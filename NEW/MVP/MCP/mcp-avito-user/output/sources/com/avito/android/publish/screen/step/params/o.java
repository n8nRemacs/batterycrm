package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import com.avito.android.intermediary_verification.deeplink.d;
import com.avito.android.publish.C0;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$observeUserVerificationDeeplinkResult$3", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class o extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f241514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f241515r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f241515r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f241515r, continuation);
        oVar.f241514q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((o) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f241514q;
        p pVar = this.f241515r;
        D6.w(pVar.f241516a.getView());
        pVar.f241522g.e();
        com.avito.android.intermediary_verification.deeplink.d dVar = (com.avito.android.intermediary_verification.deeplink.d) c43501a.f413261b;
        boolean z12 = dVar instanceof d.a;
        C0 c02 = pVar.f241520e;
        if (z12) {
            c02.ye();
        } else if (dVar instanceof d.b) {
            pVar.f241517b.g(null, true);
            ((PublishDetailsFragment.k) pVar.f241523h).invoke(InterfaceC14065a.c.C14068e.f8266a);
        } else if (dVar.equals(d.c.f173130b)) {
            c02.ye();
            c02.xe(null);
        }
        return G0.f406611a;
    }
}
