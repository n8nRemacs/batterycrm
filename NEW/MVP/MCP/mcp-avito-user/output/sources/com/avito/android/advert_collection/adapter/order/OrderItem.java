package com.avito.android.advert_collection.adapter.order;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_collection.adapter.CollectionWidgetItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/adapter/order/OrderItem;", "Lcom/avito/android/advert_collection/adapter/CollectionWidgetItem;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderItem implements CollectionWidgetItem {

    @k
    public static final Parcelable.Creator<OrderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81295b;

    /* compiled from: OrderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderItem> {
        @Override // android.os.Parcelable.Creator
        public final OrderItem createFromParcel(Parcel parcel) {
            return new OrderItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderItem[] newArray(int i12) {
            return new OrderItem[i12];
        }
    }

    public OrderItem(@k String str) {
        this.f81295b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderItem) && L.f(this.f81295b, ((OrderItem) obj).f81295b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79781b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF79782c() {
        return "collection_order";
    }

    public final int hashCode() {
        return this.f81295b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("OrderItem(orderTitle="), this.f81295b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81295b);
    }
}
