package com.avito.android.order.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.order.OrderScreenSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OrderLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/deeplink/OrderLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class OrderLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<OrderLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f209452c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209453d;

    /* compiled from: OrderLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderLink> {
        @Override // android.os.Parcelable.Creator
        public final OrderLink createFromParcel(Parcel parcel) {
            return new OrderLink(parcel.readString(), parcel.readInt() != 0, (OrderScreenSegment) parcel.readParcelable(OrderLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrderLink[] newArray(int i12) {
            return new OrderLink[i12];
        }
    }

    public OrderLink(@k String str, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        this.f209451b = str;
        this.f209452c = z12;
        this.f209453d = orderScreenSegment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderLink)) {
            return false;
        }
        OrderLink orderLink = (OrderLink) obj;
        return L.f(this.f209451b, orderLink.f209451b) && this.f209452c == orderLink.f209452c && L.f(this.f209453d, orderLink.f209453d);
    }

    public final int hashCode() {
        return this.f209453d.hashCode() + r.i(this.f209451b.hashCode() * 31, 31, this.f209452c);
    }

    @k
    public final String toString() {
        return "OrderLink(orderId=" + this.f209451b + ", withBottomNavigation=" + this.f209452c + ", orderScreenSegment=" + this.f209453d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209451b);
        parcel.writeInt(this.f209452c ? 1 : 0);
        parcel.writeParcelable(this.f209453d, i12);
    }
}
