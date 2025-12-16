package okio;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GzipSink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/B;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class B implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final X f420010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Deflater f420011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r f420012d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f420013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CRC32 f420014f;

    public B(@Y61.k c0 c0Var) {
        X x12 = new X(c0Var);
        this.f420010b = x12;
        Deflater deflater = new Deflater(-1, true);
        this.f420011c = deflater;
        this.f420012d = new r(x12, deflater);
        this.f420014f = new CRC32();
        C44802l c44802l = x12.f420043c;
        c44802l.J(8075);
        c44802l.D(8);
        c44802l.D(0);
        c44802l.H(0);
        c44802l.D(0);
        c44802l.D(0);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z12;
        C44802l c44802l;
        Deflater deflater = this.f420011c;
        X x12 = this.f420010b;
        if (this.f420013e) {
            return;
        }
        try {
            r rVar = this.f420012d;
            rVar.f420145c.finish();
            rVar.a(false);
            value = (int) this.f420014f.getValue();
            z12 = x12.f420044d;
            c44802l = x12.f420043c;
        } catch (Throwable th2) {
            th = th2;
        }
        if (z12) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        c44802l.getClass();
        c44802l.H(C44799i.c(value));
        x12.W1();
        int bytesRead = (int) deflater.getBytesRead();
        if (x12.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        c44802l.getClass();
        c44802l.H(C44799i.c(bytesRead));
        x12.W1();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            x12.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f420013e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.c0, java.io.Flushable
    public final void flush() throws IOException {
        this.f420012d.flush();
    }

    @Override // okio.c0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420032c() {
        return this.f420010b.f420042b.getF420032c();
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        if (j12 == 0) {
            return;
        }
        Z z12 = c44802l.f420124b;
        long j13 = j12;
        while (j13 > 0) {
            int iMin = (int) Math.min(j13, z12.f420052c - z12.f420051b);
            this.f420014f.update(z12.f420050a, z12.f420051b, iMin);
            j13 -= iMin;
            z12 = z12.f420055f;
        }
        this.f420012d.write(c44802l, j12);
    }
}
