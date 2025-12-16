package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.io.IOException;
import rX0.InterfaceC47610a;
import uX0.InterfaceC48995d;
import vX0.InterfaceC49281c;

/* compiled from: JsonValueSerializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.ser.std.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36492s extends M<Object> implements com.fasterxml.jackson.databind.ser.j, InterfaceC48995d, InterfaceC49281c {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC36471j f342386d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342387e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342388f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342389g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342390h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f342391i;

    /* renamed from: j, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.ser.impl.k f342392j;

    /* compiled from: JsonValueSerializer.java */
    /* renamed from: com.fasterxml.jackson.databind.ser.std.s$a */
    public static class a extends com.fasterxml.jackson.databind.jsontype.o {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.jsontype.o f342393a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f342394b;

        public a(com.fasterxml.jackson.databind.jsontype.o oVar, Object obj) {
            this.f342393a = oVar;
            this.f342394b = obj;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.o
        public final com.fasterxml.jackson.databind.jsontype.o a(com.fasterxml.jackson.databind.c cVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.o
        public final String b() {
            return this.f342393a.b();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.o
        public final JsonTypeInfo.As c() {
            return this.f342393a.c();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.o
        public final WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            writableTypeId.f341264a = this.f342394b;
            return this.f342393a.e(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.o
        public final WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            return this.f342393a.f(jsonGenerator, writableTypeId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C36492s(C36492s c36492s, com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, boolean z12) {
        Class cls = c36492s.f342353b;
        super(cls == null ? Object.class : cls);
        this.f342386d = c36492s.f342386d;
        this.f342390h = c36492s.f342390h;
        this.f342387e = oVar;
        this.f342388f = lVar;
        this.f342389g = cVar;
        this.f342391i = z12;
        this.f342392j = com.fasterxml.jackson.databind.ser.impl.k.a();
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.jsontype.o oVarA = this.f342387e;
        if (oVarA != null) {
            oVarA = oVarA.a(cVar);
        }
        boolean z12 = this.f342391i;
        com.fasterxml.jackson.databind.l<?> lVar = this.f342388f;
        if (lVar != null) {
            return q(cVar, oVarA, a12.A(lVar, cVar), z12);
        }
        boolean zK2 = a12.f341330b.k(MapperFeature.USE_STATIC_TYPING);
        com.fasterxml.jackson.databind.h hVar = this.f342390h;
        if (!zK2 && !hVar.E()) {
            return cVar != this.f342389g ? q(cVar, oVarA, lVar, z12) : this;
        }
        com.fasterxml.jackson.databind.l<Object> lVarT = a12.t(hVar, cVar);
        Class<?> cls = hVar.f341930b;
        boolean zX2 = false;
        if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
            zX2 = com.fasterxml.jackson.databind.util.g.x(lVarT);
        }
        return q(cVar, oVarA, lVarT, zX2);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        Object objL = this.f342386d.l(obj);
        if (objL == null) {
            return true;
        }
        com.fasterxml.jackson.databind.l<Object> lVarP = this.f342388f;
        if (lVarP == null) {
            try {
                lVarP = p(a12, objL.getClass());
            } catch (JsonMappingException e12) {
                throw new RuntimeJsonMappingException(e12);
            }
        }
        return lVarP.d(a12, objL);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws IOException {
        AbstractC36471j abstractC36471j = this.f342386d;
        try {
            Object objL = abstractC36471j.l(obj);
            if (objL == null) {
                a12.o(jsonGenerator);
                return;
            }
            com.fasterxml.jackson.databind.l<Object> lVarP = this.f342388f;
            if (lVarP == null) {
                lVarP = p(a12, objL.getClass());
            }
            com.fasterxml.jackson.databind.jsontype.o oVar = this.f342387e;
            if (oVar != null) {
                lVarP.g(objL, jsonGenerator, a12, oVar);
            } else {
                lVarP.f(objL, jsonGenerator, a12);
            }
        } catch (Exception e12) {
            M.o(a12, e12, obj, abstractC36471j.d() + "()");
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        AbstractC36471j abstractC36471j = this.f342386d;
        try {
            Object objL = abstractC36471j.l(obj);
            if (objL == null) {
                a12.o(jsonGenerator);
                return;
            }
            com.fasterxml.jackson.databind.l<Object> lVarP = this.f342388f;
            if (lVarP == null) {
                lVarP = p(a12, objL.getClass());
            } else if (this.f342391i) {
                WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_STRING, obj));
                lVarP.f(objL, jsonGenerator, a12);
                oVar.f(jsonGenerator, writableTypeIdE);
                return;
            }
            lVarP.g(objL, jsonGenerator, a12, new a(oVar, obj));
        } catch (Exception e12) {
            M.o(a12, e12, obj, abstractC36471j.d() + "()");
            throw null;
        }
    }

    public final com.fasterxml.jackson.databind.l<Object> p(com.fasterxml.jackson.databind.A a12, Class<?> cls) {
        com.fasterxml.jackson.databind.l<Object> lVarD = this.f342392j.d(cls);
        if (lVarD != null) {
            return lVarD;
        }
        com.fasterxml.jackson.databind.h hVar = this.f342390h;
        boolean zV2 = hVar.v();
        com.fasterxml.jackson.databind.c cVar = this.f342389g;
        if (!zV2) {
            com.fasterxml.jackson.databind.l<Object> lVarU = a12.u(cls, cVar);
            this.f342392j = this.f342392j.c(cls, lVarU);
            return lVarU;
        }
        com.fasterxml.jackson.databind.h hVarN = a12.n(hVar, cls);
        com.fasterxml.jackson.databind.l<Object> lVarT = a12.t(hVarN, cVar);
        com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342392j;
        kVar.getClass();
        this.f342392j = kVar.c(hVarN.f341930b, lVarT);
        return lVarT;
    }

    public final C36492s q(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar, boolean z12) {
        return (this.f342389g == cVar && this.f342387e == oVar && this.f342388f == lVar && z12 == this.f342391i) ? this : new C36492s(this, cVar, oVar, lVar, z12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(@JsonValue serializer for method ");
        AbstractC36471j abstractC36471j = this.f342386d;
        sb2.append(abstractC36471j.h());
        sb2.append("#");
        sb2.append(abstractC36471j.d());
        sb2.append(")");
        return sb2.toString();
    }

    public C36492s(AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l<?> lVar) {
        super(abstractC36471j.f());
        this.f342386d = abstractC36471j;
        this.f342390h = abstractC36471j.f();
        this.f342387e = oVar;
        this.f342388f = lVar;
        this.f342389g = null;
        this.f342391i = true;
        this.f342392j = com.fasterxml.jackson.databind.ser.impl.k.a();
    }
}
