package org.joda.time.convert;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44874p;
import org.joda.time.chrono.A;
import org.joda.time.chrono.w;
import org.joda.time.chrono.x;

/* compiled from: CalendarConverter.java */
/* loaded from: classes7.dex */
final class b extends a implements h, l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f420664a = new b();

    @Override // org.joda.time.convert.c
    public final Class<?> a() {
        return Calendar.class;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final AbstractC44854a b(Object obj) throws ClassNotFoundException {
        AbstractC44868j abstractC44868jE;
        Calendar calendar = (Calendar) obj;
        try {
            abstractC44868jE = AbstractC44868j.d(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            abstractC44868jE = AbstractC44868j.e();
        }
        if (calendar.getClass().getName().endsWith(".BuddhistCalendar")) {
            return org.joda.time.chrono.m.V(abstractC44868jE);
        }
        if (!(calendar instanceof GregorianCalendar)) {
            return x.W(abstractC44868jE);
        }
        long time = ((GregorianCalendar) calendar).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return w.F0(abstractC44868jE, 4);
        }
        if (time == Long.MAX_VALUE) {
            return A.F0(abstractC44868jE, 4);
        }
        return org.joda.time.chrono.q.X(abstractC44868jE, time == org.joda.time.chrono.q.f420615S.f420954b ? null : new C44874p(time), 4);
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final long c(Object obj, AbstractC44854a abstractC44854a) {
        return ((Calendar) obj).getTime().getTime();
    }
}
