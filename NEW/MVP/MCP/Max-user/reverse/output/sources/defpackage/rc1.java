package defpackage;

/* loaded from: classes.dex */
public final class rc1 extends id0 {
    public final CharSequence b;

    public rc1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc1) && fni.a(this.b, ((rc1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SendToChatLink(link=" + ((Object) this.b) + ")";
    }
}
