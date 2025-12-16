package defpackage;

/* loaded from: classes2.dex */
public final class uwe extends laj {
    public final r5g a;
    public final n5g b;
    public final Integer c;

    public uwe(r5g r5gVar, n5g n5gVar, Integer num) {
        this.a = r5gVar;
        this.b = n5gVar;
        this.c = num;
    }

    @Override // defpackage.laj
    public final s5g a() {
        return this.b;
    }

    @Override // defpackage.laj
    public final Integer b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwe)) {
            return false;
        }
        uwe uweVar = (uwe) obj;
        return this.a.equals(uweVar.a) && this.b.equals(uweVar.b) && this.c.equals(uweVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, a9h.b(this.a.hashCode() * 31, 31, true), 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", shouldShowMore=true, hint=" + this.b + ", hintColor=" + this.c + ")";
    }
}
