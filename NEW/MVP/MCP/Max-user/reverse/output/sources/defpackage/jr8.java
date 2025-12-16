package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jr8 implements gp5 {
    public static final byte[] p1 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] q1;
    public static final byte[] r1;
    public static final byte[] s1;
    public static final UUID t1;
    public static final Map u1;
    public ByteBuffer A0;
    public long B0;
    public long C0;
    public long D0;
    public long E0;
    public long F0;
    public boolean G0;
    public hr8 H0;
    public boolean I0;
    public int J0;
    public long K0;
    public boolean L0;
    public long M0;
    public long N0;
    public long O0;
    public r55 P0;
    public r55 Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public long U0;
    public long V0;
    public int W0;
    public final rof X;
    public int X0;
    public final umb Y;
    public int[] Y0;
    public final umb Z;
    public int Z0;
    public final wl4 a;
    public int a1;
    public final qyg b;
    public int b1;
    public final SparseArray c;
    public int c1;
    public final boolean d;
    public boolean d1;
    public long e1;
    public int f1;
    public int g1;
    public int h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public int l1;
    public byte m1;
    public boolean n1;
    public final boolean o;
    public kp5 o1;
    public final umb s0;
    public final umb t0;
    public final umb u0;
    public final umb v0;
    public final umb w0;
    public final umb x0;
    public final umb y0;
    public final umb z0;

    static {
        String str = zxg.a;
        q1 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        r1 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        s1 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        t1 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        hf3.d(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        hf3.d(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        u1 = Collections.unmodifiableMap(map);
    }

    public jr8(rof rofVar, int i) {
        wl4 wl4Var = new wl4(1);
        this.C0 = -1L;
        this.D0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.M0 = -1L;
        this.N0 = -1L;
        this.O0 = -9223372036854775807L;
        this.a = wl4Var;
        wl4Var.g = new ao6(21, this);
        this.X = rofVar;
        this.d = (i & 1) == 0;
        this.o = (i & 2) == 0;
        this.b = new qyg(1, false);
        this.c = new SparseArray();
        this.s0 = new umb(4);
        this.t0 = new umb(ByteBuffer.allocate(4).putInt(-1).array());
        this.u0 = new umb(4);
        this.Y = new umb(hfi.a);
        this.Z = new umb(4);
        this.v0 = new umb();
        this.w0 = new umb();
        this.x0 = new umb(8);
        this.y0 = new umb();
        this.z0 = new umb();
        this.Y0 = new int[1];
    }

    public static byte[] e(long j, long j2, String str) {
        hsi.b(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str3 = zxg.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void a(int i) {
        if (this.P0 == null || this.Q0 == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    public final void b(int i) {
        if (this.H0 != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.hr8 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr8.c(hr8, long, int, int, int):void");
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.O0 = -9223372036854775807L;
        this.T0 = 0;
        wl4 wl4Var = this.a;
        wl4Var.c = 0;
        wl4Var.b.clear();
        qyg qygVar = (qyg) wl4Var.f;
        qygVar.b = 0;
        qygVar.c = 0;
        qyg qygVar2 = this.b;
        qygVar2.b = 0;
        qygVar2.c = 0;
        g();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            djg djgVar = ((hr8) sparseArray.valueAt(i)).V;
            if (djgVar != null) {
                djgVar.b = false;
                djgVar.c = 0;
            }
            i++;
        }
    }

    public final void f(ip5 ip5Var, int i) {
        umb umbVar = this.s0;
        if (umbVar.c >= i) {
            return;
        }
        byte[] bArr = umbVar.a;
        if (bArr.length < i) {
            umbVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = umbVar.a;
        int i2 = umbVar.c;
        ip5Var.readFully(bArr2, i2, i - i2);
        umbVar.I(i);
    }

    public final void g() {
        this.f1 = 0;
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = 0;
        this.m1 = (byte) 0;
        this.n1 = false;
        this.v0.G(0);
    }

    public final long h(long j) throws ParserException {
        long j2 = this.D0;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = zxg.a;
        return zxg.e0(j, j2, 1000L, RoundingMode.DOWN);
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        bj bjVar = new bj(18);
        umb umbVar = (umb) bjVar.c;
        long length = ip5Var.getLength();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = length;
        }
        int i = (int) j;
        ip5Var.i(0, umbVar.a, 4);
        long jZ = umbVar.z();
        bjVar.b = 4;
        while (true) {
            if (jZ != 440786851) {
                int i2 = bjVar.b + 1;
                bjVar.b = i2;
                if (i2 == i) {
                    break;
                }
                ip5Var.i(0, umbVar.a, 1);
                jZ = ((jZ << 8) & (-256)) | (umbVar.a[0] & 255);
            } else {
                long jM = bjVar.m(ip5Var);
                long j2 = bjVar.b;
                if (jM != Long.MIN_VALUE && (length == -1 || j2 + jM < length)) {
                    while (true) {
                        long j3 = bjVar.b;
                        long j4 = j2 + jM;
                        if (j3 < j4) {
                            if (bjVar.m(ip5Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jM2 = bjVar.m(ip5Var);
                            if (jM2 < 0 || jM2 > 2147483647L) {
                                break;
                            }
                            if (jM2 != 0) {
                                int i3 = (int) jM2;
                                ip5Var.q(i3);
                                bjVar.b += i3;
                            }
                        } else if (j3 == j4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int j(ip5 ip5Var, hr8 hr8Var, int i, boolean z) throws ParserException {
        int iC;
        int iC2;
        int i2;
        if ("S_TEXT/UTF8".equals(hr8Var.c)) {
            k(ip5Var, p1, i);
            int i3 = this.g1;
            g();
            return i3;
        }
        if ("S_TEXT/ASS".equals(hr8Var.c) || "S_TEXT/SSA".equals(hr8Var.c)) {
            k(ip5Var, r1, i);
            int i4 = this.g1;
            g();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(hr8Var.c)) {
            k(ip5Var, s1, i);
            int i5 = this.g1;
            g();
            return i5;
        }
        sfg sfgVar = hr8Var.Z;
        boolean z2 = this.i1;
        umb umbVar = this.v0;
        if (!z2) {
            boolean z3 = hr8Var.i;
            umb umbVar2 = this.s0;
            if (z3) {
                this.b1 &= -1073741825;
                if (!this.j1) {
                    ip5Var.readFully(umbVar2.a, 0, 1);
                    this.f1++;
                    byte b = umbVar2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.m1 = b;
                    this.j1 = true;
                }
                byte b2 = this.m1;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.b1 |= 1073741824;
                    if (!this.n1) {
                        umb umbVar3 = this.x0;
                        ip5Var.readFully(umbVar3.a, 0, 8);
                        this.f1 += 8;
                        this.n1 = true;
                        umbVar2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        umbVar2.J(0);
                        sfgVar.b(umbVar2, 1, 1);
                        this.g1++;
                        umbVar3.J(0);
                        sfgVar.b(umbVar3, 8, 1);
                        this.g1 += 8;
                    }
                    if (z4) {
                        if (!this.k1) {
                            ip5Var.readFully(umbVar2.a, 0, 1);
                            this.f1++;
                            umbVar2.J(0);
                            this.l1 = umbVar2.x();
                            this.k1 = true;
                        }
                        int i6 = this.l1 * 4;
                        umbVar2.G(i6);
                        ip5Var.readFully(umbVar2.a, 0, i6);
                        this.f1 += i6;
                        short s = (short) ((this.l1 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.A0;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.A0 = ByteBuffer.allocate(i7);
                        }
                        this.A0.position(0);
                        this.A0.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.l1;
                            if (i8 >= i2) {
                                break;
                            }
                            int iB = umbVar2.B();
                            if (i8 % 2 == 0) {
                                this.A0.putShort((short) (iB - i9));
                            } else {
                                this.A0.putInt(iB - i9);
                            }
                            i8++;
                            i9 = iB;
                        }
                        int i10 = (i - this.f1) - i9;
                        if (i2 % 2 == 1) {
                            this.A0.putInt(i10);
                        } else {
                            this.A0.putShort((short) i10);
                            this.A0.putInt(0);
                        }
                        byte[] bArrArray = this.A0.array();
                        umb umbVar4 = this.y0;
                        umbVar4.H(i7, bArrArray);
                        sfgVar.b(umbVar4, i7, 1);
                        this.g1 += i7;
                    }
                }
            } else {
                byte[] bArr = hr8Var.j;
                if (bArr != null) {
                    umbVar.H(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(hr8Var.c) ? z : hr8Var.g > 0) {
                this.b1 |= 268435456;
                this.z0.G(0);
                int i11 = (umbVar.c + i) - this.f1;
                umbVar2.G(4);
                byte[] bArr2 = umbVar2.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                sfgVar.b(umbVar2, 4, 2);
                this.g1 += 4;
            }
            this.i1 = true;
        }
        int i12 = i + umbVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(hr8Var.c) && !"V_MPEGH/ISO/HEVC".equals(hr8Var.c)) {
            if (hr8Var.V != null) {
                hsi.g(umbVar.c == 0);
                hr8Var.V.f(ip5Var);
            }
            while (true) {
                int i13 = this.f1;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = umbVar.a();
                if (iA > 0) {
                    iC2 = Math.min(i14, iA);
                    sfgVar.b(umbVar, iC2, 0);
                } else {
                    iC2 = sfgVar.c(ip5Var, i14, false);
                }
                this.f1 += iC2;
                this.g1 += iC2;
            }
        } else {
            umb umbVar5 = this.Z;
            byte[] bArr3 = umbVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = hr8Var.a0;
            int i16 = 4 - i15;
            while (this.f1 < i12) {
                int i17 = this.h1;
                if (i17 == 0) {
                    int iMin = Math.min(i15, umbVar.a());
                    ip5Var.readFully(bArr3, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        umbVar.h(i16, bArr3, iMin);
                    }
                    this.f1 += i15;
                    umbVar5.J(0);
                    this.h1 = umbVar5.B();
                    umb umbVar6 = this.Y;
                    umbVar6.J(0);
                    sfgVar.b(umbVar6, 4, 0);
                    this.g1 += 4;
                } else {
                    int iA2 = umbVar.a();
                    if (iA2 > 0) {
                        iC = Math.min(i17, iA2);
                        sfgVar.b(umbVar, iC, 0);
                    } else {
                        iC = sfgVar.c(ip5Var, i17, false);
                    }
                    this.f1 += iC;
                    this.g1 += iC;
                    this.h1 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(hr8Var.c)) {
            umb umbVar7 = this.t0;
            umbVar7.J(0);
            sfgVar.b(umbVar7, 4, 0);
            this.g1 += 4;
        }
        int i18 = this.g1;
        g();
        return i18;
    }

    public final void k(ip5 ip5Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        umb umbVar = this.w0;
        byte[] bArr2 = umbVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            umbVar.getClass();
            umbVar.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ip5Var.readFully(umbVar.a, bArr.length, i);
        umbVar.J(0);
        umbVar.I(length);
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        if (this.o) {
            kp5Var = new dl6(kp5Var, this.X);
        }
        this.o1 = kp5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0bd8, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0bd9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0f6a, code lost:
    
        if (r5 == false) goto L857;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0f6c, code lost:
    
        r1 = r0.getPosition();
        r3 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0f74, code lost:
    
        if (r3.L0 == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0f76, code lost:
    
        r3.N0 = r1;
        r43.a = r3.M0;
        r3.L0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0f82, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0f89, code lost:
    
        if (r3.I0 == false) goto L909;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0f8b, code lost:
    
        r6 = r3.N0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0f91, code lost:
    
        if (r6 == (-1)) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0f93, code lost:
    
        r43.a = r6;
        r3.N0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f97, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0f98, code lost:
    
        r3 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0fb6, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0fb7, code lost:
    
        if (r5 != false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0fb9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0fba, code lost:
    
        r1 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0fc0, code lost:
    
        if (r0 >= r1.size()) goto L936;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0fc2, code lost:
    
        r1 = (defpackage.hr8) r1.valueAt(r0);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0fcf, code lost:
    
        if (r2 == null) goto L938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0fd1, code lost:
    
        r2.b(r1.Z, r1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x0fd8, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0fdb, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0fde, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0f9e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v75 */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r42, defpackage.n7 r43) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 4894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr8.y(ip5, n7):int");
    }
}
