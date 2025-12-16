package defpackage;

/* loaded from: classes2.dex */
public final class kqd implements nqd {
    public final String a;

    public kqd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqd) && fni.a(this.a, ((kqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wy1.h("custom_", this.a);
    }
}
