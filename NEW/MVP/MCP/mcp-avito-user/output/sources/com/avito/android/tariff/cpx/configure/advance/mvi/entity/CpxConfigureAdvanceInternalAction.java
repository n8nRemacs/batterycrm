package com.avito.android.tariff.cpx.configure.advance.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import eC0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvanceChanges", "Close", "Content", "Error", "HandleDeepLink", "Loading", "SaveStatusChanges", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$AdvanceChanges;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Close;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Error;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$HandleDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Loading;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$SaveStatusChanges;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CpxConfigureAdvanceInternalAction extends n {

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$AdvanceChanges;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvanceChanges implements CpxConfigureAdvanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f295747b;

        public AdvanceChanges(@k String str) {
            this.f295747b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvanceChanges) && L.f(this.f295747b, ((AdvanceChanges) obj).f295747b);
        }

        public final int hashCode() {
            return this.f295747b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AdvanceChanges(advance="), this.f295747b, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Close;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements CpxConfigureAdvanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f295748b = new Close();

        private Close() {
        }
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CpxConfigureAdvanceInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f295749b;

        public Content(@k f fVar) {
            this.f295749b = fVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof Content) && L.f(this.f295749b, ((Content) obj).f295749b);
        }

        public final int hashCode() {
            return this.f295749b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(result=" + this.f295749b + ')';
        }
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Error;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CpxConfigureAdvanceInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f295750b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f295751c;

        public Error(@k ApiError apiError) {
            this.f295750b = apiError;
            this.f295751c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof Error) && L.f(this.f295750b, ((Error) obj).f295750b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212884c() {
            return this.f295751c;
        }

        public final int hashCode() {
            return this.f295750b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f295750b, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$HandleDeepLink;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeepLink implements CpxConfigureAdvanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f295752b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f295753c;

        public HandleDeepLink(@l DeepLink deepLink, @l String str) {
            this.f295752b = deepLink;
            this.f295753c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeepLink)) {
                return false;
            }
            HandleDeepLink handleDeepLink = (HandleDeepLink) obj;
            return L.f(this.f295752b, handleDeepLink.f295752b) && L.f(this.f295753c, handleDeepLink.f295753c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f295752b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.f295753c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeepLink(deepLink=");
            sb2.append(this.f295752b);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f295753c, ')');
        }

        public /* synthetic */ HandleDeepLink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CpxConfigureAdvanceInternalAction {
    }

    /* compiled from: CpxConfigureAdvanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction$SaveStatusChanges;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveStatusChanges implements CpxConfigureAdvanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f295754b;

        public SaveStatusChanges(boolean z12) {
            this.f295754b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveStatusChanges) && this.f295754b == ((SaveStatusChanges) obj).f295754b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f295754b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SaveStatusChanges(isLoading="), this.f295754b, ')');
        }
    }
}
