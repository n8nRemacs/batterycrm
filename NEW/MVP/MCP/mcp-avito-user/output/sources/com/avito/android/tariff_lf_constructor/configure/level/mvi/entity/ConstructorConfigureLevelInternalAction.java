package com.avito.android.tariff_lf_constructor.configure.level.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tD0.C48538b;

/* compiled from: ConstructorConfigureLevelInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "HandleDeeplink", "Loading", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Close;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Content;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Error;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Loading;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConstructorConfigureLevelInternalAction extends n {

    /* compiled from: ConstructorConfigureLevelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Close;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements ConstructorConfigureLevelInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f299833b = new Close();

        private Close() {
        }
    }

    /* compiled from: ConstructorConfigureLevelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Content;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ConstructorConfigureLevelInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48538b f299834b;

        public Content(@k C48538b c48538b) {
            this.f299834b = c48538b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof Content) && L.f(this.f299834b, ((Content) obj).f299834b);
        }

        public final int hashCode() {
            return this.f299834b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f299834b + ')';
        }
    }

    /* compiled from: ConstructorConfigureLevelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Error;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ConstructorConfigureLevelInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f299835b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f299836c;

        public Error(@k ApiException apiException) {
            this.f299835b = apiException;
            this.f299836c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof Error) && this.f299835b.equals(((Error) obj).f299835b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF296911c() {
            return this.f299836c;
        }

        public final int hashCode() {
            return this.f299835b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f299835b, ')');
        }
    }

    /* compiled from: ConstructorConfigureLevelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ConstructorConfigureLevelInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f299837b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f299837b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f299837b, ((HandleDeeplink) obj).f299837b);
        }

        public final int hashCode() {
            return this.f299837b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f299837b, ')');
        }
    }

    /* compiled from: ConstructorConfigureLevelInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction$Loading;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ConstructorConfigureLevelInternalAction {
    }
}
