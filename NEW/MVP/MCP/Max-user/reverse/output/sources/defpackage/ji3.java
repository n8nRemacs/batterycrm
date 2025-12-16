package defpackage;

/* loaded from: classes2.dex */
public final class ji3 {
    public final hi3 a;
    public final ki3 b;
    public final mi3 c;

    public ji3(hi3 hi3Var, ki3 ki3Var, mi3 mi3Var) {
        this.a = hi3Var;
        this.b = ki3Var;
        this.c = mi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji3)) {
            return false;
        }
        ji3 ji3Var = (ji3) obj;
        return fni.a(this.a, ji3Var.a) && fni.a(this.b, ji3Var.b) && fni.a(this.c, ji3Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommonStatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
