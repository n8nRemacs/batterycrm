package com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingFlowsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$c;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$d;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ReAgentProfileCreateLandingFlowsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7523a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C7523a f250690a = new C7523a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C7523a);
        }

        public final int hashCode() {
            return 1310054869;
        }

        @k
        public final String toString() {
            return "ActionClick";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReAgentProfileCreateLandingFlowsState.FlowType f250691a;

        public b(@k ReAgentProfileCreateLandingFlowsState.FlowType flowType) {
            this.f250691a = flowType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f250691a == ((b) obj).f250691a;
        }

        public final int hashCode() {
            return this.f250691a.hashCode();
        }

        @k
        public final String toString() {
            return "FlowSelected(flowType=" + this.f250691a + ')';
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$c;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f250692a;

        public c(@k DeepLink deepLink) {
            this.f250692a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f250692a, ((c) obj).f250692a);
        }

        public final int hashCode() {
            return this.f250692a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f250692a, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a$d;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f250693a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -607932996;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }
}
