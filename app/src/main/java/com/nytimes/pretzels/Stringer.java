package com.nytimes.pretzels;

import java.util.List;

public class Stringer {
    int id;
    String name;
    boolean available;
    String phone;
    String email;
    boolean contract;
    List<String> languages;
    List<String> skills;
    Location baseLocation;
    Location currentLocation;


    class Location {
        String type;
        int[] coordinates;
    }
}


/**
 {
 "id": "METRO1234",
 "name": "",
 "baseLocation": {
 "type": "Point",
 "coordinates": [100.0, 0.0]
 }
 "currentLocation": {
 "type": "Point",
 "coordinates": [100.0, 0.0]
 }
 "available": true/false,
 "phone": "",
 "email": "",
 "contract": "date signed for yes"
 "languages": ["English", "Urdu", "Spanish", "Russian"],
 "skills": ["Social media", "photographer"]
 }
 */
