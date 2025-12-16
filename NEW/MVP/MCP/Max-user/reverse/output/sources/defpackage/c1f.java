package defpackage;

/* loaded from: classes.dex */
public final class c1f implements ty0 {
    public final String a;

    public c1f(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.ty0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ty0
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1f) {
            return this.a.equals(((c1f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
