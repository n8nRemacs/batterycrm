package defpackage;

/* loaded from: classes2.dex */
public final class mc0 {
    public static final mc0 c = new mc0("", 0);
    public final long a;
    public final CharSequence b;

    public mc0(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0Var = (mc0) obj;
        return this.a == mc0Var.a && fni.a(this.b, mc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarAbbreviationModel(sourceId=" + this.a + ", abbreviation=" + ((Object) this.b) + ")";
    }
}
