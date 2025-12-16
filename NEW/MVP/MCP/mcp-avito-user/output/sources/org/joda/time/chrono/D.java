package org.joda.time.chrono;

import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: StrictChronology.java */
/* loaded from: classes7.dex */
public final class D extends AbstractC44857a {
    private static final long serialVersionUID = 6633006628097111960L;

    /* renamed from: N, reason: collision with root package name */
    public transient D f420485N;

    public static final AbstractC44864f V(AbstractC44864f abstractC44864f) {
        if (abstractC44864f == null) {
            return null;
        }
        if (abstractC44864f instanceof org.joda.time.field.l) {
            abstractC44864f = ((org.joda.time.field.l) abstractC44864f).f420693b;
        }
        return !abstractC44864f.A() ? abstractC44864f : new org.joda.time.field.v(abstractC44864f, null, null);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        if (this.f420485N == null) {
            if (o() == AbstractC44868j.f420911c) {
                this.f420485N = this;
            } else {
                AbstractC44854a abstractC44854aN = this.f420508b.N();
                if (abstractC44854aN == null) {
                    throw new IllegalArgumentException("Must supply a chronology");
                }
                this.f420485N = new D(abstractC44854aN, null);
            }
        }
        return this.f420485N;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        if (abstractC44868j == AbstractC44868j.f420911c) {
            return N();
        }
        if (abstractC44868j == o()) {
            return this;
        }
        AbstractC44854a abstractC44854aO = this.f420508b.O(abstractC44868j);
        if (abstractC44854aO != null) {
            return new D(abstractC44854aO, null);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        c12206a.f420537E = V(c12206a.f420537E);
        c12206a.f420538F = V(c12206a.f420538F);
        c12206a.f420539G = V(c12206a.f420539G);
        c12206a.f420540H = V(c12206a.f420540H);
        c12206a.f420541I = V(c12206a.f420541I);
        c12206a.f420565x = V(c12206a.f420565x);
        c12206a.f420566y = V(c12206a.f420566y);
        c12206a.f420567z = V(c12206a.f420567z);
        c12206a.f420536D = V(c12206a.f420536D);
        c12206a.f420533A = V(c12206a.f420533A);
        c12206a.f420534B = V(c12206a.f420534B);
        c12206a.f420535C = V(c12206a.f420535C);
        c12206a.f420554m = V(c12206a.f420554m);
        c12206a.f420555n = V(c12206a.f420555n);
        c12206a.f420556o = V(c12206a.f420556o);
        c12206a.f420557p = V(c12206a.f420557p);
        c12206a.f420558q = V(c12206a.f420558q);
        c12206a.f420559r = V(c12206a.f420559r);
        c12206a.f420560s = V(c12206a.f420560s);
        c12206a.f420562u = V(c12206a.f420562u);
        c12206a.f420561t = V(c12206a.f420561t);
        c12206a.f420563v = V(c12206a.f420563v);
        c12206a.f420564w = V(c12206a.f420564w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        return this.f420508b.equals(((D) obj).f420508b);
    }

    public final int hashCode() {
        return (this.f420508b.hashCode() * 7) + 352831696;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        return "StrictChronology[" + this.f420508b.toString() + ']';
    }
}
