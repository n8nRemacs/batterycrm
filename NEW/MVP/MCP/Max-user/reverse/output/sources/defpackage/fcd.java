package defpackage;

/* loaded from: classes2.dex */
public final class fcd extends u7j {
    public final CharSequence a;

    public fcd(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcd) && fni.a(this.a, ((fcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ")";
    }
}
