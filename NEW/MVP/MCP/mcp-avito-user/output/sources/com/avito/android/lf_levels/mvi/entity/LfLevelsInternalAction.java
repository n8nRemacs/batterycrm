package com.avito.android.lf_levels.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
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
import yR.e;

/* compiled from: LfLevelsInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "HandleDeeplink", "LevelSelect", "Loading", "ProgressChanged", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Content;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Error;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$LevelSelect;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Loading;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$ProgressChanged;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LfLevelsInternalAction extends n {

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Content;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements LfLevelsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f175378b;

        public Content(@k e eVar) {
            this.f175378b = eVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof Content) && L.f(this.f175378b, ((Content) obj).f175378b);
        }

        public final int hashCode() {
            return this.f175378b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(result=" + this.f175378b + ')';
        }
    }

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Error;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements LfLevelsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f175379b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f175380c;

        public Error(@k ApiError apiError) {
            this.f175379b = apiError;
            this.f175380c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof Error) && L.f(this.f175379b, ((Error) obj).f175379b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF122760c() {
            return this.f175380c;
        }

        public final int hashCode() {
            return this.f175379b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f175379b, ')');
        }
    }

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements LfLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f175381b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f175381b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f175381b, ((HandleDeeplink) obj).f175381b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f175381b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f175381b, ')');
        }
    }

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$LevelSelect;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LevelSelect implements LfLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f175382b;

        public LevelSelect(@k h hVar) {
            this.f175382b = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LevelSelect) && L.f(this.f175382b, ((LevelSelect) obj).f175382b);
        }

        public final int hashCode() {
            return this.f175382b.hashCode();
        }

        @k
        public final String toString() {
            return "LevelSelect(level=" + this.f175382b + ')';
        }
    }

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements LfLevelsInternalAction {
    }

    /* compiled from: LfLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction$ProgressChanged;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChanged implements LfLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f175383b;

        public ProgressChanged(boolean z12) {
            this.f175383b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChanged) && this.f175383b == ((ProgressChanged) obj).f175383b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f175383b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChanged(isLoading="), this.f175383b, ')');
        }
    }
}
