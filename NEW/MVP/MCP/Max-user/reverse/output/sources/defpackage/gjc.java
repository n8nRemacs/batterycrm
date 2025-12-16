package defpackage;

/* loaded from: classes2.dex */
public final class gjc extends ljc {
    public final CharSequence a;

    public gjc(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjc) && fni.a(this.a, ((gjc) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 32768;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @Override // defpackage.t98
    public final int m() {
        return 32768;
    }

    public final String toString() {
        return "LinkWithQrCodeItem(link=" + ((Object) this.a) + ")";
    }
}
