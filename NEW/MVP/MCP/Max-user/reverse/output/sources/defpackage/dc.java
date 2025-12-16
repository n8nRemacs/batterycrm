package defpackage;

/* loaded from: classes.dex */
public final class dc implements gp5 {
    public kp5 X;
    public long Y;
    public final int a;
    public final umb d;
    public final u62 o;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final fc b = new fc(null, 0, "audio/mp4a-latm", true);
    public final umb c = new umb(2048);
    public int s0 = -1;
    public long Z = -1;

    public dc(int i) {
        this.a = i;
        umb umbVar = new umb(10);
        this.d = umbVar;
        byte[] bArr = umbVar.a;
        this.o = new u62(bArr, bArr.length, 3, (byte) 0);
    }

    public final int a(ip5 ip5Var) {
        int i = 0;
        while (true) {
            umb umbVar = this.d;
            ip5Var.i(0, umbVar.a, 10);
            umbVar.J(0);
            if (umbVar.A() != 4801587) {
                break;
            }
            umbVar.K(3);
            int iW = umbVar.w();
            i += iW + 10;
            ip5Var.q(iW);
        }
        ip5Var.y();
        ip5Var.q(i);
        if (this.Z == -1) {
            this.Z = i;
        }
        return i;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.u0 = false;
        this.b.a();
        this.Y = j2;
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        int iA = a(ip5Var);
        int i = iA;
        int i2 = 0;
        int i3 = 0;
        do {
            umb umbVar = this.d;
            ip5Var.i(0, umbVar.a, 2);
            umbVar.J(0);
            if ((umbVar.D() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ip5Var.i(0, umbVar.a, 4);
                u62 u62Var = this.o;
                u62Var.q(14);
                int i4 = u62Var.i(13);
                if (i4 <= 6) {
                    i++;
                    ip5Var.y();
                    ip5Var.q(i);
                } else {
                    ip5Var.q(i4 - 6);
                    i3 += i4;
                }
            } else {
                i++;
                ip5Var.y();
                ip5Var.q(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iA < 8192);
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.X = kp5Var;
        this.b.i(kp5Var, new mjg(0, 1, 1, (byte) 0));
        kp5Var.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r20, defpackage.n7 r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.y(ip5, n7):int");
    }
}
