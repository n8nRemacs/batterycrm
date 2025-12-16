package com.avito.android.license.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LicenseInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Loading", "ShowLicenses", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction$Loading;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction$ShowLicenses;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LicenseInternalAction extends n {

    /* compiled from: LicenseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/license/mvi/entity/LicenseInternalAction$Loading;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements LicenseInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f181535d;

        public Loading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f181535d == ((Loading) obj).f181535d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF111995e() {
            return this.f181535d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f181535d.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingType=" + this.f181535d + ')';
        }

        public Loading(ScreenPerformanceTracker.LoadingType loadingType, int i12, C42822w c42822w) {
            this.f181535d = (i12 & 1) != 0 ? ScreenPerformanceTracker.LoadingType.f90786c : loadingType;
        }
    }

    /* compiled from: LicenseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/license/mvi/entity/LicenseInternalAction$ShowLicenses;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLicenses implements LicenseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f181536b;

        public ShowLicenses(@k String str) {
            this.f181536b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLicenses) && L.f(this.f181536b, ((ShowLicenses) obj).f181536b);
        }

        public final int hashCode() {
            return this.f181536b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowLicenses(licensesHtml="), this.f181536b, ')');
        }
    }
}
