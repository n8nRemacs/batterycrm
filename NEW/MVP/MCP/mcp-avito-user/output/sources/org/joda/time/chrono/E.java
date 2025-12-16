package org.joda.time.chrono;

import androidx.compose.runtime.C22026a;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: ZonedChronology.java */
/* loaded from: classes7.dex */
public final class E extends AbstractC44857a {
    private static final long serialVersionUID = -1079258847191166848L;

    /* compiled from: ZonedChronology.java */
    public static final class a extends org.joda.time.field.c {

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC44864f f420486c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC44868j f420487d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC44871m f420488e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f420489f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC44871m f420490g;

        /* renamed from: h, reason: collision with root package name */
        public final AbstractC44871m f420491h;

        public a(AbstractC44864f abstractC44864f, AbstractC44868j abstractC44868j, AbstractC44871m abstractC44871m, AbstractC44871m abstractC44871m2, AbstractC44871m abstractC44871m3) {
            super(abstractC44864f.y());
            if (!abstractC44864f.B()) {
                throw new IllegalArgumentException();
            }
            this.f420486c = abstractC44864f;
            this.f420487d = abstractC44868j;
            this.f420488e = abstractC44871m;
            this.f420489f = abstractC44871m != null && abstractC44871m.d() < 43200000;
            this.f420490g = abstractC44871m2;
            this.f420491h = abstractC44871m3;
        }

        @Override // org.joda.time.AbstractC44864f
        public final boolean A() {
            return this.f420486c.A();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long C(long j12) {
            return this.f420486c.C(this.f420487d.b(j12));
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long E(long j12) {
            boolean z12 = this.f420489f;
            AbstractC44864f abstractC44864f = this.f420486c;
            if (z12) {
                long jK2 = K(j12);
                return abstractC44864f.E(j12 + jK2) - jK2;
            }
            AbstractC44868j abstractC44868j = this.f420487d;
            return abstractC44868j.a(abstractC44864f.E(abstractC44868j.b(j12)), j12);
        }

        @Override // org.joda.time.AbstractC44864f
        public final long F(long j12) {
            boolean z12 = this.f420489f;
            AbstractC44864f abstractC44864f = this.f420486c;
            if (z12) {
                long jK2 = K(j12);
                return abstractC44864f.F(j12 + jK2) - jK2;
            }
            AbstractC44868j abstractC44868j = this.f420487d;
            return abstractC44868j.a(abstractC44864f.F(abstractC44868j.b(j12)), j12);
        }

        @Override // org.joda.time.AbstractC44864f
        public final long G(int i12, long j12) {
            AbstractC44868j abstractC44868j = this.f420487d;
            long jB2 = abstractC44868j.b(j12);
            AbstractC44864f abstractC44864f = this.f420486c;
            long jG2 = abstractC44864f.G(i12, jB2);
            long jA2 = abstractC44868j.a(jG2, j12);
            if (c(jA2) == i12) {
                return jA2;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(jG2, abstractC44868j.f420915b);
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(abstractC44864f.y(), Integer.valueOf(i12), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long H(long j12, String str, Locale locale) {
            AbstractC44868j abstractC44868j = this.f420487d;
            return abstractC44868j.a(this.f420486c.H(abstractC44868j.b(j12), str, locale), j12);
        }

        public final int K(long j12) {
            int i12 = this.f420487d.i(j12);
            long j13 = i12;
            if (((j12 + j13) ^ j12) >= 0 || (j12 ^ j13) < 0) {
                return i12;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long a(int i12, long j12) {
            boolean z12 = this.f420489f;
            AbstractC44864f abstractC44864f = this.f420486c;
            if (z12) {
                long jK2 = K(j12);
                return abstractC44864f.a(i12, j12 + jK2) - jK2;
            }
            AbstractC44868j abstractC44868j = this.f420487d;
            return abstractC44868j.a(abstractC44864f.a(i12, abstractC44868j.b(j12)), j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long b(long j12, long j13) {
            boolean z12 = this.f420489f;
            AbstractC44864f abstractC44864f = this.f420486c;
            if (z12) {
                long jK2 = K(j12);
                return abstractC44864f.b(j12 + jK2, j13) - jK2;
            }
            AbstractC44868j abstractC44868j = this.f420487d;
            return abstractC44868j.a(abstractC44864f.b(abstractC44868j.b(j12), j13), j12);
        }

        @Override // org.joda.time.AbstractC44864f
        public final int c(long j12) {
            return this.f420486c.c(this.f420487d.b(j12));
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String d(int i12, Locale locale) {
            return this.f420486c.d(i12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String e(long j12, Locale locale) {
            return this.f420486c.e(this.f420487d.b(j12), locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f420486c.equals(aVar.f420486c) && this.f420487d.equals(aVar.f420487d) && this.f420488e.equals(aVar.f420488e) && this.f420490g.equals(aVar.f420490g);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String g(int i12, Locale locale) {
            return this.f420486c.g(i12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String h(long j12, Locale locale) {
            return this.f420486c.h(this.f420487d.b(j12), locale);
        }

        public final int hashCode() {
            return this.f420486c.hashCode() ^ this.f420487d.hashCode();
        }

        @Override // org.joda.time.AbstractC44864f
        public final AbstractC44871m k() {
            return this.f420488e;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final AbstractC44871m l() {
            return this.f420491h;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int m(Locale locale) {
            return this.f420486c.m(locale);
        }

        @Override // org.joda.time.AbstractC44864f
        public final int n() {
            return this.f420486c.n();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int o(long j12) {
            return this.f420486c.o(this.f420487d.b(j12));
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int p(org.joda.time.base.k kVar) {
            return this.f420486c.p(kVar);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int q(org.joda.time.base.k kVar, int[] iArr) {
            return this.f420486c.q(kVar, iArr);
        }

        @Override // org.joda.time.AbstractC44864f
        public final int s() {
            return this.f420486c.s();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int t(long j12) {
            return this.f420486c.t(this.f420487d.b(j12));
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int u(org.joda.time.base.k kVar) {
            return this.f420486c.u(kVar);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int v(org.joda.time.base.k kVar, int[] iArr) {
            return this.f420486c.v(kVar, iArr);
        }

        @Override // org.joda.time.AbstractC44864f
        public final AbstractC44871m x() {
            return this.f420490g;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final boolean z(long j12) {
            return this.f420486c.z(this.f420487d.b(j12));
        }
    }

    /* compiled from: ZonedChronology.java */
    public static class b extends org.joda.time.field.d {
        private static final long serialVersionUID = -485345310999208286L;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC44871m f420492c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f420493d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC44868j f420494e;

        public b(AbstractC44871m abstractC44871m, AbstractC44868j abstractC44868j) {
            super(abstractC44871m.c());
            if (!abstractC44871m.f()) {
                throw new IllegalArgumentException();
            }
            this.f420492c = abstractC44871m;
            this.f420493d = abstractC44871m.d() < 43200000;
            this.f420494e = abstractC44868j;
        }

        @Override // org.joda.time.AbstractC44871m
        public final long a(int i12, long j12) {
            int i13 = i(j12);
            long jA2 = this.f420492c.a(i12, j12 + i13);
            if (!this.f420493d) {
                i13 = h(jA2);
            }
            return jA2 - i13;
        }

        @Override // org.joda.time.AbstractC44871m
        public final long b(long j12, long j13) {
            int i12 = i(j12);
            long jB2 = this.f420492c.b(j12 + i12, j13);
            if (!this.f420493d) {
                i12 = h(jB2);
            }
            return jB2 - i12;
        }

        @Override // org.joda.time.AbstractC44871m
        public final long d() {
            return this.f420492c.d();
        }

        @Override // org.joda.time.AbstractC44871m
        public final boolean e() {
            boolean z12 = this.f420493d;
            AbstractC44871m abstractC44871m = this.f420492c;
            return z12 ? abstractC44871m.e() : abstractC44871m.e() && this.f420494e.n();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f420492c.equals(bVar.f420492c) && this.f420494e.equals(bVar.f420494e);
        }

        public final int h(long j12) {
            int iK2 = this.f420494e.k(j12);
            long j13 = iK2;
            if (((j12 - j13) ^ j12) >= 0 || (j12 ^ j13) >= 0) {
                return iK2;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public final int hashCode() {
            return this.f420492c.hashCode() ^ this.f420494e.hashCode();
        }

        public final int i(long j12) {
            int i12 = this.f420494e.i(j12);
            long j13 = i12;
            if (((j12 + j13) ^ j12) >= 0 || (j12 ^ j13) < 0) {
                return i12;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
    }

    public static E X(AbstractC44857a abstractC44857a, AbstractC44868j abstractC44868j) {
        if (abstractC44857a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        AbstractC44854a abstractC44854aN = abstractC44857a.N();
        if (abstractC44854aN == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (abstractC44868j != null) {
            return new E(abstractC44854aN, abstractC44868j);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return this.f420508b;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        if (abstractC44868j == this.f420509c) {
            return this;
        }
        AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44868j == abstractC44868j2 ? abstractC44854a : new E(abstractC44854a, abstractC44868j);
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        HashMap<Object, Object> map = new HashMap<>();
        c12206a.f420553l = W(c12206a.f420553l, map);
        c12206a.f420552k = W(c12206a.f420552k, map);
        c12206a.f420551j = W(c12206a.f420551j, map);
        c12206a.f420550i = W(c12206a.f420550i, map);
        c12206a.f420549h = W(c12206a.f420549h, map);
        c12206a.f420548g = W(c12206a.f420548g, map);
        c12206a.f420547f = W(c12206a.f420547f, map);
        c12206a.f420546e = W(c12206a.f420546e, map);
        c12206a.f420545d = W(c12206a.f420545d, map);
        c12206a.f420544c = W(c12206a.f420544c, map);
        c12206a.f420543b = W(c12206a.f420543b, map);
        c12206a.f420542a = W(c12206a.f420542a, map);
        c12206a.f420537E = V(c12206a.f420537E, map);
        c12206a.f420538F = V(c12206a.f420538F, map);
        c12206a.f420539G = V(c12206a.f420539G, map);
        c12206a.f420540H = V(c12206a.f420540H, map);
        c12206a.f420541I = V(c12206a.f420541I, map);
        c12206a.f420565x = V(c12206a.f420565x, map);
        c12206a.f420566y = V(c12206a.f420566y, map);
        c12206a.f420567z = V(c12206a.f420567z, map);
        c12206a.f420536D = V(c12206a.f420536D, map);
        c12206a.f420533A = V(c12206a.f420533A, map);
        c12206a.f420534B = V(c12206a.f420534B, map);
        c12206a.f420535C = V(c12206a.f420535C, map);
        c12206a.f420554m = V(c12206a.f420554m, map);
        c12206a.f420555n = V(c12206a.f420555n, map);
        c12206a.f420556o = V(c12206a.f420556o, map);
        c12206a.f420557p = V(c12206a.f420557p, map);
        c12206a.f420558q = V(c12206a.f420558q, map);
        c12206a.f420559r = V(c12206a.f420559r, map);
        c12206a.f420560s = V(c12206a.f420560s, map);
        c12206a.f420562u = V(c12206a.f420562u, map);
        c12206a.f420561t = V(c12206a.f420561t, map);
        c12206a.f420563v = V(c12206a.f420563v, map);
        c12206a.f420564w = V(c12206a.f420564w, map);
    }

    public final AbstractC44864f V(AbstractC44864f abstractC44864f, HashMap<Object, Object> map) {
        if (abstractC44864f == null || !abstractC44864f.B()) {
            return abstractC44864f;
        }
        if (map.containsKey(abstractC44864f)) {
            return (AbstractC44864f) map.get(abstractC44864f);
        }
        a aVar = new a(abstractC44864f, (AbstractC44868j) this.f420509c, W(abstractC44864f.k(), map), W(abstractC44864f.x(), map), W(abstractC44864f.l(), map));
        map.put(abstractC44864f, aVar);
        return aVar;
    }

    public final AbstractC44871m W(AbstractC44871m abstractC44871m, HashMap<Object, Object> map) {
        if (abstractC44871m == null || !abstractC44871m.f()) {
            return abstractC44871m;
        }
        if (map.containsKey(abstractC44871m)) {
            return (AbstractC44871m) map.get(abstractC44871m);
        }
        b bVar = new b(abstractC44871m, (AbstractC44868j) this.f420509c);
        map.put(abstractC44871m, bVar);
        return bVar;
    }

    public final long Y(long j12) {
        if (j12 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j12 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        AbstractC44868j abstractC44868j = (AbstractC44868j) this.f420509c;
        int iK2 = abstractC44868j.k(j12);
        long j13 = j12 - iK2;
        if (j12 > 604800000 && j13 < 0) {
            return Long.MAX_VALUE;
        }
        if (j12 < -604800000 && j13 > 0) {
            return Long.MIN_VALUE;
        }
        if (iK2 == abstractC44868j.i(j13)) {
            return j13;
        }
        throw new IllegalInstantException(j12, abstractC44868j.f420915b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e12 = (E) obj;
        return this.f420508b.equals(e12.f420508b) && ((AbstractC44868j) this.f420509c).equals((AbstractC44868j) e12.f420509c);
    }

    public final int hashCode() {
        return (this.f420508b.hashCode() * 7) + (((AbstractC44868j) this.f420509c).hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long l(int i12, int i13, int i14, int i15) {
        return Y(this.f420508b.l(i12, i13, i14, i15));
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long m(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        return Y(this.f420508b.m(i12, i13, i14, i15, i16, i17, i18));
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long n(long j12) {
        return Y(this.f420508b.n(j12 + ((AbstractC44868j) this.f420509c).i(j12)));
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.AbstractC44854a
    public final AbstractC44868j o() {
        return (AbstractC44868j) this.f420509c;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZonedChronology[");
        sb2.append(this.f420508b);
        sb2.append(", ");
        return C22026a.c(sb2, ((AbstractC44868j) this.f420509c).f420915b, ']');
    }
}
