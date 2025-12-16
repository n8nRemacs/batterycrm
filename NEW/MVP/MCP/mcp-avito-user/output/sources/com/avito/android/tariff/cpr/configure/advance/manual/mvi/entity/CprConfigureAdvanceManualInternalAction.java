package com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import iB0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "HandleDeeplink", "InputChange", "InvalidValue", "Loading", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Content;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Error;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$InputChange;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$InvalidValue;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Loading;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CprConfigureAdvanceManualInternalAction extends n {

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Content;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CprConfigureAdvanceManualInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f295419b;

        public Content(@k b bVar) {
            this.f295419b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Content) && L.f(this.f295419b, ((Content) obj).f295419b);
        }

        public final int hashCode() {
            return this.f295419b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(result=" + this.f295419b + ')';
        }
    }

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Error;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CprConfigureAdvanceManualInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f295420b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f295421c;

        public Error(@k ApiError apiError) {
            this.f295420b = apiError;
            this.f295421c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Error) && L.f(this.f295420b, ((Error) obj).f295420b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF258123c() {
            return this.f295421c;
        }

        public final int hashCode() {
            return this.f295420b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(throwable="), this.f295420b, ')');
        }
    }

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CprConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f295422b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f295423c;

        public HandleDeeplink(@l DeepLink deepLink, @l String str) {
            this.f295422b = deepLink;
            this.f295423c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f295422b, handleDeeplink.f295422b) && L.f(this.f295423c, handleDeeplink.f295423c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f295422b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.f295423c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f295422b);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f295423c, ')');
        }
    }

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$InputChange;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements CprConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f295424b;

        public InputChange(@k String str) {
            this.f295424b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChange) && L.f(this.f295424b, ((InputChange) obj).f295424b);
        }

        public final int hashCode() {
            return this.f295424b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(text="), this.f295424b, ')');
        }
    }

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$InvalidValue;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidValue implements CprConfigureAdvanceManualInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InvalidValue f295425b = new InvalidValue();

        private InvalidValue() {
        }
    }

    /* compiled from: CprConfigureAdvanceManualInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CprConfigureAdvanceManualInternalAction {
    }
}
