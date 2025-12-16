package defpackage;

/* loaded from: classes2.dex */
public final class hyg implements ry9 {
    public final String a;

    public hyg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyg) && fni.a(this.a, ((hyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("VKServerQuality(value=", this.a, ")");
    }
}
