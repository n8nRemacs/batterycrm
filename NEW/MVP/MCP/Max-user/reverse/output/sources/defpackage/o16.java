package defpackage;

/* loaded from: classes.dex */
public final class o16 implements on0 {
    public final x16 a;
    public final int b;
    public final n7 c = new n7();

    public o16(x16 x16Var, int i) {
        this.a = x16Var;
        this.b = i;
    }

    public final long a(hp5 hp5Var) {
        n7 n7Var;
        x16 x16Var;
        int iT;
        while (true) {
            long jO = hp5Var.o();
            long length = hp5Var.getLength() - 6;
            n7Var = this.c;
            x16Var = this.a;
            if (jO >= length) {
                break;
            }
            long jO2 = hp5Var.o();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zA = false;
            hp5Var.i(0, bArr, 2);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (i2 != i3) {
                hp5Var.y();
                hp5Var.q((int) (jO2 - hp5Var.getPosition()));
            } else {
                qyg qygVar = new qyg(16);
                System.arraycopy(bArr, 0, qygVar.a, 0, 2);
                byte[] bArr2 = qygVar.a;
                while (i < 14 && (iT = hp5Var.t(2 + i, bArr2, 14 - i)) != -1) {
                    i += iT;
                }
                qygVar.D(i);
                hp5Var.y();
                hp5Var.q((int) (jO2 - hp5Var.getPosition()));
                zA = kcj.a(qygVar, x16Var, i3, n7Var);
            }
            if (zA) {
                break;
            }
            hp5Var.q(1);
        }
        if (hp5Var.o() < hp5Var.getLength() - 6) {
            return n7Var.a;
        }
        hp5Var.q((int) (hp5Var.getLength() - hp5Var.o()));
        return x16Var.k;
    }

    @Override // defpackage.on0
    public final nn0 g(hp5 hp5Var, long j) {
        long position = hp5Var.getPosition();
        long jA = a(hp5Var);
        long jO = hp5Var.o();
        hp5Var.q(Math.max(6, this.a.d));
        long jA2 = a(hp5Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new nn0(-2, jA2, hp5Var.o()) : new nn0(-1, jA, position) : new nn0(0, -9223372036854775807L, jO);
    }
}
