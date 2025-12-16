package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class t90 extends w94 {
    public final Context a;
    public final hc3 b;
    public final hc3 c;
    public final String d;

    public t90(Context context, hc3 hc3Var, hc3 hc3Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (hc3Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = hc3Var;
        if (hc3Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = hc3Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w94) {
            w94 w94Var = (w94) obj;
            if (this.a.equals(((t90) w94Var).a)) {
                t90 t90Var = (t90) w94Var;
                if (this.b.equals(t90Var.b) && this.c.equals(t90Var.c) && this.d.equals(t90Var.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return ho7.l(sb, this.d, "}");
    }
}
