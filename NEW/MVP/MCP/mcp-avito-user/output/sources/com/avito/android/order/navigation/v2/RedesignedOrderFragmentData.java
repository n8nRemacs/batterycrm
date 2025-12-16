package com.avito.android.order.navigation.v2;

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

/* compiled from: RedesignedOrderFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/navigation/v2/RedesignedOrderFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RedesignedOrderFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<RedesignedOrderFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209720b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f209721c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209722d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f209723e;

    /* compiled from: RedesignedOrderFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RedesignedOrderFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final RedesignedOrderFragmentData createFromParcel(Parcel parcel) {
            return new RedesignedOrderFragmentData(parcel.readString(), (NavigationTabSetItem) parcel.readParcelable(RedesignedOrderFragmentData.class.getClassLoader()), (OrderScreenSegment) parcel.readParcelable(RedesignedOrderFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RedesignedOrderFragmentData[] newArray(int i12) {
            return new RedesignedOrderFragmentData[i12];
        }
    }

    public RedesignedOrderFragmentData(@k String str, @k NavigationTabSetItem navigationTabSetItem, @k OrderScreenSegment orderScreenSegment) {
        this.f209720b = str;
        this.f209721c = navigationTabSetItem;
        this.f209722d = orderScreenSegment;
        this.f209723e = navigationTabSetItem;
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
        return this.f209723e;
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
        if (!(obj instanceof RedesignedOrderFragmentData)) {
            return false;
        }
        RedesignedOrderFragmentData redesignedOrderFragmentData = (RedesignedOrderFragmentData) obj;
        return L.f(this.f209720b, redesignedOrderFragmentData.f209720b) && L.f(this.f209721c, redesignedOrderFragmentData.f209721c) && L.f(this.f209722d, redesignedOrderFragmentData.f209722d);
    }

    public final int hashCode() {
        return this.f209722d.hashCode() + ((this.f209721c.hashCode() + (this.f209720b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return "RedesignedOrderFragmentData(orderId=" + this.f209720b + ", tab=" + this.f209721c + ", orderScreenSegment=" + this.f209722d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209720b);
        parcel.writeParcelable(this.f209721c, i12);
        parcel.writeParcelable(this.f209722d, i12);
    }
}
