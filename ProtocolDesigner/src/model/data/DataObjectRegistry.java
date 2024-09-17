package model.data;

import model.data.DataObject;

import java.util.ArrayList;

public class DataObjectRegistry {
    public static ArrayList<DataObject> registeredTypes;
    public static void RegisterDataObject(DataObject dataObject){
        registeredTypes.add(dataObject);
    }
}
