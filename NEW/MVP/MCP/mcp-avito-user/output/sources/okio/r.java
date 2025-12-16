package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeflaterSink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/r;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final X f420144b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Deflater f420145c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f420146d;

    public r(@Y61.k X x12, @Y61.k Deflater deflater) {
        this.f420144b = x12;
        this.f420145c = deflater;
    }

    public final void a(boolean z12) throws IOException {
        C44802l c44802l;
        Z zA2;
        int iDeflate;
        X x12 = this.f420144b;
        while (true) {
            c44802l = x12.f420043c;
            zA2 = c44802l.A(1);
            Deflater deflater = this.f420145c;
            byte[] bArr = zA2.f420050a;
            if (z12) {
                try {
                    int i12 = zA2.f420052c;
                    iDeflate = deflater.deflate(bArr, i12, 8192 - i12, 2);
                } catch (NullPointerException e12) {
                    throw new IOException("Deflater already closed", e12);
                }
            } else {
                int i13 = zA2.f420052c;
                iDeflate = deflater.deflate(bArr, i13, 8192 - i13);
            }
            if (iDeflate > 0) {
                zA2.f420052c += iDeflate;
                c44802l.f420125c += iDeflate;
                x12.W1();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (zA2.f420051b == zA2.f420052c) {
            c44802l.f420124b = zA2.a();
            a0.a(zA2);
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f420145c;
        if (this.f420146d) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f420144b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f420146d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.c0, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.f420144b.flush();
    }

    @Override // okio.c0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420032c() {
        return this.f420144b.f420042b.getF420032c();
    }

    @Y61.k
    public final String toString() {
        return "DeflaterSink(" + this.f420144b + ')';
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
        C44799i.b(c44802l.f420125c, 0L, j12);
        while (j12 > 0) {
            Z z12 = c44802l.f420124b;
            int iMin = (int) Math.min(j12, z12.f420052c - z12.f420051b);
            this.f420145c.setInput(z12.f420050a, z12.f420051b, iMin);
            a(false);
            long j13 = iMin;
            c44802l.f420125c -= j13;
            int i12 = z12.f420051b + iMin;
            z12.f420051b = i12;
            if (i12 == z12.f420052c) {
                c44802l.f420124b = z12.a();
                a0.a(z12);
            }
            j12 -= j13;
        }
    }
}
