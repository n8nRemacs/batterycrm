package defpackage;

/* loaded from: classes2.dex */
public final class tic extends mjc {
    public final int a;
    public final em6 b;
    public final t5g c;
    public final int d;

    public tic(int i, em6 em6Var, t5g t5gVar) {
        this.a = i;
        this.b = em6Var;
        this.c = t5gVar;
        this.d = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tic)) {
            return false;
        }
        tic ticVar = (tic) obj;
        return this.a == ticVar.a && fni.a(this.b, ticVar.b) && fni.a(this.c, ticVar.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 4;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }

    public tic(int i) {
        this(i, new dga(29), dpg.q);
    }
}
