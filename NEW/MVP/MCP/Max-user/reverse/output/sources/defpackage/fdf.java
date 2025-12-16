package defpackage;

/* loaded from: classes2.dex */
public final class fdf {
    public final ddf a;
    public final gdf b;
    public final jdf c;

    public fdf(ddf ddfVar, gdf gdfVar, jdf jdfVar) {
        this.a = ddfVar;
        this.b = gdfVar;
        this.c = jdfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdf)) {
            return false;
        }
        fdf fdfVar = (fdf) obj;
        return fni.a(this.a, fdfVar.a) && fni.a(this.b, fdfVar.b) && fni.a(this.c, fdfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
