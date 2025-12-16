package com.avito.android.advert.item.recall_me;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$bindView$1", f = "RecallMeBlockPresenter.kt", i = {0, 1}, l = {50, 51, 52}, m = "invokeSuspend", n = {"currentUserId", "currentUserId"}, s = {"L$0", "L$0"})
/* loaded from: classes10.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f78499q;

    /* renamed from: r, reason: collision with root package name */
    public String f78500r;

    /* renamed from: s, reason: collision with root package name */
    public int f78501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f78502t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f78503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, z zVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f78502t = oVar;
        this.f78503u = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new p(this.f78502t, this.f78503u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
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
            int r1 = r8.f78501s
            com.avito.android.advert.item.recall_me.o r2 = r8.f78502t
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.advert.item.recall_me.j r7 = r2.f78488f
            if (r1 == 0) goto L30
            if (r1 == r6) goto L28
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlin.C42729a0.b(r9)
            goto L66
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.String r1 = r8.f78499q
            kotlin.C42729a0.b(r9)
            goto L5b
        L28:
            java.lang.String r1 = r8.f78500r
            java.lang.String r2 = r8.f78499q
            kotlin.C42729a0.b(r9)
            goto L47
        L30:
            kotlin.C42729a0.b(r9)
            com.avito.android.recall_me.domain.n r9 = r2.f78486d
            java.lang.String r1 = r9.a()
            r8.f78499q = r1
            r8.f78500r = r1
            r8.f78501s = r6
            java.lang.Object r9 = r7.c(r8)
            if (r9 != r0) goto L46
            return r0
        L46:
            r2 = r1
        L47:
            boolean r9 = kotlin.jvm.internal.L.f(r1, r9)
            if (r9 != 0) goto L6b
            r8.f78499q = r2
            r8.f78500r = r3
            r8.f78501s = r5
            java.lang.Object r9 = r7.b(r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            r1 = r2
        L5b:
            r8.f78499q = r3
            r8.f78501s = r4
            java.lang.Object r9 = r7.a(r1, r8)
            if (r9 != r0) goto L66
            return r0
        L66:
            com.avito.android.advert.item.recall_me.z r9 = r8.f78503u
            r9.OG()
        L6b:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
