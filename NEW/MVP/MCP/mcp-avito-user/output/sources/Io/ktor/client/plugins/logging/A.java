package io.ktor.client.plugins.logging;

import kotlin.Metadata;

/* compiled from: ObservingUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-logging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [io.ktor.utils.io.d1] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.http.content.p r5, @Y61.k io.ktor.utils.io.C41619a r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.plugins.logging.y
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.logging.y r0 = (io.ktor.client.plugins.logging.y) r0
            int r1 = r0.f399569t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399569t = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.y r0 = new io.ktor.client.plugins.logging.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f399568s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399569t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            io.ktor.utils.io.d1 r6 = r0.f399567r
            io.ktor.http.content.p r5 = r0.f399566q
            kotlin.C42729a0.b(r7)
            goto L51
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r7)
            boolean r7 = r5 instanceof io.ktor.http.content.p.a
            if (r7 == 0) goto L55
            r7 = r5
            io.ktor.http.content.p$a r7 = (io.ktor.http.content.p.a) r7
            byte[] r7 = r7.getF399959a()
            r0.f399566q = r5
            r0.f399567r = r6
            r0.f399569t = r3
            java.lang.Object r7 = io.ktor.utils.io.C41655f1.a(r6, r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r6.h(r4)
            goto L97
        L55:
            boolean r7 = r5 instanceof io.ktor.http.content.p.d
            if (r7 == 0) goto L6e
            io.ktor.utils.io.a r7 = io.ktor.utils.io.C41620a0.a()
            r0 = r5
            io.ktor.http.content.p$d r0 = (io.ktor.http.content.p.d) r0
            io.ktor.utils.io.W0 r0 = r0.e()
            io.ktor.util.C41607n.a(r0, r6, r7)
            io.ktor.client.plugins.logging.e r6 = new io.ktor.client.plugins.logging.e
            r6.<init>(r5, r7)
        L6c:
            r5 = r6
            goto L97
        L6e:
            boolean r7 = r5 instanceof io.ktor.http.content.p.e
            if (r7 == 0) goto L94
            io.ktor.utils.io.a r7 = io.ktor.utils.io.C41620a0.a()
            r0 = r5
            io.ktor.http.content.p$e r0 = (io.ktor.http.content.p.e) r0
            kotlinx.coroutines.D0 r1 = kotlinx.coroutines.D0.f410691b
            kotlinx.coroutines.scheduling.c r2 = kotlinx.coroutines.C43262l0.f411945a
            io.ktor.client.plugins.logging.z r3 = new io.ktor.client.plugins.logging.z
            r3.<init>(r0, r4)
            r0 = 0
            io.ktor.utils.io.d2 r0 = io.ktor.utils.io.C41714z1.b(r1, r2, r0, r3)
            io.ktor.utils.io.X r0 = r0.x()
            io.ktor.util.C41607n.a(r0, r6, r7)
            io.ktor.client.plugins.logging.e r6 = new io.ktor.client.plugins.logging.e
            r6.<init>(r5, r7)
            goto L6c
        L94:
            r6.h(r4)
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.A.a(io.ktor.http.content.p, io.ktor.utils.io.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
