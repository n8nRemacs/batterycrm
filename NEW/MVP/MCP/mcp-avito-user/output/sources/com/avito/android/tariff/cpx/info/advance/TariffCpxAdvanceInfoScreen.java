package com.avito.android.tariff.cpx.info.advance;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TariffCpxAdvanceInfoScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/TariffCpxAdvanceInfoScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes4.dex */
public final class TariffCpxAdvanceInfoScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffCpxAdvanceInfoScreen f296261d = new TariffCpxAdvanceInfoScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f296262e = "tariffCpxInfoAdvance";

    @k
    public static final Parcelable.Creator<TariffCpxAdvanceInfoScreen> CREATOR = new a();

    /* compiled from: TariffCpxAdvanceInfoScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxAdvanceInfoScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxAdvanceInfoScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffCpxAdvanceInfoScreen.f296261d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxAdvanceInfoScreen[] newArray(int i12) {
            return new TariffCpxAdvanceInfoScreen[i12];
        }
    }

    public TariffCpxAdvanceInfoScreen() {
        super("MnzTariffCpxInfoAdvance", false, 2, null);
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
