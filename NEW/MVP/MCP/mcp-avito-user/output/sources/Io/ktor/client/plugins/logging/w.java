package io.ktor.client.plugins.logging;

import io.ktor.client.request.c0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LoggingUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-logging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w {
    public static final void a(@Y61.k StringBuilder sb2, @Y61.k String str, @Y61.k String str2) throws IOException {
        sb2.append((CharSequence) ("-> " + str + ": " + str2)).append('\n');
    }

    public static final void b(@Y61.k StringBuilder sb2, @Y61.k Set set, @Y61.k List list) throws IOException {
        for (Map.Entry entry : C42745f0.B0(C42745f0.M0(set), new t())) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((B) it.next()).getClass();
                throw null;
            }
            a(sb2, str, C42745f0.O(list2, "; ", null, null, null, 62));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k java.lang.StringBuilder r5, @Y61.l io.ktor.http.C41524i r6, @Y61.k io.ktor.utils.io.W0 r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.client.plugins.logging.u
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.logging.u r0 = (io.ktor.client.plugins.logging.u) r0
            int r1 = r0.f399560t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399560t = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.u r0 = new io.ktor.client.plugins.logging.u
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f399559s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399560t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.nio.charset.Charset r5 = r0.f399558r
            java.lang.StringBuilder r6 = r0.f399557q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L77
        L2d:
            r5 = r6
            goto L7e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "BODY Content-Type: "
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            r8 = 10
            r5.append(r8)
            java.lang.String r2 = "BODY START"
            r5.append(r2)
            r5.append(r8)
            if (r6 == 0) goto L60
            java.nio.charset.Charset r6 = io.ktor.http.C41528k.a(r6)
            if (r6 != 0) goto L62
        L60:
            java.nio.charset.Charset r6 = kotlin.text.C43047d.f410589b
        L62:
            r0.f399557q = r5     // Catch: java.lang.Throwable -> L7e
            r0.f399558r = r6     // Catch: java.lang.Throwable -> L7e
            r0.f399560t = r3     // Catch: java.lang.Throwable -> L7e
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = r7.I(r2, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r1) goto L74
            return r1
        L74:
            r4 = r6
            r6 = r5
            r5 = r4
        L77:
            io.ktor.utils.io.core.x r8 = (io.ktor.utils.io.core.x) r8     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = io.ktor.utils.io.core.S.c(r8, r5)     // Catch: java.lang.Throwable -> L2d
            goto L82
        L7e:
            r6 = 0
            r4 = r6
            r6 = r5
            r5 = r4
        L82:
            if (r5 != 0) goto L86
            java.lang.String r5 = "[response body omitted]"
        L86:
            r6.append(r5)
            java.lang.String r5 = "\nBODY END"
            r6.append(r5)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.w.c(java.lang.StringBuilder, io.ktor.http.i, io.ktor.utils.io.W0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void d(@Y61.k StringBuilder sb2, @Y61.k io.ktor.client.statement.d dVar, @Y61.k LogLevel logLevel, @Y61.k List<B> list) throws IOException {
        if (logLevel.f399492b) {
            sb2.append("RESPONSE: " + dVar.getF399774d());
            sb2.append('\n');
            StringBuilder sb3 = new StringBuilder("METHOD: ");
            c0 c0Var = dVar.getF399772b().f398805c;
            if (c0Var == null) {
                c0Var = null;
            }
            sb3.append(c0Var.getF399702c());
            sb2.append(sb3.toString());
            sb2.append('\n');
            StringBuilder sb4 = new StringBuilder("FROM: ");
            c0 c0Var2 = dVar.getF399772b().f398805c;
            sb4.append((c0Var2 != null ? c0Var2 : null).getF399703d());
            sb2.append(sb4.toString());
            sb2.append('\n');
        }
        if (logLevel.f399493c) {
            sb2.append("COMMON HEADERS");
            sb2.append('\n');
            b(sb2, dVar.getF399779i().b(), list);
        }
    }
}
