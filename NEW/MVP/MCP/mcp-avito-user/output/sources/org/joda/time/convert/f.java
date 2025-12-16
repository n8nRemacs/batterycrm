package org.joda.time.convert;

import java.util.Date;
import org.joda.time.AbstractC44854a;

/* compiled from: DateConverter.java */
/* loaded from: classes7.dex */
final class f extends a implements h, l {

    /* renamed from: a, reason: collision with root package name */
    public static final f f420675a = new f();

    @Override // org.joda.time.convert.c
    public final Class<?> a() {
        return Date.class;
    }

    @Override // org.joda.time.convert.a, org.joda.time.convert.h
    public final long c(Object obj, AbstractC44854a abstractC44854a) {
        return ((Date) obj).getTime();
    }
}
