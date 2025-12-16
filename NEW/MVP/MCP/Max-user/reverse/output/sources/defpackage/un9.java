package defpackage;

/* loaded from: classes2.dex */
public final class un9 implements zn9 {
    public final CharSequence a;

    public un9(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un9) && fni.a(this.a, ((un9) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "FinishEditMessage(text=" + ((Object) this.a) + ")";
    }
}
