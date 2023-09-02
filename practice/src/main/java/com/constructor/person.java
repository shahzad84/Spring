package com.constructor;

public class person {
		private String name;
		private int personId;
		
		public person(String name, int personId) {
			this.name=name;
			this.personId=personId;
			
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name+":"+this.personId;
			
		}
}
