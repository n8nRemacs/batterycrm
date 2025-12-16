package defpackage;

/* loaded from: classes2.dex */
public final class yic extends mjc {
    public final uh2 a;

    public yic(uh2 uh2Var) {
        this.a = uh2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yic) && fni.a(this.a, ((yic) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 16384;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    public final int m() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
