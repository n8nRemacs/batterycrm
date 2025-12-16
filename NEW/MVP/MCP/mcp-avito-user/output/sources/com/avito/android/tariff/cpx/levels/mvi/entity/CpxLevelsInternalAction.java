package com.avito.android.tariff.cpx.levels.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithResult", "Content", "Error", "HandleDeeplink", "LevelSelect", "Loading", "ProgressChanged", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$CloseWithResult;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$LevelSelect;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Loading;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$ProgressChanged;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CpxLevelsInternalAction extends n {

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$CloseWithResult;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements CpxLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297124b;

        public CloseWithResult(@l DeepLink deepLink) {
            this.f297124b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f297124b, ((CloseWithResult) obj).f297124b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297124b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("CloseWithResult(deeplink="), this.f297124b, ')');
        }
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CpxLevelsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final eC0.l f297125b;

        public Content(@k eC0.l lVar) {
            this.f297125b = lVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f297125b, ((Content) obj).f297125b);
        }

        public final int hashCode() {
            return this.f297125b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(result=" + this.f297125b + ')';
        }
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CpxLevelsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f297126b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f297127c;

        public Error(@k ApiError apiError) {
            this.f297126b = apiError;
            this.f297127c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f297126b, ((Error) obj).f297126b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF294759c() {
            return this.f297127c;
        }

        public final int hashCode() {
            return this.f297126b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f297126b, ')');
        }
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CpxLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297128b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f297128b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f297128b, ((HandleDeeplink) obj).f297128b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297128b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f297128b, ')');
        }
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$LevelSelect;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LevelSelect implements CpxLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f297129b;

        public LevelSelect(@k h hVar) {
            this.f297129b = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LevelSelect) && L.f(this.f297129b, ((LevelSelect) obj).f297129b);
        }

        public final int hashCode() {
            return this.f297129b.hashCode();
        }

        @k
        public final String toString() {
            return "LevelSelect(level=" + this.f297129b + ')';
        }
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CpxLevelsInternalAction {
    }

    /* compiled from: CpxLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction$ProgressChanged;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChanged implements CpxLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f297130b;

        public ProgressChanged(boolean z12) {
            this.f297130b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChanged) && this.f297130b == ((ProgressChanged) obj).f297130b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f297130b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChanged(isLoading="), this.f297130b, ')');
        }
    }
}
