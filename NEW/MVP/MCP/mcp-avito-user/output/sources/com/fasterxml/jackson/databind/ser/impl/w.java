package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.AbstractC36478d;
import java.io.Serializable;
import java.util.Set;

/* compiled from: UnwrappingBeanSerializer.java */
/* loaded from: classes4.dex */
public class w extends AbstractC36478d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: m, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.t f342317m;

    public w(w wVar, i iVar, Object obj) {
        super(wVar, iVar, obj);
        this.f342317m = wVar.f342317m;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.j(obj);
        if (this.f342373j != null) {
            q(obj, jsonGenerator, a12, false);
        } else if (this.f342371h == null) {
            u(obj, jsonGenerator, a12);
        } else {
            v(obj, jsonGenerator, a12);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        if (a12.f341330b.p(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            a12.h(this.f342353b, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
            throw null;
        }
        jsonGenerator.j(obj);
        if (this.f342373j != null) {
            p(obj, jsonGenerator, a12, oVar);
        } else if (this.f342371h == null) {
            u(obj, jsonGenerator, a12);
        } else {
            v(obj, jsonGenerator, a12);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final com.fasterxml.jackson.databind.l<Object> h(com.fasterxml.jackson.databind.util.t tVar) {
        return new w(this, tVar);
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for ".concat(this.f342353b.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d w(Set<String> set, Set<String> set2) {
        return new w(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d x(Object obj) {
        return new w(this, this.f342373j, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d y(i iVar) {
        return new w(this, iVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d z(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        return new w(this, dVarArr, dVarArr2);
    }

    public w(w wVar, Set<String> set, Set<String> set2) {
        super(wVar, set, set2);
        this.f342317m = wVar.f342317m;
    }

    public w(w wVar, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super(wVar, dVarArr, dVarArr2);
        this.f342317m = wVar.f342317m;
    }

    public w(w wVar, i iVar) {
        super(wVar, iVar, wVar.f342371h);
        this.f342317m = wVar.f342317m;
    }

    public w(AbstractC36478d abstractC36478d, com.fasterxml.jackson.databind.util.t tVar) {
        super(abstractC36478d, AbstractC36478d.t(abstractC36478d.f342368e, tVar), AbstractC36478d.t(abstractC36478d.f342369f, tVar));
        this.f342317m = tVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d s() {
        return this;
    }
}
