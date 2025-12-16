package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationButton;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentProfileCreateLandingFlowsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.re_agent_landing.landing.flows_dialog.mvi.ReAgentProfileCreateLandingFlowsActor$process$1", f = "ReAgentProfileCreateLandingFlowsActor.kt", i = {}, l = {33, 36, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f250674q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f250675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReAgentProfileCreateLandingFlowsState f250676s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f250677t;

    /* compiled from: ReAgentProfileCreateLandingFlowsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7522a {
        static {
            int[] iArr = new int[ReAgentProfileCreateLandingFlowsState.FlowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReAgentProfileCreateLandingFlowsState.FlowType flowType = ReAgentProfileCreateLandingFlowsState.FlowType.f250686b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f250676s = reAgentProfileCreateLandingFlowsState;
        this.f250677t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f250676s, this.f250677t, continuation);
        aVar.f250675r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        DeepLink deepLink;
        DeepLink deepLink2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f250674q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f250675r;
            ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState = this.f250676s;
            int iOrdinal = reAgentProfileCreateLandingFlowsState.f250685b.ordinal();
            ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData = reAgentProfileCreateLandingFlowsState.f250684a;
            b bVar = this.f250677t;
            if (iOrdinal == 0) {
                bVar.f250678a.c(new Ph0.b("upgrade"));
                if (L.f(reAgentProfileCreateLandingFlowsData.f250729c.f250725h, Boxing.boxBoolean(true))) {
                    b.d dVar = b.d.f250697a;
                    this.f250674q = 1;
                    if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CreationButton creationButton = reAgentProfileCreateLandingFlowsData.f250729c.f250722e;
                    if (creationButton != null && (deepLink = creationButton.f250718c) != null) {
                        b.C7524b c7524b = new b.C7524b(deepLink);
                        this.f250674q = 2;
                        if (interfaceC43172j.emit(c7524b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else if (iOrdinal == 1) {
                bVar.f250678a.c(new Ph0.b("new_profile"));
                CreationButton creationButton2 = reAgentProfileCreateLandingFlowsData.f250730d.f250722e;
                if (creationButton2 != null && (deepLink2 = creationButton2.f250718c) != null) {
                    b.C7524b c7524b2 = new b.C7524b(deepLink2);
                    this.f250674q = 3;
                    if (interfaceC43172j.emit(c7524b2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
