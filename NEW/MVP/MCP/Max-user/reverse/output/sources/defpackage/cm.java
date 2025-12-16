package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cm {
    public final int a;
    public final xo8 b;
    public final el c;
    public final String d;

    public cm(xo8 xo8Var, el elVar, String str) {
        this.b = xo8Var;
        this.c = elVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{xo8Var, elVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        return syi.c(this.b, cmVar.b) && syi.c(this.c, cmVar.c) && syi.c(this.d, cmVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
