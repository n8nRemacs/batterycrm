package io.ktor.utils.io;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.core.C41628a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReadSession.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0, 0, 1, 1, 1, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31}, m = "read", n = {"$this$read", "block", "$this$read", "buffer", "bytesRead", "cause"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0"})
/* loaded from: classes8.dex */
final class V1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f400790q;

    /* renamed from: r, reason: collision with root package name */
    public C41628a f400791r;

    /* renamed from: s, reason: collision with root package name */
    public int f400792s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400793t;

    /* renamed from: u, reason: collision with root package name */
    public int f400794u;

    public V1() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.f400793t = r12
            int r0 = r11.f400794u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r11.f400794u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f400794u
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L49
            if (r1 == r6) goto L3d
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L25
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            java.lang.Object r0 = r11.f400790q
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C42729a0.b(r12)
            goto Lad
        L2e:
            int r1 = r11.f400792s
            io.ktor.utils.io.core.a r5 = r11.f400791r
            java.lang.Object r6 = r11.f400790q
            io.ktor.utils.io.W0 r6 = (io.ktor.utils.io.W0) r6
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L3a
            goto L96
        L3a:
            r12 = move-exception
            r1 = r12
            goto L9f
        L3d:
            io.ktor.utils.io.core.a r1 = r11.f400791r
            Y41.q r1 = (Y41.q) r1
            java.lang.Object r6 = r11.f400790q
            io.ktor.utils.io.W0 r6 = (io.ktor.utils.io.W0) r6
            kotlin.C42729a0.b(r12)
            goto L5b
        L49:
            kotlin.C42729a0.b(r12)
            r11.f400790q = r2
            r11.f400791r = r2
            r11.f400794u = r6
            java.lang.Object r12 = io.ktor.utils.io.Y1.b(r2, r3, r11)
            if (r12 != r0) goto L59
            goto Lab
        L59:
            r1 = r2
            r6 = r1
        L5b:
            io.ktor.utils.io.core.a r12 = (io.ktor.utils.io.core.C41628a) r12
            if (r12 != 0) goto L68
            io.ktor.utils.io.core.a$a r12 = io.ktor.utils.io.core.C41628a.f400873g
            r12.getClass()
            io.ktor.utils.io.core.internal.b r12 = io.ktor.utils.io.core.C41628a.C11424a.a()
        L68:
            java.nio.ByteBuffer r7 = r12.f400874a     // Catch: java.lang.Throwable -> L9d
            V31.e r7 = V31.e.a(r7)     // Catch: java.lang.Throwable -> L9d
            int r8 = r12.f400875b     // Catch: java.lang.Throwable -> L9d
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L9d
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)     // Catch: java.lang.Throwable -> L9d
            int r9 = r12.f400876c     // Catch: java.lang.Throwable -> L9d
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L9d
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r1 = r1.invoke(r7, r8, r9)     // Catch: java.lang.Throwable -> L9d
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L9d
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L9d
            r11.f400790q = r6     // Catch: java.lang.Throwable -> L9d
            r11.f400791r = r12     // Catch: java.lang.Throwable -> L9d
            r11.f400792s = r1     // Catch: java.lang.Throwable -> L9d
            r11.f400794u = r5     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r5 = io.ktor.utils.io.Y1.a(r6, r12, r1, r11)     // Catch: java.lang.Throwable -> L9d
            if (r5 != r0) goto L95
            goto Lab
        L95:
            r5 = r12
        L96:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Throwable -> L3a
            goto Lab
        L9b:
            r5 = r12
            goto L9f
        L9d:
            r1 = move-exception
            goto L9b
        L9f:
            r11.f400790q = r1
            r11.f400791r = r2
            r11.f400794u = r4
            java.lang.Object r12 = io.ktor.utils.io.Y1.a(r6, r5, r3, r11)
            if (r12 != r0) goto Lac
        Lab:
            return r0
        Lac:
            r0 = r1
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.V1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
