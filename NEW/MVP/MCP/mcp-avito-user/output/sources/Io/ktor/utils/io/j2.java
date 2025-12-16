package io.ktor.utils.io;

import io.ktor.utils.io.core.C41628a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WriterSession.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j2 {
    @Y61.l
    @kotlin.X
    public static final Object a(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k C41628a c41628a, int i12, @Y61.k ContinuationImpl continuationImpl) {
        if (interfaceC41649d1 instanceof P1) {
            ((P1) interfaceC41649d1).e(i12);
            return kotlin.G0.f406611a;
        }
        Object objB = b(interfaceC41649d1, c41628a, continuationImpl);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.InterfaceC41649d1 r4, io.ktor.utils.io.core.C41628a r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.g2
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.g2 r0 = (io.ktor.utils.io.g2) r0
            int r1 = r0.f400968s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400968s = r1
            goto L18
        L13:
            io.ktor.utils.io.g2 r0 = new io.ktor.utils.io.g2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f400967r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400968s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.core.a r5 = r0.f400966q
            kotlin.C42729a0.b(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r6)
            boolean r6 = r5 instanceof io.ktor.utils.io.core.internal.b
            if (r6 == 0) goto L54
            r0.f400966q = r5
            r0.f400968s = r3
            java.lang.Object r4 = r4.l(r5, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            io.ktor.utils.io.core.internal.b r5 = (io.ktor.utils.io.core.internal.b) r5
            io.ktor.utils.io.core.internal.b$e r4 = io.ktor.utils.io.core.internal.b.f400881j
            r4.getClass()
            io.ktor.utils.io.core.internal.b$d r4 = io.ktor.utils.io.core.internal.b.f400884m
            r5.k(r4)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L54:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Only ChunkBuffer instance is supported."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j2.b(io.ktor.utils.io.d1, io.ktor.utils.io.core.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    @kotlin.X
    public static final Object c(@Y61.k InterfaceC41649d1 interfaceC41649d1, int i12, @Y61.k ContinuationImpl continuationImpl) {
        k2 k2VarL = interfaceC41649d1 instanceof P1 ? ((P1) interfaceC41649d1).L() : null;
        if (k2VarL != null) {
            io.ktor.utils.io.core.internal.b bVarA = k2VarL.a(i12);
            return bVarA != null ? bVarA : d(k2VarL, i12, continuationImpl);
        }
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        Object objS2 = io.ktor.utils.io.core.internal.b.f400884m.S2();
        io.ktor.utils.io.core.internal.b bVar = (io.ktor.utils.io.core.internal.b) objS2;
        bVar.f(bVar.f400879f - bVar.f400877d);
        bVar.e();
        return (C41628a) objS2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.k2 r4, int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.i2
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.i2 r0 = (io.ktor.utils.io.i2) r0
            int r1 = r0.f401013t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401013t = r1
            goto L18
        L13:
            io.ktor.utils.io.i2 r0 = new io.ktor.utils.io.i2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f401012s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401013t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.f401011r
            io.ktor.utils.io.k2 r4 = r0.f401010q
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f401010q = r4
            r0.f401011r = r5
            r0.f401013t = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            io.ktor.utils.io.core.internal.b r5 = r4.a(r5)
            if (r5 == 0) goto L4c
            goto L50
        L4c:
            io.ktor.utils.io.core.internal.b r5 = r4.a(r3)
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j2.d(io.ktor.utils.io.k2, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
