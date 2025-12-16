package com.avito.android.item_map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: ItemMapFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/ItemMapFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemMapFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<ItemMapFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ItemMapArguments f173266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f173267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f173268d;

    /* compiled from: ItemMapFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemMapFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ItemMapFragmentData createFromParcel(Parcel parcel) {
            return new ItemMapFragmentData(ItemMapArguments.CREATOR.createFromParcel(parcel), (NavigationTabSetItem) parcel.readParcelable(ItemMapFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ItemMapFragmentData[] newArray(int i12) {
            return new ItemMapFragmentData[i12];
        }
    }

    public ItemMapFragmentData(@k ItemMapArguments itemMapArguments, @k NavigationTabSetItem navigationTabSetItem) {
        this.f173266b = itemMapArguments;
        this.f173267c = navigationTabSetItem;
        this.f173268d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115238d() {
        return this.f173268d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF227418e() {
        return false;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f173266b.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f173267c, i12);
    }
}
