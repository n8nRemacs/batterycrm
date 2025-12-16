package defpackage;

/* loaded from: classes.dex */
public final class fa0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fa0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fa0) {
            fa0 fa0Var = (fa0) obj;
            if (this.a.equals(fa0Var.a) && this.b.equals(fa0Var.b) && this.c.equals(fa0Var.c) && this.d.equals(fa0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return ho7.l(sb, this.d, "}");
    }
}
