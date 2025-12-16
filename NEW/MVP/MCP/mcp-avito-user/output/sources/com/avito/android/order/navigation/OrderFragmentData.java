package com.avito.android.order.navigation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.order.OrderScreenSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/navigation/OrderFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrderFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<OrderFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f209717c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209718d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f209719e;

    /* compiled from: OrderFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final OrderFragmentData createFromParcel(Parcel parcel) {
            return new OrderFragmentData(parcel.readString(), (NavigationTabSetItem) parcel.readParcelable(OrderFragmentData.class.getClassLoader()), (OrderScreenSegment) parcel.readParcelable(OrderFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrderFragmentData[] newArray(int i12) {
            return new OrderFragmentData[i12];
        }
    }

    public OrderFragmentData(@k String str, @k NavigationTabSetItem navigationTabSetItem, @k OrderScreenSegment orderScreenSegment) {
        this.f209716b = str;
        this.f209717c = navigationTabSetItem;
        this.f209718d = orderScreenSegment;
        this.f209719e = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF109310g() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF209723e() {
        return this.f209719e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF226992d() {
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderFragmentData)) {
            return false;
        }
        OrderFragmentData orderFragmentData = (OrderFragmentData) obj;
        return L.f(this.f209716b, orderFragmentData.f209716b) && L.f(this.f209717c, orderFragmentData.f209717c) && L.f(this.f209718d, orderFragmentData.f209718d);
    }

    public final int hashCode() {
        return this.f209718d.hashCode() + ((this.f209717c.hashCode() + (this.f209716b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return "OrderFragmentData(orderId=" + this.f209716b + ", tab=" + this.f209717c + ", orderScreenSegment=" + this.f209718d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209716b);
        parcel.writeParcelable(this.f209717c, i12);
        parcel.writeParcelable(this.f209718d, i12);
    }
}
