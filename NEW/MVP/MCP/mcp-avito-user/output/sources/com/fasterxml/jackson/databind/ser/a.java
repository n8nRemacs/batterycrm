package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.ser.std.C36494u;
import java.io.IOException;
import java.util.Map;

/* compiled from: AnyGetterWriter.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.b f342228a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC36471j f342229b;

    /* renamed from: c, reason: collision with root package name */
    public com.fasterxml.jackson.databind.l<Object> f342230c;

    /* renamed from: d, reason: collision with root package name */
    public C36494u f342231d;

    public a(c.b bVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.l lVar) {
        this.f342229b = abstractC36471j;
        this.f342228a = bVar;
        this.f342230c = lVar;
        if (lVar instanceof C36494u) {
            this.f342231d = (C36494u) lVar;
        }
    }

    public final void a(Object obj, JsonGenerator jsonGenerator, A a12) throws IOException {
        AbstractC36471j abstractC36471j = this.f342229b;
        Object objL = abstractC36471j.l(obj);
        if (objL == null) {
            return;
        }
        if (objL instanceof Map) {
            C36494u c36494u = this.f342231d;
            if (c36494u != null) {
                c36494u.u((Map) objL, jsonGenerator, a12);
                return;
            } else {
                this.f342230c.f(objL, jsonGenerator, a12);
                return;
            }
        }
        a12.i("Value returned by 'any-getter' " + abstractC36471j.d() + "() not java.util.Map but " + objL.getClass().getName());
        throw null;
    }
}
