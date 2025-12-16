package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.DateFormat;
import java.util.Date;
import rX0.InterfaceC47610a;

/* compiled from: DateSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36485k extends AbstractC36486l<Date> {

    /* renamed from: g, reason: collision with root package name */
    public static final C36485k f342379g = new C36485k();

    public C36485k() {
        this(null, null);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Date date = (Date) obj;
        if (p(a12)) {
            jsonGenerator.M(date == null ? 0L : date.getTime());
        } else {
            q(date, jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36486l
    public final AbstractC36486l<Date> r(Boolean bool, DateFormat dateFormat) {
        return new C36485k(bool, dateFormat);
    }

    public C36485k(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
