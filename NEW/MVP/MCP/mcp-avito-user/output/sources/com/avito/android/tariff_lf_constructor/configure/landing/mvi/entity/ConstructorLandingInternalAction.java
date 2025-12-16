package com.avito.android.tariff_lf_constructor.configure.landing.mvi.entity;

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
import sD0.C48034b;

/* compiled from: ConstructorLandingInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "ContinueButtonClick", "Error", "Loading", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Close;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Content;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$ContinueButtonClick;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Error;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Loading;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConstructorLandingInternalAction extends n {

    /* compiled from: ConstructorLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Close;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ConstructorLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f299718b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1677051887;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ConstructorLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Content;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ConstructorLandingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48034b f299719b;

        public Content(@k C48034b c48034b) {
            this.f299719b = c48034b;
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
            return (obj instanceof Content) && L.f(this.f299719b, ((Content) obj).f299719b);
        }

        public final int hashCode() {
            return this.f299719b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f299719b + ')';
        }
    }

    /* compiled from: ConstructorLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$ContinueButtonClick;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContinueButtonClick implements ConstructorLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f299720b;

        public ContinueButtonClick(@k DeepLink deepLink) {
            this.f299720b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinueButtonClick) && L.f(this.f299720b, ((ContinueButtonClick) obj).f299720b);
        }

        public final int hashCode() {
            return this.f299720b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("ContinueButtonClick(deeplink="), this.f299720b, ')');
        }
    }

    /* compiled from: ConstructorLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Error;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ConstructorLandingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f299721b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f299722c;

        public Error(@k ApiException apiException) {
            this.f299721b = apiException;
            this.f299722c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f299721b.equals(((Error) obj).f299721b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF296911c() {
            return this.f299722c;
        }

        public final int hashCode() {
            return this.f299721b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f299721b, ')');
        }
    }

    /* compiled from: ConstructorLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction$Loading;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/mvi/entity/ConstructorLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ConstructorLandingInternalAction {
    }
}
