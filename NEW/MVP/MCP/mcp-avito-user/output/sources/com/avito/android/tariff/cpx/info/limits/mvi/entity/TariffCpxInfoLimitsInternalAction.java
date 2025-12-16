package com.avito.android.tariff.cpx.info.limits.mvi.entity;

import AK.c;
import TB0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoLimitsInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "HandleDeeplink", "Loading", "SelectTab", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Close;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Loading;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$SelectTab;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxInfoLimitsInternalAction extends n {

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Close;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TariffCpxInfoLimitsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f296614b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1607120741;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCpxInfoLimitsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f296615b;

        public Content(@k a aVar) {
            this.f296615b = aVar;
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
            return (obj instanceof Content) && L.f(this.f296615b, ((Content) obj).f296615b);
        }

        public final int hashCode() {
            return this.f296615b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f296615b + ')';
        }
    }

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffCpxInfoLimitsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f296616b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f296617c;

        public Error(@k ApiException apiException) {
            this.f296616b = apiException;
            this.f296617c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f296616b.equals(((Error) obj).f296616b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF208324d() {
            return this.f296617c;
        }

        public final int hashCode() {
            return this.f296616b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f296616b, ')');
        }
    }

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCpxInfoLimitsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            ((HandleDeeplink) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=null)";
        }
    }

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffCpxInfoLimitsInternalAction {
    }

    /* compiled from: TariffCpxInfoLimitsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction$SelectTab;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectTab implements TariffCpxInfoLimitsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f296618b;

        public SelectTab(int i12) {
            this.f296618b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTab) && this.f296618b == ((SelectTab) obj).f296618b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f296618b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectTab(index="), this.f296618b, ')');
        }
    }
}
