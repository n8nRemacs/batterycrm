package com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingFlowsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState;", "", "a", "FlowType", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReAgentProfileCreateLandingFlowsState {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f250683c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ReAgentProfileCreateLandingFlowsData f250684a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FlowType f250685b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReAgentProfileCreateLandingFlowsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState$FlowType;", "", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlowType {

        /* renamed from: b, reason: collision with root package name */
        public static final FlowType f250686b;

        /* renamed from: c, reason: collision with root package name */
        public static final FlowType f250687c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FlowType[] f250688d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f250689e;

        static {
            FlowType flowType = new FlowType("Upgrade", 0);
            f250686b = flowType;
            FlowType flowType2 = new FlowType("Create", 1);
            f250687c = flowType2;
            FlowType[] flowTypeArr = {flowType, flowType2};
            f250688d = flowTypeArr;
            f250689e = c.a(flowTypeArr);
        }

        public FlowType() {
            throw null;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) f250688d.clone();
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState$a;", "", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ReAgentProfileCreateLandingFlowsState(@k ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData, @k FlowType flowType) {
        this.f250684a = reAgentProfileCreateLandingFlowsData;
        this.f250685b = flowType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentProfileCreateLandingFlowsState)) {
            return false;
        }
        ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState = (ReAgentProfileCreateLandingFlowsState) obj;
        return L.f(this.f250684a, reAgentProfileCreateLandingFlowsState.f250684a) && this.f250685b == reAgentProfileCreateLandingFlowsState.f250685b;
    }

    public final int hashCode() {
        return this.f250685b.hashCode() + (this.f250684a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ReAgentProfileCreateLandingFlowsState(data=" + this.f250684a + ", selectedFlowType=" + this.f250685b + ')';
    }
}
