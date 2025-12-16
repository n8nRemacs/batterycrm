package defpackage;

/* loaded from: classes.dex */
public final class xg5 extends j5c {
    public final wee l;
    public final bwf m;

    public xg5(String str, int i) {
        super(str, null, i);
        this.l = wee.c;
        this.m = new bwf(new wg5(i, str, this));
    }

    @Override // defpackage.j5c, defpackage.ree
    public final s9j e() {
        return this.l;
    }

    @Override // defpackage.j5c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ree)) {
            return false;
        }
        ree reeVar = (ree) obj;
        return reeVar.e() == wee.c && fni.a(this.a, reeVar.a()) && fni.a(ofi.a(this), ofi.a(reeVar));
    }

    @Override // defpackage.j5c
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        f2 f2Var = new f2(this);
        int iHashCode2 = 1;
        while (f2Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) f2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.j5c, defpackage.ree
    public final ree i(int i) {
        return ((ree[]) this.m.getValue())[i];
    }

    @Override // defpackage.j5c
    public final String toString() {
        return ue3.N(new zs(4, this), ", ", u45.l(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
