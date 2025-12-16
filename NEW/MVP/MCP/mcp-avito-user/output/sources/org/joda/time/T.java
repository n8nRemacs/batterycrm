package org.joda.time;

import java.io.Serializable;
import org.joda.convert.ToString;

/* compiled from: YearMonth.java */
/* loaded from: classes7.dex */
public final class T extends org.joda.time.base.k implements M, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44865g[] f420452d = {AbstractC44865g.f420885g, AbstractC44865g.f420887i};
    private static final long serialVersionUID = 797544782896179L;

    /* compiled from: YearMonth.java */
    public static class a extends org.joda.time.field.a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;

        @Override // org.joda.time.field.a
        public final int a() {
            throw null;
        }

        @Override // org.joda.time.field.a
        public final AbstractC44864f b() {
            throw null;
        }
    }

    private Object readResolve() {
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        AbstractC44854a abstractC44854a = this.f420465b;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        ((Q) abstractC44868j).getClass();
        return !(abstractC44868jO instanceof Q) ? new T(this, abstractC44854a.N()) : this;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final AbstractC44865g I(int i12) {
        return f420452d[i12];
    }

    @Override // org.joda.time.base.e
    public final AbstractC44864f c(int i12, AbstractC44854a abstractC44854a) {
        if (i12 == 0) {
            return abstractC44854a.P();
        }
        if (i12 == 1) {
            return abstractC44854a.A();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.M
    public final int size() {
        return 2;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.j.k().d(this);
    }
}
