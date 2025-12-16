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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/deeplink/RedesignedOrderLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class RedesignedOrderLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<RedesignedOrderLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f209455c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209456d;

    /* compiled from: OrderLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RedesignedOrderLink> {
        @Override // android.os.Parcelable.Creator
        public final RedesignedOrderLink createFromParcel(Parcel parcel) {
            return new RedesignedOrderLink(parcel.readString(), parcel.readInt() != 0, (OrderScreenSegment) parcel.readParcelable(RedesignedOrderLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RedesignedOrderLink[] newArray(int i12) {
            return new RedesignedOrderLink[i12];
        }
    }

    public RedesignedOrderLink(@k String str, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        this.f209454b = str;
        this.f209455c = z12;
        this.f209456d = orderScreenSegment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedesignedOrderLink)) {
            return false;
        }
        RedesignedOrderLink redesignedOrderLink = (RedesignedOrderLink) obj;
        return L.f(this.f209454b, redesignedOrderLink.f209454b) && this.f209455c == redesignedOrderLink.f209455c && L.f(this.f209456d, redesignedOrderLink.f209456d);
    }

    public final int hashCode() {
        return this.f209456d.hashCode() + r.i(this.f209454b.hashCode() * 31, 31, this.f209455c);
    }

    @k
    public final String toString() {
        return "RedesignedOrderLink(orderId=" + this.f209454b + ", withBottomNavigation=" + this.f209455c + ", orderScreenSegment=" + this.f209456d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209454b);
        parcel.writeInt(this.f209455c ? 1 : 0);
        parcel.writeParcelable(this.f209456d, i12);
    }
}
