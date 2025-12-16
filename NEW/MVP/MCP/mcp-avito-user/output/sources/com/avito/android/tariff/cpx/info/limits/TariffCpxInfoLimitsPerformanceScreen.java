package com.avito.android.tariff.cpx.info.limits;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoLimitsPerformanceScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/TariffCpxInfoLimitsPerformanceScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes4.dex */
public final class TariffCpxInfoLimitsPerformanceScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffCpxInfoLimitsPerformanceScreen f296574d = new TariffCpxInfoLimitsPerformanceScreen();

    @k
    public static final Parcelable.Creator<TariffCpxInfoLimitsPerformanceScreen> CREATOR = new a();

    /* compiled from: TariffCpxInfoLimitsPerformanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoLimitsPerformanceScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoLimitsPerformanceScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffCpxInfoLimitsPerformanceScreen.f296574d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoLimitsPerformanceScreen[] newArray(int i12) {
            return new TariffCpxInfoLimitsPerformanceScreen[i12];
        }
    }

    public TariffCpxInfoLimitsPerformanceScreen() {
        super("TariffCpxInfoLimits", false, 2, null);
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
