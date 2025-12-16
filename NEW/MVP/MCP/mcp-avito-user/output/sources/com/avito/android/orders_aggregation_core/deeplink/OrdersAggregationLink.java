package com.avito.android.orders_aggregation_core.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: OrdersAggregationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_orders-aggregation-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class OrdersAggregationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<OrdersAggregationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f210383b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final OrdersAggregationSettings f210384c;

    /* compiled from: OrdersAggregationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrdersAggregationLink> {
        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationLink createFromParcel(Parcel parcel) {
            return new OrdersAggregationLink(parcel.readString(), parcel.readInt() == 0 ? null : OrdersAggregationSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationLink[] newArray(int i12) {
            return new OrdersAggregationLink[i12];
        }
    }

    public OrdersAggregationLink(@l String str, @l OrdersAggregationSettings ordersAggregationSettings) {
        this.f210383b = str;
        this.f210384c = ordersAggregationSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f210383b);
        OrdersAggregationSettings ordersAggregationSettings = this.f210384c;
        if (ordersAggregationSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ordersAggregationSettings.writeToParcel(parcel, i12);
        }
    }
}
