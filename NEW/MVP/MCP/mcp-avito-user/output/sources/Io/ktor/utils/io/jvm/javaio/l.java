package io.ktor.utils.io.jvm.javaio;

import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.InterfaceC41649d1;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Reading.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.ReadingKt", f = "Reading.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {AvailableCode.HMS_IS_SPOOF}, m = "copyTo", n = {"$this$copyTo", "channel", "buffer", "limit", "copied", "bufferSize", "rc"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0"})
/* loaded from: classes8.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InputStream f401131q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC41649d1 f401132r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f401133s;

    /* renamed from: t, reason: collision with root package name */
    public long f401134t;

    /* renamed from: u, reason: collision with root package name */
    public long f401135u;

    /* renamed from: v, reason: collision with root package name */
    public long f401136v;

    /* renamed from: w, reason: collision with root package name */
    public int f401137w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f401138x;

    /* renamed from: y, reason: collision with root package name */
    public int f401139y;

    public l() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:6:0x0023, B:23:0x0074, B:16:0x004b, B:20:0x005d, B:24:0x0077, B:13:0x003e), top: B:29:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:14:0x0047->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:23:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            r14.f401138x = r15
            int r0 = r14.f401139y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r14.f401139y = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f401139y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            int r1 = r14.f401137w
            long r3 = r14.f401136v
            long r5 = r14.f401135u
            long r7 = r14.f401134t
            byte[] r9 = r14.f401133s
            io.ktor.utils.io.d1 r10 = r14.f401132r
            java.io.InputStream r11 = r14.f401131q
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> L28
            r15 = r14
            goto L74
        L28:
            r15 = move-exception
            goto L81
        L2a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L32:
            kotlin.C42729a0.b(r15)
            io.ktor.utils.io.pool.a$a r15 = io.ktor.utils.io.pool.a.f401244a
            java.lang.Object r15 = r15.S2()
            r9 = r15
            byte[] r9 = (byte[]) r9
            int r15 = r9.length     // Catch: java.lang.Throwable -> L28
            long r3 = (long) r15     // Catch: java.lang.Throwable -> L28
            r15 = 0
            r5 = 0
            r10 = r15
            r11 = r10
            r7 = r5
            r15 = r14
        L47:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L77
            long r12 = r7 - r5
            long r12 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r1 = (int) r12     // Catch: java.lang.Throwable -> L28
            r12 = 0
            int r1 = r11.read(r9, r12, r1)     // Catch: java.lang.Throwable -> L28
            r13 = -1
            if (r1 != r13) goto L5b
            goto L77
        L5b:
            if (r1 <= 0) goto L47
            r15.f401131q = r11     // Catch: java.lang.Throwable -> L28
            r15.f401132r = r10     // Catch: java.lang.Throwable -> L28
            r15.f401133s = r9     // Catch: java.lang.Throwable -> L28
            r15.f401134t = r7     // Catch: java.lang.Throwable -> L28
            r15.f401135u = r5     // Catch: java.lang.Throwable -> L28
            r15.f401136v = r3     // Catch: java.lang.Throwable -> L28
            r15.f401137w = r1     // Catch: java.lang.Throwable -> L28
            r15.f401139y = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r12 = r10.D(r9, r12, r1, r15)     // Catch: java.lang.Throwable -> L28
            if (r12 != r0) goto L74
            goto L80
        L74:
            long r12 = (long) r1     // Catch: java.lang.Throwable -> L28
            long r5 = r5 + r12
            goto L47
        L77:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)     // Catch: java.lang.Throwable -> L28
            io.ktor.utils.io.pool.a$a r15 = io.ktor.utils.io.pool.a.f401244a
            r15.G4(r9)
        L80:
            return r0
        L81:
            io.ktor.utils.io.pool.a$a r0 = io.ktor.utils.io.pool.a.f401244a
            r0.G4(r9)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
