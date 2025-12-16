package com.avito.android.re_agent_landing.landing.mvi.entity;

import AK.c;
import Oh0.j;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "FollowDeeplink", "LoadingError", "OpenFlowsDialog", "ScreenDataLoaded", "ScrollToItem", "StartLoading", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$Close;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$FollowDeeplink;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$LoadingError;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$OpenFlowsDialog;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$ScreenDataLoaded;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$ScrollToItem;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$StartLoading;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ReAgentProfileCreateLandingInternalAction extends n {

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$Close;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ReAgentProfileCreateLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f250827b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1901724563;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$FollowDeeplink;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowDeeplink implements ReAgentProfileCreateLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f250828b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f250829c;

        public FollowDeeplink(@k DeepLink deepLink, boolean z12) {
            this.f250828b = deepLink;
            this.f250829c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FollowDeeplink)) {
                return false;
            }
            FollowDeeplink followDeeplink = (FollowDeeplink) obj;
            return L.f(this.f250828b, followDeeplink.f250828b) && this.f250829c == followDeeplink.f250829c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f250829c) + (this.f250828b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowDeeplink(deepLink=");
            sb2.append(this.f250828b);
            sb2.append(", refreshOnResume=");
            return r.x(sb2, this.f250829c, ')');
        }

        public /* synthetic */ FollowDeeplink(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$LoadingError;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements ReAgentProfileCreateLandingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f250830b;

        public LoadingError(@k ApiError apiError) {
            this.f250830b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof LoadingError) && L.f(this.f250830b, ((LoadingError) obj).f250830b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF212545c() {
            return new J.a(this.f250830b);
        }

        public final int hashCode() {
            return this.f250830b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f250830b, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$OpenFlowsDialog;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFlowsDialog implements ReAgentProfileCreateLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReAgentProfileCreateLandingFlowsData f250831b;

        public OpenFlowsDialog(@k ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData) {
            this.f250831b = reAgentProfileCreateLandingFlowsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenFlowsDialog) && L.f(this.f250831b, ((OpenFlowsDialog) obj).f250831b);
        }

        public final int hashCode() {
            return this.f250831b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFlowsDialog(data=" + this.f250831b + ')';
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$ScreenDataLoaded;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenDataLoaded implements ReAgentProfileCreateLandingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j f250832b;

        public ScreenDataLoaded(@k j jVar) {
            this.f250832b = jVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof ScreenDataLoaded) && L.f(this.f250832b, ((ScreenDataLoaded) obj).f250832b);
        }

        public final int hashCode() {
            return this.f250832b.hashCode();
        }

        @k
        public final String toString() {
            return "ScreenDataLoaded(data=" + this.f250832b + ')';
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$ScrollToItem;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements ReAgentProfileCreateLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f250833b;

        public ScrollToItem(int i12) {
            this.f250833b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToItem) && this.f250833b == ((ScrollToItem) obj).f250833b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f250833b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(position="), this.f250833b, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction$StartLoading;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ReAgentProfileCreateLandingInternalAction {
    }
}
