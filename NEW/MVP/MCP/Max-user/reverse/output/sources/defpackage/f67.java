package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class f67 extends gxd {
    public final Map H;
    public x45 I;

    public f67(qi4 qi4Var, j55 j55Var, lk6 lk6Var, Map map) {
        super(qi4Var, j55Var, lk6Var);
        this.H = map;
    }

    @Override // defpackage.gxd
    public final gf6 l(gf6 gf6Var) {
        x45 x45Var;
        x45 x45Var2 = this.I;
        if (x45Var2 == null) {
            x45Var2 = gf6Var.y0;
        }
        if (x45Var2 != null && (x45Var = (x45) this.H.get(x45Var2.c)) != null) {
            x45Var2 = x45Var;
        }
        sy9 sy9Var = gf6Var.t0;
        sy9 sy9Var2 = null;
        if (sy9Var == null) {
            sy9Var = sy9Var2;
        } else {
            qy9[] qy9VarArr = sy9Var.a;
            int length = qy9VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                qy9 qy9Var = qy9VarArr[i2];
                if ((qy9Var instanceof q9c) && "com.apple.streaming.transportStreamTimestamp".equals(((q9c) qy9Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    qy9[] qy9VarArr2 = new qy9[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            qy9VarArr2[i < i2 ? i : i - 1] = qy9VarArr[i];
                        }
                        i++;
                    }
                    sy9Var2 = new sy9(qy9VarArr2);
                }
                sy9Var = sy9Var2;
            }
        }
        if (x45Var2 != gf6Var.y0 || sy9Var != gf6Var.t0) {
            ef6 ef6VarA = gf6Var.a();
            ef6VarA.n = x45Var2;
            ef6VarA.i = sy9Var;
            gf6Var = new gf6(ef6VarA);
        }
        return super.l(gf6Var);
    }
}
