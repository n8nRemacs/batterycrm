package com.avito.android.mortgage.deeplink;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageApplicationDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.deeplink.MortgageApplicationDeeplinkHandler$doHandle$1$1", f = "MortgageApplicationDeeplinkHandler.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"applicationId"}, s = {"L$0"})
/* renamed from: com.avito.android.mortgage.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32586a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f198782q;

    /* renamed from: r, reason: collision with root package name */
    public int f198783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32588c f198784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationLink f198785t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32586a(C32588c c32588c, MortgageApplicationLink mortgageApplicationLink, Continuation<? super C32586a> continuation) {
        super(2, continuation);
        this.f198784s = c32588c;
        this.f198785t = mortgageApplicationLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32586a(this.f198784s, this.f198785t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32586a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v25, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f198783r
            com.avito.android.mortgage.deeplink.c r2 = r7.f198784s
            r3 = 2131953853(0x7f1308bd, float:1.9544189E38)
            r4 = 1
            com.avito.android.deeplink_handler.view.a$i r5 = r2.f198796j
            com.avito.android.deeplink_handler.view.a$g r6 = r2.f198795i
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1a
            kotlin.jvm.internal.l0$h r0 = r7.f198782q
            kotlin.C42729a0.b(r8)
            goto L4e
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            kotlin.C42729a0.b(r8)
            com.avito.android.deeplink_handler.handler.bundle.a r8 = r2.d()
            r6.g(r8, r4)
            kotlin.jvm.internal.l0$h r8 = new kotlin.jvm.internal.l0$h
            r8.<init>()
            com.avito.android.mortgage.deeplink.MortgageApplicationLink r1 = r7.f198785t
            java.lang.String r1 = r1.f198693b
            r8.f406842b = r1
            if (r1 == 0) goto L3f
            int r1 = r1.length()
            if (r1 != 0) goto L85
        L3f:
            r7.f198782q = r8
            r7.f198783r = r4
            com.avito.android.mortgage.deeplink.domain.a r1 = r2.f198794h
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            r0 = r8
            r8 = r1
        L4e:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r1 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L63
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            JZ.b r8 = (JZ.b) r8
            java.lang.String r8 = r8.getId()
            r0.f406842b = r8
            goto L84
        L63:
            boolean r1 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto Lbb
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r1 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r1, r8)
            com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
            r8.toString()
            r5.Y1(r3)
            Ju.d$b r8 = Ju.AbstractC14250d.b.f9170c
            r2.j(r8)
        L84:
            r8 = r0
        L85:
            T r8 = r8.f406842b
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto La8
            int r0 = r8.length()
            if (r0 != 0) goto L92
            goto La8
        L92:
            com.avito.android.mortgage.root.model.MortgageRootArguments r0 = new com.avito.android.mortgage.root.model.MortgageRootArguments
            r0.<init>(r8)
            t00.a r8 = r2.f198793g
            android.content.Intent r8 = r8.a(r0)
            com.avito.android.deeplink_handler.view.a$a r0 = r2.f198792f
            com.avito.android.deeplink_handler.view.a.InterfaceC4053a.C4054a.a(r0, r8)
            Ju.d$c r8 = Ju.AbstractC14250d.c.f9171c
            r2.j(r8)
            goto Lb0
        La8:
            r5.Y1(r3)
            Ju.d$b r8 = Ju.AbstractC14250d.b.f9170c
            r2.j(r8)
        Lb0:
            com.avito.android.deeplink_handler.handler.bundle.a r8 = r2.d()
            r0 = 0
            r6.g(r8, r0)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lbb:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.deeplink.C32586a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
