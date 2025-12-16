package defpackage;

/* loaded from: classes.dex */
public final class p5i {
    public String a;
    public w4i b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5i)) {
            return false;
        }
        p5i p5iVar = (p5i) obj;
        return fni.a(this.a, p5iVar.a) && this.b == p5iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
