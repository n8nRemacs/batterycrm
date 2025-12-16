package io.ktor.utils.io;

import io.ktor.utils.io.core.C41628a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ReadSession.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Y1 {
    @Y61.l
    @kotlin.X
    public static final Object a(@Y61.k W0 w02, @Y61.l C41628a c41628a, int i12, @Y61.k ContinuationImpl continuationImpl) {
        if (i12 < 0) {
            throw new IllegalStateException(AK.c.g(i12, "bytesRead shouldn't be negative: ").toString());
        }
        boolean z12 = w02 instanceof O1;
        b2 b2VarB = z12 ? ((O1) w02).B() : null;
        if (b2VarB != null) {
            b2VarB.c(i12);
            if (z12) {
                ((O1) w02).d();
            }
            return kotlin.G0.f406611a;
        }
        if (c41628a instanceof io.ktor.utils.io.core.internal.b) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            if (c41628a != io.ktor.utils.io.core.internal.b.f400886o) {
                ((io.ktor.utils.io.core.internal.b) c41628a).k(io.ktor.utils.io.core.internal.b.f400884m);
                Object objC = w02.C(i12, continuationImpl);
                return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
            }
        }
        return kotlin.G0.f406611a;
    }

    @Y61.l
    @kotlin.X
    public static final Object b(@Y61.k W0 w02, int i12, @Y61.k ContinuationImpl continuationImpl) {
        b2 b2VarB = w02 instanceof b2 ? (b2) w02 : w02 instanceof O1 ? ((O1) w02).B() : null;
        if (b2VarB == null) {
            return c(w02, i12, continuationImpl);
        }
        io.ktor.utils.io.core.internal.b bVarA = b2VarB.a(i12 <= 8 ? i12 : 8);
        return bVarA != null ? bVarA : d(b2VarB, i12, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.W0 r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.W1
            if (r0 == 0) goto L14
            r0 = r13
            io.ktor.utils.io.W1 r0 = (io.ktor.utils.io.W1) r0
            int r1 = r0.f400801s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f400801s = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            io.ktor.utils.io.W1 r0 = new io.ktor.utils.io.W1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.f400800r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f400801s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            io.ktor.utils.io.core.internal.b r11 = r9.f400799q
            kotlin.C42729a0.b(r13)
            goto L5e
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.C42729a0.b(r13)
            io.ktor.utils.io.core.internal.b$e r13 = io.ktor.utils.io.core.internal.b.f400881j
            r13.getClass()
            io.ktor.utils.io.core.internal.b$d r13 = io.ktor.utils.io.core.internal.b.f400884m
            java.lang.Object r13 = r13.S2()
            io.ktor.utils.io.core.internal.b r13 = (io.ktor.utils.io.core.internal.b) r13
            int r1 = r13.f400876c
            long r3 = (long) r1
            long r5 = (long) r12
            int r12 = r13.f400878e
            int r12 = r12 - r1
            long r7 = (long) r12
            r9.f400799q = r13
            r9.f400801s = r2
            java.nio.ByteBuffer r2 = r13.f400874a
            r1 = r11
            java.lang.Object r11 = r1.s(r2, r3, r5, r7, r9)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            r10 = r13
            r13 = r11
            r11 = r10
        L5e:
            java.lang.Number r13 = (java.lang.Number) r13
            long r12 = r13.longValue()
            int r12 = (int) r12
            r11.a(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.Y1.c(io.ktor.utils.io.W0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.b2 r4, int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.X1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.X1 r0 = (io.ktor.utils.io.X1) r0
            int r1 = r0.f400813s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400813s = r1
            goto L18
        L13:
            io.ktor.utils.io.X1 r0 = new io.ktor.utils.io.X1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f400812r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400813s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.b2 r4 = r0.f400811q
            kotlin.C42729a0.b(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r6)
            r0.f400811q = r4
            r0.f400813s = r3
            java.lang.Object r5 = r4.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            io.ktor.utils.io.core.internal.b r4 = r4.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.Y1.d(io.ktor.utils.io.b2, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
