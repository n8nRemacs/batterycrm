package com.avito.android.btob_business_trip.screens.infoScreen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripInfoFragment.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/infoScreen/B2bBusinessTripInfoScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes11.dex */
public final class B2bBusinessTripInfoScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final B2bBusinessTripInfoScreen f107910d = new B2bBusinessTripInfoScreen();

    @Y61.k
    public static final Parcelable.Creator<B2bBusinessTripInfoScreen> CREATOR = new a();

    /* compiled from: B2bBusinessTripInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<B2bBusinessTripInfoScreen> {
        @Override // android.os.Parcelable.Creator
        public final B2bBusinessTripInfoScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return B2bBusinessTripInfoScreen.f107910d;
        }

        @Override // android.os.Parcelable.Creator
        public final B2bBusinessTripInfoScreen[] newArray(int i12) {
            return new B2bBusinessTripInfoScreen[i12];
        }
    }

    public B2bBusinessTripInfoScreen() {
        super("B2bBusinessTripInfoScreen", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
