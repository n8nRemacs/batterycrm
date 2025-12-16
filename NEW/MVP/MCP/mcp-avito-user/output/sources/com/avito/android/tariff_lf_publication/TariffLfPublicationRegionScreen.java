package com.avito.android.tariff_lf_publication;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/TariffLfPublicationRegionScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes4.dex */
public final class TariffLfPublicationRegionScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TariffLfPublicationRegionScreen f300707d = new TariffLfPublicationRegionScreen();

    @k
    public static final Parcelable.Creator<TariffLfPublicationRegionScreen> CREATOR = new a();

    /* compiled from: TariffLfPublicationPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffLfPublicationRegionScreen> {
        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationRegionScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TariffLfPublicationRegionScreen.f300707d;
        }

        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationRegionScreen[] newArray(int i12) {
            return new TariffLfPublicationRegionScreen[i12];
        }
    }

    public TariffLfPublicationRegionScreen() {
        super("TariffLfPublicationRegion", false, 2, null);
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
