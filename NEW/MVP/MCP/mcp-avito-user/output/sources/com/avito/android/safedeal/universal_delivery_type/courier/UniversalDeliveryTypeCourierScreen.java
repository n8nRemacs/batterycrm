package com.avito.android.safedeal.universal_delivery_type.courier;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeCourierScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/UniversalDeliveryTypeCourierScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes3.dex */
public final class UniversalDeliveryTypeCourierScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final UniversalDeliveryTypeCourierScreen f256468d = new UniversalDeliveryTypeCourierScreen();

    @k
    public static final Parcelable.Creator<UniversalDeliveryTypeCourierScreen> CREATOR = new a();

    /* compiled from: UniversalDeliveryTypeCourierScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalDeliveryTypeCourierScreen> {
        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeCourierScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UniversalDeliveryTypeCourierScreen.f256468d;
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryTypeCourierScreen[] newArray(int i12) {
            return new UniversalDeliveryTypeCourierScreen[i12];
        }
    }

    public UniversalDeliveryTypeCourierScreen() {
        super("display-courier-tab", false, 2, null);
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
