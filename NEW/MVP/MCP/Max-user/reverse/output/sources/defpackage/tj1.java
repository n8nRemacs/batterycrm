package defpackage;

/* loaded from: classes.dex */
public final class tj1 {
    public final CharSequence a;

    public tj1(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj1) && fni.a(this.a, ((tj1) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "CallPresettingsEditChanges(changedName=" + ((Object) this.a) + ")";
    }
}
