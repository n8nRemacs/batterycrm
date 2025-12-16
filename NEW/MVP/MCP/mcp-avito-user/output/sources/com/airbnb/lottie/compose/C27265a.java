package com.airbnb.lottie.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.airbnb.lottie.C27291k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: animateLottieCompositionAsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.airbnb.lottie.compose.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27265a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f59418q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f59419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f59420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27267c f59421t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C27291k f59422u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f59423v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f59424w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f59425x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractC27282s f59426y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f59427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27265a(boolean z12, boolean z13, InterfaceC27267c interfaceC27267c, C27291k c27291k, int i12, boolean z14, float f12, AbstractC27282s abstractC27282s, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f59394b;
        this.f59419r = z12;
        this.f59420s = z13;
        this.f59421t = interfaceC27267c;
        this.f59422u = c27291k;
        this.f59423v = i12;
        this.f59424w = z14;
        this.f59425x = f12;
        this.f59426y = abstractC27282s;
        this.f59427z = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f59394b;
        return new C27265a(this.f59419r, this.f59420s, this.f59421t, this.f59422u, this.f59423v, this.f59424w, this.f59425x, this.f59426y, this.f59427z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C27265a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
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
            int r1 = r12.f59418q
            com.airbnb.lottie.compose.c r2 = r12.f59421t
            androidx.compose.runtime.y1<java.lang.Boolean> r3 = r12.f59427z
            r4 = 2
            boolean r5 = r12.f59419r
            r6 = 1
            if (r1 == 0) goto L25
            if (r1 == r6) goto L21
            if (r1 != r4) goto L19
            kotlin.C42729a0.b(r13)
            goto Laf
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L21:
            kotlin.C42729a0.b(r13)
            goto L85
        L25:
            kotlin.C42729a0.b(r13)
            if (r5 == 0) goto L85
            java.lang.Object r13 = r3.getF42167b()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L85
            boolean r13 = r12.f59420s
            if (r13 == 0) goto L85
            r12.f59418q = r6
            com.airbnb.lottie.k r13 = r2.u()
            com.airbnb.lottie.compose.s r1 = r2.m()
            float r7 = r2.getSpeed()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 >= 0) goto L53
            if (r13 != 0) goto L53
        L51:
            r8 = r9
            goto L65
        L53:
            if (r13 != 0) goto L56
            goto L65
        L56:
            if (r7 >= 0) goto L5f
            if (r1 == 0) goto L51
            float r8 = r1.a(r13)
            goto L65
        L5f:
            if (r1 == 0) goto L65
            float r8 = r1.b(r13)
        L65:
            com.airbnb.lottie.k r13 = r2.u()
            float r1 = r2.c()
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L73
            r1 = r6
            goto L74
        L73:
            r1 = 0
        L74:
            r1 = r1 ^ r6
            java.lang.Object r13 = r2.t(r13, r8, r1, r12)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r13 != r1) goto L80
            goto L82
        L80:
            kotlin.G0 r13 = kotlin.G0.f406611a
        L82:
            if (r13 != r0) goto L85
            return r0
        L85:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            r3.setValue(r13)
            if (r5 != 0) goto L91
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        L91:
            float r9 = r2.c()
            r12.f59418q = r4
            int r4 = r2.w()
            com.airbnb.lottie.compose.LottieCancellationBehavior r10 = com.airbnb.lottie.compose.LottieCancellationBehavior.f59394b
            com.airbnb.lottie.k r3 = r12.f59422u
            int r5 = r12.f59423v
            boolean r6 = r12.f59424w
            float r7 = r12.f59425x
            com.airbnb.lottie.compose.s r8 = r12.f59426y
            r11 = r12
            java.lang.Object r13 = r2.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Laf
            return r0
        Laf:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.C27265a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
