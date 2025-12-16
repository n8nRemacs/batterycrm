package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ir8 implements fp5 {
    public static final byte[] b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final UUID f0;
    public static final Map g0;
    public long A;
    public long B;
    public r55 C;
    public r55 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final wl4 a;
    public jp5 a0;
    public final qyg b;
    public final SparseArray c;
    public final boolean d;
    public final qyg e;
    public final qyg f;
    public final qyg g;
    public final qyg h;
    public final qyg i;
    public final qyg j;
    public final qyg k;
    public final qyg l;
    public final qyg m;
    public final qyg n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public gr8 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = xxg.a;
        c0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(mb2.c);
        d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        e0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        hf3.d(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        hf3.d(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap(map);
    }

    public ir8(int i) {
        wl4 wl4Var = new wl4(0);
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = wl4Var;
        wl4Var.g = new iv6(23, this);
        this.d = (i & 1) == 0;
        this.b = new qyg(0, false);
        this.c = new SparseArray();
        this.g = new qyg(4);
        this.h = new qyg(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new qyg(4);
        this.e = new qyg(gfi.a);
        this.f = new qyg(4);
        this.j = new qyg(2, false);
        this.k = new qyg(2, false);
        this.l = new qyg(8);
        this.m = new qyg(2, false);
        this.n = new qyg(2, false);
        this.L = new int[1];
    }

    public static byte[] e(long j, long j2, String str) {
        fsi.b(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = xxg.a;
        return str2.getBytes(mb2.c);
    }

    public final void a(int i) {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw ParserException.a(null, sb.toString());
        }
    }

    public final void b(int i) {
        if (this.u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw ParserException.a(null, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[PHI: r2
  0x00ec: PHI (r2v24 int) = (r2v23 int), (r2v25 int) binds: [B:49:0x00d4, B:53:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gr8 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.c(gr8, long, int, int, int):void");
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        wl4 wl4Var = this.a;
        wl4Var.c = 0;
        wl4Var.b.clear();
        qyg qygVar = (qyg) wl4Var.f;
        qygVar.b = 0;
        qygVar.c = 0;
        qyg qygVar2 = this.b;
        qygVar2.b = 0;
        qygVar2.c = 0;
        j();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            djg djgVar = ((gr8) sparseArray.valueAt(i)).T;
            if (djgVar != null) {
                djgVar.b = false;
                djgVar.c = 0;
            }
            i++;
        }
    }

    public final void f(hp5 hp5Var, int i) {
        qyg qygVar = this.g;
        if (qygVar.c >= i) {
            return;
        }
        byte[] bArr = qygVar.a;
        if (bArr.length < i) {
            qygVar.d(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = qygVar.a;
        int i2 = qygVar.c;
        hp5Var.readFully(bArr2, i2, i - i2);
        qygVar.D(i);
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.a0 = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        bj bjVar = new bj(17);
        qyg qygVar = (qyg) bjVar.c;
        mm4 mm4Var = (mm4) hp5Var;
        long j = mm4Var.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        mm4Var.n(qygVar.a, 0, 4, false);
        long jT = qygVar.t();
        bjVar.b = 4;
        while (true) {
            if (jT != 440786851) {
                int i2 = bjVar.b + 1;
                bjVar.b = i2;
                if (i2 == i) {
                    break;
                }
                mm4Var.n(qygVar.a, 0, 1, false);
                jT = ((jT << 8) & (-256)) | (qygVar.a[0] & 255);
            } else {
                long jK = bjVar.k(mm4Var);
                long j3 = bjVar.b;
                if (jK != Long.MIN_VALUE && (j == -1 || j3 + jK < j)) {
                    while (true) {
                        long j4 = bjVar.b;
                        long j5 = j3 + jK;
                        if (j4 < j5) {
                            if (bjVar.k(mm4Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jK2 = bjVar.k(mm4Var);
                            if (jK2 < 0 || jK2 > 2147483647L) {
                                break;
                            }
                            if (jK2 != 0) {
                                int i3 = (int) jK2;
                                mm4Var.b(i3, false);
                                bjVar.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0ba6, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0f52, code lost:
    
        if (r5 == false) goto L830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0f54, code lost:
    
        r1 = ((defpackage.mm4) r0).d;
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0f5d, code lost:
    
        if (r3.y == false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0f5f, code lost:
    
        r3.A = r1;
        r39.a = r3.z;
        r3.y = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0f6b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0f6c, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0f72, code lost:
    
        if (r3.v == false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0f74, code lost:
    
        r6 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0f7a, code lost:
    
        if (r6 == (-1)) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0f7c, code lost:
    
        r39.a = r6;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0f80, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0f81, code lost:
    
        r36 = true;
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x0f87, code lost:
    
        r0 = r3;
        r4 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0f87, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r3v41, types: [gr8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r5v34, types: [mm4] */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r38, defpackage.n7 r39) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 4856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.i(hp5, n7):int");
    }

    public final void j() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.B(0);
    }

    public final long k(long j) throws ParserException {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return xxg.H(j, j2, 1000L);
        }
        throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int l(hp5 hp5Var, gr8 gr8Var, int i) throws ParserException {
        int iA;
        int iA2;
        int i2;
        if ("S_TEXT/UTF8".equals(gr8Var.b)) {
            m(hp5Var, b0, i);
            int i3 = this.S;
            j();
            return i3;
        }
        if ("S_TEXT/ASS".equals(gr8Var.b)) {
            m(hp5Var, d0, i);
            int i4 = this.S;
            j();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(gr8Var.b)) {
            m(hp5Var, e0, i);
            int i5 = this.S;
            j();
            return i5;
        }
        rfg rfgVar = gr8Var.X;
        boolean z = this.U;
        qyg qygVar = this.j;
        if (!z) {
            boolean z2 = gr8Var.h;
            qyg qygVar2 = this.g;
            if (z2) {
                this.O &= -1073741825;
                if (!this.V) {
                    hp5Var.readFully(qygVar2.a, 0, 1);
                    this.R++;
                    byte b = qygVar2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.Y = b;
                    this.V = true;
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z3 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        qyg qygVar3 = this.l;
                        hp5Var.readFully(qygVar3.a, 0, 8);
                        this.R += 8;
                        this.Z = true;
                        qygVar2.a[0] = (byte) ((z3 ? 128 : 0) | 8);
                        qygVar2.E(0);
                        rfgVar.c(1, qygVar2);
                        this.S++;
                        qygVar3.E(0);
                        rfgVar.c(8, qygVar3);
                        this.S += 8;
                    }
                    if (z3) {
                        if (!this.W) {
                            hp5Var.readFully(qygVar2.a, 0, 1);
                            this.R++;
                            qygVar2.E(0);
                            this.X = qygVar2.s();
                            this.W = true;
                        }
                        int i6 = this.X * 4;
                        qygVar2.B(i6);
                        hp5Var.readFully(qygVar2.a, 0, i6);
                        this.R += i6;
                        short s = (short) ((this.X / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.X;
                            if (i8 >= i2) {
                                break;
                            }
                            int iV = qygVar2.v();
                            if (i8 % 2 == 0) {
                                this.o.putShort((short) (iV - i9));
                            } else {
                                this.o.putInt(iV - i9);
                            }
                            i8++;
                            i9 = iV;
                        }
                        int i10 = (i - this.R) - i9;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i10);
                        } else {
                            this.o.putShort((short) i10);
                            this.o.putInt(0);
                        }
                        byte[] bArrArray = this.o.array();
                        qyg qygVar4 = this.m;
                        qygVar4.C(i7, bArrArray);
                        rfgVar.c(i7, qygVar4);
                        this.S += i7;
                    }
                }
            } else {
                byte[] bArr = gr8Var.i;
                if (bArr != null) {
                    qygVar.C(bArr.length, bArr);
                }
            }
            if (gr8Var.f > 0) {
                this.O |= 268435456;
                this.n.B(0);
                qygVar2.B(4);
                byte[] bArr2 = qygVar2.a;
                bArr2[0] = (byte) ((i >> 24) & 255);
                bArr2[1] = (byte) ((i >> 16) & 255);
                bArr2[2] = (byte) ((i >> 8) & 255);
                bArr2[3] = (byte) (i & 255);
                rfgVar.c(4, qygVar2);
                this.S += 4;
            }
            this.U = true;
        }
        int i11 = i + qygVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(gr8Var.b) && !"V_MPEGH/ISO/HEVC".equals(gr8Var.b)) {
            if (gr8Var.T != null) {
                fsi.d(qygVar.c == 0);
                gr8Var.T.e(hp5Var);
            }
            while (true) {
                int i12 = this.R;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i11 - i12;
                int iC = qygVar.c();
                if (iC > 0) {
                    iA2 = Math.min(i13, iC);
                    rfgVar.c(iA2, qygVar);
                } else {
                    iA2 = rfgVar.a(hp5Var, i13, false);
                }
                this.R += iA2;
                this.S += iA2;
            }
        } else {
            qyg qygVar5 = this.f;
            byte[] bArr3 = qygVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = gr8Var.Y;
            int i15 = 4 - i14;
            while (this.R < i11) {
                int i16 = this.T;
                if (i16 == 0) {
                    int iMin = Math.min(i14, qygVar.c());
                    hp5Var.readFully(bArr3, i15 + iMin, i14 - iMin);
                    if (iMin > 0) {
                        qygVar.e(i15, bArr3, iMin);
                    }
                    this.R += i14;
                    qygVar5.E(0);
                    this.T = qygVar5.v();
                    qyg qygVar6 = this.e;
                    qygVar6.E(0);
                    rfgVar.c(4, qygVar6);
                    this.S += 4;
                } else {
                    int iC2 = qygVar.c();
                    if (iC2 > 0) {
                        iA = Math.min(i16, iC2);
                        rfgVar.c(iA, qygVar);
                    } else {
                        iA = rfgVar.a(hp5Var, i16, false);
                    }
                    this.R += iA;
                    this.S += iA;
                    this.T -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(gr8Var.b)) {
            qyg qygVar7 = this.h;
            qygVar7.E(0);
            rfgVar.c(4, qygVar7);
            this.S += 4;
        }
        int i17 = this.S;
        j();
        return i17;
    }

    public final void m(hp5 hp5Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        qyg qygVar = this.k;
        byte[] bArr2 = qygVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            qygVar.getClass();
            qygVar.C(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        hp5Var.readFully(qygVar.a, bArr.length, i);
        qygVar.E(0);
        qygVar.D(length);
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
