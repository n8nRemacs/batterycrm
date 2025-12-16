package org.joda.time.convert;

import org.joda.time.AbstractC44854a;

/* compiled from: StringConverter.java */
/* loaded from: classes7.dex */
class s extends a implements h, l, g, m, i {

    /* renamed from: a, reason: collision with root package name */
    public static final s f420683a = new s();

    @Override // org.joda.time.convert.c
    public final Class<?> a() {
        return String.class;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final long c(Object obj, AbstractC44854a abstractC44854a) {
        return org.joda.time.format.j.f().f(abstractC44854a).b((String) obj);
    }
}
