package defpackage;

/* loaded from: classes.dex */
public final class bqc {
    public final /* synthetic */ int a;
    public final y9g b;
    public final qyg c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public bqc(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new y9g(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new qyg(2, false);
                break;
            default:
                this.b = new y9g(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new qyg(2, false);
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(qyg qygVar) {
        int i = qygVar.b;
        if (qygVar.c() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        qygVar.e(0, bArr, 9);
        qygVar.E(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(hp5 hp5Var) {
        switch (this.a) {
            case 0:
                byte[] bArr = xxg.f;
                qyg qygVar = this.c;
                qygVar.getClass();
                qygVar.C(bArr.length, bArr);
                this.d = true;
                hp5Var.y();
                break;
            default:
                byte[] bArr2 = xxg.f;
                qyg qygVar2 = this.c;
                qygVar2.getClass();
                qygVar2.C(bArr2.length, bArr2);
                this.d = true;
                hp5Var.y();
                break;
        }
    }
}
