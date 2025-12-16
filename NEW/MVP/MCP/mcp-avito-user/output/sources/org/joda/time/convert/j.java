package org.joda.time.convert;

import org.joda.time.AbstractC44854a;

/* compiled from: LongConverter.java */
/* loaded from: classes7.dex */
class j extends a implements h, l, g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f420676a = new j();

    @Override // org.joda.time.convert.c
    public final Class<?> a() {
        return Long.class;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final long c(Object obj, AbstractC44854a abstractC44854a) {
        return ((Long) obj).longValue();
    }
}
