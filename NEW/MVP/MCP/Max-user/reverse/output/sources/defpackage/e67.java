package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e67 implements sfg {
    public static final hf6 f;
    public static final hf6 g;
    public final sfg a;
    public final hf6 b;
    public hf6 c;
    public byte[] d;
    public int e;

    static {
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("application/id3");
        f = new hf6(ff6Var);
        ff6 ff6Var2 = new ff6();
        ff6Var2.m = xz9.n("application/x-emsg");
        g = new hf6(ff6Var2);
    }

    public e67(sfg sfgVar, int i) {
        this.a = sfgVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(ho7.f(i, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.sfg
    public final void a(long j, int i, int i2, int i3, qfg qfgVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        umb umbVar = new umb(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        hf6 hf6Var = this.b;
        String str2 = hf6Var.n;
        String str3 = hf6Var.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                a8i.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            ni5 ni5VarE = bq.e(umbVar);
            hf6 hf6VarL = ni5VarE.l();
            if (hf6VarL == null || !Objects.equals(str3, hf6VarL.n)) {
                a8i.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + ni5VarE.l());
                return;
            }
            byte[] bArrO = ni5VarE.o();
            bArrO.getClass();
            umbVar = new umb(bArrO);
        }
        int iA = umbVar.a();
        sfg sfgVar = this.a;
        sfgVar.b(umbVar, iA, 0);
        sfgVar.a(j, i, iA, 0, qfgVar);
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        umbVar.h(this.e, this.d, i);
        this.e += i;
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = ke4Var.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
        this.c = hf6Var;
        this.a.d(this.b);
    }
}
