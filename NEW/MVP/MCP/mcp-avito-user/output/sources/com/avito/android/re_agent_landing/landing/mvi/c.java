package com.avito.android.re_agent_landing.landing.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingArgs;
import com.avito.android.re_agent_landing.landing.mvi.entity.ReAgentProfileCreateLandingInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentProfileCreateLandingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.b<ReAgentProfileCreateLandingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.re_agent_landing.landing.interactor.a f250813a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f250814b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReAgentProfileCreateLandingArgs f250815c;

    /* compiled from: ReAgentProfileCreateLandingBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.re_agent_landing.landing.mvi.ReAgentProfileCreateLandingBootstrap$produce$1", f = "ReAgentProfileCreateLandingBootstrap.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ReAgentProfileCreateLandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f250816q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f250817r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f250817r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ReAgentProfileCreateLandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f250816q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f250817r;
                c cVar = c.this;
                cVar.f250814b.c(new Ph0.e(cVar.f250815c.f250555b));
                InterfaceC43160i<ReAgentProfileCreateLandingInternalAction> interfaceC43160iO = cVar.f250813a.O();
                this.f250816q = 1;
                if (C43175k.u(this, interfaceC43160iO, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k com.avito.android.re_agent_landing.landing.interactor.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ReAgentProfileCreateLandingArgs reAgentProfileCreateLandingArgs) {
        this.f250813a = aVar;
        this.f250814b = interfaceC28373a;
        this.f250815c = reAgentProfileCreateLandingArgs;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ReAgentProfileCreateLandingInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
