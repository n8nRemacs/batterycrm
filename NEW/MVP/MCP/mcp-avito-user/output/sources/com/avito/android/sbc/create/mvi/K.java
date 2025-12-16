package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "Lkotlin/Function2;", "LUo0/f;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lcom/avito/android/arch/mvi/utils/l;LY41/p;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$6", f = "CreateDiscountDispatchActor.kt", i = {}, l = {1415, 1417}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class K extends SuspendLambda implements Y41.q<com.avito.android.arch.mvi.utils.l<CreateDiscountDispatchState>, Y41.p<? super Uo0.f, ? super Continuation<? super kotlin.G0>, ? extends Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259311q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f259312r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Y41.p f259313s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259314t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C34469a c34469a, Continuation<? super K> continuation) {
        super(3, continuation);
        this.f259314t = c34469a;
    }

    @Override // Y41.q
    public final Object invoke(com.avito.android.arch.mvi.utils.l<CreateDiscountDispatchState> lVar, Y41.p<? super Uo0.f, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super kotlin.G0> continuation) {
        K k12 = new K(this.f259314t, continuation);
        k12.f259312r = lVar;
        k12.f259313s = pVar;
        return k12.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f259311q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.C42729a0.b(r9)
            goto L57
        L1b:
            kotlin.C42729a0.b(r9)
            com.avito.android.arch.mvi.utils.l r9 = r8.f259312r
            Y41.p r1 = r8.f259313s
            Y41.p r1 = (Y41.p) r1
            java.lang.Object r4 = r9.getValue()
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState r4 = (com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState) r4
            boolean r5 = r4 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded
            r6 = 0
            com.avito.android.sbc.create.mvi.a r7 = r8.f259314t
            if (r5 == 0) goto L4c
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded r4 = (com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded) r4
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$h r5 = r4.f259619D
            boolean r5 = r5.f259687c
            if (r5 == 0) goto L4c
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState$DiscountDispatchDataLoaded$d r4 = r4.f259618C
            boolean r4 = com.avito.android.sbc.create.mvi.entity.a.a(r4)
            if (r4 == 0) goto L4c
            r8.f259312r = r6
            r8.f259311q = r3
            java.lang.Object r9 = com.avito.android.sbc.create.mvi.C34469a.g(r7, r9, r1, r8)
            if (r9 != r0) goto L57
            return r0
        L4c:
            r8.f259312r = r6
            r8.f259311q = r2
            java.lang.Object r9 = com.avito.android.sbc.create.mvi.C34469a.e(r7, r9, r1, r8)
            if (r9 != r0) goto L57
            return r0
        L57:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
