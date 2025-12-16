package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ea1 extends e9j {
    public final /* synthetic */ int a;
    public final List b;
    public final List c;

    public /* synthetic */ ea1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.e9j
    public final boolean b(int i, int i2) {
        switch (this.a) {
            case 0:
                return fni.a(this.b.get(i), this.c.get(i2));
            case 1:
                return fni.a(this.b.get(i), this.c.get(i2));
            case 2:
                return this.b.get(i) == this.c.get(i2);
            default:
                return fni.a(ue3.J(i, this.b), ue3.J(i2, this.c));
        }
    }

    @Override // defpackage.e9j
    public final boolean c(int i, int i2) {
        switch (this.a) {
            case 0:
                return ((cb1) this.b.get(i)).c == ((cb1) this.c.get(i2)).c;
            case 1:
                return fni.a(((pa6) this.b.get(i)).a, ((pa6) this.c.get(i2)).a);
            case 2:
                return ((d08) this.b.get(i)).c == ((d08) this.c.get(i2)).c;
            default:
                cbc cbcVar = (cbc) ue3.J(i, this.b);
                Long lValueOf = cbcVar != null ? Long.valueOf(cbcVar.a) : null;
                cbc cbcVar2 = (cbc) ue3.J(i2, this.c);
                return fni.a(lValueOf, cbcVar2 != null ? Long.valueOf(cbcVar2.a) : null);
        }
    }

    @Override // defpackage.e9j
    public final int e() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // defpackage.e9j
    public final int f() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
