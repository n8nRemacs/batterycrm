package io.ktor.client.call;

import kotlin.Metadata;

/* compiled from: SavedCall.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.client.call.b r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.call.f
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.call.f r0 = (io.ktor.client.call.f) r0
            int r1 = r0.f398816s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398816s = r1
            goto L18
        L13:
            io.ktor.client.call.f r0 = new io.ktor.client.call.f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f398815r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398816s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            io.ktor.client.call.b r5 = r0.f398814q
            kotlin.C42729a0.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.C42729a0.b(r6)
            io.ktor.client.statement.d r6 = r5.f398806d
            if (r6 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r4
        L3d:
            io.ktor.utils.io.W0 r6 = r6.getF399778h()
            r0.f398814q = r5
            r0.f398816s = r3
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r6 = r6.I(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            io.ktor.utils.io.core.n r6 = (io.ktor.utils.io.core.C41641n) r6
            byte[] r6 = io.ktor.utils.io.core.S.b(r6)
            io.ktor.client.call.h r0 = new io.ktor.client.call.h
            io.ktor.client.a r1 = r5.f398804b
            io.ktor.client.request.c0 r2 = r5.f398805c
            if (r2 == 0) goto L60
            goto L61
        L60:
            r2 = r4
        L61:
            io.ktor.client.statement.d r5 = r5.f398806d
            if (r5 == 0) goto L66
            r4 = r5
        L66:
            r0.<init>(r1, r2, r4, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.g.a(io.ktor.client.call.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
