package org.joda.time;

import java.io.Serializable;

/* compiled from: YearMonthDay.java */
@Deprecated
/* loaded from: classes7.dex */
public final class U extends org.joda.time.base.k implements M, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44865g[] f420453d = {AbstractC44865g.f420885g, AbstractC44865g.f420887i, AbstractC44865g.f420888j};
    private static final long serialVersionUID = 797544782896179L;

    /* compiled from: YearMonthDay.java */
    @Deprecated
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

    @Override // org.joda.time.base.e, org.joda.time.M
    public final AbstractC44865g I(int i12) {
        return f420453d[i12];
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

    @Override // org.joda.time.M
    public final int size() {
        return 3;
    }

    public final String toString() {
        return org.joda.time.format.j.l().d(this);
    }
}
