package defpackage;

/* loaded from: classes.dex */
public final class llb implements aa3 {
    public final Class a;

    public llb(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.aa3
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof llb) {
            return fni.a(this.a, ((llb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
