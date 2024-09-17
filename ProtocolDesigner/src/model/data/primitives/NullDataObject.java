package model.data.primitives;

import model.data.DataObject;

import javax.swing.*;

public class NullDataObject implements DataObject {
    @Override
    public JPanel getContext() {
        return null;
    }

    @Override
    public int getTypeIconIndex() {
        return 0;
    }

    @Override
    public String getDisplayName() {
        return null;
    }
}
