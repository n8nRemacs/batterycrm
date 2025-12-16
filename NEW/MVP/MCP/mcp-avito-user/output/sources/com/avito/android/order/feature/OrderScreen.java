package com.avito.android.order.feature;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: OrderScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/order/feature/OrderScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes15.dex */
public final class OrderScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final OrderScreen f209504d = new OrderScreen();

    @k
    public static final Parcelable.Creator<OrderScreen> CREATOR = new a();

    /* compiled from: OrderScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderScreen> {
        @Override // android.os.Parcelable.Creator
        public final OrderScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return OrderScreen.f209504d;
        }

        @Override // android.os.Parcelable.Creator
        public final OrderScreen[] newArray(int i12) {
            return new OrderScreen[i12];
        }
    }

    public OrderScreen() {
        super("order-page-info", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
