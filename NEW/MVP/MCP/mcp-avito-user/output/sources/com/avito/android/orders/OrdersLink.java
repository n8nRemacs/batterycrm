package com.avito.android.orders;

import K51.d;
import W40.c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OrdersLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/OrdersLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "LW40/c;", "_avito_orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class OrdersLink extends PublicDeeplink implements c {

    @k
    public static final Parcelable.Creator<OrdersLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f209933b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f209934c;

    /* compiled from: OrdersLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrdersLink> {
        @Override // android.os.Parcelable.Creator
        public final OrdersLink createFromParcel(Parcel parcel) {
            return new OrdersLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersLink[] newArray(int i12) {
            return new OrdersLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrdersLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersLink)) {
            return false;
        }
        OrdersLink ordersLink = (OrdersLink) obj;
        return L.f(this.f209933b, ordersLink.f209933b) && L.f(this.f209934c, ordersLink.f209934c);
    }

    public final int hashCode() {
        String str = this.f209933b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f209934c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrdersLink(tab=");
        sb2.append(this.f209933b);
        sb2.append(", ordersToPrefetch=");
        return C22026a.c(sb2, this.f209934c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209933b);
        parcel.writeString(this.f209934c);
    }

    public /* synthetic */ OrdersLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public OrdersLink(@l String str, @l String str2) {
        this.f209933b = str;
        this.f209934c = str2;
    }
}
