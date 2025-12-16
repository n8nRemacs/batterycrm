package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.InterfaceC29684j;
import com.avito.android.deep_linking.links.O;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.analytics.FromPage;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity.ReAgentShortFlowCreationInternalAction;
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

/* compiled from: ReAgentShortFlowCreationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.ReAgentShortFlowCreationActor$handleDeeplinkResult$1", f = "ReAgentShortFlowCreationActor.kt", i = {}, l = {135, 139, 152, 156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ReAgentShortFlowCreationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211579q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f211580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f211581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f211582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f211583u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, InterfaceC14249c interfaceC14249c, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f211581s = str;
        this.f211582t = interfaceC14249c;
        this.f211583u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f211581s, this.f211582t, this.f211583u, continuation);
        aVar.f211580r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReAgentShortFlowCreationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f211579q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f211580r;
            String str = this.f211581s;
            boolean zF2 = L.f(str, "passport.re_agent_short_flow_creation.start_verification");
            InterfaceC14249c interfaceC14249c = this.f211582t;
            c cVar = this.f211583u;
            if (zF2) {
                if (interfaceC14249c instanceof O.d) {
                    InterfaceC28373a interfaceC28373a = cVar.f211588a;
                    Integer numBoxInt = Boxing.boxInt(1);
                    Integer numBoxInt2 = Boxing.boxInt(1200);
                    String name = cVar.f211590c.e().getName();
                    if (name == null) {
                        name = "";
                    }
                    interfaceC28373a.c(new M50.j(numBoxInt, numBoxInt2, name, null, AnalyticScreen.f211210c, ProfileCreateExtendedFlow.Profile.Upgrade.f211175d, null));
                } else if (interfaceC14249c instanceof O.b) {
                    cVar.f211588a.c(new R50.b(FromPage.f211544d));
                    ReAgentShortFlowCreationInternalAction.OnFinal onFinal = new ReAgentShortFlowCreationInternalAction.OnFinal(false);
                    this.f211579q = 1;
                    if (interfaceC43172j.emit(onFinal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof O.a) {
                    ReAgentShortFlowCreationInternalAction.OnClose onClose = ReAgentShortFlowCreationInternalAction.OnClose.f211600b;
                    this.f211579q = 2;
                    if (interfaceC43172j.emit(onClose, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (L.f(str, "passport.re_agent_short_flow_creation.start_verification_popup")) {
                if (interfaceC14249c instanceof InterfaceC29684j.b) {
                    cVar.f211588a.c(new R50.b(FromPage.f211544d));
                    ReAgentShortFlowCreationInternalAction.OnFinal onFinal2 = new ReAgentShortFlowCreationInternalAction.OnFinal(false);
                    this.f211579q = 3;
                    if (interfaceC43172j.emit(onFinal2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof InterfaceC29684j.a) {
                    ReAgentShortFlowCreationInternalAction.OnClose onClose2 = ReAgentShortFlowCreationInternalAction.OnClose.f211600b;
                    this.f211579q = 4;
                    if (interfaceC43172j.emit(onClose2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
