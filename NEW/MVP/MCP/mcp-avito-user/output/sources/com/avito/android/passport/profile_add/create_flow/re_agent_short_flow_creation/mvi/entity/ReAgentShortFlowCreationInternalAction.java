package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
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

/* compiled from: ReAgentShortFlowCreationInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleDeeplinkForResult", "OnBack", "OnClose", "OnFailure", "OnFinal", "StartLoading", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$HandleDeeplinkForResult;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnBack;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnClose;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnFailure;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnFinal;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$StartLoading;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ReAgentShortFlowCreationInternalAction extends n {

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$HandleDeeplinkForResult;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplinkForResult implements ReAgentShortFlowCreationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f211596b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f211597c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Bundle f211598d;

        public HandleDeeplinkForResult(@l Bundle bundle, @k DeepLink deepLink, @k String str) {
            this.f211596b = deepLink;
            this.f211597c = str;
            this.f211598d = bundle;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            if (!(obj instanceof HandleDeeplinkForResult)) {
                return false;
            }
            HandleDeeplinkForResult handleDeeplinkForResult = (HandleDeeplinkForResult) obj;
            return L.f(this.f211596b, handleDeeplinkForResult.f211596b) && L.f(this.f211597c, handleDeeplinkForResult.f211597c) && L.f(this.f211598d, handleDeeplinkForResult.f211598d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f211596b.hashCode() * 31, 31, this.f211597c);
            Bundle bundle = this.f211598d;
            return iD2 + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplinkForResult(deeplink=");
            sb2.append(this.f211596b);
            sb2.append(", requestKey=");
            sb2.append(this.f211597c);
            sb2.append(", args=");
            return H.m(sb2, this.f211598d, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnBack;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBack implements ReAgentShortFlowCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f211599b;

        public OnBack(@l DeepLink deepLink) {
            this.f211599b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBack) && L.f(this.f211599b, ((OnBack) obj).f211599b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f211599b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OnBack(deeplink="), this.f211599b, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnClose;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnClose implements ReAgentShortFlowCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnClose f211600b = new OnClose();

        private OnClose() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnClose);
        }

        public final int hashCode() {
            return 296561916;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnFailure;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFailure implements ReAgentShortFlowCreationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f211601b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211602c;

        public OnFailure(@k ApiException apiException) {
            this.f211601b = apiException;
            this.f211602c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof OnFailure) && this.f211601b.equals(((OnFailure) obj).f211601b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF115372b() {
            return this.f211602c;
        }

        public final int hashCode() {
            return this.f211601b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("OnFailure(throwable="), this.f211601b, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$OnFinal;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFinal implements ReAgentShortFlowCreationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f211603b;

        public OnFinal(boolean z12) {
            this.f211603b = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof OnFinal) && this.f211603b == ((OnFinal) obj).f211603b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f211603b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnFinal(isProfileUpgraded="), this.f211603b, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction$StartLoading;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ReAgentShortFlowCreationInternalAction {
    }
}
