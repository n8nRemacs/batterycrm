package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c70 implements el {
    public static final c70 c;
    public final boolean a;
    public final String b;

    static {
        s7c s7cVar = new s7c();
        s7cVar.a = Boolean.FALSE;
        c = new c70(s7cVar);
    }

    public c70(s7c s7cVar) {
        this.a = ((Boolean) s7cVar.a).booleanValue();
        this.b = (String) s7cVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj;
        c70Var.getClass();
        return syi.c(null, null) && this.a == c70Var.a && syi.c(this.b, c70Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
