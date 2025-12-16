package com.avito.android.gig_apply.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pH.AbstractC46954b;

/* compiled from: GigApplyActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpH/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.mvi.GigApplyActor$process$2", f = "GigApplyActor.kt", i = {0, 1}, l = {40, 41, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.gig_apply.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30721b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AbstractC46954b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159716q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f159717r;

    public C30721b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30721b c30721b = new C30721b(2, continuation);
        c30721b.f159717r = obj;
        return c30721b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC46954b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30721b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f159716q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r7)
            goto L63
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.f159717r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L55
        L25:
            java.lang.Object r1 = r6.f159717r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L42
        L2d:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f159717r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            pH.b$e r1 = pH.AbstractC46954b.e.f428310a
            r6.f159717r = r7
            r6.f159716q = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r7
        L42:
            kotlin.time.e$a r7 = kotlin.time.e.f410651c
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.f410634f
            long r4 = kotlin.time.g.g(r4, r7)
            r6.f159717r = r1
            r6.f159716q = r3
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.c(r4, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            pH.b$c r7 = pH.AbstractC46954b.c.f428307a
            r3 = 0
            r6.f159717r = r3
            r6.f159716q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L63
            return r0
        L63:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.mvi.C30721b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
