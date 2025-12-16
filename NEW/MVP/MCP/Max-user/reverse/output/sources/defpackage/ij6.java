package defpackage;

/* loaded from: classes.dex */
public final class ij6 {
    public final sfg a;
    public ufg d;
    public dp4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final hf6 j;
    public boolean m;
    public final jfg b = new jfg(1);
    public final umb c = new umb();
    public final umb k = new umb(1);
    public final umb l = new umb();

    public ij6(sfg sfgVar, ufg ufgVar, dp4 dp4Var, hf6 hf6Var) {
        this.a = sfgVar;
        this.d = ufgVar;
        this.e = dp4Var;
        this.j = hf6Var;
        this.d = ufgVar;
        this.e = dp4Var;
        sfgVar.d(hf6Var);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.i[this.f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final ifg b() {
        if (!this.m) {
            return null;
        }
        jfg jfgVar = this.b;
        dp4 dp4Var = (dp4) jfgVar.o;
        String str = zxg.a;
        int i = dp4Var.a;
        ifg ifgVar = (ifg) jfgVar.p;
        if (ifgVar == null) {
            ifgVar = this.d.a.l[i];
        }
        if (ifgVar == null || !ifgVar.a) {
            return null;
        }
        return ifgVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
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

    public final int d(int i, int i2) {
        umb umbVar;
        ifg ifgVarB = b();
        if (ifgVarB == null) {
            return 0;
        }
        int length = ifgVarB.d;
        jfg jfgVar = this.b;
        if (length != 0) {
            umbVar = (umb) jfgVar.q;
        } else {
            byte[] bArr = ifgVarB.e;
            String str = zxg.a;
            int length2 = bArr.length;
            umb umbVar2 = this.l;
            umbVar2.H(length2, bArr);
            length = bArr.length;
            umbVar = umbVar2;
        }
        boolean z = jfgVar.j && jfgVar.k[this.f];
        boolean z2 = z || i2 != 0;
        umb umbVar3 = this.k;
        umbVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        umbVar3.J(0);
        sfg sfgVar = this.a;
        sfgVar.b(umbVar3, 1, 1);
        sfgVar.b(umbVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        umb umbVar4 = this.c;
        if (!z) {
            umbVar4.G(8);
            byte[] bArr2 = umbVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            sfgVar.b(umbVar4, 8, 1);
            return length + 9;
        }
        umb umbVar5 = (umb) jfgVar.q;
        int iD = umbVar5.D();
        umbVar5.K(-2);
        int i3 = (iD * 6) + 2;
        if (i2 != 0) {
            umbVar4.G(i3);
            byte[] bArr3 = umbVar4.a;
            umbVar5.h(0, bArr3, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            umbVar4 = umbVar5;
        }
        sfgVar.b(umbVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
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
        this.m = false;
    }
}
