package io.ktor.util;

import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.V0;

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41607n {
    public static final void a(@Y61.k W0 w02, @Y61.k C41619a c41619a, @Y61.k C41619a c41619a2) {
        ((V0) C43259k.d(kotlinx.coroutines.D0.f410691b, C43262l0.f411946b, null, new C41600i(w02, c41619a, c41619a2, null), 2)).k(new C41602j(c41619a, c41619a2));
    }

    @Y61.k
    public static final kotlin.Q b(@Y61.k W0 w02, @Y61.k io.ktor.client.statement.d dVar) {
        C41619a c41619a = new C41619a(true, null, 0, 6, null);
        C41619a c41619a2 = new C41619a(true, null, 0, 6, null);
        ((V0) C43259k.d(dVar, null, null, new C41604k(w02, c41619a, c41619a2, null), 3)).k(new C41605l(c41619a, c41619a2));
        return new kotlin.Q(c41619a, c41619a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k io.ktor.utils.io.W0 r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.util.C41606m
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.util.m r0 = (io.ktor.util.C41606m) r0
            int r1 = r0.f400492r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400492r = r1
            goto L18
        L13:
            io.ktor.util.m r0 = new io.ktor.util.m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f400491q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400492r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r5)
            r0.f400492r = r3
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r5 = r4.I(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            io.ktor.utils.io.core.n r5 = (io.ktor.utils.io.core.C41641n) r5
            byte[] r4 = io.ktor.utils.io.core.S.b(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.C41607n.c(io.ktor.utils.io.W0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
