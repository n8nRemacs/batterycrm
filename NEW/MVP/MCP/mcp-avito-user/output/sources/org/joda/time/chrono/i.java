package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;
import org.joda.time.IllegalFieldValueException;

/* compiled from: BasicSingleEraDateTimeField.java */
/* loaded from: classes7.dex */
final class i extends org.joda.time.field.c {

    /* renamed from: c, reason: collision with root package name */
    public final String f420599c;

    public i(String str) {
        super(AbstractC44865g.f420881c);
        this.f420599c = str;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        org.joda.time.field.j.d(this, i12, 1, 1);
        return j12;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long H(long j12, String str, Locale locale) {
        if (this.f420599c.equals(str) || "1".equals(str)) {
            return j12;
        }
        throw new IllegalFieldValueException(AbstractC44865g.f420881c, str);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        return this.f420599c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return org.joda.time.field.x.h(AbstractC44872n.f420929c);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        return this.f420599c.length();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return null;
    }
}
