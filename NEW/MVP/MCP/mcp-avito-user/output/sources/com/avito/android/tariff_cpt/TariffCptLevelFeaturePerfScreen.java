package com.avito.android.tariff_cpt;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TariffCptPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/TariffCptLevelFeaturePerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes4.dex */
public final class TariffCptLevelFeaturePerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffCptLevelFeaturePerfScreen f297509d = new TariffCptLevelFeaturePerfScreen();

    @k
    public static final Parcelable.Creator<TariffCptLevelFeaturePerfScreen> CREATOR = new a();

    /* compiled from: TariffCptPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptLevelFeaturePerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeaturePerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffCptLevelFeaturePerfScreen.f297509d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeaturePerfScreen[] newArray(int i12) {
            return new TariffCptLevelFeaturePerfScreen[i12];
        }
    }

    public TariffCptLevelFeaturePerfScreen() {
        super("TariffCptLevelFeature", false, 2, null);
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
