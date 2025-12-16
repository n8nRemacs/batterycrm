package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mv4 {
    public static final mv4 e = new so0(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = zxg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public mv4(so0 so0Var) {
        this.a = so0Var.a;
        this.b = so0Var.b;
        this.c = so0Var.c;
        this.d = (String) so0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv4)) {
            return false;
        }
        mv4 mv4Var = (mv4) obj;
        return this.a == mv4Var.a && this.b == mv4Var.b && this.c == mv4Var.c && Objects.equals(this.d, mv4Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
