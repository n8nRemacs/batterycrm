package org.joda.time.chrono;

import androidx.compose.runtime.C22026a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.C44856c;
import org.joda.time.C44866h;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: LimitChronology.java */
/* loaded from: classes7.dex */
public final class C extends AbstractC44857a {
    private static final long serialVersionUID = 7670866536893052522L;

    /* renamed from: N, reason: collision with root package name */
    public final C44856c f420475N;

    /* renamed from: O, reason: collision with root package name */
    public final C44856c f420476O;

    /* renamed from: P, reason: collision with root package name */
    public transient C f420477P;

    /* compiled from: LimitChronology.java */
    public class a extends org.joda.time.field.e {

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC44871m f420478d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC44871m f420479e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC44871m f420480f;

        public a(AbstractC44864f abstractC44864f, AbstractC44871m abstractC44871m, AbstractC44871m abstractC44871m2, AbstractC44871m abstractC44871m3) {
            super(abstractC44864f, abstractC44864f.y());
            this.f420478d = abstractC44871m;
            this.f420479e = abstractC44871m2;
            this.f420480f = abstractC44871m3;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long C(long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jC2 = this.f420691c.C(j12);
            c12.V(jC2, "resulting");
            return jC2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long E(long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jE2 = this.f420691c.E(j12);
            c12.V(jE2, "resulting");
            return jE2;
        }

        @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
        public final long F(long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jF2 = this.f420691c.F(j12);
            c12.V(jF2, "resulting");
            return jF2;
        }

        @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
        public final long G(int i12, long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jG2 = this.f420691c.G(i12, j12);
            c12.V(jG2, "resulting");
            return jG2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long H(long j12, String str, Locale locale) {
            C c12 = C.this;
            c12.V(j12, null);
            long jH2 = this.f420691c.H(j12, str, locale);
            c12.V(jH2, "resulting");
            return jH2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long a(int i12, long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jA2 = this.f420691c.a(i12, j12);
            c12.V(jA2, "resulting");
            return jA2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long b(long j12, long j13) {
            C c12 = C.this;
            c12.V(j12, null);
            long jB2 = this.f420691c.b(j12, j13);
            c12.V(jB2, "resulting");
            return jB2;
        }

        @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
        public final int c(long j12) {
            C.this.V(j12, null);
            return this.f420691c.c(j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String e(long j12, Locale locale) {
            C.this.V(j12, null);
            return this.f420691c.e(j12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String h(long j12, Locale locale) {
            C.this.V(j12, null);
            return this.f420691c.h(j12, locale);
        }

        @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
        public final AbstractC44871m k() {
            return this.f420478d;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final AbstractC44871m l() {
            return this.f420480f;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int m(Locale locale) {
            return this.f420691c.m(locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int o(long j12) {
            C.this.V(j12, null);
            return this.f420691c.o(j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int t(long j12) {
            C.this.V(j12, null);
            return this.f420691c.t(j12);
        }

        @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
        public final AbstractC44871m x() {
            return this.f420479e;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final boolean z(long j12) {
            C.this.V(j12, null);
            return this.f420691c.z(j12);
        }
    }

    /* compiled from: LimitChronology.java */
    public class b extends org.joda.time.field.f {
        private static final long serialVersionUID = 8049297699408782284L;

        public b(AbstractC44871m abstractC44871m) {
            super(abstractC44871m, abstractC44871m.c());
        }

        @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
        public final long a(int i12, long j12) {
            C c12 = C.this;
            c12.V(j12, null);
            long jA2 = this.f420692c.a(i12, j12);
            c12.V(jA2, "resulting");
            return jA2;
        }

        @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
        public final long b(long j12, long j13) {
            C c12 = C.this;
            c12.V(j12, null);
            long jB2 = this.f420692c.b(j12, j13);
            c12.V(jB2, "resulting");
            return jB2;
        }
    }

    /* compiled from: LimitChronology.java */
    public class c extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f420483b;

        public c(String str, boolean z12) {
            super(str);
            this.f420483b = z12;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            org.joda.time.format.b bVarF = org.joda.time.format.j.e().f(C.this.f420508b);
            try {
                if (this.f420483b) {
                    stringBuffer.append("below the supported minimum of ");
                    bVarF.e(stringBuffer, C.this.f420475N.f420462b, null);
                } else {
                    stringBuffer.append("above the supported maximum of ");
                    bVarF.e(stringBuffer, C.this.f420476O.f420462b, null);
                }
            } catch (IOException unused) {
            }
            stringBuffer.append(" (");
            stringBuffer.append(C.this.f420508b);
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    public C(AbstractC44854a abstractC44854a, C44856c c44856c, C44856c c44856c2) {
        super(abstractC44854a, null);
        this.f420475N = c44856c;
        this.f420476O = c44856c2;
    }

    public static C Y(AbstractC44854a abstractC44854a, C44856c c44856c, C44856c c44856c2) {
        if (abstractC44854a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        if (c44856c == null) {
            c44856c = null;
        }
        if (c44856c2 == null) {
            c44856c2 = null;
        }
        if (c44856c != null && c44856c2 != null) {
            C44866h.b bVar = C44866h.f420908a;
            if (c44856c.f420462b >= c44856c2.getMillis()) {
                throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
            }
        }
        return new C(abstractC44854a, c44856c, c44856c2);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return O(AbstractC44868j.f420911c);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        C c12;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        if (abstractC44868j == o()) {
            return this;
        }
        AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
        if (abstractC44868j == abstractC44868j2 && (c12 = this.f420477P) != null) {
            return c12;
        }
        C44856c c44856cA = this.f420475N;
        if (c44856cA != null) {
            org.joda.time.y yVar = new org.joda.time.y(c44856cA.f420462b, c44856cA.y().o());
            yVar.i(abstractC44868j);
            c44856cA = yVar.a();
        }
        C44856c c44856cA2 = this.f420476O;
        if (c44856cA2 != null) {
            org.joda.time.y yVar2 = new org.joda.time.y(c44856cA2.f420462b, c44856cA2.y().o());
            yVar2.i(abstractC44868j);
            c44856cA2 = yVar2.a();
        }
        C cY2 = Y(this.f420508b.O(abstractC44868j), c44856cA, c44856cA2);
        if (abstractC44868j == abstractC44868j2) {
            this.f420477P = cY2;
        }
        return cY2;
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        HashMap<Object, Object> map = new HashMap<>();
        c12206a.f420553l = X(c12206a.f420553l, map);
        c12206a.f420552k = X(c12206a.f420552k, map);
        c12206a.f420551j = X(c12206a.f420551j, map);
        c12206a.f420550i = X(c12206a.f420550i, map);
        c12206a.f420549h = X(c12206a.f420549h, map);
        c12206a.f420548g = X(c12206a.f420548g, map);
        c12206a.f420547f = X(c12206a.f420547f, map);
        c12206a.f420546e = X(c12206a.f420546e, map);
        c12206a.f420545d = X(c12206a.f420545d, map);
        c12206a.f420544c = X(c12206a.f420544c, map);
        c12206a.f420543b = X(c12206a.f420543b, map);
        c12206a.f420542a = X(c12206a.f420542a, map);
        c12206a.f420537E = W(c12206a.f420537E, map);
        c12206a.f420538F = W(c12206a.f420538F, map);
        c12206a.f420539G = W(c12206a.f420539G, map);
        c12206a.f420540H = W(c12206a.f420540H, map);
        c12206a.f420541I = W(c12206a.f420541I, map);
        c12206a.f420565x = W(c12206a.f420565x, map);
        c12206a.f420566y = W(c12206a.f420566y, map);
        c12206a.f420567z = W(c12206a.f420567z, map);
        c12206a.f420536D = W(c12206a.f420536D, map);
        c12206a.f420533A = W(c12206a.f420533A, map);
        c12206a.f420534B = W(c12206a.f420534B, map);
        c12206a.f420535C = W(c12206a.f420535C, map);
        c12206a.f420554m = W(c12206a.f420554m, map);
        c12206a.f420555n = W(c12206a.f420555n, map);
        c12206a.f420556o = W(c12206a.f420556o, map);
        c12206a.f420557p = W(c12206a.f420557p, map);
        c12206a.f420558q = W(c12206a.f420558q, map);
        c12206a.f420559r = W(c12206a.f420559r, map);
        c12206a.f420560s = W(c12206a.f420560s, map);
        c12206a.f420562u = W(c12206a.f420562u, map);
        c12206a.f420561t = W(c12206a.f420561t, map);
        c12206a.f420563v = W(c12206a.f420563v, map);
        c12206a.f420564w = W(c12206a.f420564w, map);
    }

    public final void V(long j12, String str) {
        C44856c c44856c = this.f420475N;
        if (c44856c != null && j12 < c44856c.f420462b) {
            throw new c(str, true);
        }
        C44856c c44856c2 = this.f420476O;
        if (c44856c2 != null && j12 >= c44856c2.f420462b) {
            throw new c(str, false);
        }
    }

    public final AbstractC44864f W(AbstractC44864f abstractC44864f, HashMap<Object, Object> map) {
        if (abstractC44864f == null || !abstractC44864f.B()) {
            return abstractC44864f;
        }
        if (map.containsKey(abstractC44864f)) {
            return (AbstractC44864f) map.get(abstractC44864f);
        }
        a aVar = new a(abstractC44864f, X(abstractC44864f.k(), map), X(abstractC44864f.x(), map), X(abstractC44864f.l(), map));
        map.put(abstractC44864f, aVar);
        return aVar;
    }

    public final AbstractC44871m X(AbstractC44871m abstractC44871m, HashMap<Object, Object> map) {
        if (abstractC44871m == null || !abstractC44871m.f()) {
            return abstractC44871m;
        }
        if (map.containsKey(abstractC44871m)) {
            return (AbstractC44871m) map.get(abstractC44871m);
        }
        b bVar = new b(abstractC44871m);
        map.put(abstractC44871m, bVar);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f420508b.equals(c12.f420508b) && org.joda.time.field.j.a(this.f420475N, c12.f420475N) && org.joda.time.field.j.a(this.f420476O, c12.f420476O);
    }

    public final int hashCode() {
        C44856c c44856c = this.f420475N;
        int iHashCode = (c44856c != null ? c44856c.hashCode() : 0) + 317351877;
        C44856c c44856c2 = this.f420476O;
        return (this.f420508b.hashCode() * 7) + iHashCode + (c44856c2 != null ? c44856c2.hashCode() : 0);
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long l(int i12, int i13, int i14, int i15) {
        long jL2 = this.f420508b.l(i12, i13, i14, i15);
        V(jL2, "resulting");
        return jL2;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long m(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        long jM2 = this.f420508b.m(i12, i13, i14, i15, i16, i17, i18);
        V(jM2, "resulting");
        return jM2;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long n(long j12) {
        V(j12, null);
        long jN2 = this.f420508b.n(j12);
        V(jN2, "resulting");
        return jN2;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LimitChronology[");
        sb2.append(this.f420508b.toString());
        sb2.append(", ");
        C44856c c44856c = this.f420475N;
        sb2.append(c44856c == null ? "NoLimit" : c44856c.toString());
        sb2.append(", ");
        C44856c c44856c2 = this.f420476O;
        return C22026a.c(sb2, c44856c2 != null ? c44856c2.toString() : "NoLimit", ']');
    }
}
