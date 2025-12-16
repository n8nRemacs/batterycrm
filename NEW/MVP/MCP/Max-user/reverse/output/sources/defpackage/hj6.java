package defpackage;

/* loaded from: classes.dex */
public final class hj6 {
    public final rfg a;
    public tfg d;
    public cp4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final jfg b = new jfg(0);
    public final qyg c = new qyg(2, false);
    public final qyg j = new qyg(1);
    public final qyg k = new qyg(2, false);

    public hj6(rfg rfgVar, tfg tfgVar, cp4 cp4Var) {
        this.a = rfgVar;
        this.d = tfgVar;
        this.e = cp4Var;
        this.d = tfgVar;
        this.e = cp4Var;
        rfgVar.d(tfgVar.a.f);
        d();
    }

    public final hfg a() {
        if (!this.l) {
            return null;
        }
        jfg jfgVar = this.b;
        cp4 cp4Var = (cp4) jfgVar.o;
        int i = xxg.a;
        int i2 = cp4Var.a;
        hfg hfgVar = (hfg) jfgVar.p;
        if (hfgVar == null) {
            hfgVar = this.d.a.k[i2];
        }
        if (hfgVar == null || !hfgVar.a) {
            return null;
        }
        return hfgVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.f;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        qyg qygVar;
        hfg hfgVarA = a();
        if (hfgVarA == null) {
            return 0;
        }
        int length = hfgVarA.d;
        jfg jfgVar = this.b;
        if (length != 0) {
            qygVar = (qyg) jfgVar.q;
        } else {
            byte[] bArr = hfgVarA.e;
            int i3 = xxg.a;
            int length2 = bArr.length;
            qyg qygVar2 = this.k;
            qygVar2.C(length2, bArr);
            length = bArr.length;
            qygVar = qygVar2;
        }
        boolean z = jfgVar.j && jfgVar.k[this.f];
        boolean z2 = z || i2 != 0;
        qyg qygVar3 = this.j;
        qygVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        qygVar3.E(0);
        rfg rfgVar = this.a;
        rfgVar.c(1, qygVar3);
        rfgVar.c(length, qygVar);
        if (!z2) {
            return length + 1;
        }
        qyg qygVar4 = this.c;
        if (!z) {
            qygVar4.B(8);
            byte[] bArr2 = qygVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            rfgVar.c(8, qygVar4);
            return length + 9;
        }
        qyg qygVar5 = (qyg) jfgVar.q;
        int iX = qygVar5.x();
        qygVar5.F(-2);
        int i4 = (iX * 6) + 2;
        if (i2 != 0) {
            qygVar4.B(i4);
            byte[] bArr3 = qygVar4.a;
            qygVar5.e(0, bArr3, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            qygVar4 = qygVar5;
        }
        rfgVar.c(i4, qygVar4);
        return length + 1 + i4;
    }

    public final void d() {
        jfg jfgVar = this.b;
        jfgVar.c = 0;
        jfgVar.m = 0L;
        jfgVar.n = false;
        jfgVar.j = false;
        jfgVar.l = false;
        jfgVar.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
