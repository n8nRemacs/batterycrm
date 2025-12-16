package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ScreenPublicConsts.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/MortgageCounterOfferScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class MortgageCounterOfferScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final MortgageCounterOfferScreen f90419d = new MortgageCounterOfferScreen();

    @Y61.k
    public static final Parcelable.Creator<MortgageCounterOfferScreen> CREATOR = new a();

    /* compiled from: ScreenPublicConsts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageCounterOfferScreen> {
        @Override // android.os.Parcelable.Creator
        public final MortgageCounterOfferScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return MortgageCounterOfferScreen.f90419d;
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageCounterOfferScreen[] newArray(int i12) {
            return new MortgageCounterOfferScreen[i12];
        }
    }

    public MortgageCounterOfferScreen() {
        super("MortgageCounterOffer", false, 2, null);
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
