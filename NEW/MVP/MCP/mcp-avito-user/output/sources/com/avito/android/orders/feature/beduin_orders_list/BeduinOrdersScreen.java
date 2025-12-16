package com.avito.android.orders.feature.beduin_orders_list;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: BeduinOrdersScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/BeduinOrdersScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes15.dex */
public final class BeduinOrdersScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final BeduinOrdersScreen f209998d = new BeduinOrdersScreen();

    @k
    public static final Parcelable.Creator<BeduinOrdersScreen> CREATOR = new a();

    /* compiled from: BeduinOrdersScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinOrdersScreen> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOrdersScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BeduinOrdersScreen.f209998d;
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOrdersScreen[] newArray(int i12) {
            return new BeduinOrdersScreen[i12];
        }
    }

    public BeduinOrdersScreen() {
        super("beduin-profile-orders", false, 2, null);
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
