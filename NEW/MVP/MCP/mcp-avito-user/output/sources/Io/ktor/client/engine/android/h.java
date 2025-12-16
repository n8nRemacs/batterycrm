package io.ktor.client.engine.android;

import io.ktor.http.C41531l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AndroidClientEngine.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-android"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<C41531l0> f398875a;

    static {
        C41531l0.a aVar = C41531l0.f400052b;
        aVar.getClass();
        C41531l0 c41531l0 = C41531l0.f400053c;
        aVar.getClass();
        f398875a = C42745f0.U(c41531l0, C41531l0.f400055e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k io.ktor.http.content.p r8, @Y61.k java.io.OutputStream r9, @Y61.k kotlin.coroutines.CoroutineContext r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.client.engine.android.f
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.client.engine.android.f r0 = (io.ktor.client.engine.android.f) r0
            int r1 = r0.f398871s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398871s = r1
            goto L18
        L13:
            io.ktor.client.engine.android.f r0 = new io.ktor.client.engine.android.f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f398870r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f398871s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.io.OutputStream r9 = r0.f398869q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L93
        L2f:
            r8 = move-exception
            goto La1
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.io.OutputStream r9 = r0.f398869q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L6a
        L3f:
            kotlin.C42729a0.b(r11)
            boolean r11 = r8 instanceof io.ktor.http.content.p.a     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L50
            io.ktor.http.content.p$a r8 = (io.ktor.http.content.p.a) r8     // Catch: java.lang.Throwable -> L2f
            byte[] r8 = r8.getF399959a()     // Catch: java.lang.Throwable -> L2f
            r9.write(r8)     // Catch: java.lang.Throwable -> L2f
            goto L93
        L50:
            boolean r11 = r8 instanceof io.ktor.http.content.p.d     // Catch: java.lang.Throwable -> L2f
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 == 0) goto L70
            io.ktor.http.content.p$d r8 = (io.ktor.http.content.p.d) r8     // Catch: java.lang.Throwable -> L2f
            io.ktor.utils.io.W0 r8 = r8.e()     // Catch: java.lang.Throwable -> L2f
            r0.f398869q = r9     // Catch: java.lang.Throwable -> L2f
            r0.f398871s = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = io.ktor.utils.io.jvm.javaio.r.a(r8, r9, r6, r0)     // Catch: java.lang.Throwable -> L2f
            if (r11 != r1) goto L6a
            return r1
        L6a:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L2f
            r11.longValue()     // Catch: java.lang.Throwable -> L2f
            goto L93
        L70:
            boolean r11 = r8 instanceof io.ktor.http.content.p.e     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L8f
            kotlinx.coroutines.D0 r11 = kotlinx.coroutines.D0.f410691b     // Catch: java.lang.Throwable -> L2f
            io.ktor.client.engine.android.g r2 = new io.ktor.client.engine.android.g     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r8, r5)     // Catch: java.lang.Throwable -> L2f
            r8 = 0
            io.ktor.utils.io.d2 r8 = io.ktor.utils.io.C41714z1.b(r11, r10, r8, r2)     // Catch: java.lang.Throwable -> L2f
            io.ktor.utils.io.X r8 = r8.x()     // Catch: java.lang.Throwable -> L2f
            r0.f398869q = r9     // Catch: java.lang.Throwable -> L2f
            r0.f398871s = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = io.ktor.utils.io.jvm.javaio.r.a(r8, r9, r6, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L93
            return r1
        L8f:
            boolean r10 = r8 instanceof io.ktor.http.content.p.b     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto L9b
        L93:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2f
            kotlin.io.c.a(r9, r5)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L9b:
            io.ktor.client.call.UnsupportedContentTypeException r10 = new io.ktor.client.call.UnsupportedContentTypeException     // Catch: java.lang.Throwable -> L2f
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        La1:
            throw r8     // Catch: java.lang.Throwable -> La2
        La2:
            r10 = move-exception
            kotlin.io.c.a(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.h.a(io.ktor.http.content.p, java.io.OutputStream, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
