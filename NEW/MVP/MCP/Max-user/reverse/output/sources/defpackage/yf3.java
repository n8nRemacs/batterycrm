package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class yf3 implements x74, Serializable {
    public final x74 a;
    public final v74 b;

    public yf3(x74 x74Var, v74 v74Var) {
        this.a = x74Var;
        this.b = v74Var;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof yf3) {
            yf3 yf3Var = (yf3) obj;
            yf3Var.getClass();
            int i = 2;
            yf3 yf3Var2 = yf3Var;
            int i2 = 2;
            while (true) {
                x74 x74Var = yf3Var2.a;
                yf3Var2 = x74Var instanceof yf3 ? (yf3) x74Var : null;
                if (yf3Var2 == null) {
                    break;
                }
                i2++;
            }
            yf3 yf3Var3 = this;
            while (true) {
                x74 x74Var2 = yf3Var3.a;
                yf3Var3 = x74Var2 instanceof yf3 ? (yf3) x74Var2 : null;
                if (yf3Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                yf3 yf3Var4 = this;
                while (true) {
                    v74 v74Var = yf3Var4.b;
                    if (!fni.a(yf3Var.get(v74Var.getKey()), v74Var)) {
                        zA = false;
                        break;
                    }
                    x74 x74Var3 = yf3Var4.a;
                    if (!(x74Var3 instanceof yf3)) {
                        v74 v74Var2 = (v74) x74Var3;
                        zA = fni.a(yf3Var.get(v74Var2.getKey()), v74Var2);
                        break;
                    }
                    yf3Var4 = (yf3) x74Var3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.x74
    public final Object fold(Object obj, sm6 sm6Var) {
        return sm6Var.invoke(this.a.fold(obj, sm6Var), this.b);
    }

    @Override // defpackage.x74
    public final v74 get(w74 w74Var) {
        yf3 yf3Var = this;
        while (true) {
            v74 v74Var = yf3Var.b.get(w74Var);
            if (v74Var != null) {
                return v74Var;
            }
            x74 x74Var = yf3Var.a;
            if (!(x74Var instanceof yf3)) {
                return x74Var.get(w74Var);
            }
            yf3Var = (yf3) x74Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.x74
    public final x74 minusKey(w74 w74Var) {
        v74 v74Var = this.b;
        v74 v74Var2 = v74Var.get(w74Var);
        x74 x74Var = this.a;
        if (v74Var2 != null) {
            return x74Var;
        }
        x74 x74VarMinusKey = x74Var.minusKey(w74Var);
        return x74VarMinusKey == x74Var ? this : x74VarMinusKey == bd5.a ? v74Var : new yf3(x74VarMinusKey, v74Var);
    }

    @Override // defpackage.x74
    public final x74 plus(x74 x74Var) {
        return x6j.b(this, x74Var);
    }

    public final String toString() {
        return u45.l(new StringBuilder("["), (String) fold("", xf3.b), ']');
    }
}
