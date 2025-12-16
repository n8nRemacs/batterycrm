package com.avito.android.orders_aggregation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import kotlin.Metadata;

/* compiled from: OrdersAggregationFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrdersAggregationFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<OrdersAggregationFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f210194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final OrdersAggregationIntentFactory.GeneralOrdersData f210195c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final NavigationTabSetItem f210196d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f210197e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f210198f;

    /* compiled from: OrdersAggregationFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrdersAggregationFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationFragmentData createFromParcel(Parcel parcel) {
            return new OrdersAggregationFragmentData(parcel.readString(), (OrdersAggregationIntentFactory.GeneralOrdersData) parcel.readParcelable(OrdersAggregationFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(OrdersAggregationFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersAggregationFragmentData[] newArray(int i12) {
            return new OrdersAggregationFragmentData[i12];
        }
    }

    public OrdersAggregationFragmentData(@Y61.l String str, @Y61.l OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, @Y61.l NavigationTabSetItem navigationTabSetItem) {
        this.f210194b = str;
        this.f210195c = generalOrdersData;
        this.f210196d = navigationTabSetItem;
        this.f210197e = navigationTabSetItem == null ? NavigationTab.f106974j : navigationTabSetItem;
        this.f210198f = true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF88712c() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF209723e() {
        return this.f210197e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF224264d() {
        return this.f210198f;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f210194b);
        parcel.writeParcelable(this.f210195c, i12);
        parcel.writeParcelable(this.f210196d, i12);
    }
}
