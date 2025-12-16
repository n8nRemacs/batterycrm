package defpackage;

/* loaded from: classes2.dex */
public final class yqf {
    public final gpf a;
    public final boolean b;

    public yqf(gpf gpfVar, boolean z) {
        this.a = gpfVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqf)) {
            return false;
        }
        yqf yqfVar = (yqf) obj;
        return fni.a(this.a, yqfVar.a) && this.b == yqfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
