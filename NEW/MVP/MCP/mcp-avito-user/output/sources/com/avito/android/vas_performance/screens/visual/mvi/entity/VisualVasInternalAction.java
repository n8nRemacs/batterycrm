package com.avito.android.vas_performance.screens.visual.mvi.entity;

import AK.c;
import HL0.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.vas_performance.screens.visual.item.item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeButtonState", "Content", "Error", "FinishFlow", "ItemSelected", "Loading", "OnBackPressed", "OpenDeepLink", "PutVideoVasSelectionParam", "ShowErrorToast", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ItemSelected;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$OnBackPressed;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$PutVideoVasSelectionParam;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ShowErrorToast;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VisualVasInternalAction extends n {

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeButtonState implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f321131b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f321132c;

        public ChangeButtonState(boolean z12, @l Integer num) {
            this.f321131b = z12;
            this.f321132c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeButtonState)) {
                return false;
            }
            ChangeButtonState changeButtonState = (ChangeButtonState) obj;
            return this.f321131b == changeButtonState.f321131b && L.f(this.f321132c, changeButtonState.f321132c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f321131b) * 31;
            Integer num = this.f321132c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeButtonState(isLoading=");
            sb2.append(this.f321131b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f321132c, ')');
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements VisualVasInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f321133b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f321134c;

        public Content(@k b bVar, @k String str) {
            this.f321133b = bVar;
            this.f321134c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return L.f(this.f321133b, content.f321133b) && L.f(this.f321134c, content.f321134c);
        }

        public final int hashCode() {
            return this.f321134c.hashCode() + (this.f321133b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f321133b);
            sb2.append(", checkoutContext=");
            return C22026a.c(sb2, this.f321134c, ')');
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements VisualVasInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f321135b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f321136c;

        public Error(@k ApiError apiError) {
            this.f321135b = apiError;
            this.f321136c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof Error) && L.f(this.f321135b, ((Error) obj).f321135b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF274987c() {
            return this.f321136c;
        }

        public final int hashCode() {
            return this.f321135b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f321135b, ')');
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$FinishFlow;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f321137b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return 75607690;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ItemSelected;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemSelected implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f321138b;

        public ItemSelected(@k a aVar) {
            this.f321138b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemSelected) && L.f(this.f321138b, ((ItemSelected) obj).f321138b);
        }

        public final int hashCode() {
            return this.f321138b.hashCode();
        }

        @k
        public final String toString() {
            return "ItemSelected(item=" + this.f321138b + ')';
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements VisualVasInternalAction {
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$OnBackPressed;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackPressed implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnBackPressed f321139b = new OnBackPressed();

        private OnBackPressed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return -860194029;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f321140b;

        public OpenDeepLink(@l DeepLink deepLink) {
            this.f321140b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f321140b, ((OpenDeepLink) obj).f321140b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f321140b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f321140b, ')');
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$PutVideoVasSelectionParam;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PutVideoVasSelectionParam implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f321141b;

        public PutVideoVasSelectionParam(boolean z12) {
            this.f321141b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PutVideoVasSelectionParam) && this.f321141b == ((PutVideoVasSelectionParam) obj).f321141b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f321141b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PutVideoVasSelectionParam(value="), this.f321141b, ')');
        }
    }

    /* compiled from: VisualVasInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction$ShowErrorToast;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements VisualVasInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f321142b;

        public ShowErrorToast(@k ApiError apiError) {
            this.f321142b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f321142b, ((ShowErrorToast) obj).f321142b);
        }

        public final int hashCode() {
            return this.f321142b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowErrorToast(error="), this.f321142b, ')');
        }
    }
}
