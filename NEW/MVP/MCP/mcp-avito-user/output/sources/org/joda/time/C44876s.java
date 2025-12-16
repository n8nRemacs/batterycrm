package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import org.joda.convert.ToString;
import org.joda.time.C44866h;

/* compiled from: LocalDate.java */
/* renamed from: org.joda.time.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44876s extends org.joda.time.base.j implements M, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f420955e;
    private static final long serialVersionUID = -8775358157899L;

    /* renamed from: b, reason: collision with root package name */
    public final long f420956b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44854a f420957c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f420958d;

    /* compiled from: LocalDate.java */
    /* renamed from: org.joda.time.s$a */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = -3193829732634L;

        /* renamed from: b, reason: collision with root package name */
        public transient C44876s f420959b;

        /* renamed from: c, reason: collision with root package name */
        public transient AbstractC44864f f420960c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420959b = (C44876s) objectInputStream.readObject();
            this.f420960c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f420959b.f420957c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f420959b);
            objectOutputStream.writeObject(this.f420960c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f420959b.f420957c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f420960c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f420959b.f420956b;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f420955e = hashSet;
        hashSet.add(AbstractC44872n.f420935i);
        hashSet.add(AbstractC44872n.f420934h);
        hashSet.add(AbstractC44872n.f420933g);
        hashSet.add(AbstractC44872n.f420931e);
        hashSet.add(AbstractC44872n.f420932f);
        hashSet.add(AbstractC44872n.f420930d);
        hashSet.add(AbstractC44872n.f420929c);
    }

    public C44876s() {
        this(C44866h.a(), org.joda.time.chrono.x.V());
    }

    private Object readResolve() {
        long j12 = this.f420956b;
        AbstractC44854a abstractC44854a = this.f420957c;
        if (abstractC44854a == null) {
            return new C44876s(j12, org.joda.time.chrono.x.f420650N);
        }
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        ((Q) abstractC44868j).getClass();
        return !(abstractC44868jO instanceof Q) ? new C44876s(j12, abstractC44854a.N()) : this;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final boolean F4(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null) {
            return false;
        }
        AbstractC44872n abstractC44872nA = abstractC44865g.a();
        boolean zContains = f420955e.contains(abstractC44872nA);
        AbstractC44854a abstractC44854a = this.f420957c;
        if (zContains || abstractC44872nA.a(abstractC44854a).d() >= abstractC44854a.h().d()) {
            return abstractC44865g.b(abstractC44854a).B();
        }
        return false;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final int I1(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (F4(abstractC44865g)) {
            return abstractC44865g.b(this.f420957c).c(this.f420956b);
        }
        throw new IllegalArgumentException("Field '" + abstractC44865g + "' is not supported");
    }

    @Override // org.joda.time.base.e, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(M m12) {
        if (this == m12) {
            return 0;
        }
        if (m12 instanceof C44876s) {
            C44876s c44876s = (C44876s) m12;
            if (this.f420957c.equals(c44876s.f420957c)) {
                long j12 = this.f420956b;
                long j13 = c44876s.f420956b;
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
            return abstractC44854a.P();
        }
        if (i12 == 1) {
            return abstractC44854a.A();
        }
        if (i12 == 2) {
            return abstractC44854a.e();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44876s) {
            C44876s c44876s = (C44876s) obj;
            if (this.f420957c.equals(c44876s.f420957c)) {
                return this.f420956b == c44876s.f420956b;
            }
        }
        return super.equals(obj);
    }

    @Override // org.joda.time.M
    public final int g(int i12) {
        long j12 = this.f420956b;
        AbstractC44854a abstractC44854a = this.f420957c;
        if (i12 == 0) {
            return abstractC44854a.P().c(j12);
        }
        if (i12 == 1) {
            return abstractC44854a.A().c(j12);
        }
        if (i12 == 2) {
            return abstractC44854a.e().c(j12);
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final int hashCode() {
        int i12 = this.f420958d;
        if (i12 != 0) {
            return i12;
        }
        int iHashCode = super.hashCode();
        this.f420958d = iHashCode;
        return iHashCode;
    }

    @Override // org.joda.time.M
    public final int size() {
        return 3;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.j.b().d(this);
    }

    @Override // org.joda.time.M
    public final AbstractC44854a y() {
        return this.f420957c;
    }

    public C44876s(long j12, AbstractC44854a abstractC44854a) throws ClassNotFoundException {
        C44866h.b bVar = C44866h.f420908a;
        abstractC44854a = abstractC44854a == null ? org.joda.time.chrono.x.V() : abstractC44854a;
        long jF2 = abstractC44854a.o().f(j12, AbstractC44868j.f420911c);
        AbstractC44854a abstractC44854aN = abstractC44854a.N();
        this.f420956b = abstractC44854aN.e().F(jF2);
        this.f420957c = abstractC44854aN;
    }
}
