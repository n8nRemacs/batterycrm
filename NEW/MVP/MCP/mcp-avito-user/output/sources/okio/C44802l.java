package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.text.selection.C21030p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import okhttp3.internal.connection.RealConnection;
import shark.AndroidResourceIdNames;

/* compiled from: Buffer.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lokio/l;", "Lokio/n;", "Lokio/m;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44802l implements InterfaceC44804n, InterfaceC44803m, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public Z f420124b;

    /* renamed from: c, reason: collision with root package name */
    public long f420125c;

    /* compiled from: Buffer.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/l$a;", "Ljava/io/Closeable;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.l$a */
    public static final class a implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.l
        public C44802l f420126b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        public boolean f420127c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public Z f420128d;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        @Y61.l
        public byte[] f420130f;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public long f420129e = -1;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        public int f420131g = -1;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        public int f420132h = -1;

        public final void a(long j12) {
            C44802l c44802l = this.f420126b;
            if (c44802l == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f420127c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j13 = c44802l.f420125c;
            if (j12 <= j13) {
                if (j12 < 0) {
                    throw new IllegalArgumentException(C21030p.a(j12, "newSize < 0: ").toString());
                }
                long j14 = j13 - j12;
                while (true) {
                    if (j14 <= 0) {
                        break;
                    }
                    Z z12 = c44802l.f420124b.f420056g;
                    int i12 = z12.f420052c;
                    long j15 = i12 - z12.f420051b;
                    if (j15 > j14) {
                        z12.f420052c = i12 - ((int) j14);
                        break;
                    } else {
                        c44802l.f420124b = z12.a();
                        a0.a(z12);
                        j14 -= j15;
                    }
                }
                this.f420128d = null;
                this.f420129e = j12;
                this.f420130f = null;
                this.f420131g = -1;
                this.f420132h = -1;
            } else if (j12 > j13) {
                long j16 = j12 - j13;
                int i13 = 1;
                boolean z13 = true;
                for (long j17 = 0; j16 > j17; j17 = 0) {
                    Z zA2 = c44802l.A(i13);
                    int iMin = (int) Math.min(j16, 8192 - zA2.f420052c);
                    int i14 = zA2.f420052c + iMin;
                    zA2.f420052c = i14;
                    j16 -= iMin;
                    if (z13) {
                        this.f420128d = zA2;
                        this.f420129e = j13;
                        this.f420130f = zA2.f420050a;
                        this.f420131g = i14 - iMin;
                        this.f420132h = i14;
                        z13 = false;
                    }
                    i13 = 1;
                }
            }
            c44802l.f420125c = j12;
        }

        public final int b(long j12) {
            C44802l c44802l = this.f420126b;
            if (c44802l == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j12 >= -1) {
                long j13 = c44802l.f420125c;
                if (j12 <= j13) {
                    if (j12 == -1 || j12 == j13) {
                        this.f420128d = null;
                        this.f420129e = j12;
                        this.f420130f = null;
                        this.f420131g = -1;
                        this.f420132h = -1;
                        return -1;
                    }
                    Z z12 = c44802l.f420124b;
                    Z z13 = this.f420128d;
                    long j14 = 0;
                    if (z13 != null) {
                        long j15 = this.f420129e - (this.f420131g - z13.f420051b);
                        if (j15 > j12) {
                            j13 = j15;
                            z13 = z12;
                            z12 = z13;
                        } else {
                            j14 = j15;
                        }
                    } else {
                        z13 = z12;
                    }
                    if (j13 - j12 > j12 - j14) {
                        while (true) {
                            long j16 = (z13.f420052c - z13.f420051b) + j14;
                            if (j12 < j16) {
                                break;
                            }
                            z13 = z13.f420055f;
                            j14 = j16;
                        }
                    } else {
                        while (j13 > j12) {
                            z12 = z12.f420056g;
                            j13 -= z12.f420052c - z12.f420051b;
                        }
                        z13 = z12;
                        j14 = j13;
                    }
                    if (this.f420127c && z13.f420053d) {
                        byte[] bArr = z13.f420050a;
                        Z z14 = new Z(Arrays.copyOf(bArr, bArr.length), z13.f420051b, z13.f420052c, false, true);
                        if (c44802l.f420124b == z13) {
                            c44802l.f420124b = z14;
                        }
                        z13.b(z14);
                        z14.f420056g.a();
                        z13 = z14;
                    }
                    this.f420128d = z13;
                    this.f420129e = j12;
                    this.f420130f = z13.f420050a;
                    int i12 = z13.f420051b + ((int) (j12 - j14));
                    this.f420131g = i12;
                    int i13 = z13.f420052c;
                    this.f420132h = i13;
                    return i13 - i12;
                }
            }
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "offset=", " > size=");
            sbQ.append(c44802l.f420125c);
            throw new ArrayIndexOutOfBoundsException(sbQ.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f420126b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f420126b = null;
            this.f420128d = null;
            this.f420129e = -1L;
            this.f420130f = null;
            this.f420131g = -1;
            this.f420132h = -1;
        }
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/l$c", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.l$c */
    public static final class c extends OutputStream {
        public c() {
        }

        @Y61.k
        public final String toString() {
            return C44802l.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i12) {
            C44802l.this.D(i12);
        }

        @Override // java.io.OutputStream
        public final void write(@Y61.k byte[] bArr, int i12, int i13) {
            C44802l.this.write(bArr, i12, i13);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }
    }

    @Y61.k
    public final Z A(int i12) {
        if (i12 < 1 || i12 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Z z12 = this.f420124b;
        if (z12 == null) {
            Z zB2 = a0.b();
            this.f420124b = zB2;
            zB2.f420056g = zB2;
            zB2.f420055f = zB2;
            return zB2;
        }
        Z z13 = z12.f420056g;
        if (z13.f420052c + i12 <= 8192 && z13.f420054e) {
            return z13;
        }
        Z zB3 = a0.b();
        z13.b(zB3);
        return zB3;
    }

    @Y61.k
    public final void B(@Y61.k C44805o c44805o) {
        c44805o.u(c44805o.d(), this);
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m B1(C44805o c44805o) {
        B(c44805o);
        return this;
    }

    @Y61.k
    public final void D(int i12) {
        Z zA2 = A(1);
        int i13 = zA2.f420052c;
        zA2.f420052c = i13 + 1;
        zA2.f420050a[i13] = (byte) i12;
        this.f420125c++;
    }

    @Override // okio.InterfaceC44804n
    public final long E1(@Y61.k c0 c0Var) {
        long j12 = this.f420125c;
        if (j12 > 0) {
            c0Var.write(this, j12);
        }
        return j12;
    }

    @Y61.k
    public final void F(long j12) {
        byte[] bArr;
        if (j12 == 0) {
            D(48);
            return;
        }
        boolean z12 = false;
        int i12 = 1;
        if (j12 < 0) {
            j12 = -j12;
            if (j12 < 0) {
                N(0, 20, "-9223372036854775808");
                return;
            }
            z12 = true;
        }
        if (j12 >= 100000000) {
            i12 = j12 < 1000000000000L ? j12 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j12 < 1000000000 ? 9 : 10 : j12 < 100000000000L ? 11 : 12 : j12 < 1000000000000000L ? j12 < 10000000000000L ? 13 : j12 < 100000000000000L ? 14 : 15 : j12 < 100000000000000000L ? j12 < 10000000000000000L ? 16 : 17 : j12 < 1000000000000000000L ? 18 : 19;
        } else if (j12 >= 10000) {
            i12 = j12 < 1000000 ? j12 < 100000 ? 5 : 6 : j12 < 10000000 ? 7 : 8;
        } else if (j12 >= 100) {
            i12 = j12 < 1000 ? 3 : 4;
        } else if (j12 >= 10) {
            i12 = 2;
        }
        if (z12) {
            i12++;
        }
        Z zA2 = A(i12);
        int i13 = zA2.f420052c + i12;
        while (true) {
            bArr = zA2.f420050a;
            if (j12 == 0) {
                break;
            }
            long j13 = 10;
            i13--;
            bArr[i13] = okio.internal.a.f420070a[(int) (j12 % j13)];
            j12 /= j13;
        }
        if (z12) {
            bArr[i13 - 1] = 45;
        }
        zA2.f420052c += i12;
        this.f420125c += i12;
    }

    @Override // okio.InterfaceC44804n
    public final boolean F0(long j12, @Y61.k C44805o c44805o) {
        int iD2 = c44805o.d();
        if (j12 < 0 || iD2 < 0 || this.f420125c - j12 < iD2 || c44805o.d() < iD2) {
            return false;
        }
        for (int i12 = 0; i12 < iD2; i12++) {
            if (m(i12 + j12) != c44805o.k(i12)) {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public final void G(long j12) {
        if (j12 == 0) {
            D(48);
            return;
        }
        long j13 = (j12 >>> 1) | j12;
        long j14 = j13 | (j13 >>> 2);
        long j15 = j14 | (j14 >>> 4);
        long j16 = j15 | (j15 >>> 8);
        long j17 = j16 | (j16 >>> 16);
        long j18 = j17 | (j17 >>> 32);
        long j19 = j18 - ((j18 >>> 1) & 6148914691236517205L);
        long j22 = ((j19 >>> 2) & 3689348814741910323L) + (j19 & 3689348814741910323L);
        long j23 = ((j22 >>> 4) + j22) & 1085102592571150095L;
        long j24 = j23 + (j23 >>> 8);
        long j25 = j24 + (j24 >>> 16);
        int i12 = (int) ((((j25 & 63) + ((j25 >>> 32) & 63)) + 3) / 4);
        Z zA2 = A(i12);
        int i13 = zA2.f420052c;
        for (int i14 = (i13 + i12) - 1; i14 >= i13; i14--) {
            zA2.f420050a[i14] = okio.internal.a.f420070a[(int) (15 & j12)];
            j12 >>>= 4;
        }
        zA2.f420052c += i12;
        this.f420125c += i12;
    }

    @Y61.k
    public final void H(int i12) {
        Z zA2 = A(4);
        int i13 = zA2.f420052c;
        byte[] bArr = zA2.f420050a;
        bArr[i13] = (byte) ((i12 >>> 24) & 255);
        bArr[i13 + 1] = (byte) ((i12 >>> 16) & 255);
        bArr[i13 + 2] = (byte) ((i12 >>> 8) & 255);
        bArr[i13 + 3] = (byte) (i12 & 255);
        zA2.f420052c = i13 + 4;
        this.f420125c += 4;
    }

    @Y61.k
    public final void I(long j12) {
        Z zA2 = A(8);
        int i12 = zA2.f420052c;
        byte[] bArr = zA2.f420050a;
        bArr[i12] = (byte) ((j12 >>> 56) & 255);
        bArr[i12 + 1] = (byte) ((j12 >>> 48) & 255);
        bArr[i12 + 2] = (byte) ((j12 >>> 40) & 255);
        bArr[i12 + 3] = (byte) ((j12 >>> 32) & 255);
        bArr[i12 + 4] = (byte) ((j12 >>> 24) & 255);
        bArr[i12 + 5] = (byte) ((j12 >>> 16) & 255);
        bArr[i12 + 6] = (byte) ((j12 >>> 8) & 255);
        bArr[i12 + 7] = (byte) (j12 & 255);
        zA2.f420052c = i12 + 8;
        this.f420125c += 8;
    }

    @Override // okio.InterfaceC44804n
    public final long I3() {
        return n((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Y61.k
    public final void J(int i12) {
        Z zA2 = A(2);
        int i13 = zA2.f420052c;
        byte[] bArr = zA2.f420050a;
        bArr[i13] = (byte) ((i12 >>> 8) & 255);
        bArr[i13 + 1] = (byte) (i12 & 255);
        zA2.f420052c = i13 + 2;
        this.f420125c += 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[EDGE_INSN: B:43:0x008a->B:37:0x008a BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // okio.InterfaceC44804n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J1() throws java.io.EOFException {
        /*
            r13 = this;
            long r0 = r13.f420125c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L91
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.Z r6 = r13.f420124b
            int r7 = r6.f420051b
            int r8 = r6.f420052c
        L11:
            if (r7 >= r8) goto L76
            byte[] r9 = r6.f420050a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L22
            r10 = 57
            if (r9 > r10) goto L22
            int r10 = r9 + (-48)
            goto L37
        L22:
            r10 = 97
            if (r9 < r10) goto L2d
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L2d
            int r10 = r9 + (-87)
            goto L37
        L2d:
            r10 = 65
            if (r9 < r10) goto L62
            r10 = 70
            if (r9 > r10) goto L62
            int r10 = r9 + (-55)
        L37:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L47
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L11
        L47:
            okio.l r0 = new okio.l
            r0.<init>()
            r0.G(r4)
            r0.D(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.u()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L62:
            if (r0 == 0) goto L66
            r1 = 1
            goto L76
        L66:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = okio.C44799i.d(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L76:
            if (r7 != r8) goto L82
            okio.Z r7 = r6.a()
            r13.f420124b = r7
            okio.a0.a(r6)
            goto L84
        L82:
            r6.f420051b = r7
        L84:
            if (r1 != 0) goto L8a
            okio.Z r6 = r13.f420124b
            if (r6 != 0) goto Lb
        L8a:
            long r1 = r13.f420125c
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f420125c = r1
            return r4
        L91:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C44802l.J1():long");
    }

    public final InterfaceC44803m L(String str, Charset charset) {
        M(str, 0, str.length(), charset);
        return this;
    }

    @Y61.k
    public final void M(@Y61.k String str, int i12, int i13, @Y61.k Charset charset) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "beginIndex < 0: ").toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i13, i12, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i13 > str.length()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        if (charset.equals(C43047d.f410589b)) {
            N(i12, i13, str);
        } else {
            byte[] bytes = str.substring(i12, i13).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Y61.k
    public final void N(int i12, int i13, @Y61.k String str) {
        char cCharAt;
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "beginIndex < 0: ").toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i13, i12, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i13 > str.length()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        while (i12 < i13) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 128) {
                Z zA2 = A(1);
                int i14 = zA2.f420052c - i12;
                int iMin = Math.min(i13, 8192 - i14);
                int i15 = i12 + 1;
                byte[] bArr = zA2.f420050a;
                bArr[i12 + i14] = (byte) cCharAt2;
                while (true) {
                    i12 = i15;
                    if (i12 >= iMin || (cCharAt = str.charAt(i12)) >= 128) {
                        break;
                    }
                    i15 = i12 + 1;
                    bArr[i12 + i14] = (byte) cCharAt;
                }
                int i16 = zA2.f420052c;
                int i17 = (i14 + i12) - i16;
                zA2.f420052c = i16 + i17;
                this.f420125c += i17;
            } else {
                if (cCharAt2 < 2048) {
                    Z zA3 = A(2);
                    int i18 = zA3.f420052c;
                    byte[] bArr2 = zA3.f420050a;
                    bArr2[i18] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i18 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zA3.f420052c = i18 + 2;
                    this.f420125c += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Z zA4 = A(3);
                    int i19 = zA4.f420052c;
                    byte[] bArr3 = zA4.f420050a;
                    bArr3[i19] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i19 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i19 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zA4.f420052c = i19 + 3;
                    this.f420125c += 3;
                } else {
                    int i22 = i12 + 1;
                    char cCharAt3 = i22 < i13 ? str.charAt(i22) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        D(63);
                        i12 = i22;
                    } else {
                        int i23 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                        Z zA5 = A(4);
                        int i24 = zA5.f420052c;
                        byte[] bArr4 = zA5.f420050a;
                        bArr4[i24] = (byte) ((i23 >> 18) | 240);
                        bArr4[i24 + 1] = (byte) (((i23 >> 12) & 63) | 128);
                        bArr4[i24 + 2] = (byte) (((i23 >> 6) & 63) | 128);
                        bArr4[i24 + 3] = (byte) ((i23 & 63) | 128);
                        zA5.f420052c = i24 + 4;
                        this.f420125c += 4;
                        i12 += 2;
                    }
                }
                i12++;
            }
        }
    }

    @Y61.k
    public final void O(@Y61.k String str) {
        N(0, str.length(), str);
    }

    @Y61.k
    public final void P(int i12) {
        String strP;
        int i13 = 0;
        if (i12 < 128) {
            D(i12);
            return;
        }
        if (i12 < 2048) {
            Z zA2 = A(2);
            int i14 = zA2.f420052c;
            byte[] bArr = zA2.f420050a;
            bArr[i14] = (byte) ((i12 >> 6) | 192);
            bArr[1 + i14] = (byte) ((i12 & 63) | 128);
            zA2.f420052c = i14 + 2;
            this.f420125c += 2;
            return;
        }
        if (55296 <= i12 && i12 < 57344) {
            D(63);
            return;
        }
        if (i12 < 65536) {
            Z zA3 = A(3);
            int i15 = zA3.f420052c;
            byte[] bArr2 = zA3.f420050a;
            bArr2[i15] = (byte) ((i12 >> 12) | 224);
            bArr2[1 + i15] = (byte) (((i12 >> 6) & 63) | 128);
            bArr2[2 + i15] = (byte) ((i12 & 63) | 128);
            zA3.f420052c = i15 + 3;
            this.f420125c += 3;
            return;
        }
        if (i12 <= 1114111) {
            Z zA4 = A(4);
            int i16 = zA4.f420052c;
            byte[] bArr3 = zA4.f420050a;
            bArr3[i16] = (byte) ((i12 >> 18) | 240);
            bArr3[1 + i16] = (byte) (((i12 >> 12) & 63) | 128);
            bArr3[2 + i16] = (byte) (((i12 >> 6) & 63) | 128);
            bArr3[3 + i16] = (byte) ((i12 & 63) | 128);
            zA4.f420052c = i16 + 4;
            this.f420125c += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        a aVar = C44799i.f420068a;
        if (i12 != 0) {
            char[] cArr = okio.internal.c.f420071a;
            char[] cArr2 = {cArr[(i12 >> 28) & 15], cArr[(i12 >> 24) & 15], cArr[(i12 >> 20) & 15], cArr[(i12 >> 16) & 15], cArr[(i12 >> 12) & 15], cArr[(i12 >> 8) & 15], cArr[(i12 >> 4) & 15], cArr[i12 & 15]};
            while (i13 < 8 && cArr2[i13] == '0') {
                i13++;
            }
            strP = C43066x.p(cArr2, i13, 8);
        } else {
            strP = "0";
        }
        sb2.append(strP);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m U0(long j12) {
        F(j12);
        return this;
    }

    @Override // okio.InterfaceC44804n
    public final void U4(@Y61.k C44802l c44802l, long j12) {
        long j13 = this.f420125c;
        if (j13 >= j12) {
            c44802l.write(this, j12);
        } else {
            c44802l.write(this, j13);
            throw new EOFException();
        }
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final C44805o W0(long j12) throws EOFException {
        if (j12 < 0 || j12 > 2147483647L) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount: ").toString());
        }
        if (this.f420125c < j12) {
            throw new EOFException();
        }
        if (j12 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new C44805o(p5(j12));
        }
        C44805o c44805oZ = z((int) j12);
        skip(j12);
        return c44805oZ;
    }

    @Override // okio.InterfaceC44804n
    public final boolean W2() {
        return this.f420125c == 0;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String X1(long j12) throws EOFException {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "limit < 0: ").toString());
        }
        long j13 = j12 != Long.MAX_VALUE ? j12 + 1 : Long.MAX_VALUE;
        long jN2 = n((byte) 10, 0L, j13);
        if (jN2 != -1) {
            return okio.internal.a.b(this, jN2);
        }
        if (j13 < this.f420125c && m(j13 - 1) == 13 && m(j13) == 10) {
            return okio.internal.a.b(this, j13);
        }
        C44802l c44802l = new C44802l();
        k(0L, c44802l, Math.min(32, this.f420125c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f420125c, j12) + " content=" + c44802l.W0(c44802l.f420125c).e() + (char) 8230);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r1 = new okio.C44802l();
        r1.F(r8);
        r1.D(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.u()));
     */
    @Override // okio.InterfaceC44804n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Y2() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C44802l.Y2():long");
    }

    public final void a() {
        skip(this.f420125c);
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m b2(String str) {
        O(str);
        return this;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String d4(long j12) {
        return z1(j12, C43047d.f410589b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof C44802l) {
                long j12 = this.f420125c;
                C44802l c44802l = (C44802l) obj;
                if (j12 == c44802l.f420125c) {
                    if (j12 != 0) {
                        Z z12 = this.f420124b;
                        Z z13 = c44802l.f420124b;
                        int i12 = z12.f420051b;
                        int i13 = z13.f420051b;
                        long j13 = 0;
                        while (j13 < this.f420125c) {
                            long jMin = Math.min(z12.f420052c - i12, z13.f420052c - i13);
                            long j14 = 0;
                            while (j14 < jMin) {
                                int i14 = i12 + 1;
                                byte b12 = z12.f420050a[i12];
                                int i15 = i13 + 1;
                                if (b12 == z13.f420050a[i13]) {
                                    j14++;
                                    i13 = i15;
                                    i12 = i14;
                                }
                            }
                            if (i12 == z12.f420052c) {
                                Z z14 = z12.f420055f;
                                i12 = z14.f420051b;
                                z12 = z14;
                            }
                            if (i13 == z13.f420052c) {
                                z13 = z13.f420055f;
                                i13 = z13.f420051b;
                            }
                            j13 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // okio.InterfaceC44803m
    public final long h2(@Y61.k e0 e0Var) {
        long j12 = 0;
        while (true) {
            long j13 = e0Var.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j13 == -1) {
                return j12;
            }
            j12 += j13;
        }
    }

    public final int hashCode() {
        Z z12 = this.f420124b;
        if (z12 == null) {
            return 0;
        }
        int i12 = 1;
        do {
            int i13 = z12.f420052c;
            for (int i14 = z12.f420051b; i14 < i13; i14++) {
                i12 = (i12 * 31) + z12.f420050a[i14];
            }
            z12 = z12.f420055f;
        } while (z12 != this.f420124b);
        return i12;
    }

    @Y61.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C44802l clone() {
        C44802l c44802l = new C44802l();
        if (this.f420125c != 0) {
            Z z12 = this.f420124b;
            Z zC2 = z12.c();
            c44802l.f420124b = zC2;
            zC2.f420056g = zC2;
            zC2.f420055f = zC2;
            for (Z z13 = z12.f420055f; z13 != z12; z13 = z13.f420055f) {
                zC2.f420056g.b(z13.c());
            }
            c44802l.f420125c = this.f420125c;
        }
        return c44802l;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j12 = this.f420125c;
        if (j12 == 0) {
            return 0L;
        }
        Z z12 = this.f420124b.f420056g;
        if (z12.f420052c < 8192 && z12.f420054e) {
            j12 -= r3 - z12.f420051b;
        }
        return j12;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final byte[] j4() {
        return p5(this.f420125c);
    }

    @Y61.k
    public final void k(long j12, @Y61.k C44802l c44802l, long j13) {
        C44799i.b(this.f420125c, j12, j13);
        if (j13 == 0) {
            return;
        }
        c44802l.f420125c += j13;
        Z z12 = this.f420124b;
        while (true) {
            long j14 = z12.f420052c - z12.f420051b;
            if (j12 < j14) {
                break;
            }
            j12 -= j14;
            z12 = z12.f420055f;
        }
        while (j13 > 0) {
            Z zC2 = z12.c();
            int i12 = zC2.f420051b + ((int) j12);
            zC2.f420051b = i12;
            zC2.f420052c = Math.min(i12 + ((int) j13), zC2.f420052c);
            Z z13 = c44802l.f420124b;
            if (z13 == null) {
                zC2.f420056g = zC2;
                zC2.f420055f = zC2;
                c44802l.f420124b = zC2;
            } else {
                z13.f420056g.b(zC2);
            }
            j13 -= zC2.f420052c - zC2.f420051b;
            z12 = z12.f420055f;
            j12 = 0;
        }
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m k6(int i12, int i13, byte[] bArr) {
        write(bArr, i12, i13);
        return this;
    }

    @X41.i
    public final byte m(long j12) {
        C44799i.b(this.f420125c, j12, 1L);
        Z z12 = this.f420124b;
        z12.getClass();
        long j13 = this.f420125c;
        if (j13 - j12 < j12) {
            while (j13 > j12) {
                z12 = z12.f420056g;
                j13 -= z12.f420052c - z12.f420051b;
            }
            return z12.f420050a[(int) ((z12.f420051b + j12) - j13)];
        }
        long j14 = 0;
        while (true) {
            int i12 = z12.f420052c;
            int i13 = z12.f420051b;
            long j15 = (i12 - i13) + j14;
            if (j15 > j12) {
                return z12.f420050a[(int) ((i13 + j12) - j14)];
            }
            z12 = z12.f420055f;
            j14 = j15;
        }
    }

    public final long n(byte b12, long j12, long j13) {
        Z z12;
        long j14 = 0;
        if (0 > j12 || j12 > j13) {
            throw new IllegalArgumentException(("size=" + this.f420125c + " fromIndex=" + j12 + " toIndex=" + j13).toString());
        }
        long j15 = this.f420125c;
        if (j13 > j15) {
            j13 = j15;
        }
        if (j12 == j13 || (z12 = this.f420124b) == null) {
            return -1L;
        }
        if (j15 - j12 < j12) {
            while (j15 > j12) {
                z12 = z12.f420056g;
                j15 -= z12.f420052c - z12.f420051b;
            }
            while (j15 < j13) {
                int iMin = (int) Math.min(z12.f420052c, (z12.f420051b + j13) - j15);
                for (int i12 = (int) ((z12.f420051b + j12) - j15); i12 < iMin; i12++) {
                    if (z12.f420050a[i12] == b12) {
                        return (i12 - z12.f420051b) + j15;
                    }
                }
                j15 += z12.f420052c - z12.f420051b;
                z12 = z12.f420055f;
                j12 = j15;
            }
            return -1L;
        }
        while (true) {
            long j16 = (z12.f420052c - z12.f420051b) + j14;
            if (j16 > j12) {
                break;
            }
            z12 = z12.f420055f;
            j14 = j16;
        }
        while (j14 < j13) {
            int iMin2 = (int) Math.min(z12.f420052c, (z12.f420051b + j13) - j14);
            for (int i13 = (int) ((z12.f420051b + j12) - j14); i13 < iMin2; i13++) {
                if (z12.f420050a[i13] == b12) {
                    return (i13 - z12.f420051b) + j14;
                }
            }
            j14 += z12.f420052c - z12.f420051b;
            z12 = z12.f420055f;
            j12 = j14;
        }
        return -1L;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String n2() {
        return X1(Long.MAX_VALUE);
    }

    public final long o(long j12, @Y61.k C44805o c44805o) {
        int i12;
        int i13;
        int i14;
        int i15;
        long j13 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "fromIndex < 0: ").toString());
        }
        Z z12 = this.f420124b;
        if (z12 == null) {
            return -1L;
        }
        long j14 = this.f420125c;
        if (j14 - j12 < j12) {
            while (j14 > j12) {
                z12 = z12.f420056g;
                j14 -= z12.f420052c - z12.f420051b;
            }
            if (c44805o.d() == 2) {
                byte bK2 = c44805o.k(0);
                byte bK3 = c44805o.k(1);
                while (j14 < this.f420125c) {
                    i14 = (int) ((z12.f420051b + j12) - j14);
                    int i16 = z12.f420052c;
                    while (i14 < i16) {
                        byte b12 = z12.f420050a[i14];
                        if (b12 == bK2 || b12 == bK3) {
                            i15 = z12.f420051b;
                        } else {
                            i14++;
                        }
                    }
                    j14 += z12.f420052c - z12.f420051b;
                    z12 = z12.f420055f;
                    j12 = j14;
                }
                return -1L;
            }
            byte[] bArrI = c44805o.getData();
            while (j14 < this.f420125c) {
                i14 = (int) ((z12.f420051b + j12) - j14);
                int i17 = z12.f420052c;
                while (i14 < i17) {
                    byte b13 = z12.f420050a[i14];
                    for (byte b14 : bArrI) {
                        if (b13 == b14) {
                            i15 = z12.f420051b;
                        }
                    }
                    i14++;
                }
                j14 += z12.f420052c - z12.f420051b;
                z12 = z12.f420055f;
                j12 = j14;
            }
            return -1L;
            return (i14 - i15) + j14;
        }
        while (true) {
            long j15 = (z12.f420052c - z12.f420051b) + j13;
            if (j15 > j12) {
                break;
            }
            z12 = z12.f420055f;
            j13 = j15;
        }
        if (c44805o.d() == 2) {
            byte bK4 = c44805o.k(0);
            byte bK5 = c44805o.k(1);
            while (j13 < this.f420125c) {
                i12 = (int) ((z12.f420051b + j12) - j13);
                int i18 = z12.f420052c;
                while (i12 < i18) {
                    byte b15 = z12.f420050a[i12];
                    if (b15 == bK4 || b15 == bK5) {
                        i13 = z12.f420051b;
                    } else {
                        i12++;
                    }
                }
                j13 += z12.f420052c - z12.f420051b;
                z12 = z12.f420055f;
                j12 = j13;
            }
            return -1L;
        }
        byte[] bArrI2 = c44805o.getData();
        while (j13 < this.f420125c) {
            i12 = (int) ((z12.f420051b + j12) - j13);
            int i19 = z12.f420052c;
            while (i12 < i19) {
                byte b16 = z12.f420050a[i12];
                for (byte b17 : bArrI2) {
                    if (b16 == b17) {
                        i13 = z12.f420051b;
                    }
                }
                i12++;
            }
            j13 += z12.f420052c - z12.f420051b;
            z12 = z12.f420055f;
            j12 = j13;
        }
        return -1L;
        return (i12 - i13) + j13;
    }

    @X41.j
    @Y61.k
    public final a p(@Y61.k a aVar) {
        byte[] bArr = okio.internal.a.f420070a;
        if (aVar == C44799i.f420068a) {
            aVar = new a();
        }
        if (aVar.f420126b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f420126b = this;
        aVar.f420127c = true;
        return aVar;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final byte[] p5(long j12) throws EOFException {
        if (j12 < 0 || j12 > 2147483647L) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount: ").toString());
        }
        if (this.f420125c < j12) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j12];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final Y peek() {
        return new Y(new T(this));
    }

    public final short q() throws EOFException {
        short s5 = readShort();
        a aVar = C44799i.f420068a;
        return (short) (((s5 & 255) << 8) | ((65280 & s5) >>> 8));
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final C44805o q1() {
        return W0(this.f420125c);
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final OutputStream q6() {
        return new c();
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
        }
        long j13 = this.f420125c;
        if (j13 == 0) {
            return -1L;
        }
        if (j12 > j13) {
            j12 = j13;
        }
        c44802l.write(this, j12);
        return j12;
    }

    @Override // okio.InterfaceC44804n
    public final byte readByte() {
        long j12 = this.f420125c;
        if (j12 == 0) {
            throw new EOFException();
        }
        Z z12 = this.f420124b;
        int i12 = z12.f420051b;
        int i13 = z12.f420052c;
        int i14 = i12 + 1;
        byte b12 = z12.f420050a[i12];
        this.f420125c = j12 - 1;
        if (i14 == i13) {
            this.f420124b = z12.a();
            a0.a(z12);
        } else {
            z12.f420051b = i14;
        }
        return b12;
    }

    @Override // okio.InterfaceC44804n
    public final void readFully(@Y61.k byte[] bArr) {
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = read(bArr, i12, bArr.length - i12);
            if (i13 == -1) {
                throw new EOFException();
            }
            i12 += i13;
        }
    }

    @Override // okio.InterfaceC44804n
    public final int readInt() throws EOFException {
        long j12 = this.f420125c;
        if (j12 < 4) {
            throw new EOFException();
        }
        Z z12 = this.f420124b;
        int i12 = z12.f420051b;
        int i13 = z12.f420052c;
        if (i13 - i12 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = z12.f420050a;
        int i14 = i12 + 3;
        int i15 = ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 2] & 255) << 8);
        int i16 = i12 + 4;
        int i17 = i15 | (bArr[i14] & 255);
        this.f420125c = j12 - 4;
        if (i16 == i13) {
            this.f420124b = z12.a();
            a0.a(z12);
        } else {
            z12.f420051b = i16;
        }
        return i17;
    }

    @Override // okio.InterfaceC44804n
    public final long readLong() {
        long j12 = this.f420125c;
        if (j12 < 8) {
            throw new EOFException();
        }
        Z z12 = this.f420124b;
        int i12 = z12.f420051b;
        int i13 = z12.f420052c;
        if (i13 - i12 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = z12.f420050a;
        int i14 = i12 + 7;
        long j13 = ((bArr[i12 + 1] & 255) << 48) | ((bArr[i12] & 255) << 56) | ((bArr[i12 + 2] & 255) << 40) | ((bArr[i12 + 3] & 255) << 32) | ((bArr[i12 + 4] & 255) << 24) | ((bArr[i12 + 5] & 255) << 16) | ((bArr[i12 + 6] & 255) << 8);
        int i15 = i12 + 8;
        long j14 = j13 | (bArr[i14] & 255);
        this.f420125c = j12 - 8;
        if (i15 == i13) {
            this.f420124b = z12.a();
            a0.a(z12);
        } else {
            z12.f420051b = i15;
        }
        return j14;
    }

    @Override // okio.InterfaceC44804n
    public final short readShort() throws EOFException {
        long j12 = this.f420125c;
        if (j12 < 2) {
            throw new EOFException();
        }
        Z z12 = this.f420124b;
        int i12 = z12.f420051b;
        int i13 = z12.f420052c;
        if (i13 - i12 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i14 = i12 + 1;
        byte[] bArr = z12.f420050a;
        int i15 = (bArr[i12] & 255) << 8;
        int i16 = i12 + 2;
        int i17 = (bArr[i14] & 255) | i15;
        this.f420125c = j12 - 2;
        if (i16 == i13) {
            this.f420124b = z12.a();
            a0.a(z12);
        } else {
            z12.f420051b = i16;
        }
        return (short) i17;
    }

    @Override // okio.InterfaceC44804n
    public final boolean request(long j12) {
        return this.f420125c >= j12;
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final InputStream s6() {
        return new b();
    }

    @Override // okio.InterfaceC44804n
    public final void skip(long j12) {
        while (j12 > 0) {
            Z z12 = this.f420124b;
            if (z12 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j12, z12.f420052c - z12.f420051b);
            long j13 = iMin;
            this.f420125c -= j13;
            j12 -= j13;
            int i12 = z12.f420051b + iMin;
            z12.f420051b = i12;
            if (i12 == z12.f420052c) {
                this.f420124b = z12.a();
                a0.a(z12);
            }
        }
    }

    @Override // okio.InterfaceC44804n
    public final int t6(@Y61.k P p12) {
        int iC2 = okio.internal.a.c(this, p12, false);
        if (iC2 == -1) {
            return -1;
        }
        skip(p12.f420029c[iC2].d());
        return iC2;
    }

    @Override // okio.e0
    @Y61.k
    public final i0 timeout() {
        return i0.NONE;
    }

    @Y61.k
    public final String toString() {
        return y().toString();
    }

    @Y61.k
    public final String u() {
        return z1(this.f420125c, C43047d.f410589b);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String w4(@Y61.k Charset charset) {
        return z1(this.f420125c, charset);
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) {
        Z zB2;
        if (c44802l == this) {
            throw new IllegalArgumentException("source == this");
        }
        C44799i.b(c44802l.f420125c, 0L, j12);
        while (j12 > 0) {
            Z z12 = c44802l.f420124b;
            int i12 = z12.f420052c - z12.f420051b;
            if (j12 < i12) {
                Z z13 = this.f420124b;
                Z z14 = z13 != null ? z13.f420056g : null;
                if (z14 != null && z14.f420054e) {
                    if ((z14.f420052c + j12) - (z14.f420053d ? 0 : z14.f420051b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        z12.d(z14, (int) j12);
                        c44802l.f420125c -= j12;
                        this.f420125c += j12;
                        return;
                    }
                }
                int i13 = (int) j12;
                if (i13 <= 0 || i13 > i12) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i13 >= 1024) {
                    zB2 = z12.c();
                } else {
                    zB2 = a0.b();
                    int i14 = z12.f420051b;
                    C42756l.q(z12.f420050a, zB2.f420050a, i14, i14 + i13);
                }
                zB2.f420052c = zB2.f420051b + i13;
                z12.f420051b += i13;
                z12.f420056g.b(zB2);
                c44802l.f420124b = zB2;
            }
            Z z15 = c44802l.f420124b;
            long j13 = z15.f420052c - z15.f420051b;
            c44802l.f420124b = z15.a();
            Z z16 = this.f420124b;
            if (z16 == null) {
                this.f420124b = z15;
                z15.f420056g = z15;
                z15.f420055f = z15;
            } else {
                z16.f420056g.b(z15);
                Z z17 = z15.f420056g;
                if (z17 == z15) {
                    throw new IllegalStateException("cannot compact");
                }
                if (z17.f420054e) {
                    int i15 = z15.f420052c - z15.f420051b;
                    if (i15 <= (8192 - z17.f420052c) + (z17.f420053d ? 0 : z17.f420051b)) {
                        z15.d(z17, i15);
                        z15.a();
                        a0.a(z15);
                    }
                }
            }
            c44802l.f420125c -= j13;
            this.f420125c += j13;
            j12 -= j13;
        }
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m writeByte(int i12) {
        D(i12);
        return this;
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m writeInt(int i12) {
        H(i12);
        return this;
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m writeLong(long j12) {
        I(j12);
        return this;
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m writeShort(int i12) {
        J(i12);
        return this;
    }

    public final int x() throws EOFException {
        int i12;
        int i13;
        int i14;
        if (this.f420125c == 0) {
            throw new EOFException();
        }
        byte bM2 = m(0L);
        if ((bM2 & 128) == 0) {
            i12 = bM2 & 127;
            i14 = 0;
            i13 = 1;
        } else if ((bM2 & 224) == 192) {
            i12 = bM2 & 31;
            i13 = 2;
            i14 = 128;
        } else if ((bM2 & 240) == 224) {
            i12 = bM2 & 15;
            i13 = 3;
            i14 = 2048;
        } else {
            if ((bM2 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i12 = bM2 & 7;
            i13 = 4;
            i14 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        long j12 = i13;
        if (this.f420125c < j12) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i13, "size < ", ": ");
            sbJ.append(this.f420125c);
            sbJ.append(" (to read code point prefixed 0x");
            sbJ.append(C44799i.d(bM2));
            sbJ.append(')');
            throw new EOFException(sbJ.toString());
        }
        for (int i15 = 1; i15 < i13; i15++) {
            long j13 = i15;
            byte bM3 = m(j13);
            if ((bM3 & 192) != 128) {
                skip(j13);
                return 65533;
            }
            i12 = (i12 << 6) | (bM3 & 63);
        }
        skip(j12);
        if (i12 > 1114111) {
            return 65533;
        }
        if ((55296 > i12 || i12 >= 57344) && i12 >= i14) {
            return i12;
        }
        return 65533;
    }

    @Override // okio.InterfaceC44804n
    public final void x5(long j12) throws EOFException {
        if (this.f420125c < j12) {
            throw new EOFException();
        }
    }

    @Y61.k
    public final C44805o y() {
        long j12 = this.f420125c;
        if (j12 <= 2147483647L) {
            return z((int) j12);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f420125c).toString());
    }

    @Y61.k
    public final C44805o z(int i12) {
        if (i12 == 0) {
            return C44805o.f420140f;
        }
        C44799i.b(this.f420125c, 0L, i12);
        Z z12 = this.f420124b;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            int i16 = z12.f420052c;
            int i17 = z12.f420051b;
            if (i16 == i17) {
                throw new AssertionError("s.limit == s.pos");
            }
            i14 += i16 - i17;
            i15++;
            z12 = z12.f420055f;
        }
        byte[][] bArr = new byte[i15][];
        int[] iArr = new int[i15 * 2];
        Z z13 = this.f420124b;
        int i18 = 0;
        while (i13 < i12) {
            bArr[i18] = z13.f420050a;
            i13 += z13.f420052c - z13.f420051b;
            iArr[i18] = Math.min(i13, i12);
            iArr[i18 + i15] = z13.f420051b;
            z13.f420053d = true;
            i18++;
            z13 = z13.f420055f;
        }
        return new b0(bArr, iArr);
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    public final String z1(long j12, @Y61.k Charset charset) {
        if (j12 < 0 || j12 > 2147483647L) {
            throw new IllegalArgumentException(C21030p.a(j12, "byteCount: ").toString());
        }
        if (this.f420125c < j12) {
            throw new EOFException();
        }
        if (j12 == 0) {
            return "";
        }
        Z z12 = this.f420124b;
        int i12 = z12.f420051b;
        if (i12 + j12 > z12.f420052c) {
            return new String(p5(j12), charset);
        }
        int i13 = (int) j12;
        String str = new String(z12.f420050a, i12, i13, charset);
        int i14 = z12.f420051b + i13;
        z12.f420051b = i14;
        this.f420125c -= j12;
        if (i14 == z12.f420052c) {
            this.f420124b = z12.a();
            a0.a(z12);
        }
        return str;
    }

    @Override // okio.InterfaceC44803m
    public final /* bridge */ /* synthetic */ InterfaceC44803m z4(long j12) {
        G(j12);
        return this;
    }

    /* compiled from: Buffer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/l$b", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.l$b */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C44802l.this.f420125c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public final int read() {
            C44802l c44802l = C44802l.this;
            if (c44802l.f420125c > 0) {
                return c44802l.readByte() & 255;
            }
            return -1;
        }

        @Y61.k
        public final String toString() {
            return C44802l.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@Y61.k byte[] bArr, int i12, int i13) {
            return C44802l.this.read(bArr, i12, i13);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@Y61.k ByteBuffer byteBuffer) {
        Z z12 = this.f420124b;
        if (z12 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), z12.f420052c - z12.f420051b);
        byteBuffer.put(z12.f420050a, z12.f420051b, iMin);
        int i12 = z12.f420051b + iMin;
        z12.f420051b = i12;
        this.f420125c -= iMin;
        if (i12 == z12.f420052c) {
            this.f420124b = z12.a();
            a0.a(z12);
        }
        return iMin;
    }

    @Override // okio.InterfaceC44803m
    public final InterfaceC44803m Q4() {
        return this;
    }

    @Override // okio.InterfaceC44803m
    public final InterfaceC44803m W1() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.c0
    public final void close() {
    }

    @Override // okio.InterfaceC44803m, okio.c0, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.InterfaceC44804n
    @Y61.k
    /* renamed from: v */
    public final C44802l getF420047c() {
        return this;
    }

    public final int read(@Y61.k byte[] bArr, int i12, int i13) {
        C44799i.b(bArr.length, i12, i13);
        Z z12 = this.f420124b;
        if (z12 == null) {
            return -1;
        }
        int iMin = Math.min(i13, z12.f420052c - z12.f420051b);
        int i14 = z12.f420051b;
        C42756l.l(z12.f420050a, i12, bArr, i14, i14 + iMin);
        int i15 = z12.f420051b + iMin;
        z12.f420051b = i15;
        this.f420125c -= iMin;
        if (i15 == z12.f420052c) {
            this.f420124b = z12.a();
            a0.a(z12);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@Y61.k ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i12 = iRemaining;
        while (i12 > 0) {
            Z zA2 = A(1);
            int iMin = Math.min(i12, 8192 - zA2.f420052c);
            byteBuffer.get(zA2.f420050a, zA2.f420052c, iMin);
            i12 -= iMin;
            zA2.f420052c += iMin;
        }
        this.f420125c += iRemaining;
        return iRemaining;
    }

    @Override // okio.InterfaceC44803m
    public final InterfaceC44803m write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    @Y61.k
    /* renamed from: write, reason: collision with other method in class */
    public final void m268write(@Y61.k byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Y61.k
    public final void write(@Y61.k byte[] bArr, int i12, int i13) {
        long j12 = i13;
        C44799i.b(bArr.length, i12, j12);
        int i14 = i13 + i12;
        while (i12 < i14) {
            Z zA2 = A(1);
            int iMin = Math.min(i14 - i12, 8192 - zA2.f420052c);
            int i15 = i12 + iMin;
            C42756l.l(bArr, zA2.f420052c, zA2.f420050a, i12, i15);
            zA2.f420052c += iMin;
            i12 = i15;
        }
        this.f420125c += j12;
    }
}
