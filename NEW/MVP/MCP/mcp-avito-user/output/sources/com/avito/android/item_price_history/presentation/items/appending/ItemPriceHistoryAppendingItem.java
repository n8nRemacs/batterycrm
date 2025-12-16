package com.avito.android.item_price_history.presentation.items.appending;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryAppendingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/items/appending/ItemPriceHistoryAppendingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemPriceHistoryAppendingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ItemPriceHistoryAppendingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173741b;

    /* compiled from: ItemPriceHistoryAppendingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemPriceHistoryAppendingItem> {
        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryAppendingItem createFromParcel(Parcel parcel) {
            return new ItemPriceHistoryAppendingItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryAppendingItem[] newArray(int i12) {
            return new ItemPriceHistoryAppendingItem[i12];
        }
    }

    public ItemPriceHistoryAppendingItem(@k String str) {
        this.f173741b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ItemPriceHistoryAppendingItem) && L.f(this.f173741b, ((ItemPriceHistoryAppendingItem) obj).f173741b);
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
        return this.f173741b;
    }

    public final int hashCode() {
        return this.f173741b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ItemPriceHistoryAppendingItem(stringId="), this.f173741b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173741b);
    }
}
