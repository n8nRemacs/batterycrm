package io.ktor.client.statement;

import io.ktor.util.InterfaceC41603j0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C;
import kotlinx.coroutines.N0;

/* compiled from: HttpResponse.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.client.statement.d r6, @Y61.k java.nio.charset.Charset r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.client.statement.g
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.statement.g r0 = (io.ktor.client.statement.g) r0
            int r1 = r0.f399791s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399791s = r1
            goto L18
        L13:
            io.ktor.client.statement.g r0 = new io.ktor.client.statement.g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f399790r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399791s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.nio.charset.CharsetDecoder r6 = r0.f399789q
            kotlin.C42729a0.b(r8)
            goto L6f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C42729a0.b(r8)
            io.ktor.http.i r8 = io.ktor.http.C41529k0.b(r6)
            if (r8 == 0) goto L41
            java.nio.charset.Charset r8 = io.ktor.http.C41528k.a(r8)
            goto L42
        L41:
            r8 = 0
        L42:
            if (r8 != 0) goto L45
            goto L46
        L45:
            r7 = r8
        L46:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            io.ktor.client.call.b r6 = r6.getF399772b()
            java.lang.Class<io.ktor.utils.io.core.n> r8 = io.ktor.utils.io.core.C41641n.class
            kotlin.reflect.r r2 = kotlin.jvm.internal.m0.c(r8)
            java.lang.reflect.Type r4 = kotlin.reflect.y.d(r2)
            kotlin.jvm.internal.n0 r5 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r8 = r5.b(r8)
            U31.b r5 = new U31.b
            r5.<init>(r8, r4, r2)
            r0.f399789q = r7
            r0.f399791s = r3
            java.lang.Object r8 = r6.b(r5, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            r6 = r7
        L6f:
            if (r8 == 0) goto L78
            io.ktor.utils.io.core.n r8 = (io.ktor.utils.io.core.C41641n) r8
            java.lang.String r6 = W31.b.a(r6, r8)
            return r6
        L78:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.h.a(io.ktor.client.statement.d, java.nio.charset.Charset, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @InterfaceC41603j0
    @X
    public static final void b(@Y61.k d dVar) {
        ((C) dVar.getF114917e().get(N0.f410716u2)).q3();
    }
}
