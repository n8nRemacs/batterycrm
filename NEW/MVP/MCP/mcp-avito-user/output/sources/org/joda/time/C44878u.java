package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import org.joda.convert.ToString;
import org.joda.time.C44866h;

/* compiled from: LocalTime.java */
/* renamed from: org.joda.time.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44878u extends org.joda.time.base.j implements M, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f421006d;
    private static final long serialVersionUID = -12873158713873L;

    /* renamed from: b, reason: collision with root package name */
    public final long f421007b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44854a f421008c;

    /* compiled from: LocalTime.java */
    /* renamed from: org.joda.time.u$a */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = -325842547277223L;

        /* renamed from: b, reason: collision with root package name */
        public transient C44878u f421009b;

        /* renamed from: c, reason: collision with root package name */
        public transient AbstractC44864f f421010c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f421009b = (C44878u) objectInputStream.readObject();
            this.f421010c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f421009b.f421008c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f421009b);
            objectOutputStream.writeObject(this.f421010c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f421009b.f421008c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f421010c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f421009b.f421007b;
        }
    }

    static {
        new C44878u(0);
        HashSet hashSet = new HashSet();
        f421006d = hashSet;
        hashSet.add(AbstractC44872n.f420940n);
        hashSet.add(AbstractC44872n.f420939m);
        hashSet.add(AbstractC44872n.f420938l);
        hashSet.add(AbstractC44872n.f420937k);
    }

    public C44878u(int i12) {
        org.joda.time.chrono.x xVar = org.joda.time.chrono.x.f420650N;
        C44866h.b bVar = C44866h.f420908a;
        if (xVar == null) {
            org.joda.time.chrono.x.V();
        }
        long jN2 = xVar.n(0L);
        this.f421008c = xVar;
        this.f421007b = jN2;
    }

    private Object readResolve() {
        long j12 = this.f421007b;
        AbstractC44854a abstractC44854a = this.f421008c;
        if (abstractC44854a == null) {
            return new C44878u(j12, org.joda.time.chrono.x.f420650N);
        }
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        ((Q) abstractC44868j).getClass();
        return !(abstractC44868jO instanceof Q) ? new C44878u(j12, abstractC44854a.N()) : this;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final boolean F4(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null || !d(abstractC44865g.a())) {
            return false;
        }
        AbstractC44872n abstractC44872nC = abstractC44865g.c();
        return d(abstractC44872nC) || abstractC44872nC == AbstractC44872n.f420935i;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final int I1(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (F4(abstractC44865g)) {
            return abstractC44865g.b(this.f421008c).c(this.f421007b);
        }
        throw new IllegalArgumentException("Field '" + abstractC44865g + "' is not supported");
    }

    @Override // org.joda.time.base.e, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(M m12) {
        if (this == m12) {
            return 0;
        }
        if (m12 instanceof C44878u) {
            C44878u c44878u = (C44878u) m12;
            if (this.f421008c.equals(c44878u.f421008c)) {
                long j12 = this.f421007b;
                long j13 = c44878u.f421007b;
                if (j12 < j13) {
                    return -1;
                }
                return j12 == j13 ? 0 : 1;
            }
        }
        return super.compareTo(m12);
    }

    @Override // org.joda.time.base.e
    public final AbstractC44864f c(int i12, AbstractC44854a abstractC44854a) {
        if (i12 == 0) {
            return abstractC44854a.r();
        }
        if (i12 == 1) {
            return abstractC44854a.y();
        }
        if (i12 == 2) {
            return abstractC44854a.E();
        }
        if (i12 == 3) {
            return abstractC44854a.w();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    public final boolean d(AbstractC44872n abstractC44872n) {
        if (abstractC44872n == null) {
            return false;
        }
        AbstractC44854a abstractC44854a = this.f421008c;
        AbstractC44871m abstractC44871mA = abstractC44872n.a(abstractC44854a);
        if (f421006d.contains(abstractC44872n) || abstractC44871mA.d() < abstractC44854a.h().d()) {
            return abstractC44871mA.f();
        }
        return false;
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44878u) {
            C44878u c44878u = (C44878u) obj;
            if (this.f421008c.equals(c44878u.f421008c)) {
                return this.f421007b == c44878u.f421007b;
            }
        }
        return super.equals(obj);
    }

    @Override // org.joda.time.M
    public final int g(int i12) {
        long j12 = this.f421007b;
        AbstractC44854a abstractC44854a = this.f421008c;
        if (i12 == 0) {
            return abstractC44854a.r().c(j12);
        }
        if (i12 == 1) {
            return abstractC44854a.y().c(j12);
        }
        if (i12 == 2) {
            return abstractC44854a.E().c(j12);
        }
        if (i12 == 3) {
            return abstractC44854a.w().c(j12);
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.M
    public final int size() {
        return 4;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.j.j().d(this);
    }

    @Override // org.joda.time.M
    public final AbstractC44854a y() {
        return this.f421008c;
    }

    public C44878u() {
        this(C44866h.a(), org.joda.time.chrono.x.V());
    }

    public C44878u(long j12, AbstractC44854a abstractC44854a) throws ClassNotFoundException {
        C44866h.b bVar = C44866h.f420908a;
        abstractC44854a = abstractC44854a == null ? org.joda.time.chrono.x.V() : abstractC44854a;
        long jF2 = abstractC44854a.o().f(j12, AbstractC44868j.f420911c);
        AbstractC44854a abstractC44854aN = abstractC44854a.N();
        this.f421007b = abstractC44854aN.v().c(jF2);
        this.f421008c = abstractC44854aN;
    }
}
