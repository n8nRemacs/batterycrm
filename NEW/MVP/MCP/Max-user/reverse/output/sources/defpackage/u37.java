package defpackage;

/* loaded from: classes.dex */
public final class u37 extends v37 {
    public final String a;

    public u37(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u37) && fni.a(this.a, ((u37) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("Time(time=", this.a, ")");
    }
}
