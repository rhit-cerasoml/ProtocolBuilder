package model.data.primitives;

import model.data.DataObject;

import javax.swing.*;

public class NullDataObject implements DataObject {
    @Override
    public JPanel getContext() {
        return null;
    }
}
