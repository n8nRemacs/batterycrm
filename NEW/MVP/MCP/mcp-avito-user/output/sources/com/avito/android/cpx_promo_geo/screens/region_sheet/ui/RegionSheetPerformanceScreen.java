package com.avito.android.cpx_promo_geo.screens.region_sheet.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: RegionSheetPerformanceScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/ui/RegionSheetPerformanceScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes12.dex */
public final class RegionSheetPerformanceScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final RegionSheetPerformanceScreen f128472d = new RegionSheetPerformanceScreen();

    @k
    public static final Parcelable.Creator<RegionSheetPerformanceScreen> CREATOR = new a();

    /* compiled from: RegionSheetPerformanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionSheetPerformanceScreen> {
        @Override // android.os.Parcelable.Creator
        public final RegionSheetPerformanceScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return RegionSheetPerformanceScreen.f128472d;
        }

        @Override // android.os.Parcelable.Creator
        public final RegionSheetPerformanceScreen[] newArray(int i12) {
            return new RegionSheetPerformanceScreen[i12];
        }
    }

    public RegionSheetPerformanceScreen() {
        super("CpxPromoGeoRegionSheet", false, 2, null);
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
