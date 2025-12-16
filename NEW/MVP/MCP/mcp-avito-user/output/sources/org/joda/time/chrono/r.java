package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.IllegalFieldValueException;

/* compiled from: GJDayOfWeekDateTimeField.java */
/* loaded from: classes7.dex */
final class r extends org.joda.time.field.p {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420631e;

    public r(AbstractC44859c abstractC44859c, AbstractC44871m abstractC44871m) {
        super(AbstractC44865g.f420892n, abstractC44871m);
        this.f420631e = abstractC44859c;
    }

    @Override // org.joda.time.field.c
    public final int J(String str, Locale locale) {
        Integer num = t.b(locale).f420641h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(AbstractC44865g.f420892n, str);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        this.f420631e.getClass();
        return AbstractC44859c.e0(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String d(int i12, Locale locale) {
        return t.b(locale).f420636c[i12];
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        return t.b(locale).f420635b[i12];
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        return t.b(locale).f420644k;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return 7;
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420631e.f420516j;
    }
}
