package com.avito.android.order.feature;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: OrderActivity.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/OrderScreenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class OrderScreenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<OrderScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209505b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f209506c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderScreenSegment f209507d;

    /* compiled from: OrderActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final OrderScreenParams createFromParcel(Parcel parcel) {
            return new OrderScreenParams(parcel.readString(), parcel.readInt() != 0, (OrderScreenSegment) parcel.readParcelable(OrderScreenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrderScreenParams[] newArray(int i12) {
            return new OrderScreenParams[i12];
        }
    }

    public OrderScreenParams(@k String str, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        this.f209505b = str;
        this.f209506c = z12;
        this.f209507d = orderScreenSegment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f209505b);
        parcel.writeInt(this.f209506c ? 1 : 0);
        parcel.writeParcelable(this.f209507d, i12);
    }
}
