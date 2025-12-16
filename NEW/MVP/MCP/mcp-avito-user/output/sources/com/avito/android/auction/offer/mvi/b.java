package com.avito.android.auction.offer.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AuctionActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNd/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auction.offer.mvi.AuctionActor$process$2", f = "AuctionActor.kt", i = {0, 1, 2, 3}, l = {42, 43, 44, 45, 47}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Nd.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92566q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92567r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f92568s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f92568s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f92568s, continuation);
        bVar.f92567r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Nd.c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
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
            int r1 = r8.f92566q
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L35
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L24
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.C42729a0.b(r9)
            goto Lb5
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.f92567r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto La7
        L2d:
            java.lang.Object r1 = r8.f92567r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L67
        L35:
            java.lang.Object r1 = r8.f92567r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L52
        L3d:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f92567r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            Nd.c$e r9 = Nd.c.e.f11632a
            r8.f92567r = r1
            r8.f92566q = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            com.avito.android.auction.offer.mvi.c r9 = r8.f92568s
            com.avito.android.auction.offer.domain.d r6 = r9.f92569a
            com.avito.android.auction.offer.AuctionOfferParams r9 = r9.f92570b
            java.lang.String r7 = r9.f92443b
            r8.f92567r = r1
            r8.f92566q = r5
            java.lang.String r9 = r9.f92445d
            java.lang.Object r9 = r6.a(r7, r9, r8)
            if (r9 != r0) goto L67
            return r0
        L67:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L89
            Nd.c$d r3 = new Nd.c$d
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            com.avito.android.auction.remote.model.AuctionSendingResult r9 = (com.avito.android.auction.remote.model.AuctionSendingResult) r9
            com.avito.android.deep_linking.links.DeepLink r9 = r9.getDeepLink()
            r3.<init>(r9)
            r8.f92567r = r1
            r8.f92566q = r4
            java.lang.Object r9 = r1.emit(r3, r8)
            if (r9 != r0) goto La7
            return r0
        L89:
            boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto La7
            Nd.c$j r4 = new Nd.c$j
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r9 = r9.getError()
            java.lang.String r9 = r9.getF244063c()
            r4.<init>(r9)
            r8.f92567r = r1
            r8.f92566q = r3
            java.lang.Object r9 = r1.emit(r4, r8)
            if (r9 != r0) goto La7
            return r0
        La7:
            Nd.c$c r9 = Nd.c.C0748c.f11630a
            r3 = 0
            r8.f92567r = r3
            r8.f92566q = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto Lb5
            return r0
        Lb5:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auction.offer.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
