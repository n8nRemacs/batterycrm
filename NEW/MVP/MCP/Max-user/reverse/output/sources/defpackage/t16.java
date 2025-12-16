package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t16 implements gp5 {
    public sfg X;
    public ty9 Z;
    public kp5 o;
    public x16 s0;
    public int t0;
    public int u0;
    public r16 v0;
    public int w0;
    public long x0;
    public final byte[] a = new byte[42];
    public final umb b = new umb(0, new byte[32768]);
    public final boolean c = false;
    public final n7 d = new n7();
    public int Y = 0;

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.Y = 0;
        } else {
            r16 r16Var = this.v0;
            if (r16Var != null) {
                r16Var.e(j2);
            }
        }
        this.x0 = j2 != 0 ? -1L : 0L;
        this.w0 = 0;
        this.b.G(0);
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        j40.b(ip5Var, false);
        umb umbVar = new umb(4);
        ip5Var.i(0, umbVar.a, 4);
        return umbVar.z() == 1716281667;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.o = kp5Var;
        this.X = kp5Var.mo163B(0, 1);
        kp5Var.w();
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) throws ParserException {
        int i;
        x16 x16Var;
        int i2;
        i9e ge0Var;
        long j;
        long j2;
        boolean zA;
        int i3 = this.Y;
        boolean z = false;
        if (i3 == 0) {
            boolean z2 = !this.c;
            ip5Var.y();
            long jO = ip5Var.o();
            ty9 ty9VarB = j40.b(ip5Var, z2);
            ip5Var.z((int) (ip5Var.o() - jO));
            this.Z = ty9VarB;
            this.Y = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i3 == 1) {
            ip5Var.i(0, bArr, bArr.length);
            ip5Var.y();
            this.Y = 2;
            return 0;
        }
        int i4 = 4;
        int i5 = 3;
        if (i3 == 2) {
            umb umbVar = new umb(4);
            ip5Var.readFully(umbVar.a, 0, 4);
            if (umbVar.z() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.Y = 3;
            return 0;
        }
        int i6 = 6;
        if (i3 == 3) {
            byte b = 0;
            x16 x16Var2 = this.s0;
            while (!z) {
                ip5Var.y();
                byte[] bArr2 = new byte[i4];
                byte b2 = b;
                u62 u62Var = new u62(bArr2, i4, i5, b2);
                ip5Var.i(b2, bArr2, i4);
                boolean zH = u62Var.h();
                int i7 = u62Var.i(i);
                int i8 = u62Var.i(24) + i4;
                if (i7 == 0) {
                    byte[] bArr3 = new byte[38];
                    ip5Var.readFully(bArr3, b2, 38);
                    x16Var2 = new x16(bArr3, i4, i);
                    i = i;
                } else {
                    if (x16Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    ty9 ty9Var = (ty9) x16Var2.m;
                    if (i7 == i5) {
                        umb umbVar2 = new umb(i8);
                        ip5Var.readFully(umbVar2.a, b2, i8);
                        i = i;
                        x16Var2 = new x16(x16Var2.b, x16Var2.c, x16Var2.d, x16Var2.e, x16Var2.f, x16Var2.h, x16Var2.i, x16Var2.k, j40.c(umbVar2), (ty9) x16Var2.m);
                    } else {
                        i = i;
                        if (i7 == i4) {
                            umb umbVar3 = new umb(i8);
                            ip5Var.readFully(umbVar3.a, 0, i8);
                            umbVar3.K(i4);
                            ty9 ty9VarE = gri.e(Arrays.asList((String[]) gri.f(umbVar3, false, false).a));
                            if (ty9Var != null) {
                                ty9VarE = ty9Var.b(ty9VarE);
                            }
                            x16Var = new x16(x16Var2.b, x16Var2.c, x16Var2.d, x16Var2.e, x16Var2.f, x16Var2.h, x16Var2.i, x16Var2.k, (s7c) x16Var2.l, ty9VarE);
                        } else if (i7 == i6) {
                            umb umbVar4 = new umb(i8);
                            ip5Var.readFully(umbVar4.a, 0, i8);
                            umbVar4.K(4);
                            ty9 ty9Var2 = new ty9(wg7.m(lzb.b(umbVar4)));
                            if (ty9Var != null) {
                                ty9Var2 = ty9Var.b(ty9Var2);
                            }
                            x16Var = new x16(x16Var2.b, x16Var2.c, x16Var2.d, x16Var2.e, x16Var2.f, x16Var2.h, x16Var2.i, x16Var2.k, (s7c) x16Var2.l, ty9Var2);
                        } else {
                            ip5Var.z(i8);
                        }
                        x16Var2 = x16Var;
                    }
                }
                String str = zxg.a;
                this.s0 = x16Var2;
                z = zH;
                i = i;
                i4 = 4;
                i5 = 3;
                i = 7;
                i6 = 6;
                b = 0;
            }
            this.s0.getClass();
            this.t0 = Math.max(this.s0.d, 6);
            hf6 hf6VarE = this.s0.e(bArr, this.Z);
            sfg sfgVar = this.X;
            ff6 ff6VarA = hf6VarE.a();
            ff6VarA.l = xz9.n("audio/flac");
            a9h.m(ff6VarA, sfgVar);
            sfg sfgVar2 = this.X;
            this.s0.c();
            sfgVar2.getClass();
            this.Y = 4;
            return 0;
        }
        long j3 = 0;
        if (i3 == 4) {
            ip5Var.y();
            umb umbVar5 = new umb(2);
            ip5Var.i(0, umbVar5.a, 2);
            int iD = umbVar5.D();
            if ((iD >> 2) != 16382) {
                ip5Var.y();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            ip5Var.y();
            this.u0 = iD;
            kp5 kp5Var = this.o;
            String str2 = zxg.a;
            long position = ip5Var.getPosition();
            long length = ip5Var.getLength();
            this.s0.getClass();
            x16 x16Var3 = this.s0;
            s7c s7cVar = (s7c) x16Var3.l;
            if (s7cVar != null && ((long[]) s7cVar.a).length > 0) {
                ge0Var = new ge0(x16Var3, position, 1);
                i2 = 0;
            } else if (length == -1 || x16Var3.k <= 0) {
                i2 = 0;
                ge0Var = new ge0(x16Var3.c());
            } else {
                int i9 = this.u0;
                int i10 = x16Var3.d;
                wo4 wo4Var = new wo4(25, x16Var3);
                p16 p16Var = new p16(x16Var3, i9);
                long jC = x16Var3.c();
                long j4 = x16Var3.k;
                int i11 = x16Var3.e;
                if (i11 > 0) {
                    i2 = 0;
                    j = ((i11 + i10) / 2) + 1;
                } else {
                    i2 = 0;
                    int i12 = x16Var3.b;
                    j = 64 + (((((i12 != x16Var3.c || i12 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i12) * x16Var3.h) * x16Var3.i) / 8);
                }
                r16 r16Var = new r16(wo4Var, p16Var, jC, j4, position, length, j, Math.max(6, i10));
                this.v0 = r16Var;
                ge0Var = (jn0) r16Var.c;
            }
            kp5Var.Q(ge0Var);
            this.Y = 5;
            return i2;
        }
        if (i3 != 5) {
            throw new IllegalStateException();
        }
        this.X.getClass();
        this.s0.getClass();
        r16 r16Var2 = this.v0;
        if (r16Var2 != null && ((kn0) r16Var2.e) != null) {
            return r16Var2.b(ip5Var, n7Var);
        }
        if (this.x0 == -1) {
            x16 x16Var4 = this.s0;
            ip5Var.y();
            ip5Var.q(1);
            byte[] bArr4 = new byte[1];
            ip5Var.i(0, bArr4, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            ip5Var.q(2);
            i = z3 ? 7 : 6;
            umb umbVar6 = new umb(i);
            byte[] bArr5 = umbVar6.a;
            int i13 = 0;
            while (i13 < i) {
                int iT = ip5Var.t(i13, bArr5, i - i13);
                if (iT == -1) {
                    break;
                }
                i13 += iT;
            }
            umbVar6.I(i13);
            ip5Var.y();
            try {
                long jE = umbVar6.E();
                if (!z3) {
                    jE *= x16Var4.c;
                }
                j3 = jE;
            } catch (NumberFormatException unused) {
                i = 0;
            }
            if (i == 0) {
                throw ParserException.a(null, null);
            }
            this.x0 = j3;
        } else {
            umb umbVar7 = this.b;
            int i14 = umbVar7.c;
            if (i14 < 32768) {
                int i15 = ip5Var.read(umbVar7.a, i14, 32768 - i14);
                i = i15 != -1 ? 0 : 1;
                if (i == 0) {
                    umbVar7.I(i14 + i15);
                } else if (umbVar7.a() == 0) {
                    long j5 = this.x0 * 1000000;
                    x16 x16Var5 = this.s0;
                    String str3 = zxg.a;
                    this.X.a(j5 / x16Var5.f, 1, this.w0, 0, null);
                    return -1;
                }
            } else {
                i = 0;
            }
            int i16 = umbVar7.b;
            int i17 = this.w0;
            int i18 = this.t0;
            if (i17 < i18) {
                umbVar7.K(Math.min(i18 - i17, umbVar7.a()));
            }
            this.s0.getClass();
            int i19 = umbVar7.b;
            while (true) {
                int i20 = umbVar7.c - 16;
                n7 n7Var2 = this.d;
                if (i19 <= i20) {
                    umbVar7.J(i19);
                    if (z7.a(umbVar7, this.s0, this.u0, n7Var2)) {
                        umbVar7.J(i19);
                        j2 = n7Var2.a;
                        break;
                    }
                    i19++;
                } else {
                    if (i != 0) {
                        while (true) {
                            int i21 = umbVar7.c;
                            if (i19 > i21 - this.t0) {
                                umbVar7.J(i21);
                                break;
                            }
                            umbVar7.J(i19);
                            try {
                                zA = z7.a(umbVar7, this.s0, this.u0, n7Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (umbVar7.b > umbVar7.c) {
                                zA = false;
                            }
                            if (zA) {
                                umbVar7.J(i19);
                                j2 = n7Var2.a;
                                break;
                            }
                            i19++;
                        }
                    } else {
                        umbVar7.J(i19);
                    }
                    j2 = -1;
                }
            }
            int i22 = umbVar7.b - i16;
            umbVar7.J(i16);
            this.X.b(umbVar7, i22, 0);
            int i23 = this.w0 + i22;
            this.w0 = i23;
            if (j2 != -1) {
                long j6 = this.x0 * 1000000;
                x16 x16Var6 = this.s0;
                String str4 = zxg.a;
                this.X.a(j6 / x16Var6.f, 1, i23, 0, null);
                this.w0 = 0;
                this.x0 = j2;
            }
            int length2 = umbVar7.a.length - umbVar7.c;
            if (umbVar7.a() < 16 && length2 < 16) {
                int iA = umbVar7.a();
                byte[] bArr6 = umbVar7.a;
                System.arraycopy(bArr6, umbVar7.b, bArr6, 0, iA);
                umbVar7.J(0);
                umbVar7.I(iA);
            }
        }
        return 0;
    }
}
