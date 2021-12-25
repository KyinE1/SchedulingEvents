public class Date implements Comparable<Date> {
	int year; 	// (2014-2021).
	int month; 	// (1-12).
	int day;	// (1-31).
	
	/** Parameterized constructor; check for specified ranges. */
	public Date(int year, int month, int day) 
	throws IllegalArgumentException { 
		if (year > 2021 || year < 2014 ||
			month > 12 || month < 1 ||
			day > 31 || day < 1)
				throw new IllegalArgumentException();

		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**	Accessor methods. */
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	/** Convert the data members to a string. 
	 *	
	 * @return: String of month/day/year format. 
	*/
	public String toString() {
		String convert = Integer.toString(month) + "/" + 
		Integer.toString(day) + "/" + Integer.toString(year);
		
		return convert;
	}

	/** Overrides the equal method in the object class.
	 *
	 * @param obj: The object properties to compare to.
	 * @return: True if this Date object has the same year, month
	 * and date as the parameter.
	 */
	public boolean equals(Object obj) {
		Date otherDate = (Date)obj;

		// Compare object references.
		if (obj == otherDate)
			if (this.month == otherDate.month &&
				this.day == otherDate.day &&
				this.year == otherDate.year)
					return true;

		// Objects are not equal.
		return false;
	}

	/**	Inherited from Comparable interface. 
	 * Determines if the Date object is equal, later than or before the otherDate object.
	 * 
	 * @param otherDate: The object to compare to.
	 * @return: 0 if Date object is equal to the otherDate object. 
	 * -1 if this Date object is earlier than the otherDate object.
	 * +1 if this Date object is later than the otherDate object.
	 */
	public int compareTo(Date otherDate) {
		if (this.year < otherDate.year)
			return -1;
		if (this.year > otherDate.year)
			return 1;
		if (this.month < otherDate.month)
			return -1;
		if (this.month > otherDate.month)
			return 1;
		if (this.day < otherDate.day)
			return -1;
		if (this.day > otherDate.day)
			return 1;

		// Dates are equal.
		return 0;
	}
}
