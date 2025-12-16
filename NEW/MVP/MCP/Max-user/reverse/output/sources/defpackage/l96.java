package defpackage;

/* loaded from: classes2.dex */
public final class l96 extends n96 {
    public final CharSequence a;
    public final boolean b;

    public l96(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    @Override // defpackage.n96
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l96)) {
            return false;
        }
        l96 l96Var = (l96) obj;
        return fni.a(this.a, l96Var.a) && this.b == l96Var.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Creation(name=" + ((Object) this.a) + ", isCreateButtonEnabled=" + this.b + ")";
    }

    public /* synthetic */ l96() {
        this(null, false);
    }
}
