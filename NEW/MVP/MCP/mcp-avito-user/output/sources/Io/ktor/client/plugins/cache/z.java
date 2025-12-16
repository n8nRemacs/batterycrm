package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HttpCacheLegacy.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class z {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.plugins.cache.d r7, io.ktor.client.statement.d r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.client.plugins.cache.s
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cache.s r0 = (io.ktor.client.plugins.cache.s) r0
            int r1 = r0.f399182r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399182r = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.s r0 = new io.ktor.client.plugins.cache.s
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f399181q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399182r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r9)
            goto L76
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r9)
            io.ktor.client.call.b r9 = r8.getF399772b()
            io.ktor.client.request.c0 r9 = r9.f398805c
            if (r9 == 0) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            java.util.List r2 = io.ktor.http.C41529k0.a(r8)
            java.util.List r4 = io.ktor.http.C41529k0.a(r9)
            io.ktor.client.plugins.cache.a r5 = io.ktor.client.plugins.cache.C41444a.f399120a
            r5.getClass()
            io.ktor.http.O r5 = io.ktor.client.plugins.cache.C41444a.f399123d
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L56
            io.ktor.client.plugins.cache.storage.q r5 = r7.f399140b
            goto L58
        L56:
            io.ktor.client.plugins.cache.storage.q r5 = r7.f399139a
        L58:
            io.ktor.http.O r6 = io.ktor.client.plugins.cache.C41444a.f399121b
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L7d
            boolean r2 = r4.contains(r6)
            if (r2 == 0) goto L67
            goto L7d
        L67:
            io.ktor.http.T0 r9 = r9.getF399112c()
            boolean r7 = r7.f399144f
            r0.f399182r = r3
            java.lang.Object r9 = io.ktor.client.plugins.cache.storage.r.c(r5, r9, r8, r7, r0)
            if (r9 != r1) goto L76
            return r1
        L76:
            io.ktor.client.plugins.cache.m r9 = (io.ktor.client.plugins.cache.m) r9
            io.ktor.client.statement.d r7 = r9.a()
            return r7
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.z.a(io.ktor.client.plugins.cache.d, io.ktor.client.statement.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k io.ktor.util.pipeline.e r27, @Y61.k io.ktor.client.statement.d r28, @Y61.k io.ktor.client.plugins.cache.d r29, @Y61.k io.ktor.client.a r30, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.z.b(io.ktor.util.pipeline.e, io.ktor.client.statement.d, io.ktor.client.plugins.cache.d, io.ktor.client.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
