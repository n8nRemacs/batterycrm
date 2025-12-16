package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import java.io.Serializable;

/* compiled from: VirtualBeanPropertyWriter.java */
/* loaded from: classes4.dex */
public abstract class t extends d implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.ser.d
    public final void k(Object obj, JsonGenerator jsonGenerator, A a12) {
        Object objN = n(a12);
        if (objN == null) {
            com.fasterxml.jackson.databind.l<Object> lVar = this.f342247n;
            if (lVar != null) {
                lVar.f(null, jsonGenerator, a12);
                return;
            } else {
                jsonGenerator.H();
                return;
            }
        }
        com.fasterxml.jackson.databind.l<Object> lVarA = this.f342246m;
        if (lVarA == null) {
            Class<?> cls = objN.getClass();
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342249p;
            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
            lVarA = lVarD == null ? a(kVar, cls, a12) : lVarD;
        }
        Object obj2 = this.f342251r;
        if (obj2 != null) {
            if (JsonInclude.Include.f340956d == obj2) {
                if (lVarA.d(a12, objN)) {
                    m(jsonGenerator, a12);
                    return;
                }
            } else if (obj2.equals(objN)) {
                m(jsonGenerator, a12);
                return;
            }
        }
        if (objN == obj && f(jsonGenerator, a12, lVarA)) {
            return;
        }
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342248o;
        if (oVar == null) {
            lVarA.f(objN, jsonGenerator, a12);
        } else {
            lVarA.g(objN, jsonGenerator, a12, oVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.d
    public final void l(Object obj, JsonGenerator jsonGenerator, A a12) {
        Object objN = n(a12);
        com.fasterxml.jackson.core.io.n nVar = this.f342237d;
        if (objN == null) {
            if (this.f342247n != null) {
                jsonGenerator.F(nVar);
                this.f342247n.f(null, jsonGenerator, a12);
                return;
            }
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVarA = this.f342246m;
        if (lVarA == null) {
            Class<?> cls = objN.getClass();
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342249p;
            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
            lVarA = lVarD == null ? a(kVar, cls, a12) : lVarD;
        }
        Object obj2 = this.f342251r;
        if (obj2 != null) {
            if (JsonInclude.Include.f340956d == obj2) {
                if (lVarA.d(a12, objN)) {
                    return;
                }
            } else if (obj2.equals(objN)) {
                return;
            }
        }
        if (objN == obj && f(jsonGenerator, a12, lVarA)) {
            return;
        }
        jsonGenerator.F(nVar);
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342248o;
        if (oVar == null) {
            lVarA.f(objN, jsonGenerator, a12);
        } else {
            lVarA.g(objN, jsonGenerator, a12, oVar);
        }
    }

    public abstract Object n(A a12);

    public abstract t o();
}
