package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.W0;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;

/* compiled from: Blocking.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/io/InputStream;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class e extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W0 f401116b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final P0 f401117c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f401118d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public byte[] f401119e;

    /* compiled from: Blocking.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/utils/io/jvm/javaio/e$a", "Lio/ktor/utils/io/jvm/javaio/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e f401120g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N0 n02, e eVar) {
            super(n02);
            this.f401120g = eVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:25:0x006c). Please report as a decompilation issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof io.ktor.utils.io.jvm.javaio.d
                if (r0 == 0) goto L13
                r0 = r9
                io.ktor.utils.io.jvm.javaio.d r0 = (io.ktor.utils.io.jvm.javaio.d) r0
                int r1 = r0.f401115t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f401115t = r1
                goto L18
            L13:
                io.ktor.utils.io.jvm.javaio.d r0 = new io.ktor.utils.io.jvm.javaio.d
                r0.<init>(r8, r9)
            L18:
                java.lang.Object r9 = r0.f401113r
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f401115t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                io.ktor.utils.io.jvm.javaio.e$a r2 = r0.f401112q
                kotlin.C42729a0.b(r9)
                goto L6c
            L2e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L36:
                io.ktor.utils.io.jvm.javaio.e$a r2 = r0.f401112q
                kotlin.C42729a0.b(r9)
                goto L57
            L3c:
                kotlin.C42729a0.b(r9)
                r9 = 0
                r2 = r8
            L41:
                r2.result = r9
                r0.f401112q = r2
                r0.f401115t = r4
                java.lang.Object r9 = io.ktor.utils.io.jvm.javaio.a.a(r2, r0)
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r9 != r5) goto L54
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
            L54:
                if (r9 != r1) goto L57
                return r1
            L57:
                byte[] r9 = (byte[]) r9
                io.ktor.utils.io.jvm.javaio.e r5 = r2.f401120g
                io.ktor.utils.io.W0 r5 = r5.f401116b
                int r6 = r2.f401100d
                int r7 = r2.f401101e
                r0.f401112q = r2
                r0.f401115t = r3
                java.lang.Object r9 = r5.H(r9, r6, r7, r0)
                if (r9 != r1) goto L6c
                return r1
            L6c:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                r5 = -1
                if (r9 != r5) goto L41
                io.ktor.utils.io.jvm.javaio.e r0 = r2.f401120g
                kotlinx.coroutines.P0 r0 = r0.f401117c
                r0.q3()
                r2.result = r9
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.e.a.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public e(@Y61.k W0 w02, @Y61.l N0 n02) {
        this.f401116b = w02;
        this.f401117c = new P0(n02);
        this.f401118d = new a(n02, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f401116b.i();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            this.f401116b.f(null);
            if (!this.f401117c.c0()) {
                this.f401117c.c(null);
            }
            this.f401118d.c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f401119e;
            if (bArr == null) {
                bArr = new byte[1];
                this.f401119e = bArr;
            }
            a aVar = this.f401118d;
            aVar.f401100d = 0;
            aVar.f401101e = 1;
            int iD2 = aVar.d(bArr);
            if (iD2 == -1) {
                return -1;
            }
            if (iD2 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iD2 + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(@Y61.l byte[] bArr, int i12, int i13) {
        a aVar;
        aVar = this.f401118d;
        aVar.f401100d = i12;
        aVar.f401101e = i13;
        return aVar.d(bArr);
    }
}
