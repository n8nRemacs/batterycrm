package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class gqc implements gp5 {
    public boolean X;
    public boolean Y;
    public long Z;
    public boolean o;
    public r16 s0;
    public kp5 t0;
    public boolean u0;
    public final z9g a = new z9g(0);
    public final umb c = new umb(4096);
    public final SparseArray b = new SparseArray();
    public final cqc d = new cqc(0);

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        z9g z9gVar = this.a;
        synchronized (z9gVar) {
            j3 = z9gVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = z9gVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            z9gVar.f(j2);
        }
        r16 r16Var = this.s0;
        if (r16Var != null) {
            r16Var.e(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            eqc eqcVar = (eqc) sparseArray.valueAt(i);
            eqcVar.f = false;
            eqcVar.a.a();
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        byte[] bArr = new byte[14];
        ip5Var.i(0, bArr, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            ip5Var.q(bArr[13] & 7);
            ip5Var.i(0, bArr, 3);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.t0 = kp5Var;
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        int i;
        int i2;
        long j;
        ba5 mz6Var;
        long j2;
        hsi.h(this.t0);
        long length = ip5Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        cqc cqcVar = this.d;
        if (i3 != 0 && !cqcVar.d) {
            z9g z9gVar = cqcVar.b;
            umb umbVar = cqcVar.c;
            if (!cqcVar.f) {
                long length2 = ip5Var.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j4 = length2 - iMin;
                if (ip5Var.getPosition() != j4) {
                    n7Var.a = j4;
                    return 1;
                }
                umbVar.G(iMin);
                ip5Var.y();
                ip5Var.i(0, umbVar.a, iMin);
                int i4 = umbVar.b;
                int i5 = umbVar.c - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (cqc.b(i5, umbVar.a) == 442) {
                        umbVar.J(i5 + 4);
                        long jC = cqc.c(umbVar);
                        if (jC != -9223372036854775807L) {
                            j3 = jC;
                            break;
                        }
                    }
                    i5--;
                }
                cqcVar.h = j3;
                cqcVar.f = true;
                return 0;
            }
            if (cqcVar.h == -9223372036854775807L) {
                cqcVar.a(ip5Var);
                return 0;
            }
            if (cqcVar.e) {
                long j5 = cqcVar.g;
                if (j5 == -9223372036854775807L) {
                    cqcVar.a(ip5Var);
                    return 0;
                }
                cqcVar.i = z9gVar.c(cqcVar.h) - z9gVar.b(j5);
                cqcVar.a(ip5Var);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, ip5Var.getLength());
            long j6 = 0;
            if (ip5Var.getPosition() != j6) {
                n7Var.a = j6;
                return 1;
            }
            umbVar.G(iMin2);
            ip5Var.y();
            ip5Var.i(0, umbVar.a, iMin2);
            int i6 = umbVar.b;
            int i7 = umbVar.c;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (cqc.b(i6, umbVar.a) == 442) {
                    umbVar.J(i6 + 4);
                    long jC2 = cqc.c(umbVar);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        break;
                    }
                }
                i6++;
            }
            cqcVar.g = j2;
            cqcVar.e = true;
            return 0;
        }
        if (this.u0) {
            i = i3;
            i2 = 4;
        } else {
            this.u0 = true;
            long j7 = cqcVar.i;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                r16 r16Var = new r16(new rha(14), new enb(cqcVar.b), j7, j7 + 1, 0L, length, 188L, 1000);
                this.s0 = r16Var;
                this.t0.Q((jn0) r16Var.c);
            } else {
                i = i3;
                i2 = 4;
                this.t0.Q(new ge0(j7));
            }
        }
        r16 r16Var2 = this.s0;
        if (r16Var2 != null && ((kn0) r16Var2.e) != null) {
            return r16Var2.b(ip5Var, n7Var);
        }
        ip5Var.y();
        long jO = i != 0 ? length - ip5Var.o() : -1L;
        if (jO != -1 && jO < 4) {
            return -1;
        }
        umb umbVar2 = this.c;
        if (!ip5Var.n(umbVar2.a, 0, i2, true)) {
            return -1;
        }
        umbVar2.J(0);
        int iJ = umbVar2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            ip5Var.i(0, umbVar2.a, 10);
            umbVar2.J(9);
            ip5Var.z((umbVar2.x() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            ip5Var.i(0, umbVar2.a, 2);
            umbVar2.J(0);
            ip5Var.z(umbVar2.D() + 6);
            return 0;
        }
        if (((iJ & (-256)) >> 8) != 1) {
            ip5Var.z(1);
            return 0;
        }
        int i8 = iJ & 255;
        SparseArray sparseArray = this.b;
        eqc eqcVar = (eqc) sparseArray.get(i8);
        if (!this.o) {
            if (eqcVar == null) {
                if (i8 == 189) {
                    mz6Var = new s4("video/mp2p");
                    this.X = true;
                    this.Z = ip5Var.getPosition();
                } else if ((iJ & 224) == 192) {
                    mz6Var = new f4a(null, 0, "video/mp2p");
                    this.X = true;
                    this.Z = ip5Var.getPosition();
                } else if ((iJ & 240) == 224) {
                    mz6Var = new mz6(null, "video/mp2p");
                    this.Y = true;
                    this.Z = ip5Var.getPosition();
                } else {
                    mz6Var = null;
                }
                if (mz6Var != null) {
                    mz6Var.i(this.t0, new mjg(i8, 256, 1, (byte) 0));
                    eqcVar = new eqc(mz6Var, this.a);
                    sparseArray.put(i8, eqcVar);
                }
            }
            if (ip5Var.getPosition() > ((this.X && this.Y) ? this.Z + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.o = true;
                this.t0.w();
            }
        }
        ip5Var.i(0, umbVar2.a, 2);
        umbVar2.J(0);
        int iD = umbVar2.D() + 6;
        if (eqcVar == null) {
            ip5Var.z(iD);
            return 0;
        }
        umbVar2.G(iD);
        ip5Var.readFully(umbVar2.a, 0, iD);
        umbVar2.J(6);
        ba5 ba5Var = eqcVar.a;
        u62 u62Var = eqcVar.c;
        umbVar2.h(0, u62Var.d, 3);
        u62Var.q(0);
        u62Var.t(8);
        eqcVar.d = u62Var.h();
        eqcVar.e = u62Var.h();
        u62Var.t(6);
        umbVar2.h(0, u62Var.d, u62Var.i(8));
        u62Var.q(0);
        z9g z9gVar2 = eqcVar.b;
        eqcVar.g = 0L;
        if (eqcVar.d) {
            u62Var.t(4);
            u62Var.t(1);
            u62Var.t(1);
            long jI = (u62Var.i(3) << 30) | (u62Var.i(15) << 15) | u62Var.i(15);
            u62Var.t(1);
            if (eqcVar.f || !eqcVar.e) {
                j = jI;
            } else {
                u62Var.t(4);
                u62Var.t(1);
                u62Var.t(1);
                u62Var.t(1);
                z9gVar2.b((u62Var.i(15) << 15) | (u62Var.i(3) << 30) | u62Var.i(15));
                eqcVar.f = true;
                j = jI;
            }
            eqcVar.g = z9gVar2.b(j);
        }
        ba5Var.e(4, eqcVar.g);
        ba5Var.f(umbVar2);
        ba5Var.h(false);
        umbVar2.I(umbVar2.a.length);
        return 0;
    }
}
