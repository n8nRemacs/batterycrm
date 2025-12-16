package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e3f implements ec8 {
    public final ze4 a;
    public final zdf b;
    public byte[] c;

    public e3f(se4 se4Var, ze4 ze4Var) {
        ub8.c.getAndIncrement();
        this.a = ze4Var;
        this.b = new zdf(se4Var);
    }

    @Override // defpackage.ec8
    public final void c() {
    }

    @Override // defpackage.ec8
    public final void load() {
        zdf zdfVar = this.b;
        zdfVar.b = 0L;
        try {
            zdfVar.H(this.a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) zdfVar.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = zdfVar.read(bArr2, i2, bArr2.length - i2);
            }
            z7j.a(zdfVar);
        } catch (Throwable th) {
            z7j.a(zdfVar);
            throw th;
        }
    }
}
