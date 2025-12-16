package defpackage;

/* loaded from: classes2.dex */
public final class xic extends ljc {
    public final CharSequence a;
    public final int b;
    public final int c;

    public xic(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xic)) {
            return false;
        }
        xic xicVar = (xic) obj;
        return fni.a(this.a, xicVar.a) && this.b == xicVar.b;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 8;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.c;
    }

    public final String toString() {
        return "ChatDescription(text=" + ((Object) this.a) + ", itemViewType=" + j6j.c(this.b) + ")";
    }
}
