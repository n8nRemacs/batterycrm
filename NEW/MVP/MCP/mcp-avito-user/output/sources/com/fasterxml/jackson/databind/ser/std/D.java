package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.sql.Date;
import java.text.DateFormat;
import rX0.InterfaceC47610a;

/* compiled from: SqlDateSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class D extends AbstractC36486l<Date> {
    public D() {
        this(null, null);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Date date = (Date) obj;
        if (p(a12)) {
            jsonGenerator.M(date == null ? 0L : date.getTime());
        } else if (this.f342381e == null) {
            jsonGenerator.i0(date.toString());
        } else {
            q(date, jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36486l
    public final AbstractC36486l<Date> r(Boolean bool, DateFormat dateFormat) {
        return new D(bool, dateFormat);
    }

    public D(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
