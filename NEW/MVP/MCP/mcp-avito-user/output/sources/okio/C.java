package okio;

import androidx.compose.foundation.text.selection.C21030p;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GzipSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/C;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class C implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public byte f420015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f420016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Inflater f420017d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final F f420018e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CRC32 f420019f;

    public C(@Y61.k e0 e0Var) {
        Y y12 = new Y(e0Var);
        this.f420016c = y12;
        Inflater inflater = new Inflater(true);
        this.f420017d = inflater;
        this.f420018e = new F(y12, inflater);
        this.f420019f = new CRC32();
    }

    public static void a(int i12, int i13, String str) throws IOException {
        if (i13 != i12) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i13), Integer.valueOf(i12)}, 3)));
        }
    }

    public final void b(long j12, C44802l c44802l, long j13) {
        Z z12 = c44802l.f420124b;
        while (true) {
            int i12 = z12.f420052c;
            int i13 = z12.f420051b;
            if (j12 < i12 - i13) {
                break;
            }
            j12 -= i12 - i13;
            z12 = z12.f420055f;
        }
        while (j13 > 0) {
            int iMin = (int) Math.min(z12.f420052c - r5, j13);
            this.f420019f.update(z12.f420050a, (int) (z12.f420051b + j12), iMin);
            j13 -= iMin;
            z12 = z12.f420055f;
            j12 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f420018e.close();
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
        long j13;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        if (j12 == 0) {
            return 0L;
        }
        byte b12 = this.f420015b;
        CRC32 crc32 = this.f420019f;
        Y y12 = this.f420016c;
        if (b12 == 0) {
            y12.x5(10L);
            C44802l c44802l2 = y12.f420047c;
            byte bM2 = c44802l2.m(3L);
            boolean z12 = ((bM2 >> 1) & 1) == 1;
            if (z12) {
                b(0L, y12.f420047c, 10L);
            }
            a(8075, y12.readShort(), "ID1ID2");
            y12.skip(8L);
            if (((bM2 >> 2) & 1) == 1) {
                y12.x5(2L);
                if (z12) {
                    b(0L, y12.f420047c, 2L);
                }
                long jQ2 = c44802l2.q() & 65535;
                y12.x5(jQ2);
                if (z12) {
                    b(0L, y12.f420047c, jQ2);
                    j13 = jQ2;
                } else {
                    j13 = jQ2;
                }
                y12.skip(j13);
            }
            if (((bM2 >> 3) & 1) == 1) {
                long jI3 = y12.I3();
                if (jI3 == -1) {
                    throw new EOFException();
                }
                if (z12) {
                    b(0L, y12.f420047c, jI3 + 1);
                }
                y12.skip(jI3 + 1);
            }
            if (((bM2 >> 4) & 1) == 1) {
                long jI32 = y12.I3();
                if (jI32 == -1) {
                    throw new EOFException();
                }
                if (z12) {
                    b(0L, y12.f420047c, jI32 + 1);
                }
                y12.skip(jI32 + 1);
            }
            if (z12) {
                a(y12.f(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f420015b = (byte) 1;
        }
        if (this.f420015b == 1) {
            long j14 = c44802l.f420125c;
            long j15 = this.f420018e.read(c44802l, j12);
            if (j15 != -1) {
                b(j14, c44802l, j15);
                return j15;
            }
            this.f420015b = (byte) 2;
        }
        if (this.f420015b == 2) {
            a(y12.c(), (int) crc32.getValue(), "CRC");
            a(y12.c(), (int) this.f420017d.getBytesWritten(), "ISIZE");
            this.f420015b = (byte) 3;
            if (!y12.W2()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420025c() {
        return this.f420016c.f420046b.getF420025c();
    }
}
