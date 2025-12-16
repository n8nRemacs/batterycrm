package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.type.LogicalType;

/* compiled from: StdDelegatingDeserializer.java */
/* loaded from: classes4.dex */
public class B<T> extends C<T> implements com.fasterxml.jackson.databind.deser.i, com.fasterxml.jackson.databind.deser.t {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.i<Object, T> f341712e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341713f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341714g;

    public B(com.fasterxml.jackson.databind.util.i<?, T> iVar) {
        super((Class<?>) Object.class);
        this.f341712e = iVar;
        this.f341713f = null;
        this.f341714g = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.util.i<Object, T> iVar = this.f341712e;
        com.fasterxml.jackson.databind.i<?> iVar2 = this.f341714g;
        if (iVar2 == null) {
            com.fasterxml.jackson.databind.h hVarA = iVar.a(fVar.e());
            com.fasterxml.jackson.databind.i<Object> iVarP = fVar.p(hVarA, cVar);
            com.fasterxml.jackson.databind.util.g.G(this, B.class, "withDelegate");
            return new B(iVar, hVarA, iVarP);
        }
        com.fasterxml.jackson.databind.h hVar = this.f341713f;
        com.fasterxml.jackson.databind.i<?> iVarA = fVar.A(iVar2, cVar, hVar);
        if (iVarA == iVar2) {
            return this;
        }
        com.fasterxml.jackson.databind.util.g.G(this, B.class, "withDelegate");
        return new B(iVar, hVar, iVarA);
    }

    @Override // com.fasterxml.jackson.databind.deser.t
    public final void c(com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.deser.s sVar = this.f341714g;
        if (sVar == null || !(sVar instanceof com.fasterxml.jackson.databind.deser.t)) {
            return;
        }
        ((com.fasterxml.jackson.databind.deser.t) sVar).c(fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final T e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        Object objE = this.f341714g.e(jsonParser, fVar);
        if (objE == null) {
            return null;
        }
        return this.f341712e.convert(objE);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final T f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        com.fasterxml.jackson.databind.h hVar = this.f341713f;
        if (hVar.f341930b.isAssignableFrom(obj.getClass())) {
            return (T) this.f341714g.f(jsonParser, fVar, obj);
        }
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)".concat(obj.getClass().getName()), hVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        Object objE = this.f341714g.e(jsonParser, fVar);
        if (objE == null) {
            return null;
        }
        return this.f341712e.convert(objE);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Class<?> o() {
        return this.f341714g.o();
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return this.f341714g.q();
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return this.f341714g.r(eVar);
    }

    public B(com.fasterxml.jackson.databind.util.i<Object, T> iVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.i<?> iVar2) {
        super(hVar);
        this.f341712e = iVar;
        this.f341713f = hVar;
        this.f341714g = iVar2;
    }
}
