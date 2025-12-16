package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.AbstractC36478d;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.util.Set;

/* compiled from: BeanAsArraySerializer.java */
/* loaded from: classes4.dex */
public class b extends AbstractC36478d {
    private static final long serialVersionUID = 1;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC36478d f342265m;

    public b(b bVar, Set set, Set set2) {
        super(bVar, (Set<String>) set, (Set<String>) set2);
        this.f342265m = bVar;
    }

    public final void A(Object obj, JsonGenerator jsonGenerator, A a12) throws IOException {
        if (this.f342369f != null) {
            a12.getClass();
        }
        com.fasterxml.jackson.databind.ser.d[] dVarArr = this.f342368e;
        int i12 = 0;
        try {
            int length = dVarArr.length;
            while (i12 < length) {
                com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i12];
                if (dVar == null) {
                    jsonGenerator.H();
                } else {
                    dVar.k(obj, jsonGenerator, a12);
                }
                i12++;
            }
        } catch (Exception e12) {
            M.o(a12, e12, obj, dVarArr[i12].f342237d.f341186b);
            throw null;
        } catch (StackOverflowError e13) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e13);
            jsonMappingException.e(obj, dVarArr[i12].f342237d.f341186b);
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws IOException {
        if (a12.f341330b.p(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && this.f342368e.length == 1) {
            A(obj, jsonGenerator, a12);
            return;
        }
        jsonGenerator.c0(obj);
        A(obj, jsonGenerator, a12);
        jsonGenerator.A();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        if (this.f342373j != null) {
            p(obj, jsonGenerator, a12, oVar);
            return;
        }
        WritableTypeId writableTypeIdR = r(oVar, obj, JsonToken.START_ARRAY);
        oVar.e(jsonGenerator, writableTypeIdR);
        jsonGenerator.j(obj);
        A(obj, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdR);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final com.fasterxml.jackson.databind.l<Object> h(com.fasterxml.jackson.databind.util.t tVar) {
        return this.f342265m.h(tVar);
    }

    public final String toString() {
        return "BeanAsArraySerializer for ".concat(this.f342353b.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d w(Set set, Set set2) {
        return new b(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d x(Object obj) {
        return new b(this, this.f342373j, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d y(i iVar) {
        return this.f342265m.y(iVar);
    }

    public b(b bVar, i iVar, Object obj) {
        super(bVar, iVar, obj);
        this.f342265m = bVar;
    }

    public b(com.fasterxml.jackson.databind.ser.e eVar) {
        super(eVar, (i) null, eVar.f342371h);
        this.f342265m = eVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d s() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d z(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        return this;
    }
}
