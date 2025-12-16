package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceTypeDeserializer.java */
/* loaded from: classes4.dex */
public abstract class z<T> extends C<T> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 2;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.i f341881e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341882f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341883g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341884h;

    public z(com.fasterxml.jackson.databind.type.i iVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.i iVar2) {
        super(iVar);
        this.f341882f = xVar;
        this.f341881e = iVar;
        this.f341884h = iVar2;
        this.f341883g = lVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.type.i iVar = this.f341881e;
        com.fasterxml.jackson.databind.i<?> iVar2 = this.f341884h;
        com.fasterxml.jackson.databind.i<?> iVarP = iVar2 == null ? fVar.p(iVar.e(), cVar) : fVar.A(iVar2, cVar, iVar.e());
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341883g;
        com.fasterxml.jackson.databind.jsontype.l lVarF = lVar != null ? lVar.f(cVar) : lVar;
        return (iVarP == iVar2 && lVarF == lVar) ? this : t0(lVarF, iVarP);
    }

    @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public abstract T d(com.fasterxml.jackson.databind.f fVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.i
    public final T e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.deser.x xVar = this.f341882f;
        if (xVar != null) {
            return (T) f(jsonParser, fVar, xVar.y(fVar));
        }
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341884h;
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341883g;
        return (T) r0(lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final T f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, T t12) throws InvalidDefinitionException {
        Object objE;
        com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341884h;
        boolean zEquals = iVar.r(eVar).equals(Boolean.FALSE);
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341883g;
        if (zEquals || lVar != null) {
            objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
        } else {
            Object objQ0 = q0(t12);
            if (objQ0 == null) {
                return (T) r0(lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar));
            }
            objE = iVar.f(jsonParser, fVar, objQ0);
        }
        return (T) s0(t12, objE);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        if (jsonParser.Y(JsonToken.VALUE_NULL)) {
            return d(fVar);
        }
        com.fasterxml.jackson.databind.jsontype.l lVar2 = this.f341883g;
        return lVar2 == null ? e(jsonParser, fVar) : r0(lVar2.b(jsonParser, fVar));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342526d;
    }

    @Override // com.fasterxml.jackson.databind.i
    public Object l(com.fasterxml.jackson.databind.f fVar) {
        return d(fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341882f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.h m0() {
        return this.f341881e;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341884h;
        if (iVar != null) {
            return iVar.q();
        }
        return null;
    }

    public abstract Object q0(T t12);

    @Override // com.fasterxml.jackson.databind.i
    public Boolean r(com.fasterxml.jackson.databind.e eVar) {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341884h;
        if (iVar == null) {
            return null;
        }
        return iVar.r(eVar);
    }

    public abstract AtomicReference r0(Object obj);

    public abstract AtomicReference s0(Object obj, Object obj2);

    public abstract C36451e t0(com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.i iVar);
}
