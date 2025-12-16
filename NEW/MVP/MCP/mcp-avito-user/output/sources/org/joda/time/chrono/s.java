package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;
import org.joda.time.IllegalFieldValueException;

/* compiled from: GJEraDateTimeField.java */
/* loaded from: classes7.dex */
final class s extends org.joda.time.field.c {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44859c f420632c;

    public s(AbstractC44859c abstractC44859c) {
        super(AbstractC44865g.f420881c);
        this.f420632c = abstractC44859c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        if (c(j12) == 0) {
            return this.f420632c.E0(1, 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        if (c(j12) == 1) {
            return this.f420632c.E0(1, 0L);
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        org.joda.time.field.j.d(this, i12, 0, 1);
        if (c(j12) == i12) {
            return j12;
        }
        AbstractC44859c abstractC44859c = this.f420632c;
        return abstractC44859c.E0(-abstractC44859c.z0(j12), j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long H(long j12, String str, Locale locale) {
        Integer num = t.b(locale).f420640g.get(str);
        if (num != null) {
            return G(num.intValue(), j12);
        }
        throw new IllegalFieldValueException(AbstractC44865g.f420881c, str);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420632c.z0(j12) <= 0 ? 0 : 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        return t.b(locale).f420634a[i12];
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return org.joda.time.field.x.h(AbstractC44872n.f420929c);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        return t.b(locale).f420643j;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        return 0;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return null;
    }
}
