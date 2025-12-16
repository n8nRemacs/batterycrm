package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a7a extends vfi {
    public static final ua9 e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public final ua9 a;
    public long b;
    public final xx0 c;
    public final List d;

    static {
        Pattern pattern = ua9.d;
        ivi.a("multipart/mixed");
        ivi.a("multipart/alternative");
        ivi.a("multipart/digest");
        ivi.a("multipart/parallel");
        e = ivi.a("multipart/form-data");
        f = new byte[]{(byte) 58, (byte) 32};
        g = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        h = new byte[]{b, b};
    }

    public a7a(xx0 xx0Var, ua9 ua9Var, List list) {
        this.c = xx0Var;
        this.d = list;
        Pattern pattern = ua9.d;
        this.a = ivi.a(ua9Var + "; boundary=" + xx0Var.l());
        this.b = -1L;
    }

    @Override // defpackage.vfi
    public final long b() throws EOFException {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        long j2 = j(null, true);
        this.b = j2;
        return j2;
    }

    @Override // defpackage.vfi
    public final ua9 c() {
        return this.a;
    }

    @Override // defpackage.vfi
    public final void i(vv0 vv0Var) throws EOFException {
        j(vv0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j(vv0 vv0Var, boolean z) throws EOFException {
        qu0 qu0Var;
        vv0 qu0Var2;
        if (z) {
            qu0Var2 = new qu0();
            qu0Var = qu0Var2;
        } else {
            qu0Var = 0;
            qu0Var2 = vv0Var;
        }
        List list = this.d;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            xx0 xx0Var = this.c;
            byte[] bArr = h;
            byte[] bArr2 = g;
            if (i >= size) {
                qu0Var2.write(bArr);
                qu0Var2.K(xx0Var);
                qu0Var2.write(bArr);
                qu0Var2.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + qu0Var.b;
                qu0Var.l();
                return j2;
            }
            z6a z6aVar = (z6a) list.get(i);
            j17 j17Var = z6aVar.a;
            yy5 yy5Var = z6aVar.b;
            qu0Var2.write(bArr);
            qu0Var2.K(xx0Var);
            qu0Var2.write(bArr2);
            int size2 = j17Var.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qu0Var2.I(j17Var.b(i2)).write(f).I(j17Var.d(i2)).write(bArr2);
            }
            ua9 ua9Var = yy5Var.b;
            if (ua9Var != null) {
                qu0Var2.I("Content-Type: ").I(ua9Var.a).write(bArr2);
            }
            long jB = yy5Var.b();
            if (jB != -1) {
                qu0Var2.I("Content-Length: ").e0(jB).write(bArr2);
            } else if (z) {
                qu0Var.l();
                return -1L;
            }
            qu0Var2.write(bArr2);
            if (z) {
                j += jB;
            } else {
                yy5Var.i(qu0Var2);
            }
            qu0Var2.write(bArr2);
            i++;
        }
    }
}
