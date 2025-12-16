package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43047d;
import okio.C44802l;

/* compiled from: RealBufferedSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Y;", "Lokio/n;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Y implements InterfaceC44804n {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final e0 f420046b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C44802l f420047c = new C44802l();

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public boolean f420048d;

    public Y(@Y61.k e0 e0Var) {
        this.f420046b = e0Var;
    }

    @Override // okio.InterfaceC44804n
    public final long E1(@Y61.k c0 c0Var) {
        C44802l c44802l;
        long j12 = 0;
        while (true) {
            e0 e0Var = this.f420046b;
            c44802l = this.f420047c;
            if (e0Var.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long j13 = c44802l.j();
            if (j13 > 0) {
                j12 += j13;
                c0Var.write(c44802l, j13);
            }
        }
        long j14 = c44802l.f420125c;
        if (j14 <= 0) {
            return j12;
        }
        long j15 = j12 + j14;
        c0Var.write(c44802l, j14);
        return j15;
    }

    @Override // okio.InterfaceC44804n
    public final boolean F0(long j12, @Y61.k C44805o c44805o) {
        int iD2 = c44805o.d();
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        if (j12 < 0 || iD2 < 0 || c44805o.d() < iD2) {
            return false;
        }
        for (int i12 = 0; i12 < iD2; i12++) {
            long j13 = i12 + j12;
            if (!request(1 + j13) || this.f420047c.m(j13) != c44805o.k(i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.InterfaceC44804n
    public final long I3() {
        return a((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // okio.InterfaceC44804n
    public final long J1() throws EOFException {
        C44802l c44802l;
        byte bM2;
        x5(1L);
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            boolean zRequest = request(i13);
            c44802l = this.f420047c;
            if (!zRequest) {
                break;
            }
            bM2 = c44802l.m(i12);
            if ((bM2 < 48 || bM2 > 57) && ((bM2 < 97 || bM2 > 102) && (bM2 < 65 || bM2 > 70))) {
                break;
            }
            i12 = i13;
        }
        if (i12 == 0) {
            C43044a.a(16);
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bM2, 16)));
        }
        return c44802l.J1();
    }

    @Override // okio.InterfaceC44804n
    public final void U4(@Y61.k C44802l c44802l, long j12) throws EOFException {
        C44802l c44802l2 = this.f420047c;
        try {
            x5(j12);
            c44802l2.U4(c44802l, j12);
        } catch (EOFException e12) {
            c44802l.h2(c44802l2);
            throw e12;
        }
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final C44805o W0(long j12) throws EOFException {
        x5(j12);
        return this.f420047c.W0(j12);
    }

    @Override // okio.InterfaceC44804n
    public final boolean W2() {
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        C44802l c44802l = this.f420047c;
        return c44802l.W2() && this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String X1(long j12) throws EOFException {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "limit < 0: ").toString());
        }
        long j13 = j12 == Long.MAX_VALUE ? Long.MAX_VALUE : j12 + 1;
        long jA2 = a((byte) 10, 0L, j13);
        C44802l c44802l = this.f420047c;
        if (jA2 != -1) {
            return okio.internal.a.b(c44802l, jA2);
        }
        if (j13 < Long.MAX_VALUE && request(j13) && c44802l.m(j13 - 1) == 13 && request(1 + j13) && c44802l.m(j13) == 10) {
            return okio.internal.a.b(c44802l, j13);
        }
        C44802l c44802l2 = new C44802l();
        c44802l.k(0L, c44802l2, Math.min(32, c44802l.f420125c));
        throw new EOFException("\\n not found: limit=" + Math.min(c44802l.f420125c, j12) + " content=" + c44802l2.W0(c44802l2.f420125c).e() + (char) 8230);
    }

    @Override // okio.InterfaceC44804n
    public final long Y2() throws EOFException {
        C44802l c44802l;
        byte bM2;
        x5(1L);
        long j12 = 0;
        while (true) {
            long j13 = j12 + 1;
            boolean zRequest = request(j13);
            c44802l = this.f420047c;
            if (!zRequest) {
                break;
            }
            bM2 = c44802l.m(j12);
            if ((bM2 < 48 || bM2 > 57) && !(j12 == 0 && bM2 == 45)) {
                break;
            }
            j12 = j13;
        }
        if (j12 == 0) {
            C43044a.a(16);
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(Integer.toString(bM2, 16)));
        }
        return c44802l.Y2();
    }

    public final long a(byte b12, long j12, long j13) {
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        long jMax = 0;
        if (0 > j13) {
            throw new IllegalArgumentException(C21030p.a(j13, "fromIndex=0 toIndex=").toString());
        }
        while (jMax < j13) {
            long jN2 = this.f420047c.n(b12, jMax, j13);
            if (jN2 != -1) {
                return jN2;
            }
            C44802l c44802l = this.f420047c;
            long j14 = c44802l.f420125c;
            if (j14 >= j13 || this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j14);
        }
        return -1L;
    }

    public final long b(@Y61.k C44805o c44805o) {
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        long jMax = 0;
        while (true) {
            C44802l c44802l = this.f420047c;
            long jO2 = c44802l.o(jMax, c44805o);
            if (jO2 != -1) {
                return jO2;
            }
            long j12 = c44802l.f420125c;
            if (this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
        }
    }

    public final int c() throws EOFException {
        x5(4L);
        return C44799i.c(this.f420047c.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f420048d) {
            return;
        }
        this.f420048d = true;
        this.f420046b.close();
        this.f420047c.a();
    }

    public final long d() throws EOFException {
        x5(8L);
        long j12 = this.f420047c.readLong();
        C44802l.a aVar = C44799i.f420068a;
        return ((j12 & 255) << 56) | (((-72057594037927936L) & j12) >>> 56) | ((71776119061217280L & j12) >>> 40) | ((280375465082880L & j12) >>> 24) | ((1095216660480L & j12) >>> 8) | ((4278190080L & j12) << 8) | ((16711680 & j12) << 24) | ((65280 & j12) << 40);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String d4(long j12) throws EOFException {
        x5(j12);
        C44802l c44802l = this.f420047c;
        c44802l.getClass();
        return c44802l.z1(j12, C43047d.f410589b);
    }

    public final short f() throws EOFException {
        x5(2L);
        return this.f420047c.q();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f420048d;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final byte[] j4() {
        e0 e0Var = this.f420046b;
        C44802l c44802l = this.f420047c;
        c44802l.h2(e0Var);
        return c44802l.p5(c44802l.f420125c);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String n2() {
        return X1(Long.MAX_VALUE);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final byte[] p5(long j12) throws EOFException {
        x5(j12);
        return this.f420047c.p5(j12);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final Y peek() {
        return new Y(new T(this));
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final C44805o q1() {
        e0 e0Var = this.f420046b;
        C44802l c44802l = this.f420047c;
        c44802l.h2(e0Var);
        return c44802l.W0(c44802l.f420125c);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@Y61.k ByteBuffer byteBuffer) {
        C44802l c44802l = this.f420047c;
        if (c44802l.f420125c == 0 && this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return c44802l.read(byteBuffer);
    }

    @Override // okio.InterfaceC44804n
    public final byte readByte() throws EOFException {
        x5(1L);
        return this.f420047c.readByte();
    }

    @Override // okio.InterfaceC44804n
    public final void readFully(@Y61.k byte[] bArr) throws EOFException {
        C44802l c44802l = this.f420047c;
        try {
            x5(bArr.length);
            c44802l.readFully(bArr);
        } catch (EOFException e12) {
            int i12 = 0;
            while (true) {
                long j12 = c44802l.f420125c;
                if (j12 <= 0) {
                    throw e12;
                }
                int i13 = c44802l.read(bArr, i12, (int) j12);
                if (i13 == -1) {
                    throw new AssertionError();
                }
                i12 += i13;
            }
        }
    }

    @Override // okio.InterfaceC44804n
    public final int readInt() throws EOFException {
        x5(4L);
        return this.f420047c.readInt();
    }

    @Override // okio.InterfaceC44804n
    public final long readLong() throws EOFException {
        x5(8L);
        return this.f420047c.readLong();
    }

    @Override // okio.InterfaceC44804n
    public final short readShort() throws EOFException {
        x5(2L);
        return this.f420047c.readShort();
    }

    @Override // okio.InterfaceC44804n
    public final boolean request(long j12) {
        C44802l c44802l;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        do {
            c44802l = this.f420047c;
            if (c44802l.f420125c >= j12) {
                return true;
            }
        } while (this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final InputStream s6() {
        return new a();
    }

    @Override // okio.InterfaceC44804n
    public final void skip(long j12) throws EOFException {
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        while (j12 > 0) {
            C44802l c44802l = this.f420047c;
            if (c44802l.f420125c == 0 && this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j12, c44802l.f420125c);
            c44802l.skip(jMin);
            j12 -= jMin;
        }
    }

    @Override // okio.InterfaceC44804n
    public final int t6(@Y61.k P p12) {
        if (this.f420048d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        while (true) {
            C44802l c44802l = this.f420047c;
            int iC2 = okio.internal.a.c(c44802l, p12, true);
            if (iC2 != -2) {
                if (iC2 != -1) {
                    c44802l.skip(p12.f420029c[iC2].d());
                    return iC2;
                }
            } else if (this.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.e0
    @Y61.k
    public final i0 timeout() {
        return this.f420046b.timeout();
    }

    @Y61.k
    public final String toString() {
        return "buffer(" + this.f420046b + ')';
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    /* renamed from: v, reason: from getter */
    public final C44802l getF420047c() {
        return this.f420047c;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String w4(@Y61.k Charset charset) {
        e0 e0Var = this.f420046b;
        C44802l c44802l = this.f420047c;
        c44802l.h2(e0Var);
        return c44802l.z1(c44802l.f420125c, charset);
    }

    @Override // okio.InterfaceC44804n
    public final void x5(long j12) throws EOFException {
        if (!request(j12)) {
            throw new EOFException();
        }
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String z1(long j12, @Y61.k Charset charset) throws EOFException {
        x5(j12);
        return this.f420047c.z1(j12, charset);
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        if (j12 >= 0) {
            if (!this.f420048d) {
                C44802l c44802l2 = this.f420047c;
                if (c44802l2.f420125c == 0 && this.f420046b.read(c44802l2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return c44802l2.read(c44802l, Math.min(j12, c44802l2.f420125c));
            }
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
    }

    /* compiled from: RealBufferedSource.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Y$a", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            Y y12 = Y.this;
            if (y12.f420048d) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            return (int) Math.min(y12.f420047c.f420125c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Y.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            Y y12 = Y.this;
            if (y12.f420048d) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            C44802l c44802l = y12.f420047c;
            if (c44802l.f420125c == 0 && y12.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return c44802l.readByte() & 255;
        }

        @Y61.k
        public final String toString() {
            return Y.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@Y61.k byte[] bArr, int i12, int i13) throws IOException {
            Y y12 = Y.this;
            if (!y12.f420048d) {
                C44799i.b(bArr.length, i12, i13);
                C44802l c44802l = y12.f420047c;
                if (c44802l.f420125c == 0 && y12.f420046b.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return c44802l.read(bArr, i12, i13);
            }
            throw new IOException(AdvertStatus.CLOSED);
        }
    }
}
