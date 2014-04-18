package com.nliven.android.airports.daogenerator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class AirportsDaoGenerator {

    public static void main(String[] args) throws Exception {

        /*
         * Update your DatabaseVersion number here!
         * The second parameter is the package name for the Model/Entity POJOs that
         * will be auto-generated.
         * 
         * The second call puts all the auto-generated DAO files into a separate package. 
         */
        Schema schema = new Schema(1, "com.nliven.android.airports.biz.model");               
        schema.setDefaultJavaPackageDao("com.nliven.android.airports.biz.dao");
        schema.enableKeepSectionsByDefault();
                
        /*
         * Define your new tables in a separate static method and "Add" them here...
         */
        addAirportsTable(schema);                   
        
        /*
         * Generates the DAO and Entity/Model POJOs and should copy them to a 
         * directory in our main Android app project 
         */
        try {
            new DaoGenerator().generateAll(schema, "../AirportsApp/src");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * "Airports" table
     */
    private static void addAirportsTable(Schema schema) {
        
        /*
         * This is the TABLE name
         */
        Entity airport = schema.addEntity("Airport");
        
        /*
         * These are the Columns    
         */
        airport.addIdProperty().autoincrement();
        airport.addStringProperty("code");
        airport.addStringProperty("icao");
        airport.addStringProperty("name");
        airport.addStringProperty("city");
        airport.addStringProperty("state");
        airport.addDoubleProperty("latitude");
        airport.addDoubleProperty("longitude");
        airport.addIntProperty("runwayLength");
        airport.addStringProperty("url");
                       
    }    
}
