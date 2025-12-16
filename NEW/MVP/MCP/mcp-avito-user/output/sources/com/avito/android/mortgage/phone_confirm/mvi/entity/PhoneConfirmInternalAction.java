package com.avito.android.mortgage.phone_confirm.mvi.entity;

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
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.domain.check_access.a;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AccessCheckCompleted", "AccessCheckFailed", "AccessCheckStarted", "CodeChanged", "ConfirmationCompleted", "ConfirmationFailed", "ConfirmationStarted", "InitState", "TimerTick", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckCompleted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckFailed;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckStarted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$CodeChanged;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationCompleted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationFailed;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationStarted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$InitState;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$TimerTick;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PhoneConfirmInternalAction extends n {

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckCompleted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccessCheckCompleted implements PhoneConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f201633b;

        public AccessCheckCompleted(@k a aVar) {
            this.f201633b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF220626e() {
            return "check_access";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "check_access";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccessCheckCompleted) && L.f(this.f201633b, ((AccessCheckCompleted) obj).f201633b);
        }

        public final int hashCode() {
            return this.f201633b.hashCode();
        }

        @k
        public final String toString() {
            return "AccessCheckCompleted(result=" + this.f201633b + ')';
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckFailed;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccessCheckFailed implements PhoneConfirmInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201634b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201635c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201636d = "check_access";

        public AccessCheckFailed(@k ApiError apiError) {
            this.f201634b = apiError;
            this.f201635c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220626e() {
            return this.f201636d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f201636d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccessCheckFailed) && L.f(this.f201634b, ((AccessCheckFailed) obj).f201634b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF123698c() {
            return this.f201635c;
        }

        public final int hashCode() {
            return this.f201634b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("AccessCheckFailed(error="), this.f201634b, ')');
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$AccessCheckStarted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AccessCheckStarted extends TrackableLoadingStarted implements PhoneConfirmInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201637d = "check_access";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220626e() {
            return this.f201637d;
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$CodeChanged;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CodeChanged implements PhoneConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201638b;

        public CodeChanged(@k String str) {
            this.f201638b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CodeChanged) && L.f(this.f201638b, ((CodeChanged) obj).f201638b);
        }

        public final int hashCode() {
            return this.f201638b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CodeChanged(code="), this.f201638b, ')');
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationCompleted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmationCompleted implements PhoneConfirmInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f201639b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f201640c;

        public ConfirmationCompleted(boolean z12, @l String str) {
            this.f201639b = z12;
            this.f201640c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF220626e() {
            return "confirmation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "confirmation";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmationCompleted)) {
                return false;
            }
            ConfirmationCompleted confirmationCompleted = (ConfirmationCompleted) obj;
            return this.f201639b == confirmationCompleted.f201639b && L.f(this.f201640c, confirmationCompleted.f201640c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f201639b) * 31;
            String str = this.f201640c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmationCompleted(access=");
            sb2.append(this.f201639b);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f201640c, ')');
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationFailed;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmationFailed implements PhoneConfirmInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201641b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201642c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201643d = "confirmation";

        public ConfirmationFailed(@k ApiError apiError) {
            this.f201641b = apiError;
            this.f201642c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220626e() {
            return this.f201643d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f201643d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmationFailed) && L.f(this.f201641b, ((ConfirmationFailed) obj).f201641b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF123698c() {
            return this.f201642c;
        }

        public final int hashCode() {
            return this.f201641b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ConfirmationFailed(error="), this.f201641b, ')');
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$ConfirmationStarted;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfirmationStarted extends TrackableLoadingStarted implements PhoneConfirmInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201644d = "confirmation";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220626e() {
            return this.f201644d;
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$InitState;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitState implements PhoneConfirmInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PhoneConfirmArguments f201645b;

        public InitState(@k PhoneConfirmArguments phoneConfirmArguments) {
            this.f201645b = phoneConfirmArguments;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }

    /* compiled from: PhoneConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction$TimerTick;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimerTick implements PhoneConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f201646b;

        public TimerTick(int i12) {
            this.f201646b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimerTick) && this.f201646b == ((TimerTick) obj).f201646b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f201646b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("TimerTick(secondsLeft="), this.f201646b, ')');
        }
    }
}
