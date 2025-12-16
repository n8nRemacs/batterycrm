package com.avito.android.service_fee_conditions.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pu0.C47142a;

/* compiled from: ServiceFeeConditionsInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "FinishFlow", "HandleDeeplink", "Loading", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Back;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Content;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Error;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$FinishFlow;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$HandleDeeplink;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Loading;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceFeeConditionsInternalAction extends n {

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Back;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements ServiceFeeConditionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f278449b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1109480804;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Content;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ServiceFeeConditionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47142a f278450b;

        public Content(@k C47142a c47142a) {
            this.f278450b = c47142a;
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
            return (obj instanceof Content) && L.f(this.f278450b, ((Content) obj).f278450b);
        }

        public final int hashCode() {
            return this.f278450b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f278450b + ')';
        }
    }

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Error;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ServiceFeeConditionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f278451b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f278452c;

        public Error(@k ApiException apiException) {
            this.f278451b = apiException;
            this.f278452c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f278451b.equals(((Error) obj).f278451b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF205434c() {
            return this.f278452c;
        }

        public final int hashCode() {
            return this.f278451b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f278451b, ')');
        }
    }

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$FinishFlow;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements ServiceFeeConditionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f278453b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -885080290;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$HandleDeeplink;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ServiceFeeConditionsInternalAction {
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

    /* compiled from: ServiceFeeConditionsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ServiceFeeConditionsInternalAction {
    }
}
