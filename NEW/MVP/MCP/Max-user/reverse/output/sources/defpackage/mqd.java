package defpackage;

/* loaded from: classes2.dex */
public final class mqd implements nqd {
    public final String a;

    public mqd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqd) && fni.a(this.a, ((mqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wy1.h("system_", this.a);
    }
}
