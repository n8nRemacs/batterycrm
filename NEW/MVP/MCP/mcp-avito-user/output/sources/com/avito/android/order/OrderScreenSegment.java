package com.avito.android.order;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderScreenSegment.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/OrderScreenSegment;", "Landroid/os/Parcelable;", "_avito_order_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrderScreenSegment implements Parcelable {

    @k
    public static final Parcelable.Creator<OrderScreenSegment> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f209450b;

    /* compiled from: OrderScreenSegment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderScreenSegment> {
        @Override // android.os.Parcelable.Creator
        public final OrderScreenSegment createFromParcel(Parcel parcel) {
            return new OrderScreenSegment(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderScreenSegment[] newArray(int i12) {
            return new OrderScreenSegment[i12];
        }
    }

    public OrderScreenSegment(@l String str) {
        this.f209450b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderScreenSegment) && L.f(this.f209450b, ((OrderScreenSegment) obj).f209450b);
    }

    public final int hashCode() {
        String str = this.f209450b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("OrderScreenSegment(segment="), this.f209450b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209450b);
    }
}
