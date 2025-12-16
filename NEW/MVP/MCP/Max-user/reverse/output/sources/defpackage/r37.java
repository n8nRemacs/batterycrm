package defpackage;

/* loaded from: classes.dex */
public final class r37 extends v37 {
    public final CharSequence a;

    public r37(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r37) && fni.a(this.a, ((r37) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + ((Object) this.a) + ")";
    }
}
