package defpackage;

/* loaded from: classes2.dex */
public final class zm2 {
    public final pfb a;
    public final String b;

    public zm2(pfb pfbVar, String str) {
        this.a = pfbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm2)) {
            return false;
        }
        zm2 zm2Var = (zm2) obj;
        return this.a.equals(zm2Var.a) && this.b.equals(zm2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + ((Object) this.b) + ")";
    }
}
