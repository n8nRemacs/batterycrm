package defpackage;

/* loaded from: classes2.dex */
public final class sic extends mjc {
    public final int a;
    public final gza b;

    public sic(int i, gza gzaVar, int i2) {
        gzaVar = (i2 & 8) != 0 ? gza.d : gzaVar;
        this.a = i;
        this.b = gzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sic)) {
            return false;
        }
        sic sicVar = (sic) obj;
        return this.a == sicVar.a && this.b == sicVar.b;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 2;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((iza.a.hashCode() + ((jza.c.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return 2;
    }

    public final String toString() {
        return "MainButtonAction(title=" + this.a + ", size=" + jza.c + ", mode=" + iza.a + ", appearance=" + this.b + ")";
    }
}
