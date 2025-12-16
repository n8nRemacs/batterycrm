package defpackage;

/* loaded from: classes.dex */
public final class qcg extends ifi {
    public final CharSequence a;

    public qcg(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.ifi
    public final CharSequence b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcg) && fni.a(this.a, ((qcg) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Connected(text=" + ((Object) this.a) + ")";
    }
}
