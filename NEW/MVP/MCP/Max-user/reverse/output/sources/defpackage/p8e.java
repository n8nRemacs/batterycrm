package defpackage;

/* loaded from: classes.dex */
public final class p8e implements njg {
    public final n8e a;
    public final qyg b = new qyg(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public p8e(n8e n8eVar) {
        this.a = n8eVar;
    }

    @Override // defpackage.njg
    public final void a() {
        this.f = true;
    }

    @Override // defpackage.njg
    public final void b(y9g y9gVar, jp5 jp5Var, mjg mjgVar) {
        this.a.b(y9gVar, jp5Var, mjgVar);
        this.f = true;
    }

    @Override // defpackage.njg
    public final void c(int i, qyg qygVar) {
        boolean z = (i & 1) != 0;
        int iS = z ? qygVar.b + qygVar.s() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            qygVar.E(iS);
            this.d = 0;
        }
        while (qygVar.c() > 0) {
            int i2 = this.d;
            qyg qygVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iS2 = qygVar.s();
                    qygVar.E(qygVar.b - 1);
                    if (iS2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(qygVar.c(), 3 - this.d);
                qygVar.e(this.d, qygVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    qygVar2.E(0);
                    qygVar2.D(3);
                    qygVar2.F(1);
                    int iS3 = qygVar2.s();
                    int iS4 = qygVar2.s();
                    this.e = (iS3 & 128) != 0;
                    int i4 = (((iS3 & 15) << 8) | iS4) + 3;
                    this.c = i4;
                    byte[] bArr = qygVar2.a;
                    if (bArr.length < i4) {
                        qygVar2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(qygVar.c(), this.c - this.d);
                qygVar.e(this.d, qygVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = qygVar2.a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i6; i8++) {
                            i7 = xxg.m[((i7 >>> 24) ^ (bArr2[i8] & 255)) & 255] ^ (i7 << 8);
                        }
                        int i9 = xxg.a;
                        if (i7 != 0) {
                            this.f = true;
                            return;
                        }
                        qygVar2.D(this.c - 4);
                    } else {
                        qygVar2.D(i6);
                    }
                    qygVar2.E(0);
                    this.a.d(qygVar2);
                    this.d = 0;
                }
            }
        }
    }
}
