package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.convert.ToString;
import org.joda.time.C44866h;

/* compiled from: LocalDateTime.java */
/* renamed from: org.joda.time.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44877t extends org.joda.time.base.j implements M, Serializable {
    private static final long serialVersionUID = -268716875315837168L;

    /* renamed from: b, reason: collision with root package name */
    public final long f420961b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44854a f420962c;

    /* compiled from: LocalDateTime.java */
    /* renamed from: org.joda.time.t$a */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = -358138762846288L;

        /* renamed from: b, reason: collision with root package name */
        public transient C44877t f420963b;

        /* renamed from: c, reason: collision with root package name */
        public transient AbstractC44864f f420964c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420963b = (C44877t) objectInputStream.readObject();
            this.f420964c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f420963b.f420962c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f420963b);
            objectOutputStream.writeObject(this.f420964c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f420963b.f420962c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f420964c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f420963b.f420961b;
        }
    }

    public C44877t() {
        this(C44866h.a(), org.joda.time.chrono.x.V());
    }

    private Object readResolve() {
        long j12 = this.f420961b;
        AbstractC44854a abstractC44854a = this.f420962c;
        if (abstractC44854a == null) {
            return new C44877t(j12, org.joda.time.chrono.x.f420650N);
        }
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        ((Q) abstractC44868j).getClass();
        return !(abstractC44868jO instanceof Q) ? new C44877t(j12, abstractC44854a.N()) : this;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final boolean F4(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null) {
            return false;
        }
        return abstractC44865g.b(this.f420962c).B();
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final int I1(AbstractC44865g abstractC44865g) {
        if (abstractC44865g != null) {
            return abstractC44865g.b(this.f420962c).c(this.f420961b);
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    @Override // org.joda.time.base.e, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(M m12) {
        if (this == m12) {
            return 0;
        }
        if (m12 instanceof C44877t) {
            C44877t c44877t = (C44877t) m12;
            if (this.f420962c.equals(c44877t.f420962c)) {
                long j12 = this.f420961b;
                long j13 = c44877t.f420961b;
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
        if (i12 == 3) {
            return abstractC44854a.v();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44877t) {
            C44877t c44877t = (C44877t) obj;
            if (this.f420962c.equals(c44877t.f420962c)) {
                return this.f420961b == c44877t.f420961b;
            }
        }
        return super.equals(obj);
    }

    @Override // org.joda.time.M
    public final int g(int i12) {
        long j12 = this.f420961b;
        AbstractC44854a abstractC44854a = this.f420962c;
        if (i12 == 0) {
            return abstractC44854a.P().c(j12);
        }
        if (i12 == 1) {
            return abstractC44854a.A().c(j12);
        }
        if (i12 == 2) {
            return abstractC44854a.e().c(j12);
        }
        if (i12 == 3) {
            return abstractC44854a.v().c(j12);
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.M
    public final int size() {
        return 4;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.j.e().d(this);
    }

    @Override // org.joda.time.M
    public final AbstractC44854a y() {
        return this.f420962c;
    }

    public C44877t(long j12, AbstractC44854a abstractC44854a) {
        C44866h.b bVar = C44866h.f420908a;
        abstractC44854a = abstractC44854a == null ? org.joda.time.chrono.x.V() : abstractC44854a;
        this.f420961b = abstractC44854a.o().f(j12, AbstractC44868j.f420911c);
        this.f420962c = abstractC44854a.N();
    }
}
