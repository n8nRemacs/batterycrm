package io.ktor.utils.io.internal;

import kotlin.Metadata;

/* compiled from: SequentialCopyTo.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ef -> B:58:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0108 -> B:57:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x010b -> B:57:0x010c). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.utils.io.AbstractC41660h0 r19, @Y61.k io.ktor.utils.io.AbstractC41660h0 r20, long r21, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.p.a(io.ktor.utils.io.h0, io.ktor.utils.io.h0, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v9, types: [io.ktor.utils.io.core.internal.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.AbstractC41660h0 r8, io.ktor.utils.io.AbstractC41660h0 r9, long r10, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.internal.n
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.internal.n r0 = (io.ktor.utils.io.internal.n) r0
            int r1 = r0.f401070u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401070u = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.n r0 = new io.ktor.utils.io.internal.n
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f401069t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401070u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f401068s
            java.lang.Object r9 = r0.f401066q
            io.ktor.utils.io.core.internal.b r9 = (io.ktor.utils.io.core.internal.b) r9
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L33
            goto La8
        L33:
            r8 = move-exception
            goto Lb8
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            io.ktor.utils.io.core.internal.b r9 = r0.f401067r
            java.lang.Object r8 = r0.f401066q
            io.ktor.utils.io.h0 r8 = (io.ktor.utils.io.AbstractC41660h0) r8
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L33
            r7 = r9
            r9 = r8
            r8 = r12
            r12 = r7
            goto L74
        L4c:
            kotlin.C42729a0.b(r12)
            io.ktor.utils.io.core.internal.b$e r12 = io.ktor.utils.io.core.internal.b.f400881j
            r12.getClass()
            io.ktor.utils.io.core.internal.b$d r12 = io.ktor.utils.io.core.internal.b.f400884m
            java.lang.Object r12 = r12.S2()
            io.ktor.utils.io.core.internal.b r12 = (io.ktor.utils.io.core.internal.b) r12
            int r2 = r12.f400879f     // Catch: java.lang.Throwable -> L91
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L91
            long r10 = kotlin.ranges.s.d(r10, r5)     // Catch: java.lang.Throwable -> L91
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L91
            r12.f(r10)     // Catch: java.lang.Throwable -> L91
            r0.f401066q = r9     // Catch: java.lang.Throwable -> L91
            r0.f401067r = r12     // Catch: java.lang.Throwable -> L91
            r0.f401070u = r4     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r8.Y(r12, r0)     // Catch: java.lang.Throwable -> L91
            if (r8 != r1) goto L74
            return r1
        L74:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L91
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L91
            r10 = -1
            if (r8 != r10) goto L94
            io.ktor.utils.io.core.internal.b$e r8 = io.ktor.utils.io.core.internal.b.f400881j     // Catch: java.lang.Throwable -> L91
            r8.getClass()     // Catch: java.lang.Throwable -> L91
            io.ktor.utils.io.core.internal.b$d r8 = io.ktor.utils.io.core.internal.b.f400884m     // Catch: java.lang.Throwable -> L91
            r12.k(r8)     // Catch: java.lang.Throwable -> L91
            r9 = 0
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)     // Catch: java.lang.Throwable -> L91
            r12.k(r8)
            return r9
        L91:
            r8 = move-exception
            r9 = r12
            goto Lb8
        L94:
            r0.f401066q = r12     // Catch: java.lang.Throwable -> L91
            r10 = 0
            r0.f401067r = r10     // Catch: java.lang.Throwable -> L91
            r0.f401068s = r8     // Catch: java.lang.Throwable -> L91
            r0.f401070u = r3     // Catch: java.lang.Throwable -> L91
            r9.getClass()     // Catch: java.lang.Throwable -> L91
            java.lang.Object r9 = io.ktor.utils.io.AbstractC41660h0.p0(r9, r12, r0)     // Catch: java.lang.Throwable -> L91
            if (r9 != r1) goto La7
            return r1
        La7:
            r9 = r12
        La8:
            long r10 = (long) r8
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r10)     // Catch: java.lang.Throwable -> L33
            io.ktor.utils.io.core.internal.b$e r10 = io.ktor.utils.io.core.internal.b.f400881j
            r10.getClass()
            io.ktor.utils.io.core.internal.b$d r10 = io.ktor.utils.io.core.internal.b.f400884m
            r9.k(r10)
            return r8
        Lb8:
            io.ktor.utils.io.core.internal.b$e r10 = io.ktor.utils.io.core.internal.b.f400881j
            r10.getClass()
            io.ktor.utils.io.core.internal.b$d r10 = io.ktor.utils.io.core.internal.b.f400884m
            r9.k(r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.p.b(io.ktor.utils.io.h0, io.ktor.utils.io.h0, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
