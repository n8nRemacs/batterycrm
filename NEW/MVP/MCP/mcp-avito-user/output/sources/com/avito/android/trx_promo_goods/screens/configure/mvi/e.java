package com.avito.android.trx_promo_goods.screens.configure.mvi;

import com.avito.android.paid_services.PaidServicesResultRepository;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: TrxPromoGoodsConfigureActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.mvi.TrxPromoGoodsConfigureActor$process$deeplinkResultFlow$2", f = "TrxPromoGoodsConfigureActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f303580q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f303581r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f303581r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f303581r, continuation);
        eVar.f303580q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f303580q;
        f fVar = this.f303581r;
        if (fVar.f303597e.contains(c43501a.f413261b)) {
            PaidServicesResultRepository.Result result = PaidServicesResultRepository.Result.f210608b;
            fVar.f303595c.b();
        }
        return G0.f406611a;
    }
}
