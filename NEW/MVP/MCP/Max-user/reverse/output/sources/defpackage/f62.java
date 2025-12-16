package defpackage;

/* loaded from: classes2.dex */
public final class f62 implements g62 {
    public final long X;
    public final long a;
    public final dgf b;
    public final s5g c;
    public final Integer d;
    public final int o;

    public f62(long j, dgf dgfVar) {
        this.a = j;
        this.b = dgfVar;
        this.c = dgfVar.b;
        this.d = dgfVar.d;
        this.o = dgfVar.s0;
        this.X = dgfVar.t0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f62)) {
            return false;
        }
        f62 f62Var = (f62) obj;
        return this.a == f62Var.a && fni.a(this.b, f62Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    @Override // defpackage.g62
    public final s5g getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.o;
    }

    @Override // defpackage.g62
    public final boolean s() {
        return this.b.X == 1;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }
}
