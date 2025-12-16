package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class u98 implements ree {
    public final ree a;

    public u98(ree reeVar) {
        this.a = reeVar;
    }

    @Override // defpackage.ree
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ree
    public final int d(String str) {
        Integer numH = cnf.h(str);
        if (numH != null) {
            return numH.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // defpackage.ree
    public final s9j e() {
        return nnf.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u98)) {
            return false;
        }
        u98 u98Var = (u98) obj;
        return fni.a(this.a, u98Var.a) && fni.a(a(), u98Var.a());
    }

    @Override // defpackage.ree
    public final int f() {
        return 1;
    }

    @Override // defpackage.ree
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return hd5.a;
    }

    @Override // defpackage.ree
    public final List h(int i) {
        if (i >= 0) {
            return hd5.a;
        }
        StringBuilder sbM = ho7.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbM = ho7.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    @Override // defpackage.ree
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM = ho7.m(i, "Illegal index ", ", ");
        sbM.append(a());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
