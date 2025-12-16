package defpackage;

/* loaded from: classes2.dex */
public final class a8e implements qfc {
    public final n5g a;
    public final llc b;
    public final t5g c;
    public final int d;
    public final int o;

    public a8e(n5g n5gVar, t5g t5gVar, int i) {
        llc llcVar = new llc(10);
        t5gVar = (i & 4) != 0 ? dpg.q : t5gVar;
        int i2 = (i & 8) != 0 ? 2048 : 4096;
        this.a = n5gVar;
        this.b = llcVar;
        this.c = t5gVar;
        this.d = i2;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8e)) {
            return false;
        }
        a8e a8eVar = (a8e) obj;
        return fni.a(this.a, a8eVar.a) && fni.a(this.b, a8eVar.b) && fni.a(this.c, a8eVar.c) && this.d == a8eVar.d;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.c) * 31)) * 31)) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.o;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + i6j.b(this.d) + ")";
    }
}
