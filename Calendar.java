public class Calendar {
	static final int MAXEVENTS = 4;	// Max number of events.
	private Event[] events;			// Holds scheduled events of size MAXEVENTS.
	private int numEvents;			// Number of events currently scheduled.
	
	/** Constructor. Create an empty array of size MAXEVENTS. */
	public Calendar() {
		events = new Event[MAXEVENTS];
		numEvents = 0;
	}

	/** Add an event to array if an index is available.
	 * 
	 * @param e: The event to append.
	 * @return: True if the event has been appended.
	 */
	public Boolean addEvent(Event e) {
		if (numEvents == MAXEVENTS)
			return false;

		// Array is not full, traverse to null entry.
		for (int i = 0; i < events.length; i++)
			if (events[i] == null) {
				// Append parameter.
				events[i] = e;
				break;
			}
				
		// Successfully added to array.
		numEvents++;

		return true;
	} 

	/**	Find specified event.
	 *
	 * @param e: The event to find.
	 * @return: Indexed position of the event.
	 */
	public int findEvent(Event e) {
		// Check for null exception.
		if (numEvents == 0 || events[0] == null)
			return -1; 

		// Traverse to parameter in array.
		for (int i = 0; i < events.length; i++)
			if (events[i] != null && events[i].equals(e))
				// Return index.
				return i;

		// Index of parameter could not be found.
		return -1;
	} 

	/**	Remove the event from the array.
	 *
	 * @param e: The event to remove.
	 * @return: True if successful removal.
	 */
	public Boolean removeEvent(Event e) {
		// Retrieve the event index.
		int index = findEvent(e);

		// Index does not exist within array.
		if (index == -1)
			return false;

		// Remove event from array and decrement array size.
		events[index] = null;
		numEvents--;

		return true;
	} 

	/** Print the entries contained in the array. */
	public void dump() {
		for (int i = 0; i < events.length; i++)
			if (events[i] != null)
				System.out.println(events[i]);
	}
}
