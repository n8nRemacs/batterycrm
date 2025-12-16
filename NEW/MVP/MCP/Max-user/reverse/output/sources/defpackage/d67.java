package defpackage;

import android.util.Log;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d67 implements rfg {
    public static final gf6 f;
    public static final gf6 g;
    public final rfg a;
    public final gf6 b;
    public gf6 c;
    public byte[] d;
    public int e;

    static {
        ef6 ef6Var = new ef6();
        ef6Var.k = "application/id3";
        f = new gf6(ef6Var);
        ef6 ef6Var2 = new ef6();
        ef6Var2.k = "application/x-emsg";
        g = new gf6(ef6Var2);
    }

    public d67(rfg rfgVar, int i) {
        this.a = rfgVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown metadataType: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.rfg
    public final int a(je4 je4Var, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = je4Var.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.rfg
    public final void b(long j, int i, int i2, int i3, pfg pfgVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        qyg qygVar = new qyg(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.v0;
        gf6 gf6Var = this.b;
        String str2 = gf6Var.v0;
        String str3 = gf6Var.v0;
        if (!xxg.a(str, str2)) {
            if (!"application/x-emsg".equals(this.c.v0)) {
                String strValueOf = String.valueOf(this.c.v0);
                Log.w("HlsSampleStreamWrapper", strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                return;
            }
            mi5 mi5VarD = aq.d(qygVar);
            gf6 gf6VarL = mi5VarD.l();
            if (gf6VarL == null || !xxg.a(str3, gf6VarL.v0)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + mi5VarD.l());
                return;
            }
            byte[] bArrO = mi5VarD.o();
            bArrO.getClass();
            qygVar = new qyg(bArrO);
        }
        int iC = qygVar.c();
        rfg rfgVar = this.a;
        rfgVar.c(iC, qygVar);
        rfgVar.b(j, i, iC, i3, pfgVar);
    }

    @Override // defpackage.rfg
    public final void c(int i, qyg qygVar) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        qygVar.e(this.e, this.d, i);
        this.e += i;
    }

    @Override // defpackage.rfg
    public final void d(gf6 gf6Var) {
        this.c = gf6Var;
        this.a.d(this.b);
    }
}
