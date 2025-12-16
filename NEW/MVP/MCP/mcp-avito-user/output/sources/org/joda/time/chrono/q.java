package org.joda.time.chrono;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.C44866h;
import org.joda.time.C44874p;
import org.joda.time.C44876s;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.K;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: GJChronology.java */
/* loaded from: classes7.dex */
public final class q extends AbstractC44857a {

    /* renamed from: S, reason: collision with root package name */
    public static final C44874p f420615S = new C44874p(-12219292800000L);

    /* renamed from: T, reason: collision with root package name */
    public static final ConcurrentHashMap<p, q> f420616T = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;

    /* renamed from: N, reason: collision with root package name */
    public A f420617N;

    /* renamed from: O, reason: collision with root package name */
    public w f420618O;

    /* renamed from: P, reason: collision with root package name */
    public C44874p f420619P;

    /* renamed from: Q, reason: collision with root package name */
    public long f420620Q;

    /* renamed from: R, reason: collision with root package name */
    public long f420621R;

    /* compiled from: GJChronology.java */
    public class a extends org.joda.time.field.c {

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC44864f f420622c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC44864f f420623d;

        /* renamed from: e, reason: collision with root package name */
        public final long f420624e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f420625f;

        /* renamed from: g, reason: collision with root package name */
        public AbstractC44871m f420626g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC44871m f420627h;

        public a(q qVar, AbstractC44864f abstractC44864f, AbstractC44864f abstractC44864f2, long j12) {
            this(abstractC44864f, abstractC44864f2, null, j12, false);
        }

        @Override // org.joda.time.AbstractC44864f
        public final boolean A() {
            return false;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long E(long j12) {
            long j13 = this.f420624e;
            if (j12 >= j13) {
                return this.f420623d.E(j12);
            }
            long jE2 = this.f420622c.E(j12);
            return (jE2 < j13 || jE2 - q.this.f420621R < j13) ? jE2 : L(jE2);
        }

        @Override // org.joda.time.AbstractC44864f
        public final long F(long j12) {
            long j13 = this.f420624e;
            if (j12 < j13) {
                return this.f420622c.F(j12);
            }
            long jF2 = this.f420623d.F(j12);
            return (jF2 >= j13 || q.this.f420621R + jF2 >= j13) ? jF2 : K(jF2);
        }

        @Override // org.joda.time.AbstractC44864f
        public final long G(int i12, long j12) {
            long jG2;
            long j13 = this.f420624e;
            q qVar = q.this;
            if (j12 >= j13) {
                AbstractC44864f abstractC44864f = this.f420623d;
                jG2 = abstractC44864f.G(i12, j12);
                if (jG2 < j13) {
                    if (qVar.f420621R + jG2 < j13) {
                        jG2 = K(jG2);
                    }
                    if (c(jG2) != i12) {
                        throw new IllegalFieldValueException(abstractC44864f.y(), Integer.valueOf(i12), null, null);
                    }
                }
            } else {
                AbstractC44864f abstractC44864f2 = this.f420622c;
                jG2 = abstractC44864f2.G(i12, j12);
                if (jG2 >= j13) {
                    if (jG2 - qVar.f420621R >= j13) {
                        jG2 = L(jG2);
                    }
                    if (c(jG2) != i12) {
                        throw new IllegalFieldValueException(abstractC44864f2.y(), Integer.valueOf(i12), null, null);
                    }
                }
            }
            return jG2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long H(long j12, String str, Locale locale) {
            long j13 = this.f420624e;
            q qVar = q.this;
            if (j12 >= j13) {
                long jH2 = this.f420623d.H(j12, str, locale);
                return (jH2 >= j13 || qVar.f420621R + jH2 >= j13) ? jH2 : K(jH2);
            }
            long jH3 = this.f420622c.H(j12, str, locale);
            return (jH3 < j13 || jH3 - qVar.f420621R < j13) ? jH3 : L(jH3);
        }

        public final long K(long j12) {
            boolean z12 = this.f420625f;
            q qVar = q.this;
            return z12 ? q.V(j12, qVar.f420618O, qVar.f420617N) : q.W(j12, qVar.f420618O, qVar.f420617N);
        }

        public final long L(long j12) {
            boolean z12 = this.f420625f;
            q qVar = q.this;
            return z12 ? q.V(j12, qVar.f420617N, qVar.f420618O) : q.W(j12, qVar.f420617N, qVar.f420618O);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public long a(int i12, long j12) {
            return this.f420623d.a(i12, j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public long b(long j12, long j13) {
            return this.f420623d.b(j12, j13);
        }

        @Override // org.joda.time.AbstractC44864f
        public final int c(long j12) {
            return j12 >= this.f420624e ? this.f420623d.c(j12) : this.f420622c.c(j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String d(int i12, Locale locale) {
            return this.f420623d.d(i12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String e(long j12, Locale locale) {
            return j12 >= this.f420624e ? this.f420623d.e(j12, locale) : this.f420622c.e(j12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String g(int i12, Locale locale) {
            return this.f420623d.g(i12, locale);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String h(long j12, Locale locale) {
            return j12 >= this.f420624e ? this.f420623d.h(j12, locale) : this.f420622c.h(j12, locale);
        }

        @Override // org.joda.time.AbstractC44864f
        public final AbstractC44871m k() {
            return this.f420626g;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final AbstractC44871m l() {
            return this.f420623d.l();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int m(Locale locale) {
            return Math.max(this.f420622c.m(locale), this.f420623d.m(locale));
        }

        @Override // org.joda.time.AbstractC44864f
        public final int n() {
            return this.f420623d.n();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public int o(long j12) {
            long j13 = this.f420624e;
            if (j12 >= j13) {
                return this.f420623d.o(j12);
            }
            AbstractC44864f abstractC44864f = this.f420622c;
            int iO2 = abstractC44864f.o(j12);
            return abstractC44864f.G(iO2, j12) >= j13 ? abstractC44864f.c(abstractC44864f.a(-1, j13)) : iO2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int p(org.joda.time.base.k kVar) {
            C44874p c44874p = q.f420615S;
            return o(q.X(AbstractC44868j.f420911c, q.f420615S, 4).G(kVar));
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int q(org.joda.time.base.k kVar, int[] iArr) throws ClassNotFoundException {
            C44874p c44874p = q.f420615S;
            q qVarX = q.X(AbstractC44868j.f420911c, q.f420615S, 4);
            int size = kVar.size();
            long jG2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC44864f abstractC44864fB = kVar.I(i12).b(qVarX);
                if (iArr[i12] <= abstractC44864fB.o(jG2)) {
                    jG2 = abstractC44864fB.G(iArr[i12], jG2);
                }
            }
            return o(jG2);
        }

        @Override // org.joda.time.AbstractC44864f
        public final int s() {
            return this.f420622c.s();
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public int t(long j12) {
            long j13 = this.f420624e;
            if (j12 < j13) {
                return this.f420622c.t(j12);
            }
            AbstractC44864f abstractC44864f = this.f420623d;
            int iT2 = abstractC44864f.t(j12);
            return abstractC44864f.G(iT2, j12) < j13 ? abstractC44864f.c(j13) : iT2;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int u(org.joda.time.base.k kVar) {
            return this.f420622c.u(kVar);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int v(org.joda.time.base.k kVar, int[] iArr) {
            return this.f420622c.v(kVar, iArr);
        }

        @Override // org.joda.time.AbstractC44864f
        public final AbstractC44871m x() {
            return this.f420627h;
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final boolean z(long j12) {
            return j12 >= this.f420624e ? this.f420623d.z(j12) : this.f420622c.z(j12);
        }

        public a(AbstractC44864f abstractC44864f, AbstractC44864f abstractC44864f2, AbstractC44871m abstractC44871m, long j12, boolean z12) {
            super(abstractC44864f2.y());
            this.f420622c = abstractC44864f;
            this.f420623d = abstractC44864f2;
            this.f420624e = j12;
            this.f420625f = z12;
            this.f420626g = abstractC44864f2.k();
            if (abstractC44871m == null && (abstractC44871m = abstractC44864f2.x()) == null) {
                abstractC44871m = abstractC44864f.x();
            }
            this.f420627h = abstractC44871m;
        }
    }

    /* compiled from: GJChronology.java */
    public final class b extends a {
        public b(q qVar, AbstractC44864f abstractC44864f, AbstractC44864f abstractC44864f2, long j12) {
            this(abstractC44864f, abstractC44864f2, (AbstractC44871m) null, j12, false);
        }

        @Override // org.joda.time.chrono.q.a, org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long a(int i12, long j12) {
            long j13 = this.f420624e;
            q qVar = q.this;
            if (j12 < j13) {
                long jA2 = this.f420622c.a(i12, j12);
                return (jA2 < j13 || jA2 - qVar.f420621R < j13) ? jA2 : L(jA2);
            }
            long jA3 = this.f420623d.a(i12, j12);
            if (jA3 >= j13 || qVar.f420621R + jA3 >= j13) {
                return jA3;
            }
            if (this.f420625f) {
                if (qVar.f420618O.f420499E.c(jA3) <= 0) {
                    jA3 = qVar.f420618O.f420499E.a(-1, jA3);
                }
            } else if (qVar.f420618O.f420502H.c(jA3) <= 0) {
                jA3 = qVar.f420618O.f420502H.a(-1, jA3);
            }
            return K(jA3);
        }

        @Override // org.joda.time.chrono.q.a, org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long b(long j12, long j13) {
            long j14 = this.f420624e;
            q qVar = q.this;
            if (j12 < j14) {
                long jB2 = this.f420622c.b(j12, j13);
                return (jB2 < j14 || jB2 - qVar.f420621R < j14) ? jB2 : L(jB2);
            }
            long jB3 = this.f420623d.b(j12, j13);
            if (jB3 >= j14 || qVar.f420621R + jB3 >= j14) {
                return jB3;
            }
            if (this.f420625f) {
                if (qVar.f420618O.f420499E.c(jB3) <= 0) {
                    jB3 = qVar.f420618O.f420499E.a(-1, jB3);
                }
            } else if (qVar.f420618O.f420502H.c(jB3) <= 0) {
                jB3 = qVar.f420618O.f420502H.a(-1, jB3);
            }
            return K(jB3);
        }

        @Override // org.joda.time.chrono.q.a, org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int o(long j12) {
            return j12 >= this.f420624e ? this.f420623d.o(j12) : this.f420622c.o(j12);
        }

        @Override // org.joda.time.chrono.q.a, org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int t(long j12) {
            return j12 >= this.f420624e ? this.f420623d.t(j12) : this.f420622c.t(j12);
        }

        public b(q qVar, AbstractC44864f abstractC44864f, AbstractC44864f abstractC44864f2, AbstractC44871m abstractC44871m, AbstractC44871m abstractC44871m2, long j12) {
            this(abstractC44864f, abstractC44864f2, abstractC44871m, j12, false);
            this.f420627h = abstractC44871m2;
        }

        public b(AbstractC44864f abstractC44864f, AbstractC44864f abstractC44864f2, AbstractC44871m abstractC44871m, long j12, boolean z12) {
            super(abstractC44864f, abstractC44864f2, null, j12, z12);
            this.f420626g = abstractC44871m == null ? new c(this.f420626g, this) : abstractC44871m;
        }
    }

    /* compiled from: GJChronology.java */
    public static class c extends org.joda.time.field.f {
        private static final long serialVersionUID = 4097975388007713084L;

        /* renamed from: d, reason: collision with root package name */
        public final b f420630d;

        public c(AbstractC44871m abstractC44871m, b bVar) {
            super(abstractC44871m, abstractC44871m.c());
            this.f420630d = bVar;
        }

        @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
        public final long a(int i12, long j12) {
            return this.f420630d.a(i12, j12);
        }

        @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
        public final long b(long j12, long j13) {
            return this.f420630d.b(j12, j13);
        }
    }

    public static long V(long j12, AbstractC44854a abstractC44854a, AbstractC44854a abstractC44854a2) {
        return abstractC44854a2.v().G(abstractC44854a.v().c(j12), abstractC44854a2.f().G(abstractC44854a.f().c(j12), abstractC44854a2.H().G(abstractC44854a.H().c(j12), abstractC44854a2.J().G(abstractC44854a.J().c(j12), 0L))));
    }

    public static long W(long j12, AbstractC44854a abstractC44854a, AbstractC44854a abstractC44854a2) {
        return abstractC44854a2.l(abstractC44854a.P().c(j12), abstractC44854a.A().c(j12), abstractC44854a.e().c(j12), abstractC44854a.v().c(j12));
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Serializable, java.lang.Object[]] */
    public static q X(AbstractC44868j abstractC44868j, K k12, int i12) throws ClassNotFoundException {
        C44874p c44874pP5;
        q qVar;
        C44866h.b bVar = C44866h.f420908a;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        if (k12 == null) {
            c44874pP5 = f420615S;
        } else {
            c44874pP5 = k12.P5();
            C44876s c44876s = new C44876s(c44874pP5.f420954b, w.F0(abstractC44868j, 4));
            if (c44876s.f420957c.P().c(c44876s.f420956b) <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        p pVar = new p(abstractC44868j, c44874pP5, i12);
        ConcurrentHashMap<p, q> concurrentHashMap = f420616T;
        q qVar2 = concurrentHashMap.get(pVar);
        if (qVar2 != null) {
            return qVar2;
        }
        AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
        if (abstractC44868j == abstractC44868j2) {
            qVar = new q(null, new Object[]{A.F0(abstractC44868j, i12), w.F0(abstractC44868j, i12), c44874pP5});
        } else {
            q qVarX = X(abstractC44868j2, c44874pP5, i12);
            qVar = new q(E.X(qVarX, abstractC44868j), new Object[]{qVarX.f420617N, qVarX.f420618O, qVarX.f420619P});
        }
        q qVarPutIfAbsent = concurrentHashMap.putIfAbsent(pVar, qVar);
        return qVarPutIfAbsent != null ? qVarPutIfAbsent : qVar;
    }

    private Object readResolve() {
        return X(o(), this.f420619P, this.f420618O.f420587O);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return O(AbstractC44868j.f420911c);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        return abstractC44868j == o() ? this : X(abstractC44868j, this.f420619P, this.f420618O.f420587O);
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        Object[] objArr = (Object[]) this.f420509c;
        A a12 = (A) objArr[0];
        w wVar = (w) objArr[1];
        C44874p c44874p = (C44874p) objArr[2];
        long j12 = c44874p.f420954b;
        this.f420620Q = j12;
        this.f420617N = a12;
        this.f420618O = wVar;
        this.f420619P = c44874p;
        if (this.f420508b != null) {
            return;
        }
        if (a12.f420587O != wVar.f420587O) {
            throw new IllegalArgumentException();
        }
        this.f420621R = j12 - W(j12, a12, wVar);
        c12206a.a(wVar);
        if (wVar.f420523q.c(this.f420620Q) == 0) {
            c12206a.f420554m = new a(this, a12.f420522p, c12206a.f420554m, this.f420620Q);
            c12206a.f420555n = new a(this, a12.f420523q, c12206a.f420555n, this.f420620Q);
            c12206a.f420556o = new a(this, a12.f420524r, c12206a.f420556o, this.f420620Q);
            c12206a.f420557p = new a(this, a12.f420525s, c12206a.f420557p, this.f420620Q);
            c12206a.f420558q = new a(this, a12.f420526t, c12206a.f420558q, this.f420620Q);
            c12206a.f420559r = new a(this, a12.f420527u, c12206a.f420559r, this.f420620Q);
            c12206a.f420560s = new a(this, a12.f420528v, c12206a.f420560s, this.f420620Q);
            c12206a.f420562u = new a(this, a12.f420530x, c12206a.f420562u, this.f420620Q);
            c12206a.f420561t = new a(this, a12.f420529w, c12206a.f420561t, this.f420620Q);
            c12206a.f420563v = new a(this, a12.f420531y, c12206a.f420563v, this.f420620Q);
            c12206a.f420564w = new a(this, a12.f420532z, c12206a.f420564w, this.f420620Q);
        }
        c12206a.f420541I = new a(this, a12.f420506L, c12206a.f420541I, this.f420620Q);
        b bVar = new b(this, a12.f420502H, c12206a.f420537E, this.f420620Q);
        c12206a.f420537E = bVar;
        AbstractC44871m abstractC44871m = bVar.f420626g;
        c12206a.f420551j = abstractC44871m;
        c12206a.f420538F = new b(a12.f420503I, c12206a.f420538F, abstractC44871m, this.f420620Q, false);
        b bVar2 = new b(this, a12.f420505K, c12206a.f420540H, this.f420620Q);
        c12206a.f420540H = bVar2;
        AbstractC44871m abstractC44871m2 = bVar2.f420626g;
        c12206a.f420552k = abstractC44871m2;
        c12206a.f420539G = new b(this, a12.f420504J, c12206a.f420539G, c12206a.f420551j, abstractC44871m2, this.f420620Q);
        b bVar3 = new b(this, a12.f420501G, c12206a.f420536D, (AbstractC44871m) null, c12206a.f420551j, this.f420620Q);
        c12206a.f420536D = bVar3;
        c12206a.f420550i = bVar3.f420626g;
        b bVar4 = new b(a12.f420499E, c12206a.f420534B, (AbstractC44871m) null, this.f420620Q, true);
        c12206a.f420534B = bVar4;
        AbstractC44871m abstractC44871m3 = bVar4.f420626g;
        c12206a.f420549h = abstractC44871m3;
        c12206a.f420535C = new b(this, a12.f420500F, c12206a.f420535C, abstractC44871m3, c12206a.f420552k, this.f420620Q);
        c12206a.f420567z = new a(a12.f420497C, c12206a.f420567z, c12206a.f420551j, wVar.f420502H.E(this.f420620Q), false);
        c12206a.f420533A = new a(a12.f420498D, c12206a.f420533A, c12206a.f420549h, wVar.f420499E.E(this.f420620Q), true);
        a aVar = new a(this, a12.f420496B, c12206a.f420566y, this.f420620Q);
        aVar.f420627h = c12206a.f420550i;
        c12206a.f420566y = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f420620Q == qVar.f420620Q && this.f420618O.f420587O == qVar.f420618O.f420587O && o().equals(qVar.o());
    }

    public final int hashCode() {
        return this.f420619P.hashCode() + o().hashCode() + 25025 + this.f420618O.f420587O;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long l(int i12, int i13, int i14, int i15) {
        AbstractC44854a abstractC44854a = this.f420508b;
        if (abstractC44854a != null) {
            return abstractC44854a.l(i12, i13, i14, i15);
        }
        long jL2 = this.f420618O.l(i12, i13, i14, i15);
        if (jL2 < this.f420620Q) {
            jL2 = this.f420617N.l(i12, i13, i14, i15);
            if (jL2 >= this.f420620Q) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return jL2;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public final long m(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        long jM2;
        AbstractC44854a abstractC44854a = this.f420508b;
        if (abstractC44854a != null) {
            return abstractC44854a.m(i12, i13, i14, i15, i16, i17, i18);
        }
        try {
            jM2 = this.f420618O.m(i12, i13, i14, i15, i16, i17, i18);
        } catch (IllegalFieldValueException e12) {
            if (i13 != 2 || i14 != 29) {
                throw e12;
            }
            jM2 = this.f420618O.m(i12, i13, 28, i15, i16, i17, i18);
            if (jM2 >= this.f420620Q) {
                throw e12;
            }
        }
        if (jM2 < this.f420620Q) {
            jM2 = this.f420617N.m(i12, i13, i14, i15, i16, i17, i18);
            if (jM2 >= this.f420620Q) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return jM2;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.AbstractC44854a
    public final AbstractC44868j o() {
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44854a != null ? abstractC44854a.o() : AbstractC44868j.f420911c;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(o().f420915b);
        if (this.f420620Q != f420615S.f420954b) {
            stringBuffer.append(",cutover=");
            AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
            try {
                (((AbstractC44857a) O(abstractC44868j)).f420497C.C(this.f420620Q) == 0 ? org.joda.time.format.j.b() : org.joda.time.format.j.e()).f(O(abstractC44868j)).e(stringBuffer, this.f420620Q, null);
            } catch (IOException unused) {
            }
        }
        if (this.f420618O.f420587O != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(this.f420618O.f420587O);
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
