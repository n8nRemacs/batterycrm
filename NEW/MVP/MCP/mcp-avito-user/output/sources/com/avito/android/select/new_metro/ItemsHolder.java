package com.avito.android.select.new_metro;

import android.os.Parcelable;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ItemsHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/ItemsHolder;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ItemsHolder extends Parcelable {
    @Y61.k
    Map<Integer, MetroLineItem> F2();

    void H4(@Y61.k MetroResponseBody metroResponseBody);

    @Y61.k
    MetroSelectedStationsItem X3();

    @Y61.k
    Map<Integer, MetroStationItem> c6();

    @Y61.k
    Map<Integer, MetroFilterItem> d6();

    @Y61.k
    Map<Integer, Set<MetroFilterItem>> h5();

    @Y61.k
    SelectedStationInfo l5(@Y61.k MetroStationItem metroStationItem);

    @Y61.k
    MetroListOutputTypeItem x2();
}
