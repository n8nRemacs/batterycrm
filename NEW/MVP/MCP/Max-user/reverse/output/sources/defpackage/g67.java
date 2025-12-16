package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class g67 extends hxd {
    public final Map H;
    public y45 I;

    public g67(ri4 ri4Var, k55 k55Var, d55 d55Var, Map map) {
        super(ri4Var, k55Var, d55Var);
        this.H = map;
    }

    @Override // defpackage.hxd
    public final hf6 m(hf6 hf6Var) {
        y45 y45Var;
        y45 y45Var2 = this.I;
        if (y45Var2 == null) {
            y45Var2 = hf6Var.r;
        }
        if (y45Var2 != null && (y45Var = (y45) this.H.get(y45Var2.c)) != null) {
            y45Var2 = y45Var;
        }
        ty9 ty9Var = hf6Var.l;
        ty9 ty9Var2 = null;
        if (ty9Var == null) {
            ty9Var = ty9Var2;
        } else {
            ry9[] ry9VarArr = ty9Var.a;
            int length = ry9VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                ry9 ry9Var = ry9VarArr[i2];
                if ((ry9Var instanceof r9c) && "com.apple.streaming.transportStreamTimestamp".equals(((r9c) ry9Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    ry9[] ry9VarArr2 = new ry9[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            ry9VarArr2[i < i2 ? i : i - 1] = ry9VarArr[i];
                        }
                        i++;
                    }
                    ty9Var2 = new ty9(ry9VarArr2);
                }
                ty9Var = ty9Var2;
            }
        }
        if (y45Var2 != hf6Var.r || ty9Var != hf6Var.l) {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.q = y45Var2;
            ff6VarA.k = ty9Var;
            hf6Var = new hf6(ff6VarA);
        }
        return super.m(hf6Var);
    }
}
