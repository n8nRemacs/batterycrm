package com.avito.android.gsm_realty_trx_flow.impl_module.link;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gsm_realty_trx_flow.public_module.link.GsmRealtyTrxFlowLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import java.util.Arrays;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: GsmRealtyTrxFlowLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gsm_realty_trx_flow.impl_module.link.GsmRealtyTrxFlowLinkHandler$doHandleSuspend$2", f = "GsmRealtyTrxFlowLinkHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f161259q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f161260r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f161260r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f161260r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f161259q;
        b bVar = this.f161260r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                XH.a aVar = bVar.f161262h;
                this.f161259q = 1;
                obj = aVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                YH.a aVar2 = (YH.a) ((TypedResult.Success) typedResult).getResult();
                V2.f318762a.c("GsmRealtyTrxFlowLinkHandler", "onSuccess: uri=" + aVar2.getUri(), null);
                GsmRealtyTrxFlowLink.b bVar2 = new GsmRealtyTrxFlowLink.b();
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = bVar.f161261g;
                DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(aVar2.getUri()).toArray(new DeepLink[0]);
                bVar.i(bVar2, aVar3, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                V2.f318762a.a("GsmRealtyTrxFlowLinkHandler", "onFailure:", C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause()));
                bVar.i(new GsmRealtyTrxFlowLink.b(), bVar.f161261g, new DeepLink[0]);
            }
        } catch (Exception e12) {
            V2.f318762a.a("GsmRealtyTrxFlowLinkHandler", "onException:", e12);
            bVar.i(new GsmRealtyTrxFlowLink.b(), bVar.f161261g, new DeepLink[0]);
        }
        return G0.f406611a;
    }
}
