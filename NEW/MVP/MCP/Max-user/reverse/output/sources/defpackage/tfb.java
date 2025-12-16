package defpackage;

/* loaded from: classes2.dex */
public final class tfb implements ufb {
    public final cbb a;

    public tfb(cbb cbbVar) {
        this.a = cbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfb) && fni.a(this.a, ((tfb) obj).a);
    }

    public final int hashCode() {
        cbb cbbVar = this.a;
        if (cbbVar == null) {
            return 0;
        }
        return cbbVar.hashCode();
    }

    public final String toString() {
        return "Search(listener=" + this.a + ")";
    }
}
