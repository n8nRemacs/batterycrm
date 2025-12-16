package defpackage;

/* loaded from: classes.dex */
public final class p16 implements pn0 {
    public final x16 a;
    public final int b;
    public final n7 c = new n7();

    public p16(x16 x16Var, int i) {
        this.a = x16Var;
        this.b = i;
    }

    public final long a(ip5 ip5Var) {
        n7 n7Var;
        x16 x16Var;
        int iT;
        while (true) {
            long jO = ip5Var.o();
            long length = ip5Var.getLength() - 6;
            n7Var = this.c;
            x16Var = this.a;
            if (jO >= length) {
                break;
            }
            long jO2 = ip5Var.o();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zA = false;
            ip5Var.i(0, bArr, 2);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (i2 != i3) {
                ip5Var.y();
                ip5Var.q((int) (jO2 - ip5Var.getPosition()));
            } else {
                umb umbVar = new umb(16);
                System.arraycopy(bArr, 0, umbVar.a, 0, 2);
                byte[] bArr2 = umbVar.a;
                while (i < 14 && (iT = ip5Var.t(2 + i, bArr2, 14 - i)) != -1) {
                    i += iT;
                }
                umbVar.I(i);
                ip5Var.y();
                ip5Var.q((int) (jO2 - ip5Var.getPosition()));
                zA = z7.a(umbVar, x16Var, i3, n7Var);
            }
            if (zA) {
                break;
            }
            ip5Var.q(1);
        }
        if (ip5Var.o() < ip5Var.getLength() - 6) {
            return n7Var.a;
        }
        ip5Var.q((int) (ip5Var.getLength() - ip5Var.o()));
        return x16Var.k;
    }

    @Override // defpackage.pn0
    public final nn0 b(ip5 ip5Var, long j) {
        long position = ip5Var.getPosition();
        long jA = a(ip5Var);
        long jO = ip5Var.o();
        ip5Var.q(Math.max(6, this.a.d));
        long jA2 = a(ip5Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new nn0(-2, jA2, ip5Var.o()) : new nn0(-1, jA, position) : new nn0(0, -9223372036854775807L, jO);
    }
}
