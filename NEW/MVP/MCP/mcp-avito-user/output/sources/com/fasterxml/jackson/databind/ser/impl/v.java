package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.util.t;
import java.io.Serializable;
import java.lang.reflect.Method;

/* compiled from: UnwrappingBeanPropertyWriter.java */
/* loaded from: classes4.dex */
public class v extends com.fasterxml.jackson.databind.ser.d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: u, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.t f342316u;

    public v(v vVar, t.d dVar, com.fasterxml.jackson.core.io.n nVar) {
        super(vVar, nVar);
        this.f342316u = dVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.d
    public final com.fasterxml.jackson.databind.l<Object> a(k kVar, Class<?> cls, A a12) {
        com.fasterxml.jackson.databind.h hVar = this.f342241h;
        com.fasterxml.jackson.databind.l<Object> lVarW = hVar != null ? a12.w(a12.n(hVar, cls), this) : a12.x(cls, this);
        boolean zE2 = lVarW.e();
        com.fasterxml.jackson.databind.util.t dVar = this.f342316u;
        if (zE2 && (lVarW instanceof w)) {
            t.e eVar = com.fasterxml.jackson.databind.util.t.f342628b;
            dVar = new t.d(dVar, ((w) lVarW).f342317m);
        }
        com.fasterxml.jackson.databind.l<Object> lVarH = lVarW.h(dVar);
        this.f342249p = this.f342249p.c(cls, lVarH);
        return lVarH;
    }

    @Override // com.fasterxml.jackson.databind.ser.d
    public final void h(com.fasterxml.jackson.databind.l<Object> lVar) {
        if (lVar != null) {
            boolean zE2 = lVar.e();
            com.fasterxml.jackson.databind.util.t dVar = this.f342316u;
            if (zE2 && (lVar instanceof w)) {
                t.e eVar = com.fasterxml.jackson.databind.util.t.f342628b;
                dVar = new t.d(dVar, ((w) lVar).f342317m);
            }
            lVar = lVar.h(dVar);
        }
        super.h(lVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.d
    public final com.fasterxml.jackson.databind.ser.d i(com.fasterxml.jackson.databind.util.t tVar) {
        return new v(this, new t.d(tVar, this.f342316u), new com.fasterxml.jackson.core.io.n(tVar.b(this.f342237d.f341186b)));
    }

    @Override // com.fasterxml.jackson.databind.ser.d
    public final void l(Object obj, JsonGenerator jsonGenerator, A a12) {
        Method method = this.f342244k;
        Object objInvoke = method == null ? this.f342245l.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVarA = this.f342246m;
        if (lVarA == null) {
            Class<?> cls = objInvoke.getClass();
            k kVar = this.f342249p;
            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
            lVarA = lVarD == null ? a(kVar, cls, a12) : lVarD;
        }
        Object obj2 = this.f342251r;
        if (obj2 != null) {
            if (JsonInclude.Include.f340956d == obj2) {
                if (lVarA.d(a12, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && f(jsonGenerator, a12, lVarA)) {
            return;
        }
        if (!lVarA.e()) {
            jsonGenerator.F(this.f342237d);
        }
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342248o;
        if (oVar == null) {
            lVarA.f(objInvoke, jsonGenerator, a12);
        } else {
            lVarA.g(objInvoke, jsonGenerator, a12, oVar);
        }
    }

    public v(com.fasterxml.jackson.databind.ser.d dVar, com.fasterxml.jackson.databind.util.t tVar) {
        super(dVar, dVar.f342237d);
        this.f342316u = tVar;
    }
}
