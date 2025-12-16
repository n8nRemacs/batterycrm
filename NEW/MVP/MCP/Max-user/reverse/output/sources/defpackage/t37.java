package defpackage;

/* loaded from: classes.dex */
public final class t37 extends v37 {
    public final CharSequence a;

    public t37(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t37) && fni.a(this.a, ((t37) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ")";
    }
}
