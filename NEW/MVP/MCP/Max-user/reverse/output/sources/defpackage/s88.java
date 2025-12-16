package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class s88 implements ree {
    public final String a;
    public final ree b;
    public final ree c;

    public s88(String str, ree reeVar, ree reeVar2) {
        this.a = str;
        this.b = reeVar;
        this.c = reeVar2;
    }

    @Override // defpackage.ree
    public final String a() {
        return this.a;
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.ree
    public final s9j e() {
        return nnf.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s88)) {
            return false;
        }
        s88 s88Var = (s88) obj;
        return fni.a(this.a, s88Var.a) && fni.a(this.b, s88Var.b) && fni.a(this.c, s88Var.c);
    }

    @Override // defpackage.ree
    public final int f() {
        return 2;
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
        throw new IllegalArgumentException(ho7.l(ho7.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.l(ho7.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached");
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
        throw new IllegalArgumentException(ho7.l(ho7.m(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
