package defpackage;

/* loaded from: classes.dex */
public final class ixg implements t98 {
    public final r5g a;
    public final mc0 b;
    public final String c;
    public final zi1 d;

    public ixg(r5g r5gVar, mc0 mc0Var, String str, zi1 zi1Var) {
        this.a = r5gVar;
        this.b = mc0Var;
        this.c = str;
        this.d = zi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixg)) {
            return false;
        }
        ixg ixgVar = (ixg) obj;
        return this.a.equals(ixgVar.a) && this.b.equals(ixgVar.b) && this.c.equals(ixgVar.c) && fni.a(this.d, ixgVar.d);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + u45.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return j0b.X0;
    }

    public final String toString() {
        return "UserInWaitingData(name=" + this.a + ", avatarAbbreviationModel=" + this.b + ", url=" + this.c + ", participantId=" + this.d + ")";
    }
}
