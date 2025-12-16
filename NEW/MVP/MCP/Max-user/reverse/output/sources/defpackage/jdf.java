package defpackage;

/* loaded from: classes2.dex */
public final class jdf {
    public final idf a;
    public final kdf b;

    public jdf(idf idfVar, kdf kdfVar) {
        this.a = idfVar;
        this.b = kdfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdf)) {
            return false;
        }
        jdf jdfVar = (jdf) obj;
        return fni.a(this.a, jdfVar.a) && fni.a(this.b, jdfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesTextColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
