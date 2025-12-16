package com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingFlowsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "", "a", "b", "c", "d", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$c;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$d;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ReAgentProfileCreateLandingFlowsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReAgentProfileCreateLandingFlowsState.FlowType f250694a;

        public a(@k ReAgentProfileCreateLandingFlowsState.FlowType flowType) {
            this.f250694a = flowType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f250694a == ((a) obj).f250694a;
        }

        public final int hashCode() {
            return this.f250694a.hashCode();
        }

        @k
        public final String toString() {
            return "FlowSelected(flowType=" + this.f250694a + ')';
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C7524b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f250695a;

        public C7524b(@k DeepLink deepLink) {
            this.f250695a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7524b) && L.f(this.f250695a, ((C7524b) obj).f250695a);
        }

        public final int hashCode() {
            return this.f250695a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f250695a, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$c;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f250696a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2091960025;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b$d;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f250697a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 568670278;
        }

        @k
        public final String toString() {
            return "OpenErrorDialog";
        }
    }
}
