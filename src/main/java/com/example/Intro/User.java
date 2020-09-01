package com.example.Intro;

public class User {

		private int id;
		private String name;
		public int getId(){
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public int setId(int id){
			this.id = id;
			return this.id;
		}
		public String setName(String name) {
			this.name = name;
			return this.name;
		}
}
