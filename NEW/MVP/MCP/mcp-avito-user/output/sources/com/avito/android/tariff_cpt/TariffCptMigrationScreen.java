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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/TariffCptMigrationScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes4.dex */
public final class TariffCptMigrationScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffCptMigrationScreen f297513d = new TariffCptMigrationScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f297514e = "tariffCptConfigureMigration";

    @k
    public static final Parcelable.Creator<TariffCptMigrationScreen> CREATOR = new a();

    /* compiled from: TariffCptPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptMigrationScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptMigrationScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffCptMigrationScreen.f297513d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptMigrationScreen[] newArray(int i12) {
            return new TariffCptMigrationScreen[i12];
        }
    }

    public TariffCptMigrationScreen() {
        super("TariffCptMigration", false, 2, null);
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
