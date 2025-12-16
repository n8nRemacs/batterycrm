package defpackage;

/* loaded from: classes.dex */
public final class tz6 implements aa5, ba5 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final boolean c;
    public long d;
    public final boolean[] e;
    public String f;
    public boolean g;
    public long h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;
    public final Object p;

    public tz6(wib wibVar, boolean z, boolean z2) {
        this.a = 0;
        this.j = wibVar;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new wba(7, 0);
        this.l = new wba(8, 0);
        this.m = new wba(6, 0);
        this.h = -9223372036854775807L;
        this.p = new qyg(2, false);
    }

    @Override // defpackage.aa5
    public final void a() {
        switch (this.a) {
            case 0:
                this.d = 0L;
                this.i = false;
                this.h = -9223372036854775807L;
                gfi.d(this.e);
                ((wba) this.k).c();
                ((wba) this.l).c();
                ((wba) this.m).c();
                rz6 rz6Var = (rz6) this.o;
                if (rz6Var != null) {
                    rz6Var.k = false;
                    rz6Var.o = false;
                    qz6 qz6Var = rz6Var.n;
                    qz6Var.b = false;
                    qz6Var.a = false;
                    break;
                }
                break;
            default:
                this.d = 0L;
                this.i = false;
                this.h = -9223372036854775807L;
                hfi.b(this.e);
                ((wba) this.k).c();
                ((wba) this.l).c();
                ((wba) this.m).c();
                ((qae) this.j).d.q(0);
                sz6 sz6Var = (sz6) this.o;
                if (sz6Var != null) {
                    sz6Var.k = false;
                    sz6Var.o = false;
                    qz6 qz6Var2 = sz6Var.n;
                    qz6Var2.b = false;
                    qz6Var2.a = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r25, int r26, long r27, long r29) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz6.b(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz6.c(int, byte[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0269  */
    @Override // defpackage.aa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.qyg r24) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz6.d(qyg):void");
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.h = j;
                }
                this.i = ((i & 2) != 0) | this.i;
                break;
            default:
                this.h = j;
                this.i = ((i & 2) != 0) | this.i;
                break;
        }
    }

    @Override // defpackage.ba5
    public void f(umb umbVar) {
        int i;
        hsi.h((sfg) this.n);
        String str = zxg.a;
        int i2 = umbVar.b;
        int i3 = umbVar.c;
        byte[] bArr = umbVar.a;
        this.d += umbVar.a();
        ((sfg) this.n).b(umbVar, umbVar.a(), 0);
        while (true) {
            int iD = hfi.d(bArr, i2, i3, this.e);
            if (iD == i3) {
                c(i2, bArr, i3);
                return;
            }
            int i4 = bArr[iD + 3] & 31;
            if (iD <= 0 || bArr[iD - 1] != 0) {
                i = 3;
            } else {
                iD--;
                i = 4;
            }
            int i5 = iD;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                c(i2, bArr, i5);
            }
            int i8 = i3 - i5;
            long j = this.d - i8;
            b(i8, i7 < 0 ? -i7 : 0, j, this.h);
            k(i4, j, this.h);
            i2 = i5 + i6;
        }
    }

    @Override // defpackage.aa5
    public void g() {
    }

    @Override // defpackage.ba5
    public void h(boolean z) {
        hsi.h((sfg) this.n);
        String str = zxg.a;
        if (z) {
            ((qae) this.j).d.q(0);
            b(0, 0, this.d, this.h);
            k(9, this.d, this.h);
            b(0, 0, this.d, this.h);
        }
    }

    @Override // defpackage.ba5
    public void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.f = mjgVar.f;
        mjgVar.b();
        sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 2);
        this.n = sfgVarMo163B;
        this.o = new sz6(sfgVarMo163B, this.b, this.c);
        ((qae) this.j).b(kp5Var, mjgVar);
    }

    @Override // defpackage.aa5
    public void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.f = mjgVar.f;
        mjgVar.b();
        rfg rfgVarB = jp5Var.B(mjgVar.e, 2);
        this.n = rfgVarB;
        this.o = new rz6(rfgVarB, this.b, this.c);
        ((wib) this.j).v(jp5Var, mjgVar);
    }

    public void k(int i, long j, long j2) {
        if (!this.g || ((sz6) this.o).c) {
            ((wba) this.k).d(i);
            ((wba) this.l).d(i);
        }
        ((wba) this.m).d(i);
        sz6 sz6Var = (sz6) this.o;
        boolean z = this.i;
        sz6Var.i = i;
        sz6Var.l = j2;
        sz6Var.j = j;
        sz6Var.s = z;
        if (!sz6Var.b || i != 1) {
            if (!sz6Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        qz6 qz6Var = sz6Var.m;
        sz6Var.m = sz6Var.n;
        sz6Var.n = qz6Var;
        qz6Var.b = false;
        qz6Var.a = false;
        sz6Var.h = 0;
        sz6Var.k = true;
    }

    public tz6(qae qaeVar, boolean z, boolean z2) {
        this.a = 1;
        this.j = qaeVar;
        this.b = z;
        this.c = z2;
        this.e = new boolean[3];
        this.k = new wba(7, 1);
        this.l = new wba(8, 1);
        this.m = new wba(6, 1);
        this.h = -9223372036854775807L;
        this.p = new umb();
    }
}
