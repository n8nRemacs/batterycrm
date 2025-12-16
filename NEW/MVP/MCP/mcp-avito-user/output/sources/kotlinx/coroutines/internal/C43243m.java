package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DispatchedContinuation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43243m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a0 f411918a = new a0("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a0 f411919b = new a0("REUSABLE_CLAIMED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[Catch: all -> 0x0073, DONT_GENERATE, TryCatch #1 {all -> 0x0073, blocks: (B:15:0x004f, B:17:0x005d, B:19:0x0063, B:32:0x0099, B:22:0x0075, B:24:0x0083, B:29:0x0090, B:31:0x0096, B:37:0x00a6, B:40:0x00af, B:39:0x00ac, B:27:0x0089), top: B:50:0x004f, inners: #0 }] */
    @kotlinx.coroutines.I0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.internal.C43242l
            if (r0 == 0) goto Lb9
            kotlinx.coroutines.internal.l r8 = (kotlinx.coroutines.internal.C43242l) r8
            java.lang.Throwable r0 = kotlin.Z.b(r7)
            r1 = 0
            if (r0 != 0) goto Lf
            r2 = r7
            goto L16
        Lf:
            kotlinx.coroutines.E r2 = new kotlinx.coroutines.E
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r4, r1)
        L16:
            kotlinx.coroutines.M r0 = r8.f411914e
            kotlin.coroutines.Continuation<T> r3 = r8.f411915f
            kotlin.coroutines.CoroutineContext r4 = r3.getF401105b()
            boolean r0 = r0.p(r4)
            r4 = 1
            if (r0 == 0) goto L34
            r8.f411916g = r2
            r8.f411859d = r4
            kotlin.coroutines.CoroutineContext r7 = r3.getF401105b()
            kotlinx.coroutines.M r0 = r8.f411914e
            r0.h(r7, r8)
            goto Lbc
        L34:
            kotlinx.coroutines.w1 r0 = kotlinx.coroutines.w1.f412301a
            r0.getClass()
            kotlinx.coroutines.s0 r0 = kotlinx.coroutines.w1.a()
            boolean r5 = r0.G()
            if (r5 == 0) goto L4c
            r8.f411916g = r2
            r8.f411859d = r4
            r0.B(r8)
            goto Lbc
        L4c:
            r0.D(r4)
            kotlin.coroutines.CoroutineContext r5 = r3.getF401105b()     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.N0$b r6 = kotlinx.coroutines.N0.f410716u2     // Catch: java.lang.Throwable -> L73
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.N0 r5 = (kotlinx.coroutines.N0) r5     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            boolean r6 = r5.isActive()     // Catch: java.lang.Throwable -> L73
            if (r6 != 0) goto L75
            java.util.concurrent.CancellationException r7 = r5.J()     // Catch: java.lang.Throwable -> L73
            r8.a(r2, r7)     // Catch: java.lang.Throwable -> L73
            kotlin.Z$b r2 = new kotlin.Z$b     // Catch: java.lang.Throwable -> L73
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L73
            r8.resumeWith(r2)     // Catch: java.lang.Throwable -> L73
            goto L99
        L73:
            r7 = move-exception
            goto Lb0
        L75:
            java.lang.Object r2 = r8.f411917h     // Catch: java.lang.Throwable -> L73
            kotlin.coroutines.CoroutineContext r5 = r3.getF401105b()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = kotlinx.coroutines.internal.g0.b(r5, r2)     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.internal.a0 r6 = kotlinx.coroutines.internal.g0.f411898a     // Catch: java.lang.Throwable -> L73
            if (r2 == r6) goto L88
            kotlinx.coroutines.F1 r6 = kotlinx.coroutines.K.d(r3, r5, r2)     // Catch: java.lang.Throwable -> L73
            goto L89
        L88:
            r6 = r1
        L89:
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> La3
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> La3
            if (r6 == 0) goto L96
            boolean r7 = r6.F0()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L99
        L96:
            kotlinx.coroutines.internal.g0.a(r5, r2)     // Catch: java.lang.Throwable -> L73
        L99:
            boolean r7 = r0.I()     // Catch: java.lang.Throwable -> L73
            if (r7 != 0) goto L99
        L9f:
            r0.y(r4)
            goto Lbc
        La3:
            r7 = move-exception
            if (r6 == 0) goto Lac
            boolean r3 = r6.F0()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto Laf
        Lac:
            kotlinx.coroutines.internal.g0.a(r5, r2)     // Catch: java.lang.Throwable -> L73
        Laf:
            throw r7     // Catch: java.lang.Throwable -> L73
        Lb0:
            r8.g(r7, r1)     // Catch: java.lang.Throwable -> Lb4
            goto L9f
        Lb4:
            r7 = move-exception
            r0.y(r4)
            throw r7
        Lb9:
            r8.resumeWith(r7)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C43243m.a(java.lang.Object, kotlin.coroutines.Continuation):void");
    }
}
