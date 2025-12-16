package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gjb extends ulf {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean g(qyg qygVar, byte[] bArr) {
        if (qygVar.c() < bArr.length) {
            return false;
        }
        int i = qygVar.b;
        byte[] bArr2 = new byte[bArr.length];
        qygVar.e(0, bArr2, bArr.length);
        qygVar.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.ulf
    public final long c(qyg qygVar) {
        int i;
        byte[] bArr = qygVar.a;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.f * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // defpackage.ulf
    public final boolean e(qyg qygVar, long j, enb enbVar) {
        if (g(qygVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(qygVar.a, qygVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = k4j.a(bArrCopyOf);
            fsi.d(((gf6) enbVar.b) == null);
            ef6 ef6Var = new ef6();
            ef6Var.k = "audio/opus";
            ef6Var.x = i;
            ef6Var.y = 48000;
            ef6Var.m = arrayListA;
            enbVar.b = new gf6(ef6Var);
            return true;
        }
        if (!g(qygVar, p)) {
            fsi.e((gf6) enbVar.b);
            return false;
        }
        fsi.e((gf6) enbVar.b);
        qygVar.F(8);
        sy9 sy9VarD = eri.d(wg7.k((String[]) eri.e(qygVar, false, false).b));
        if (sy9VarD == null) {
            return true;
        }
        ef6 ef6VarA = ((gf6) enbVar.b).a();
        sy9 sy9Var = ((gf6) enbVar.b).t0;
        if (sy9Var != null) {
            qy9[] qy9VarArr = sy9Var.a;
            if (qy9VarArr.length != 0) {
                qy9[] qy9VarArr2 = sy9VarD.a;
                int i2 = xxg.a;
                Object[] objArrCopyOf = Arrays.copyOf(qy9VarArr2, qy9VarArr2.length + qy9VarArr.length);
                System.arraycopy(qy9VarArr, 0, objArrCopyOf, qy9VarArr2.length, qy9VarArr.length);
                sy9VarD = new sy9((qy9[]) objArrCopyOf);
            }
        }
        ef6VarA.i = sy9VarD;
        enbVar.b = new gf6(ef6VarA);
        return true;
    }
}
