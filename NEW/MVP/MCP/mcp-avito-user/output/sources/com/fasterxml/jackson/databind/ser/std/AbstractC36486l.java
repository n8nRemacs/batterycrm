package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeSerializerBase.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36486l<T> extends L<T> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f342380d;

    /* renamed from: e, reason: collision with root package name */
    public final DateFormat f342381e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<DateFormat> f342382f;

    public AbstractC36486l(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f342380d = bool;
        this.f342381e = dateFormat;
        this.f342382f = dateFormat == null ? null : new AtomicReference<>();
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        Class<T> cls = this.f342353b;
        JsonFormat.b bVarL = M.l(a12, cVar, cls);
        if (bVarL == null) {
            return this;
        }
        JsonFormat.Shape shape = bVarL.f340948c;
        if (shape.a()) {
            return r(Boolean.TRUE, null);
        }
        String str = bVarL.f340947b;
        boolean z12 = str != null && str.length() > 0;
        Locale locale = bVarL.f340949d;
        com.fasterxml.jackson.databind.z zVar = a12.f341330b;
        if (z12) {
            if (locale == null) {
                locale = zVar.f341506c.f341480h;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(bVarL.d() ? bVarL.c() : zVar.h());
            return r(Boolean.FALSE, simpleDateFormat);
        }
        boolean z13 = locale != null;
        boolean zD2 = bVarL.d();
        boolean z14 = shape == JsonFormat.Shape.f340940j;
        if (!z13 && !zD2 && !z14) {
            return this;
        }
        DateFormat dateFormat = zVar.f341506c.f341479g;
        if (dateFormat instanceof com.fasterxml.jackson.databind.util.B) {
            com.fasterxml.jackson.databind.util.B b12 = (com.fasterxml.jackson.databind.util.B) dateFormat;
            if (locale != null && !locale.equals(b12.f342537c)) {
                b12 = new com.fasterxml.jackson.databind.util.B(b12.f342536b, locale, b12.f342538d, b12.f342541g);
            }
            if (bVarL.d()) {
                TimeZone timeZoneC = bVarL.c();
                b12.getClass();
                if (timeZoneC == null) {
                    timeZoneC = com.fasterxml.jackson.databind.util.B.f342531k;
                }
                TimeZone timeZone = b12.f342536b;
                if (timeZoneC != timeZone && !timeZoneC.equals(timeZone)) {
                    b12 = new com.fasterxml.jackson.databind.util.B(timeZoneC, b12.f342537c, b12.f342538d, b12.f342541g);
                }
            }
            return r(Boolean.FALSE, b12);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            a12.h(cls, "Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
            throw null;
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
        SimpleDateFormat simpleDateFormat3 = z13 ? new SimpleDateFormat(simpleDateFormat2.toPattern(), locale) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone timeZoneC2 = bVarL.c();
        if (timeZoneC2 != null && !timeZoneC2.equals(simpleDateFormat3.getTimeZone())) {
            simpleDateFormat3.setTimeZone(timeZoneC2);
        }
        return r(Boolean.FALSE, simpleDateFormat3);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, T t12) {
        return false;
    }

    public final boolean p(com.fasterxml.jackson.databind.A a12) {
        Boolean bool = this.f342380d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f342381e != null) {
            return false;
        }
        if (a12 == null) {
            throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(this.f342353b.getName()));
        }
        return a12.f341330b.p(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public final void q(Date date, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        DateFormat dateFormat = this.f342381e;
        if (dateFormat == null) {
            a12.getClass();
            if (a12.f341330b.p(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
                jsonGenerator.M(date.getTime());
                return;
            } else {
                jsonGenerator.i0(a12.m().format(date));
                return;
            }
        }
        AtomicReference<DateFormat> atomicReference = this.f342382f;
        DateFormat andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) dateFormat.clone();
        }
        jsonGenerator.i0(andSet.format(date));
        while (!atomicReference.compareAndSet(null, andSet) && atomicReference.get() == null) {
        }
    }

    public abstract AbstractC36486l<T> r(Boolean bool, DateFormat dateFormat);
}
