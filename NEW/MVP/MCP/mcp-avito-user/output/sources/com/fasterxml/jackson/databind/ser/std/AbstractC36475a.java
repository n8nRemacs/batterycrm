package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Objects;

/* compiled from: ArraySerializerBase.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36475a<T> extends com.fasterxml.jackson.databind.ser.i<T> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342357d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f342358e;

    public AbstractC36475a(Class<T> cls) {
        super(cls);
        this.f342357d = null;
        this.f342358e = null;
    }

    public com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        JsonFormat.b bVarL;
        if (cVar != null && (bVarL = M.l(a12, cVar, this.f342353b)) != null) {
            Boolean boolB = bVarL.b(JsonFormat.Feature.f340929d);
            if (!Objects.equals(boolB, this.f342358e)) {
                return s(cVar, boolB);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.l
    public void f(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        if (r(a12) && q(t12)) {
            t(t12, jsonGenerator, a12);
            return;
        }
        jsonGenerator.c0(t12);
        t(t12, jsonGenerator, a12);
        jsonGenerator.A();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, t12));
        jsonGenerator.j(t12);
        t(t12, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    public final boolean r(com.fasterxml.jackson.databind.A a12) {
        Boolean bool = this.f342358e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return a12.f341330b.p(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public abstract com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool);

    public abstract void t(T t12, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12);

    public AbstractC36475a(AbstractC36475a<?> abstractC36475a, com.fasterxml.jackson.databind.c cVar, Boolean bool) {
        super(abstractC36475a.f342353b, 0);
        this.f342357d = cVar;
        this.f342358e = bool;
    }
}
