package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import uX0.InterfaceC48995d;
import vX0.InterfaceC49281c;

/* compiled from: StdDelegatingSerializer.java */
/* loaded from: classes4.dex */
public class H extends M<Object> implements com.fasterxml.jackson.databind.ser.j, com.fasterxml.jackson.databind.ser.p, InterfaceC48995d, InterfaceC49281c {

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.i<Object, ?> f342345d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342346e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342347f;

    public H(com.fasterxml.jackson.databind.util.i<Object, ?> iVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.l<?> lVar) {
        super(hVar);
        this.f342345d = iVar;
        this.f342346e = hVar;
        this.f342347f = lVar;
    }

    public static com.fasterxml.jackson.databind.l p(com.fasterxml.jackson.databind.A a12, Object obj) throws InvalidDefinitionException {
        Class<?> cls = obj.getClass();
        com.fasterxml.jackson.databind.l<Object> lVarC = a12.f341337i.c(cls);
        if (lVarC != null) {
            return lVarC;
        }
        com.fasterxml.jackson.databind.ser.q qVar = a12.f341332d;
        com.fasterxml.jackson.databind.l<Object> lVarB = qVar.b(cls);
        if (lVarB != null) {
            return lVarB;
        }
        com.fasterxml.jackson.databind.l<Object> lVarA = qVar.a(a12.f341330b.c(cls));
        if (lVarA != null) {
            return lVarA;
        }
        com.fasterxml.jackson.databind.l<Object> lVarL = a12.l(cls);
        return lVarL == null ? a12.z(cls) : lVarL;
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.l<Object> lVarB;
        com.fasterxml.jackson.databind.h hVarB;
        com.fasterxml.jackson.databind.util.i<Object, ?> iVar = this.f342345d;
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342347f;
        com.fasterxml.jackson.databind.h hVar = this.f342346e;
        if (lVar == null) {
            hVarB = hVar == null ? iVar.b(a12.e()) : hVar;
            if (hVarB.F()) {
                lVarB = lVar;
            } else {
                lVarB = a12.f341337i.b(hVarB);
                if (lVarB == null && (lVarB = a12.f341332d.a(hVarB)) == null && (lVarB = a12.k(hVarB)) == null) {
                    lVarB = a12.z(hVarB.f341930b);
                }
            }
        } else {
            lVarB = lVar;
            hVarB = hVar;
        }
        if (lVarB instanceof com.fasterxml.jackson.databind.ser.j) {
            lVarB = a12.B(lVarB, cVar);
        }
        if (lVarB == lVar && hVarB == hVar) {
            return this;
        }
        com.fasterxml.jackson.databind.util.g.G(this, H.class, "withDelegate");
        return new H(iVar, hVarB, lVarB);
    }

    @Override // com.fasterxml.jackson.databind.ser.p
    public final void b(com.fasterxml.jackson.databind.A a12) {
        InterfaceC48995d interfaceC48995d = this.f342347f;
        if (interfaceC48995d == null || !(interfaceC48995d instanceof com.fasterxml.jackson.databind.ser.p)) {
            return;
        }
        ((com.fasterxml.jackson.databind.ser.p) interfaceC48995d).b(a12);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        Object objConvert = this.f342345d.convert(obj);
        if (objConvert == null) {
            return true;
        }
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342347f;
        return lVar == null ? obj == null : lVar.d(a12, objConvert);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws InvalidDefinitionException {
        Object objConvert = this.f342345d.convert(obj);
        if (objConvert == null) {
            a12.o(jsonGenerator);
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVarP = this.f342347f;
        if (lVarP == null) {
            lVarP = p(a12, objConvert);
        }
        lVarP.f(objConvert, jsonGenerator, a12);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws InvalidDefinitionException {
        Object objConvert = this.f342345d.convert(obj);
        com.fasterxml.jackson.databind.l<Object> lVarP = this.f342347f;
        if (lVarP == null) {
            lVarP = p(a12, obj);
        }
        lVarP.g(objConvert, jsonGenerator, a12, oVar);
    }
}
