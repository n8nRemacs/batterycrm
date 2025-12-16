package com.avito.android.trx_promo_impl.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TrxPromoGetScreenDataUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_impl.domain.TrxPromoGetScreenDataUseCaseImpl$invoke$1", f = "TrxPromoGetScreenDataUseCase.kt", i = {0, 1}, l = {21, 22, AvailableCode.ERROR_NO_ACTIVITY, 30, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super TrxPromoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f304165q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f304166r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f304167s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f304167s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f304167s, continuation);
        bVar.f304166r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TrxPromoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f304165q
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L25
            if (r1 == r4) goto L20
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            kotlin.C42729a0.b(r15)
            goto Lca
        L25:
            java.lang.Object r1 = r14.f304166r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            goto L5e
        L2d:
            java.lang.Object r1 = r14.f304166r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            goto L4d
        L35:
            kotlin.C42729a0.b(r15)
            java.lang.Object r15 = r14.f304166r
            kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$Loading r1 = new com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$Loading
            r1.<init>()
            r14.f304166r = r15
            r14.f304165q = r6
            java.lang.Object r1 = r15.emit(r1, r14)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            r1 = r15
        L4d:
            com.avito.android.trx_promo_impl.domain.c r15 = r14.f304167s
            r14.f304166r = r1
            r14.f304165q = r5
            com.avito.android.trx_promo_impl.data.a r5 = r15.f304169c
            java.lang.String r15 = r15.f304168b
            java.lang.Object r15 = r5.c(r15, r14)
            if (r15 != r0) goto L5e
            return r0
        L5e:
            com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
            boolean r5 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            r6 = 0
            if (r5 == 0) goto La4
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            java.lang.Object r15 = r15.getResult()
            YF0.o r15 = (YF0.o) r15
            boolean r2 = r15 instanceof YF0.o.b
            if (r2 == 0) goto L83
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$ContentV7 r2 = new com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$ContentV7
            YF0.o$b r15 = (YF0.o.b) r15
            r2.<init>(r15)
            r14.f304166r = r6
            r14.f304165q = r4
            java.lang.Object r15 = r1.emit(r2, r14)
            if (r15 != r0) goto Lca
            return r0
        L83:
            boolean r2 = r15 instanceof YF0.o.a
            if (r2 == 0) goto Lca
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$HandleDeeplink r2 = new com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$HandleDeeplink
            YF0.o$a r15 = (YF0.o.a) r15
            com.avito.android.deep_linking.links.DeepLink r8 = r15.getAction()
            r10 = 0
            r11 = 0
            r9 = 0
            r12 = 14
            r13 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.f304166r = r6
            r14.f304165q = r3
            java.lang.Object r15 = r1.emit(r2, r14)
            if (r15 != r0) goto Lca
            return r0
        La4:
            boolean r3 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Lcd
            com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
            com.avito.android.remote.error.ApiError r3 = r15.getError()
            java.lang.Throwable r15 = r15.getCause()
            com.avito.android.util.ApiException r15 = com.avito.android.util.C35936s.a(r3, r15)
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$Error r3 = new com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$Error
            com.avito.android.remote.error.ApiError r15 = com.avito.android.error.z.n(r15)
            r3.<init>(r15)
            r14.f304166r = r6
            r14.f304165q = r2
            java.lang.Object r15 = r1.emit(r3, r14)
            if (r15 != r0) goto Lca
            return r0
        Lca:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        Lcd:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
