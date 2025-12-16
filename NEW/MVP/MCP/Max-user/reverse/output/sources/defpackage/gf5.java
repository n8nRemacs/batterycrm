package defpackage;

/* loaded from: classes.dex */
public final class gf5 {
    public final String a;

    public gf5(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5)) {
            return false;
        }
        return this.a.equals(((gf5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ho7.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
