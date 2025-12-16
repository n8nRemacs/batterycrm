package defpackage;

/* loaded from: classes2.dex */
public final class e70 extends l0g {
    public final d70 c;

    public e70(d70 d70Var) {
        this.c = d70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e70) && fni.a(this.c, ((e70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        d70 d70Var = this.c;
        return wmf.e("Response(enabled=" + d70Var.a + ",\n                |hint='" + d70Var.b + "',\n                |email='" + l8g.f(d70Var.c) + "')\n                |");
    }
}
