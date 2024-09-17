package model.data;

import javax.swing.*;

public interface DataObject {
    JPanel getContext();
    int getTypeIconIndex();
    String getDisplayName();
}
