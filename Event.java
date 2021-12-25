public class Event {
	private Date date;			// Date of event.
	private int start;			// Start time/hour of event (0-23).
	private int end;			// End time/hour of event (0-23).
	private String description;	// A description of the event.

	/** Parameterized constructor; start hour should be <= end hour. */
	public Event(Date date, int start, int end, String description) 
	throws IllegalArgumentException {
		if (start > end)
			throw new IllegalArgumentException();

		this.date = date;
		this.start = start;
		this.end = end;
		this.description = description;
	}

	/**	Accessor methods. */
	public Date getDate() {
		return date;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public String getDescription() {
		return description;
	}

	/** Mutator method. */
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	/** Convert the data members to string.
	 *
	 * @return: String of month/day/year format. 
	 */
	public String toString() {
		String convert = Integer.toString(date.month) + "/" +
		Integer.toString(date.day) + "/" +
		Integer.toString(date.year) + " " + 
		start + "--" + end + ":" + description;

		return convert;
	}

	/**	Compare if two event objects are the same.
	 *
	 * @param obj: Object properties to compare to.
	 * @return: True if both objects have the same date
	 * (start, end and description attributes).
	 */
	public boolean equals(Object obj) {
		Event otherDate = (Event)obj;

		// Compare object references.
		if (date.equals(date) && otherDate.start == start && otherDate.end == end && otherDate.description == description)
			return true;

		// All object attributes are not equal.
		return false;
	}
}
