package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36469h;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.u;
import com.fasterxml.jackson.databind.ser.impl.k;
import com.fasterxml.jackson.databind.ser.std.AbstractC36478d;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import com.fasterxml.jackson.databind.v;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import rX0.InterfaceC47610a;

/* compiled from: BeanPropertyWriter.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class d extends o implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.n f342237d;

    /* renamed from: e, reason: collision with root package name */
    public final v f342238e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342239f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342240g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.h f342241h;

    /* renamed from: i, reason: collision with root package name */
    public final transient InterfaceC36495a f342242i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC36471j f342243j;

    /* renamed from: k, reason: collision with root package name */
    public transient Method f342244k;

    /* renamed from: l, reason: collision with root package name */
    public transient Field f342245l;

    /* renamed from: m, reason: collision with root package name */
    public com.fasterxml.jackson.databind.l<Object> f342246m;

    /* renamed from: n, reason: collision with root package name */
    public com.fasterxml.jackson.databind.l<Object> f342247n;

    /* renamed from: o, reason: collision with root package name */
    public com.fasterxml.jackson.databind.jsontype.o f342248o;

    /* renamed from: p, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.ser.impl.k f342249p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f342250q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f342251r;

    /* renamed from: s, reason: collision with root package name */
    public final Class<?>[] f342252s;

    /* renamed from: t, reason: collision with root package name */
    public final transient HashMap<Object, Object> f342253t;

    public d(u uVar, AbstractC36471j abstractC36471j, InterfaceC36495a interfaceC36495a, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.l<?> lVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.h hVar2, boolean z12, Object obj, Class<?>[] clsArr) {
        super(uVar.getMetadata());
        this.f342243j = abstractC36471j;
        this.f342242i = interfaceC36495a;
        this.f342237d = new com.fasterxml.jackson.core.io.n(uVar.getName());
        this.f342238e = uVar.t();
        this.f342239f = hVar;
        this.f342246m = lVar;
        this.f342249p = lVar == null ? com.fasterxml.jackson.databind.ser.impl.k.a() : null;
        this.f342248o = oVar;
        this.f342240g = hVar2;
        if (abstractC36471j instanceof C36469h) {
            this.f342244k = null;
            this.f342245l = ((C36469h) abstractC36471j).f342042d;
        } else if (abstractC36471j instanceof C36472k) {
            this.f342244k = ((C36472k) abstractC36471j).f342054e;
            this.f342245l = null;
        } else {
            this.f342244k = null;
            this.f342245l = null;
        }
        this.f342250q = z12;
        this.f342251r = obj;
        this.f342247n = null;
        this.f342252s = clsArr;
    }

    public com.fasterxml.jackson.databind.l<Object> a(com.fasterxml.jackson.databind.ser.impl.k kVar, Class<?> cls, A a12) {
        k.d dVar;
        com.fasterxml.jackson.databind.h hVar = this.f342241h;
        if (hVar != null) {
            com.fasterxml.jackson.databind.h hVarN = a12.n(hVar, cls);
            kVar.getClass();
            com.fasterxml.jackson.databind.l<Object> lVarT = a12.t(hVarN, this);
            dVar = new k.d(lVarT, kVar.c(hVarN.f341930b, lVarT));
        } else {
            kVar.getClass();
            com.fasterxml.jackson.databind.l<Object> lVarU = a12.u(cls, this);
            dVar = new k.d(lVarU, kVar.c(cls, lVarU));
        }
        com.fasterxml.jackson.databind.ser.impl.k kVar2 = dVar.f342296b;
        if (kVar != kVar2) {
            this.f342249p = kVar2;
        }
        return dVar.f342295a;
    }

    @Override // com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f342243j;
    }

    @Override // com.fasterxml.jackson.databind.c
    public final v c() {
        return new v(this.f342237d.f341186b, null);
    }

    public final boolean f(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.l lVar) throws InvalidDefinitionException {
        if (lVar.i()) {
            return false;
        }
        if (a12.f341330b.p(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(lVar instanceof AbstractC36478d)) {
                return false;
            }
            a12.i("Direct self-reference leading to cycle");
            throw null;
        }
        if (!a12.f341330b.p(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.f342247n == null) {
            return true;
        }
        if (!jsonGenerator.g().d()) {
            jsonGenerator.F(this.f342237d);
        }
        this.f342247n.f(null, jsonGenerator, a12);
        return true;
    }

    public void g(com.fasterxml.jackson.databind.l<Object> lVar) {
        com.fasterxml.jackson.databind.l<Object> lVar2 = this.f342247n;
        if (lVar2 != null && lVar2 != lVar) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.n("Cannot override _nullSerializer: had a ", com.fasterxml.jackson.databind.util.g.f(this.f342247n), ", trying to set to ", com.fasterxml.jackson.databind.util.g.f(lVar)));
        }
        this.f342247n = lVar;
    }

    @Override // com.fasterxml.jackson.databind.util.u
    public final String getName() {
        return this.f342237d.f341186b;
    }

    @Override // com.fasterxml.jackson.databind.c
    public final com.fasterxml.jackson.databind.h getType() {
        return this.f342239f;
    }

    public void h(com.fasterxml.jackson.databind.l<Object> lVar) {
        com.fasterxml.jackson.databind.l<Object> lVar2 = this.f342246m;
        if (lVar2 != null && lVar2 != lVar) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.n("Cannot override _serializer: had a ", com.fasterxml.jackson.databind.util.g.f(this.f342246m), ", trying to set to ", com.fasterxml.jackson.databind.util.g.f(lVar)));
        }
        this.f342246m = lVar;
    }

    public d i(com.fasterxml.jackson.databind.util.t tVar) {
        com.fasterxml.jackson.core.io.n nVar = this.f342237d;
        String strB = tVar.b(nVar.f341186b);
        return strB.equals(nVar.f341186b) ? this : new d(this, v.a(strB));
    }

    public void k(Object obj, JsonGenerator jsonGenerator, A a12) {
        Method method = this.f342244k;
        Object objInvoke = method == null ? this.f342245l.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
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
            Class<?> cls = objInvoke.getClass();
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342249p;
            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
            lVarA = lVarD == null ? a(kVar, cls, a12) : lVarD;
        }
        Object obj2 = this.f342251r;
        if (obj2 != null) {
            if (JsonInclude.Include.f340956d == obj2) {
                if (lVarA.d(a12, objInvoke)) {
                    m(jsonGenerator, a12);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                m(jsonGenerator, a12);
                return;
            }
        }
        if (objInvoke == obj && f(jsonGenerator, a12, lVarA)) {
            return;
        }
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342248o;
        if (oVar == null) {
            lVarA.f(objInvoke, jsonGenerator, a12);
        } else {
            lVarA.g(objInvoke, jsonGenerator, a12, oVar);
        }
    }

    public void l(Object obj, JsonGenerator jsonGenerator, A a12) {
        Method method = this.f342244k;
        Object objInvoke = method == null ? this.f342245l.get(obj) : method.invoke(obj, null);
        com.fasterxml.jackson.core.io.n nVar = this.f342237d;
        if (objInvoke == null) {
            if (this.f342247n != null) {
                jsonGenerator.F(nVar);
                this.f342247n.f(null, jsonGenerator, a12);
                return;
            }
            return;
        }
        com.fasterxml.jackson.databind.l<Object> lVarA = this.f342246m;
        if (lVarA == null) {
            Class<?> cls = objInvoke.getClass();
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342249p;
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
        jsonGenerator.F(nVar);
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342248o;
        if (oVar == null) {
            lVarA.f(objInvoke, jsonGenerator, a12);
        } else {
            lVarA.g(objInvoke, jsonGenerator, a12, oVar);
        }
    }

    public final void m(JsonGenerator jsonGenerator, A a12) {
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342247n;
        if (lVar != null) {
            lVar.f(null, jsonGenerator, a12);
        } else {
            jsonGenerator.H();
        }
    }

    public Object readResolve() {
        AbstractC36471j abstractC36471j = this.f342243j;
        if (abstractC36471j instanceof C36469h) {
            this.f342244k = null;
            this.f342245l = (Field) abstractC36471j.k();
        } else if (abstractC36471j instanceof C36472k) {
            this.f342244k = (Method) abstractC36471j.k();
            this.f342245l = null;
        }
        if (this.f342246m == null) {
            this.f342249p = com.fasterxml.jackson.databind.ser.impl.k.a();
        }
        return this;
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(40, "property '");
        sbQ.append(this.f342237d.f341186b);
        sbQ.append("' (");
        if (this.f342244k != null) {
            sbQ.append("via method ");
            sbQ.append(this.f342244k.getDeclaringClass().getName());
            sbQ.append("#");
            sbQ.append(this.f342244k.getName());
        } else if (this.f342245l != null) {
            sbQ.append("field \"");
            sbQ.append(this.f342245l.getDeclaringClass().getName());
            sbQ.append("#");
            sbQ.append(this.f342245l.getName());
        } else {
            sbQ.append("virtual");
        }
        com.fasterxml.jackson.databind.l<Object> lVar = this.f342246m;
        if (lVar == null) {
            sbQ.append(", no static serializer");
        } else {
            sbQ.append(", static serializer of type ".concat(lVar.getClass().getName()));
        }
        sbQ.append(')');
        return sbQ.toString();
    }

    public d(d dVar, com.fasterxml.jackson.core.io.n nVar) {
        super(dVar);
        this.f342237d = nVar;
        this.f342238e = dVar.f342238e;
        this.f342243j = dVar.f342243j;
        this.f342242i = dVar.f342242i;
        this.f342239f = dVar.f342239f;
        this.f342244k = dVar.f342244k;
        this.f342245l = dVar.f342245l;
        this.f342246m = dVar.f342246m;
        this.f342247n = dVar.f342247n;
        if (dVar.f342253t != null) {
            this.f342253t = new HashMap<>(dVar.f342253t);
        }
        this.f342240g = dVar.f342240g;
        this.f342249p = dVar.f342249p;
        this.f342250q = dVar.f342250q;
        this.f342251r = dVar.f342251r;
        this.f342252s = dVar.f342252s;
        this.f342248o = dVar.f342248o;
        this.f342241h = dVar.f342241h;
    }

    public d(d dVar, v vVar) {
        super(dVar);
        this.f342237d = new com.fasterxml.jackson.core.io.n(vVar.f342656b);
        this.f342238e = dVar.f342238e;
        this.f342242i = dVar.f342242i;
        this.f342239f = dVar.f342239f;
        this.f342243j = dVar.f342243j;
        this.f342244k = dVar.f342244k;
        this.f342245l = dVar.f342245l;
        this.f342246m = dVar.f342246m;
        this.f342247n = dVar.f342247n;
        if (dVar.f342253t != null) {
            this.f342253t = new HashMap<>(dVar.f342253t);
        }
        this.f342240g = dVar.f342240g;
        this.f342249p = dVar.f342249p;
        this.f342250q = dVar.f342250q;
        this.f342251r = dVar.f342251r;
        this.f342252s = dVar.f342252s;
        this.f342248o = dVar.f342248o;
        this.f342241h = dVar.f342241h;
    }

    public d() {
        super(com.fasterxml.jackson.databind.u.f342514k);
        this.f342243j = null;
        this.f342242i = null;
        this.f342237d = null;
        this.f342238e = null;
        this.f342252s = null;
        this.f342239f = null;
        this.f342246m = null;
        this.f342249p = null;
        this.f342248o = null;
        this.f342240g = null;
        this.f342244k = null;
        this.f342245l = null;
        this.f342250q = false;
        this.f342251r = null;
        this.f342247n = null;
    }

    public d(d dVar) {
        this(dVar, dVar.f342237d);
    }
}
