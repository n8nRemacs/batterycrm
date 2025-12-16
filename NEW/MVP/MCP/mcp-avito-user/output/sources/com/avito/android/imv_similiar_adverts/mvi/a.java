package com.avito.android.imv_similiar_adverts.mvi;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvSimilarAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_similiar_adverts.mvi.ImvSimilarAdvertsActor$Companion$getSimilarAdverts$1", f = "ImvSimilarAdvertsActor.kt", i = {0, 1}, l = {38, 39, 51, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f170879q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f170880r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f170881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImvSimilarAdvertsParams f170882t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f170883u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, ImvSimilarAdvertsParams imvSimilarAdvertsParams, InterfaceC28373a interfaceC28373a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f170881s = nVar;
        this.f170882t = imvSimilarAdvertsParams;
        this.f170883u = interfaceC28373a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f170881s, this.f170882t, this.f170883u, continuation);
        aVar.f170880r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f170879q
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams r7 = r0.f170882t
            if (r2 == 0) goto L38
            if (r2 == r6) goto L30
            if (r2 == r5) goto L26
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            kotlin.C42729a0.b(r19)
            goto Lc7
        L26:
            java.lang.Object r2 = r0.f170880r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r19)
            r5 = r19
            goto L60
        L30:
            java.lang.Object r2 = r0.f170880r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r19)
            goto L4f
        L38:
            kotlin.C42729a0.b(r19)
            java.lang.Object r2 = r0.f170880r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowLoading r8 = new com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowLoading
            r8.<init>()
            r0.f170880r = r2
            r0.f170879q = r6
            java.lang.Object r6 = r2.emit(r8, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r6 = r7.f170846b
            r0.f170880r = r2
            r0.f170879q = r5
            com.avito.android.imv_similiar_adverts.n r5 = r0.f170881s
            java.lang.String r8 = r7.f170847c
            java.lang.Object r5 = r5.a(r6, r8, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            r8 = 0
            com.avito.android.analytics.a r9 = r0.f170883u
            if (r6 == 0) goto L97
            pN.a r3 = new pN.a
            java.lang.Long r11 = r7.f170851g
            r17 = 0
            java.lang.Long r12 = r7.f170852h
            java.lang.String r13 = r7.f170850f
            java.lang.String r14 = r7.f170848d
            long r6 = r7.f170849e
            r10 = r3
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r9.c(r3)
            com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowContent r3 = new com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowContent
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            uk0.b r5 = (uk0.C49072b) r5
            r3.<init>(r5)
            r0.f170880r = r8
            r0.f170879q = r4
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto Lc7
            return r1
        L97:
            boolean r4 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lc7
            pN.a r4 = new pN.a
            java.lang.Long r11 = r7.f170851g
            r17 = 1
            java.lang.Long r12 = r7.f170852h
            java.lang.String r13 = r7.f170850f
            java.lang.String r14 = r7.f170848d
            long r6 = r7.f170849e
            r10 = r4
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r9.c(r4)
            com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowError r4 = new com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction$ShowError
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r5 = r5.getError()
            r4.<init>(r5)
            r0.f170880r = r8
            r0.f170879q = r3
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lc7
            return r1
        Lc7:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.imv_similiar_adverts.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
