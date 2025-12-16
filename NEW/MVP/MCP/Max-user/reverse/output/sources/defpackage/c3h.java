package defpackage;

/* loaded from: classes2.dex */
public final class c3h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public c3h(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3h)) {
            return false;
        }
        c3h c3hVar = (c3h) obj;
        return this.a == c3hVar.a && this.b == c3hVar.b && this.c == c3hVar.c && this.d == c3hVar.d && this.e == c3hVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + iti.a(this.d, iti.a(this.c, iti.a(this.b, Integer.hashCode(this.a) * 31)));
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("VideoDimension(landscapeWidth=", this.a, ", landscapeHeight=", this.b, ", portraitWidth=");
        hf3.g(sbK, this.c, ", portraitHeight=", this.d, ", fps=");
        return ho7.j(sbK, this.e, ")");
    }
}
