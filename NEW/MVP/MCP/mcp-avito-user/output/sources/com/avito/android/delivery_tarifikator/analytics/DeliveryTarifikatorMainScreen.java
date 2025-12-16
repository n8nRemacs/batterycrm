package com.avito.android.delivery_tarifikator.analytics;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: DeliveryTarifikatorConsts.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/analytics/DeliveryTarifikatorMainScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes12.dex */
public final class DeliveryTarifikatorMainScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final DeliveryTarifikatorMainScreen f135222d = new DeliveryTarifikatorMainScreen();

    @k
    public static final Parcelable.Creator<DeliveryTarifikatorMainScreen> CREATOR = new a();

    /* compiled from: DeliveryTarifikatorConsts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryTarifikatorMainScreen> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorMainScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DeliveryTarifikatorMainScreen.f135222d;
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryTarifikatorMainScreen[] newArray(int i12) {
            return new DeliveryTarifikatorMainScreen[i12];
        }
    }

    public DeliveryTarifikatorMainScreen() {
        super("DeliveryTarifikatorMain", false, 2, null);
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
