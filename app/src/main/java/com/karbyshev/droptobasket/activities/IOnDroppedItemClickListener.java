package com.karbyshev.droptobasket.activities;

import com.karbyshev.droptobasket.model.DroppedItem;

import java.util.List;

public interface IOnDroppedItemClickListener {

    void OnItemClick (int position, List<DroppedItem> list);
}
