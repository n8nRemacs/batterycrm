package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.DateFormat;
import java.util.Calendar;
import rX0.InterfaceC47610a;

/* compiled from: CalendarSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36482h extends AbstractC36486l<Calendar> {

    /* renamed from: g, reason: collision with root package name */
    public static final C36482h f342378g = new C36482h();

    public C36482h() {
        this(null, null);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Calendar calendar = (Calendar) obj;
        if (p(a12)) {
            jsonGenerator.M(calendar == null ? 0L : calendar.getTimeInMillis());
        } else {
            q(calendar.getTime(), jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36486l
    public final AbstractC36486l<Calendar> r(Boolean bool, DateFormat dateFormat) {
        return new C36482h(bool, dateFormat);
    }

    public C36482h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
