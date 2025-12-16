package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JvmOkio.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/G;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
class G implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InputStream f420024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i0 f420025c;

    public G(@Y61.k InputStream inputStream, @Y61.k i0 i0Var) {
        this.f420024b = inputStream;
        this.f420025c = i0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f420024b.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // okio.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(@Y61.k okio.C44802l r5, long r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r0
        L7:
            if (r2 < 0) goto L6f
            r0 = 1
            okio.i0 r1 = r4.f420025c     // Catch: java.lang.AssertionError -> L3a
            r1.throwIfReached()     // Catch: java.lang.AssertionError -> L3a
            okio.Z r1 = r5.A(r0)     // Catch: java.lang.AssertionError -> L3a
            int r2 = r1.f420052c     // Catch: java.lang.AssertionError -> L3a
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.lang.AssertionError -> L3a
            long r6 = java.lang.Math.min(r6, r2)     // Catch: java.lang.AssertionError -> L3a
            int r6 = (int) r6     // Catch: java.lang.AssertionError -> L3a
            java.io.InputStream r7 = r4.f420024b     // Catch: java.lang.AssertionError -> L3a
            byte[] r2 = r1.f420050a     // Catch: java.lang.AssertionError -> L3a
            int r3 = r1.f420052c     // Catch: java.lang.AssertionError -> L3a
            int r6 = r7.read(r2, r3, r6)     // Catch: java.lang.AssertionError -> L3a
            r7 = -1
            if (r6 != r7) goto L3f
            int r6 = r1.f420051b     // Catch: java.lang.AssertionError -> L3a
            int r7 = r1.f420052c     // Catch: java.lang.AssertionError -> L3a
            if (r6 != r7) goto L3c
            okio.Z r6 = r1.a()     // Catch: java.lang.AssertionError -> L3a
            r5.f420124b = r6     // Catch: java.lang.AssertionError -> L3a
            okio.a0.a(r1)     // Catch: java.lang.AssertionError -> L3a
            goto L3c
        L3a:
            r5 = move-exception
            goto L4b
        L3c:
            r5 = -1
            return r5
        L3f:
            int r7 = r1.f420052c     // Catch: java.lang.AssertionError -> L3a
            int r7 = r7 + r6
            r1.f420052c = r7     // Catch: java.lang.AssertionError -> L3a
            long r1 = r5.f420125c     // Catch: java.lang.AssertionError -> L3a
            long r6 = (long) r6     // Catch: java.lang.AssertionError -> L3a
            long r1 = r1 + r6
            r5.f420125c = r1     // Catch: java.lang.AssertionError -> L3a
            return r6
        L4b:
            java.util.logging.Logger r6 = okio.N.f420027a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L65
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L61
            java.lang.String r1 = "getsockname failed"
            boolean r6 = kotlin.text.C43066x.q(r6, r1, r7)
            goto L62
        L61:
            r6 = r7
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            r0 = r7
        L66:
            if (r0 == 0) goto L6e
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L6e:
            throw r5
        L6f:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = androidx.compose.foundation.text.selection.C21030p.a(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.G.read(okio.l, long):long");
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout, reason: from getter */
    public final i0 getF420025c() {
        return this.f420025c;
    }

    @Y61.k
    public final String toString() {
        return "source(" + this.f420024b + ')';
    }
}
