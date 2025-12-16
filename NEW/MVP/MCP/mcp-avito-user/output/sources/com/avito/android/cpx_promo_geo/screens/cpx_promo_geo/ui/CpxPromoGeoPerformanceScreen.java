package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: CpxPromoGeoPerformanceScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/ui/CpxPromoGeoPerformanceScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes12.dex */
public final class CpxPromoGeoPerformanceScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final CpxPromoGeoPerformanceScreen f127930d = new CpxPromoGeoPerformanceScreen();

    @k
    public static final Parcelable.Creator<CpxPromoGeoPerformanceScreen> CREATOR = new a();

    /* compiled from: CpxPromoGeoPerformanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoGeoPerformanceScreen> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoGeoPerformanceScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CpxPromoGeoPerformanceScreen.f127930d;
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoGeoPerformanceScreen[] newArray(int i12) {
            return new CpxPromoGeoPerformanceScreen[i12];
        }
    }

    public CpxPromoGeoPerformanceScreen() {
        super("CpxPromoGeo", false, 2, null);
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
