package com.avito.android.advert.item.realty_usp;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RealtyUspPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.realty_usp.RealtyUspPresenterImpl$startShimmerIfRequired$1", f = "RealtyUspPresenter.kt", i = {0, 1}, l = {72, 73, 74, 77, 79}, m = "invokeSuspend", n = {"currentUserId", "currentUserId"}, s = {"L$0", "L$0"})
/* loaded from: classes10.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f78414q;

    /* renamed from: r, reason: collision with root package name */
    public String f78415r;

    /* renamed from: s, reason: collision with root package name */
    public int f78416s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f78417t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RealtyUspItem f78418u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f78419v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, RealtyUspItem realtyUspItem, m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f78417t = hVar;
        this.f78418u = realtyUspItem;
        this.f78419v = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f78417t, this.f78418u, this.f78419v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f78416s
            com.avito.android.advert.item.realty_usp.h r2 = r11.f78417t
            com.avito.android.advert.item.realty_usp.RealtyUspItem r3 = r11.f78418u
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            com.avito.android.advert.item.realty_usp.c r10 = r2.f78401c
            if (r1 == 0) goto L41
            if (r1 == r8) goto L39
            if (r1 == r7) goto L33
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L2b
            if (r1 != r4) goto L23
            kotlin.C42729a0.b(r12)
            goto La3
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2b:
            kotlin.C42729a0.b(r12)
            goto L8b
        L2f:
            kotlin.C42729a0.b(r12)
            goto L7c
        L33:
            java.lang.String r1 = r11.f78414q
            kotlin.C42729a0.b(r12)
            goto L71
        L39:
            java.lang.String r1 = r11.f78415r
            java.lang.String r8 = r11.f78414q
            kotlin.C42729a0.b(r12)
            goto L5d
        L41:
            kotlin.C42729a0.b(r12)
            com.avito.android.account.E r12 = r2.f78402d
            java.lang.String r12 = r12.a()
            if (r12 != 0) goto L4e
            java.lang.String r12 = ""
        L4e:
            r1 = r12
            r11.f78414q = r1
            r11.f78415r = r1
            r11.f78416s = r8
            java.lang.Object r12 = r10.c(r11)
            if (r12 != r0) goto L5c
            return r0
        L5c:
            r8 = r1
        L5d:
            boolean r12 = kotlin.jvm.internal.L.f(r1, r12)
            if (r12 != 0) goto L7c
            r11.f78414q = r8
            r11.f78415r = r9
            r11.f78416s = r7
            java.lang.Object r12 = r10.b(r11)
            if (r12 != r0) goto L70
            return r0
        L70:
            r1 = r8
        L71:
            r11.f78414q = r9
            r11.f78416s = r6
            java.lang.Object r12 = r10.a(r1, r11)
            if (r12 != r0) goto L7c
            return r0
        L7c:
            java.lang.String r12 = r3.f78389g
            r11.f78414q = r9
            r11.f78415r = r9
            r11.f78416s = r5
            java.lang.Object r12 = com.avito.android.advert.item.realty_usp.h.k(r2, r12, r11)
            if (r12 != r0) goto L8b
            return r0
        L8b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La3
            com.avito.android.advert.item.realty_usp.m r12 = r11.f78419v
            r12.NJ()
            java.lang.String r12 = r3.f78389g
            r11.f78416s = r4
            kotlin.G0 r12 = r10.e(r12)
            if (r12 != r0) goto La3
            return r0
        La3:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.realty_usp.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
