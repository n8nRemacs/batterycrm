package defpackage;

/* loaded from: classes2.dex */
public final class l2i {
    public final k2i a;
    public final s7c b;
    public final yl7 c;
    public final d d;

    public l2i(k2i k2iVar, s7c s7cVar, yl7 yl7Var, d dVar) {
        this.a = k2iVar;
        this.b = s7cVar;
        this.c = yl7Var;
        this.d = dVar;
    }

    public final String a() {
        s7c s7cVar = this.b;
        String str = s7cVar != null ? (String) s7cVar.a : null;
        return str == null ? "" : str;
    }

    public final boolean b() {
        return this.a == k2i.X && this.c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2i)) {
            return false;
        }
        l2i l2iVar = (l2i) obj;
        return this.a == l2iVar.a && fni.a(this.b, l2iVar.b) && fni.a(this.c, l2iVar.c) && fni.a(this.d, l2iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s7c s7cVar = this.b;
        int iHashCode2 = (iHashCode + (s7cVar == null ? 0 : s7cVar.hashCode())) * 31;
        yl7 yl7Var = this.c;
        int iHashCode3 = (iHashCode2 + (yl7Var == null ? 0 : yl7Var.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(type=" + this.a + ", textContent=" + this.b + ", keyboard=" + this.c + ", icon=" + this.d + ")";
    }
}
