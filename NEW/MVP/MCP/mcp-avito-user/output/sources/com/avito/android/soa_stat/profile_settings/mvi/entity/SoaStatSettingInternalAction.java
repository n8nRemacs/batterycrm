package com.avito.android.soa_stat.profile_settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import com.avito.android.soa_stat.tracker.SoaStatProfileSettingsScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SoaStatSettingInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Loaded", "Loading", "LoadingError", "ToggleSettingError", "ToggleSettingLoaded", "ToggleSettingLoading", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$Loaded;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$Loading;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$LoadingError;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingError;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingLoaded;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingLoading;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SoaStatSettingInternalAction extends n {

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$Loaded;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements SoaStatSettingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final IncomeProfileSettingsResponse f284145b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f284146c;

        public Loaded(@k IncomeProfileSettingsResponse incomeProfileSettingsResponse) {
            this.f284145b = incomeProfileSettingsResponse;
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284146c = SoaStatProfileSettingsScreen.f284267e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284146c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f284146c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f284145b, ((Loaded) obj).f284145b);
        }

        public final int hashCode() {
            return this.f284145b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(response=" + this.f284145b + ')';
        }
    }

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$Loading;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements SoaStatSettingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f284147d;

        public Loading() {
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284147d = SoaStatProfileSettingsScreen.f284267e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284147d;
        }
    }

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$LoadingError;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements SoaStatSettingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f284148b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f284149c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f284150d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f284151e;

        public LoadingError(@l ApiError apiError, @l Throwable th2) {
            this.f284148b = apiError;
            this.f284149c = th2;
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284150d = SoaStatProfileSettingsScreen.f284267e;
            J.a.f90383b.getClass();
            this.f284151e = J.a.C2676a.a(apiError, th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284150d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f284150d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f284148b, loadingError.f284148b) && L.f(this.f284149c, loadingError.f284149c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212144c() {
            return this.f284151e;
        }

        public final int hashCode() {
            ApiError apiError = this.f284148b;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f284149c;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(apiError=");
            sb2.append(this.f284148b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f284149c, ')');
        }
    }

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingError;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSettingError implements SoaStatSettingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f284152b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f284153c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f284154d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f284155e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final J.a f284156f;

        public ToggleSettingError(@l ApiError apiError, @l Throwable th2, boolean z12) {
            this.f284152b = apiError;
            this.f284153c = th2;
            this.f284154d = z12;
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284155e = SoaStatProfileSettingsScreen.f284268f;
            J.a.f90383b.getClass();
            this.f284156f = J.a.C2676a.a(apiError, th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284155e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f284155e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleSettingError)) {
                return false;
            }
            ToggleSettingError toggleSettingError = (ToggleSettingError) obj;
            return L.f(this.f284152b, toggleSettingError.f284152b) && L.f(this.f284153c, toggleSettingError.f284153c) && this.f284154d == toggleSettingError.f284154d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212144c() {
            return this.f284156f;
        }

        public final int hashCode() {
            ApiError apiError = this.f284152b;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f284153c;
            return Boolean.hashCode(this.f284154d) + ((iHashCode + (th2 != null ? th2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleSettingError(apiError=");
            sb2.append(this.f284152b);
            sb2.append(", throwable=");
            sb2.append(this.f284153c);
            sb2.append(", toggleEnabled=");
            return r.x(sb2, this.f284154d, ')');
        }
    }

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingLoaded;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSettingLoaded implements SoaStatSettingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f284157b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f284158c;

        public ToggleSettingLoaded(boolean z12) {
            this.f284157b = z12;
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284158c = SoaStatProfileSettingsScreen.f284268f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284158c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f284158c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSettingLoaded) && this.f284157b == ((ToggleSettingLoaded) obj).f284157b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f284157b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleSettingLoaded(toggleEnabled="), this.f284157b, ')');
        }
    }

    /* compiled from: SoaStatSettingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction$ToggleSettingLoading;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSettingLoading extends TrackableLoadingStarted implements SoaStatSettingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f284159d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f284160e;

        public ToggleSettingLoading(boolean z12) {
            this.f284159d = z12;
            SoaStatProfileSettingsScreen.f284266d.getClass();
            this.f284160e = SoaStatProfileSettingsScreen.f284268f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212153d() {
            return this.f284160e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSettingLoading) && this.f284159d == ((ToggleSettingLoading) obj).f284159d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f284159d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleSettingLoading(toggleEnabled="), this.f284159d, ')');
        }
    }
}
