package com.avito.android.advert.item.recall_me;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$onRecallMeClick$1", f = "RecallMeBlockPresenter.kt", i = {1}, l = {119, 120, 121, 128}, m = "invokeSuspend", n = {"userName"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f78516q;

    /* renamed from: r, reason: collision with root package name */
    public int f78517r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f78518s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f78519t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f78520u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ RecallMeBlockItem f78521v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f78522w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f78523x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, o oVar, String str, RecallMeBlockItem recallMeBlockItem, String str2, String str3, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f78518s = zVar;
        this.f78519t = oVar;
        this.f78520u = str;
        this.f78521v = recallMeBlockItem;
        this.f78522w = str2;
        this.f78523x = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f78518s, this.f78519t, this.f78520u, this.f78521v, this.f78522w, this.f78523x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f78517r
            com.avito.android.advert.item.recall_me.o r2 = r12.f78519t
            com.avito.android.advert.item.recall_me.j r3 = r2.f78488f
            com.avito.android.advert.item.recall_me.z r10 = r12.f78518s
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 == r7) goto L2d
            if (r1 == r6) goto L27
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            goto L23
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            kotlin.C42729a0.b(r13)
            goto L85
        L27:
            java.lang.String r1 = r12.f78516q
            kotlin.C42729a0.b(r13)
            goto L50
        L2d:
            kotlin.C42729a0.b(r13)
            goto L40
        L31:
            kotlin.C42729a0.b(r13)
            r10.setLoading(r7)
            r12.f78517r = r7
            java.lang.Object r13 = r3.d(r12)
            if (r13 != r0) goto L40
            return r0
        L40:
            java.lang.String r13 = (java.lang.String) r13
            r12.f78516q = r13
            r12.f78517r = r6
            java.lang.Object r1 = r3.h(r12)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r11 = r1
            r1 = r13
            r13 = r11
        L50:
            java.lang.String r3 = r12.f78520u
            boolean r13 = kotlin.jvm.internal.L.f(r13, r3)
            r3 = 0
            if (r13 == 0) goto L6e
            r12.f78516q = r3
            r12.f78517r = r5
            int r13 = com.avito.android.advert.item.recall_me.o.f78483n
            java.lang.String r4 = r12.f78522w
            java.lang.String r6 = r12.f78523x
            com.avito.android.advert.item.recall_me.RecallMeBlockItem r3 = r12.f78521v
            r5 = r1
            r7 = r12
            java.lang.Object r13 = r2.O(r3, r4, r5, r6, r7)
            if (r13 != r0) goto L85
            return r0
        L6e:
            r12.f78516q = r3
            r12.f78517r = r4
            java.lang.String r7 = r12.f78520u
            java.lang.String r8 = r12.f78523x
            java.lang.String r3 = r12.f78522w
            com.avito.android.advert.item.recall_me.RecallMeBlockItem r5 = r12.f78521v
            com.avito.android.advert.item.recall_me.z r6 = r12.f78518s
            r4 = r1
            r9 = r12
            java.lang.Object r13 = com.avito.android.advert.item.recall_me.o.k(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L85
            return r0
        L85:
            r13 = 0
            r10.setLoading(r13)
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
