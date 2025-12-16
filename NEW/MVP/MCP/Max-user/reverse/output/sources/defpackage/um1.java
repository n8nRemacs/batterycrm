package defpackage;

/* loaded from: classes.dex */
public final class um1 extends en1 {
    public final CharSequence D;

    public um1(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um1) && fni.a(this.D, ((um1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "RecordStart(name=" + ((Object) this.D) + ")";
    }
}
