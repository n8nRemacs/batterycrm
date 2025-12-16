package org.joda.time.convert;

import org.joda.time.AbstractC44854a;
import org.joda.time.C44866h;
import org.joda.time.K;
import org.joda.time.chrono.x;

/* compiled from: ReadableInstantConverter.java */
/* loaded from: classes7.dex */
class o extends a implements h, l {

    /* renamed from: a, reason: collision with root package name */
    public static final o f420679a = new o();

    @Override // org.joda.time.convert.c
    public final Class<?> a() {
        return K.class;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final AbstractC44854a b(Object obj) {
        AbstractC44854a abstractC44854aY = ((K) obj).y();
        C44866h.b bVar = C44866h.f420908a;
        return abstractC44854aY == null ? x.V() : abstractC44854aY;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final long c(Object obj, AbstractC44854a abstractC44854a) {
        return ((K) obj).getMillis();
    }
}
