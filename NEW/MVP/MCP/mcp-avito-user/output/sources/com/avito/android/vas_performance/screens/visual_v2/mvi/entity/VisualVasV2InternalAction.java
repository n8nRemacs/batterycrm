package com.avito.android.vas_performance.screens.visual_v2.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import xL0.C49858a;

/* compiled from: VisualVasV2InternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeButtonState", "Content", "Error", "FinishFlow", "Loading", "OnBackPressed", "OpenDeepLink", "ServiceSwitched", "SetAutoprolongLoading", "SetAutoprolongState", "ShowErrorToast", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Content;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Error;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$OnBackPressed;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ServiceSwitched;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$SetAutoprolongLoading;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$SetAutoprolongState;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ShowErrorToast;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VisualVasV2InternalAction extends n {

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeButtonState implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f321268b;

        public ChangeButtonState(boolean z12) {
            this.f321268b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeButtonState) && this.f321268b == ((ChangeButtonState) obj).f321268b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f321268b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeButtonState(isLoading="), this.f321268b, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Content;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements VisualVasV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C49858a f321269b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f321270c;

        public Content(@k C49858a c49858a, @k String str) {
            this.f321269b = c49858a;
            this.f321270c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261547d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f321269b, content.f321269b) && L.f(this.f321270c, content.f321270c);
        }

        public final int hashCode() {
            return this.f321270c.hashCode() + (this.f321269b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f321269b);
            sb2.append(", checkoutContext=");
            return C22026a.c(sb2, this.f321270c, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Error;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements VisualVasV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f321271b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f321272c;

        public Error(@k ApiError apiError) {
            this.f321271b = apiError;
            this.f321272c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261547d() {
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
            return (obj instanceof Error) && L.f(this.f321271b, ((Error) obj).f321271b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF261546d() {
            return this.f321272c;
        }

        public final int hashCode() {
            return this.f321271b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f321271b, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f321273b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -1290692517;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements VisualVasV2InternalAction {
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$OnBackPressed;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackPressed implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f321274b;

        public OnBackPressed(boolean z12) {
            this.f321274b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBackPressed) && this.f321274b == ((OnBackPressed) obj).f321274b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f321274b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnBackPressed(finishFlow="), this.f321274b, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f321275b;

        public OpenDeepLink(@l DeepLink deepLink) {
            this.f321275b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f321275b, ((OpenDeepLink) obj).f321275b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f321275b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f321275b, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ServiceSwitched;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceSwitched implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f321276b;

        public ServiceSwitched(@k String str) {
            this.f321276b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceSwitched) && L.f(this.f321276b, ((ServiceSwitched) obj).f321276b);
        }

        public final int hashCode() {
            return this.f321276b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ServiceSwitched(itemId="), this.f321276b, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$SetAutoprolongLoading;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAutoprolongLoading implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f321277b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f321278c;

        public SetAutoprolongLoading(@k String str, boolean z12) {
            this.f321277b = str;
            this.f321278c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetAutoprolongLoading)) {
                return false;
            }
            SetAutoprolongLoading setAutoprolongLoading = (SetAutoprolongLoading) obj;
            return L.f(this.f321277b, setAutoprolongLoading.f321277b) && this.f321278c == setAutoprolongLoading.f321278c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f321278c) + (this.f321277b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetAutoprolongLoading(itemId=");
            sb2.append(this.f321277b);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f321278c, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$SetAutoprolongState;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAutoprolongState implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f321279b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f321280c;

        public SetAutoprolongState(@k String str, boolean z12) {
            this.f321279b = str;
            this.f321280c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetAutoprolongState)) {
                return false;
            }
            SetAutoprolongState setAutoprolongState = (SetAutoprolongState) obj;
            return L.f(this.f321279b, setAutoprolongState.f321279b) && this.f321280c == setAutoprolongState.f321280c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f321280c) + (this.f321279b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetAutoprolongState(itemId=");
            sb2.append(this.f321279b);
            sb2.append(", enabled=");
            return r.x(sb2, this.f321280c, ')');
        }
    }

    /* compiled from: VisualVasV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction$ShowErrorToast;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements VisualVasV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f321281b;

        public ShowErrorToast(@k ApiError apiError) {
            this.f321281b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f321281b, ((ShowErrorToast) obj).f321281b);
        }

        public final int hashCode() {
            return this.f321281b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowErrorToast(error="), this.f321281b, ')');
        }
    }
}
