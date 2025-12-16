package defpackage;

/* loaded from: classes2.dex */
public final class n0h {
    public final o0h a;

    public n0h(o0h o0hVar) {
        this.a = o0hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0h) && fni.a(this.a, ((n0h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VfxEmptyBlockColors(halo=" + this.a + ")";
    }
}
