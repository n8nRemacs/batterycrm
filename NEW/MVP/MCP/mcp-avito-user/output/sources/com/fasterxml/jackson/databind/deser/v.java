package com.fasterxml.jackson.databind.deser;

import androidx.camera.core.Q;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.D;
import com.fasterxml.jackson.databind.util.F;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.io.Serializable;

/* compiled from: SettableBeanProperty.java */
/* loaded from: classes4.dex */
public abstract class v extends com.fasterxml.jackson.databind.introspect.x implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.deser.impl.h f341895n = new com.fasterxml.jackson.databind.deser.impl.h();

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f341896d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341897e;

    /* renamed from: f, reason: collision with root package name */
    public final transient InterfaceC36495a f341898f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341899g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341900h;

    /* renamed from: i, reason: collision with root package name */
    public final s f341901i;

    /* renamed from: j, reason: collision with root package name */
    public String f341902j;

    /* renamed from: k, reason: collision with root package name */
    public D f341903k;

    /* renamed from: l, reason: collision with root package name */
    public F f341904l;

    /* renamed from: m, reason: collision with root package name */
    public int f341905m;

    /* compiled from: SettableBeanProperty.java */
    public static abstract class a extends v {

        /* renamed from: o, reason: collision with root package name */
        public final v f341906o;

        public a(v vVar) {
            super(vVar);
            this.f341906o = vVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public Object A(Object obj, Object obj2) {
            return this.f341906o.A(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final v B(com.fasterxml.jackson.databind.v vVar) {
            v vVar2 = this.f341906o;
            v vVarB = vVar2.B(vVar);
            return vVarB == vVar2 ? this : F(vVarB);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final v C(s sVar) {
            v vVar = this.f341906o;
            v vVarC = vVar.C(sVar);
            return vVarC == vVar ? this : F(vVarC);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final v E(com.fasterxml.jackson.databind.i<?> iVar) {
            v vVar = this.f341906o;
            v vVarE = vVar.E(iVar);
            return vVarE == vVar ? this : F(vVarE);
        }

        public abstract v F(v vVar);

        @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
        public final AbstractC36471j b() {
            return this.f341906o.b();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final void f(int i12) {
            this.f341906o.f(i12);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
            this.f341906o.h(jsonParser, fVar, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
            return this.f341906o.i(jsonParser, fVar, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public void l(com.fasterxml.jackson.databind.e eVar) {
            this.f341906o.l(eVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final int m() {
            return this.f341906o.m();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final Class<?> n() {
            return this.f341906o.n();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final Object o() {
            return this.f341906o.o();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final String p() {
            return this.f341906o.p();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final D q() {
            return this.f341906o.q();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final com.fasterxml.jackson.databind.i<Object> r() {
            return this.f341906o.r();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final com.fasterxml.jackson.databind.jsontype.l s() {
            return this.f341906o.s();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final boolean t() {
            return this.f341906o.t();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final boolean u() {
            return this.f341906o.u();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final boolean v() {
            return this.f341906o.v();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public final boolean x() {
            return this.f341906o.x();
        }

        @Override // com.fasterxml.jackson.databind.deser.v
        public void z(Object obj, Object obj2) {
            this.f341906o.z(obj, obj2);
        }
    }

    public v(com.fasterxml.jackson.databind.introspect.u uVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a) {
        this(uVar.c(), hVar, uVar.t(), lVar, interfaceC36495a, uVar.getMetadata());
    }

    public abstract Object A(Object obj, Object obj2);

    public abstract v B(com.fasterxml.jackson.databind.v vVar);

    public abstract v C(s sVar);

    public abstract v E(com.fasterxml.jackson.databind.i<?> iVar);

    public final void a(JsonParser jsonParser, Exception exc, Object obj) throws JsonMappingException {
        if (!(exc instanceof IllegalArgumentException)) {
            com.fasterxml.jackson.databind.util.g.E(exc);
            com.fasterxml.jackson.databind.util.g.F(exc);
            Throwable thS = com.fasterxml.jackson.databind.util.g.s(exc);
            throw new JsonMappingException(jsonParser, com.fasterxml.jackson.databind.util.g.i(thS), thS);
        }
        String strF = com.fasterxml.jackson.databind.util.g.f(obj);
        StringBuilder sb2 = new StringBuilder("Problem deserializing property '");
        sb2.append(this.f341896d.f342656b);
        sb2.append("' (expected type: ");
        sb2.append(this.f341897e);
        sb2.append("; actual type: ");
        sb2.append(strF);
        sb2.append(")");
        String strI = com.fasterxml.jackson.databind.util.g.i(exc);
        if (strI != null) {
            sb2.append(", problem: ");
            sb2.append(strI);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw new JsonMappingException(jsonParser, sb2.toString(), exc);
    }

    @Override // com.fasterxml.jackson.databind.c
    public abstract AbstractC36471j b();

    @Override // com.fasterxml.jackson.databind.c
    public final com.fasterxml.jackson.databind.v c() {
        return this.f341896d;
    }

    public void f(int i12) {
        if (this.f341905m == -1) {
            this.f341905m = i12;
            return;
        }
        throw new IllegalStateException("Property '" + this.f341896d.f342656b + "' already had index (" + this.f341905m + "), trying to assign " + i12);
    }

    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        s sVar = this.f341901i;
        if (zY2) {
            return sVar.d(fVar);
        }
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341900h;
        if (lVar != null) {
            return iVar.g(jsonParser, fVar, lVar);
        }
        Object objE = iVar.e(jsonParser, fVar);
        return objE == null ? sVar.d(fVar) : objE;
    }

    @Override // com.fasterxml.jackson.databind.util.u
    public final String getName() {
        return this.f341896d.f342656b;
    }

    @Override // com.fasterxml.jackson.databind.c
    public final com.fasterxml.jackson.databind.h getType() {
        return this.f341897e;
    }

    public abstract void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj);

    public abstract Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj);

    public final Object k(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws InvalidDefinitionException {
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        s sVar = this.f341901i;
        if (zY2) {
            return com.fasterxml.jackson.databind.deser.impl.q.a(sVar) ? obj : sVar.d(fVar);
        }
        if (this.f341900h == null) {
            Object objF = this.f341899g.f(jsonParser, fVar, obj);
            return objF == null ? com.fasterxml.jackson.databind.deser.impl.q.a(sVar) ? obj : sVar.d(fVar) : objF;
        }
        fVar.i("Cannot merge polymorphic property '" + this.f341896d.f342656b + "'");
        throw null;
    }

    public int m() {
        throw new IllegalStateException(Q.a("Internal error: no creator index for property '", this.f341896d.f342656b, "' (of type ", getClass().getName(), ")"));
    }

    public Class<?> n() {
        return b().h();
    }

    public Object o() {
        return null;
    }

    public String p() {
        return this.f341902j;
    }

    public D q() {
        return this.f341903k;
    }

    public com.fasterxml.jackson.databind.i<Object> r() {
        com.fasterxml.jackson.databind.deser.impl.h hVar = f341895n;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
        if (iVar == hVar) {
            return null;
        }
        return iVar;
    }

    public com.fasterxml.jackson.databind.jsontype.l s() {
        return this.f341900h;
    }

    public boolean t() {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
        return (iVar == null || iVar == f341895n) ? false : true;
    }

    public String toString() {
        return AK.c.s(new StringBuilder("[property '"), this.f341896d.f342656b, "']");
    }

    public boolean u() {
        return this.f341900h != null;
    }

    public boolean v() {
        return this.f341904l != null;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public abstract void z(Object obj, Object obj2);

    public v(com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.v vVar2, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a, com.fasterxml.jackson.databind.u uVar) {
        String strA;
        super(uVar);
        this.f341905m = -1;
        if (vVar == null) {
            this.f341896d = com.fasterxml.jackson.databind.v.f342655f;
        } else {
            String str = vVar.f342656b;
            if (!str.isEmpty() && (strA = com.fasterxml.jackson.core.util.g.f341303c.a(str)) != str) {
                vVar = new com.fasterxml.jackson.databind.v(strA, vVar.f342657c);
            }
            this.f341896d = vVar;
        }
        this.f341897e = hVar;
        this.f341898f = interfaceC36495a;
        this.f341904l = null;
        this.f341900h = lVar != null ? lVar.f(this) : lVar;
        com.fasterxml.jackson.databind.deser.impl.h hVar2 = f341895n;
        this.f341899g = hVar2;
        this.f341901i = hVar2;
    }

    public void y() {
    }

    public v(com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.u uVar, com.fasterxml.jackson.databind.i<Object> iVar) {
        String strA;
        super(uVar);
        this.f341905m = -1;
        if (vVar == null) {
            this.f341896d = com.fasterxml.jackson.databind.v.f342655f;
        } else {
            String str = vVar.f342656b;
            if (!str.isEmpty() && (strA = com.fasterxml.jackson.core.util.g.f341303c.a(str)) != str) {
                vVar = new com.fasterxml.jackson.databind.v(strA, vVar.f342657c);
            }
            this.f341896d = vVar;
        }
        this.f341897e = hVar;
        this.f341898f = null;
        this.f341904l = null;
        this.f341900h = null;
        this.f341899g = iVar;
        this.f341901i = iVar;
    }

    public void l(com.fasterxml.jackson.databind.e eVar) {
    }

    public v(v vVar) {
        super(vVar);
        this.f341905m = -1;
        this.f341896d = vVar.f341896d;
        this.f341897e = vVar.f341897e;
        this.f341898f = vVar.f341898f;
        this.f341899g = vVar.f341899g;
        this.f341900h = vVar.f341900h;
        this.f341902j = vVar.f341902j;
        this.f341905m = vVar.f341905m;
        this.f341904l = vVar.f341904l;
        this.f341901i = vVar.f341901i;
    }

    public v(v vVar, com.fasterxml.jackson.databind.i<?> iVar, s sVar) {
        super(vVar);
        this.f341905m = -1;
        this.f341896d = vVar.f341896d;
        this.f341897e = vVar.f341897e;
        this.f341898f = vVar.f341898f;
        this.f341900h = vVar.f341900h;
        this.f341902j = vVar.f341902j;
        this.f341905m = vVar.f341905m;
        com.fasterxml.jackson.databind.deser.impl.h hVar = f341895n;
        if (iVar == null) {
            this.f341899g = hVar;
        } else {
            this.f341899g = iVar;
        }
        this.f341904l = vVar.f341904l;
        this.f341901i = sVar == hVar ? this.f341899g : sVar;
    }

    public v(v vVar, com.fasterxml.jackson.databind.v vVar2) {
        super(vVar);
        this.f341905m = -1;
        this.f341896d = vVar2;
        this.f341897e = vVar.f341897e;
        this.f341898f = vVar.f341898f;
        this.f341899g = vVar.f341899g;
        this.f341900h = vVar.f341900h;
        this.f341902j = vVar.f341902j;
        this.f341905m = vVar.f341905m;
        this.f341904l = vVar.f341904l;
        this.f341901i = vVar.f341901i;
    }
}
