package com.avito.android.item_price_history.presentation.items.skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistorySkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/items/skeleton/ItemPriceHistorySkeletonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemPriceHistorySkeletonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ItemPriceHistorySkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173771b;

    /* compiled from: ItemPriceHistorySkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemPriceHistorySkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistorySkeletonItem createFromParcel(Parcel parcel) {
            return new ItemPriceHistorySkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistorySkeletonItem[] newArray(int i12) {
            return new ItemPriceHistorySkeletonItem[i12];
        }
    }

    public ItemPriceHistorySkeletonItem(@k String str) {
        this.f173771b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ItemPriceHistorySkeletonItem) && L.f(this.f173771b, ((ItemPriceHistorySkeletonItem) obj).f173771b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF172091b() {
        return this.f173771b;
    }

    public final int hashCode() {
        return this.f173771b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ItemPriceHistorySkeletonItem(stringId="), this.f173771b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173771b);
    }
}
