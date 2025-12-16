package com.avito.android.vas_planning_checkout.item.price;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/price/PriceItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PriceItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<PriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322973b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f322974c;

    /* compiled from: PriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceItem createFromParcel(Parcel parcel) {
            return new PriceItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceItem[] newArray(int i12) {
            return new PriceItem[i12];
        }
    }

    public PriceItem(@Y61.k String str, @Y61.k String str2) {
        this.f322973b = str;
        this.f322974c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceItem)) {
            return false;
        }
        PriceItem priceItem = (PriceItem) obj;
        return L.f(this.f322973b, priceItem.f322973b) && L.f(this.f322974c, priceItem.f322974c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321685b() {
        return this.f322973b;
    }

    public final int hashCode() {
        return this.f322974c.hashCode() + (this.f322973b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceItem(stringId=");
        sb2.append(this.f322973b);
        sb2.append(", total=");
        return C22026a.c(sb2, this.f322974c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f322973b);
        parcel.writeString(this.f322974c);
    }
}
