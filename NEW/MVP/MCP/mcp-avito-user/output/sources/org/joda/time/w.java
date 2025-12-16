package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import org.joda.convert.ToString;

/* compiled from: MonthDay.java */
/* loaded from: classes7.dex */
public final class w extends org.joda.time.base.k implements M, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44865g[] f421017d = {AbstractC44865g.f420887i, AbstractC44865g.f420888j};
    private static final long serialVersionUID = 2954560699050434609L;

    /* compiled from: MonthDay.java */
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

    static {
        org.joda.time.format.c cVar = new org.joda.time.format.c();
        cVar.l(org.joda.time.format.j.h().a());
        cVar.l(org.joda.time.format.a.a("--MM-dd").a());
        cVar.u();
    }

    private Object readResolve() {
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        AbstractC44854a abstractC44854a = this.f420465b;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        ((Q) abstractC44868j).getClass();
        return !(abstractC44868jO instanceof Q) ? new w(this, abstractC44854a.N()) : this;
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final AbstractC44865g I(int i12) {
        return f421017d[i12];
    }

    @Override // org.joda.time.base.e
    public final AbstractC44864f c(int i12, AbstractC44854a abstractC44854a) {
        if (i12 == 0) {
            return abstractC44854a.A();
        }
        if (i12 == 1) {
            return abstractC44854a.e();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.M
    public final int size() {
        return 2;
    }

    @ToString
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC44865g.f420887i);
        arrayList.add(AbstractC44865g.f420888j);
        return org.joda.time.format.j.g(arrayList, true).d(this);
    }
}
