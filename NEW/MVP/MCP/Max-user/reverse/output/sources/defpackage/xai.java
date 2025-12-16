package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xai {
    public final cm a;
    public final qt5 b;

    public /* synthetic */ xai(cm cmVar, qt5 qt5Var) {
        this.a = cmVar;
        this.b = qt5Var;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof xai)) {
            xai xaiVar = (xai) obj;
            if (syi.c(this.a, xaiVar.a) && syi.c(this.b, xaiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.a, "key");
        h79Var.t(this.b, "feature");
        return h79Var.toString();
    }
}
