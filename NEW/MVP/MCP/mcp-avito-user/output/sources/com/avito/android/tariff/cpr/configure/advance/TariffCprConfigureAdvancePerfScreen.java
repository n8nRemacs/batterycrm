package com.avito.android.tariff.cpr.configure.advance;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TariffCprConfigureAdvancePerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/TariffCprConfigureAdvancePerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes4.dex */
public final class TariffCprConfigureAdvancePerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffCprConfigureAdvancePerfScreen f295201d = new TariffCprConfigureAdvancePerfScreen();

    @k
    public static final Parcelable.Creator<TariffCprConfigureAdvancePerfScreen> CREATOR = new a();

    /* compiled from: TariffCprConfigureAdvancePerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCprConfigureAdvancePerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvancePerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffCprConfigureAdvancePerfScreen.f295201d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvancePerfScreen[] newArray(int i12) {
            return new TariffCprConfigureAdvancePerfScreen[i12];
        }
    }

    public TariffCprConfigureAdvancePerfScreen() {
        super("CprConfigureAdvance", false, 2, null);
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
