package io.ktor.network.util;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", i = {}, l = {57, 59, 60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f400276q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f400277r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f400277r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f400277r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f400276q
            r2 = 3
            r3 = 2
            r4 = 1
            io.ktor.network.util.d r5 = r10.f400277r
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L90
            goto L90
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L90
            goto L7a
        L24:
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L90
            goto L2b
        L28:
            kotlin.C42729a0.b(r11)
        L2b:
            kotlinx.atomicfu.AtomicBoolean r11 = io.ktor.network.util.d.d(r5)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r11.getValue()     // Catch: java.lang.Throwable -> L90
            if (r11 != 0) goto L4a
            kotlinx.atomicfu.AtomicLong r11 = io.ktor.network.util.d.b(r5)     // Catch: java.lang.Throwable -> L90
            Y41.a r1 = io.ktor.network.util.d.a(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L90
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L90
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L90
            r11.setValue(r6)     // Catch: java.lang.Throwable -> L90
        L4a:
            kotlinx.atomicfu.AtomicLong r11 = io.ktor.network.util.d.b(r5)     // Catch: java.lang.Throwable -> L90
            long r6 = r11.getValue()     // Catch: java.lang.Throwable -> L90
            Y41.a r11 = io.ktor.network.util.d.a(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r11 = r11.invoke()     // Catch: java.lang.Throwable -> L90
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L90
            long r8 = r11.longValue()     // Catch: java.lang.Throwable -> L90
            long r6 = r6 - r8
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L87
            kotlinx.atomicfu.AtomicBoolean r11 = io.ktor.network.util.d.d(r5)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r11.getValue()     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L87
            r10.f400276q = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r11 = kotlinx.coroutines.J1.a(r10)     // Catch: java.lang.Throwable -> L90
            if (r11 != r0) goto L7a
            return r0
        L7a:
            Y41.l r11 = io.ktor.network.util.d.c(r5)     // Catch: java.lang.Throwable -> L90
            r10.f400276q = r2     // Catch: java.lang.Throwable -> L90
            java.lang.Object r11 = r11.invoke(r10)     // Catch: java.lang.Throwable -> L90
            if (r11 != r0) goto L90
            return r0
        L87:
            r10.f400276q = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r6, r10)     // Catch: java.lang.Throwable -> L90
            if (r11 != r0) goto L2b
            return r0
        L90:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.util.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
