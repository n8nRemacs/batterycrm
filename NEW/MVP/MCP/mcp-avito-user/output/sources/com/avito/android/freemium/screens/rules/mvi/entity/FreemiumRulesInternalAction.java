package com.avito.android.freemium.screens.rules.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import cF.C27031a;
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

/* compiled from: FreemiumRulesInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AcceptanceError", "AcceptanceLoading", "CloseScreen", "Content", "Error", "Loading", "OpenDeepLink", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$AcceptanceError;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$AcceptanceLoading;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$CloseScreen;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Content;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Error;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Loading;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$OpenDeepLink;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FreemiumRulesInternalAction extends n {

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$AcceptanceError;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AcceptanceError implements FreemiumRulesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f159136b;

        public AcceptanceError(@k String str) {
            this.f159136b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AcceptanceError) && L.f(this.f159136b, ((AcceptanceError) obj).f159136b);
        }

        public final int hashCode() {
            return this.f159136b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AcceptanceError(errorMessage="), this.f159136b, ')');
        }
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$AcceptanceLoading;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AcceptanceLoading implements FreemiumRulesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f159137b;

        public AcceptanceLoading(boolean z12) {
            this.f159137b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AcceptanceLoading) && this.f159137b == ((AcceptanceLoading) obj).f159137b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f159137b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("AcceptanceLoading(isLoading="), this.f159137b, ')');
        }
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$CloseScreen;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements FreemiumRulesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f159138b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -27084572;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Content;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FreemiumRulesInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C27031a f159139b;

        public Content(@k C27031a c27031a) {
            this.f159139b = c27031a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Content) && L.f(this.f159139b, ((Content) obj).f159139b);
        }

        public final int hashCode() {
            return this.f159139b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f159139b + ')';
        }
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Error;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FreemiumRulesInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f159140b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f159141c;

        public Error(@k ApiException apiException) {
            this.f159140b = apiException;
            this.f159141c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Error) && this.f159140b.equals(((Error) obj).f159140b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF118360c() {
            return this.f159141c;
        }

        public final int hashCode() {
            return this.f159140b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f159140b, ')');
        }
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$Loading;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FreemiumRulesInternalAction {
    }

    /* compiled from: FreemiumRulesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction$OpenDeepLink;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements FreemiumRulesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f159142b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f159142b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f159142b, ((OpenDeepLink) obj).f159142b);
        }

        public final int hashCode() {
            return this.f159142b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f159142b, ')');
        }
    }
}
