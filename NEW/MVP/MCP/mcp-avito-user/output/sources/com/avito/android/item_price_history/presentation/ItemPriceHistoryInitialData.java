package com.avito.android.item_price_history.presentation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryInitialData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/ItemPriceHistoryInitialData;", "Landroid/os/Parcelable;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemPriceHistoryInitialData implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemPriceHistoryInitialData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f173714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f173715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f173716e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f173717f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f173718g;

    /* compiled from: ItemPriceHistoryInitialData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemPriceHistoryInitialData> {
        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryInitialData createFromParcel(Parcel parcel) {
            return new ItemPriceHistoryInitialData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryInitialData[] newArray(int i12) {
            return new ItemPriceHistoryInitialData[i12];
        }
    }

    public ItemPriceHistoryInitialData(int i12, @k String str, @k String str2, @k String str3, @l String str4, boolean z12) {
        this.f173713b = str;
        this.f173714c = str2;
        this.f173715d = str3;
        this.f173716e = i12;
        this.f173717f = str4;
        this.f173718g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPriceHistoryInitialData)) {
            return false;
        }
        ItemPriceHistoryInitialData itemPriceHistoryInitialData = (ItemPriceHistoryInitialData) obj;
        return L.f(this.f173713b, itemPriceHistoryInitialData.f173713b) && L.f(this.f173714c, itemPriceHistoryInitialData.f173714c) && L.f(this.f173715d, itemPriceHistoryInitialData.f173715d) && this.f173716e == itemPriceHistoryInitialData.f173716e && L.f(this.f173717f, itemPriceHistoryInitialData.f173717f) && this.f173718g == itemPriceHistoryInitialData.f173718g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f173716e, H.d(H.d(this.f173713b.hashCode() * 31, 31, this.f173714c), 31, this.f173715d), 31);
        String str = this.f173717f;
        return Boolean.hashCode(this.f173718g) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPriceHistoryInitialData(itemId=");
        sb2.append(this.f173713b);
        sb2.append(", categoryId=");
        sb2.append(this.f173714c);
        sb2.append(", microcatId=");
        sb2.append(this.f173715d);
        sb2.append(", skeletonsCount=");
        sb2.append(this.f173716e);
        sb2.append(", context=");
        sb2.append(this.f173717f);
        sb2.append(", isFavorite=");
        return r.x(sb2, this.f173718g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173713b);
        parcel.writeString(this.f173714c);
        parcel.writeString(this.f173715d);
        parcel.writeInt(this.f173716e);
        parcel.writeString(this.f173717f);
        parcel.writeInt(this.f173718g ? 1 : 0);
    }
}
