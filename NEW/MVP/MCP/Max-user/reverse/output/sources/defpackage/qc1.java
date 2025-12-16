package defpackage;

/* loaded from: classes.dex */
public final class qc1 extends id0 {
    public final CharSequence b;

    public qc1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc1) && fni.a(this.b, ((qc1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CopyLink(link=" + ((Object) this.b) + ")";
    }
}
