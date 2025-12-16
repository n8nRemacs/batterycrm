package com.fasterxml.jackson.databind.ser;

import androidx.media3.common.C23088b;
import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.l;
import com.fasterxml.jackson.databind.ser.impl.x;
import com.fasterxml.jackson.databind.v;
import com.fasterxml.jackson.databind.z;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: DefaultSerializerProvider.java */
/* loaded from: classes4.dex */
public abstract class k extends A implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: n, reason: collision with root package name */
    public transient AbstractMap f342321n;

    /* renamed from: o, reason: collision with root package name */
    public transient ArrayList<G<?>> f342322o;

    /* renamed from: p, reason: collision with root package name */
    public transient JsonGenerator f342323p;

    /* compiled from: DefaultSerializerProvider.java */
    public static final class a extends k {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.ser.k
        public final a J(z zVar, g gVar) {
            return new a(this, zVar, gVar);
        }
    }

    public static IOException I(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strI = com.fasterxml.jackson.databind.util.g.i(exc);
        if (strI == null) {
            strI = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, strI, exc);
    }

    @Override // com.fasterxml.jackson.databind.A
    public final Object C(Class cls) {
        if (cls == null) {
            return null;
        }
        z zVar = this.f341330b;
        zVar.f341506c.getClass();
        return com.fasterxml.jackson.databind.util.g.h(zVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
    }

    @Override // com.fasterxml.jackson.databind.A
    public final boolean E(Object obj) throws InvalidDefinitionException {
        try {
            return obj.equals(null);
        } catch (Throwable th2) {
            String name = obj.getClass().getName();
            String name2 = th2.getClass().getName();
            String strI = com.fasterxml.jackson.databind.util.g.i(th2);
            StringBuilder sbB = C23088b.b("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbB.append(strI);
            String string = sbB.toString();
            Class<?> cls = obj.getClass();
            JsonGenerator jsonGenerator = this.f342323p;
            e().l(cls);
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(jsonGenerator, string);
            invalidDefinitionException.initCause(th2);
            throw invalidDefinitionException;
        }
    }

    @Override // com.fasterxml.jackson.databind.A
    public final com.fasterxml.jackson.databind.l<Object> H(AbstractC36463b abstractC36463b, Object obj) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.l<Object> lVar;
        if (obj instanceof com.fasterxml.jackson.databind.l) {
            lVar = (com.fasterxml.jackson.databind.l) obj;
        } else {
            if (!(obj instanceof Class)) {
                abstractC36463b.f();
                i("AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw null;
            }
            Class cls = (Class) obj;
            if (cls == l.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
                return null;
            }
            if (!com.fasterxml.jackson.databind.l.class.isAssignableFrom(cls)) {
                abstractC36463b.f();
                i("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                throw null;
            }
            z zVar = this.f341330b;
            zVar.f341506c.getClass();
            lVar = (com.fasterxml.jackson.databind.l) com.fasterxml.jackson.databind.util.g.h(zVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
        }
        if (lVar instanceof p) {
            ((p) lVar).b(this);
        }
        return lVar;
    }

    public abstract a J(z zVar, g gVar);

    public final void K(JsonGenerator jsonGenerator, Object obj) {
        this.f342323p = jsonGenerator;
        if (obj == null) {
            try {
                this.f341335g.getClass();
                jsonGenerator.H();
                return;
            } catch (Exception e12) {
                throw I(jsonGenerator, e12);
            }
        }
        Class<?> cls = obj.getClass();
        com.fasterxml.jackson.databind.l lVarV = v(cls);
        z zVar = this.f341330b;
        zVar.getClass();
        if (!zVar.p(SerializationFeature.WRAP_ROOT_VALUE)) {
            try {
                lVarV.f(obj, jsonGenerator, this);
                return;
            } catch (Exception e13) {
                throw I(jsonGenerator, e13);
            }
        }
        v vVarA = zVar.f341513g.a(cls, zVar);
        try {
            jsonGenerator.e0();
            z zVar2 = this.f341330b;
            com.fasterxml.jackson.core.io.n nVar = vVarA.f342658d;
            if (nVar == null) {
                String str = vVarA.f342656b;
                nVar = zVar2 == null ? new com.fasterxml.jackson.core.io.n(str) : new com.fasterxml.jackson.core.io.n(str);
                vVarA.f342658d = nVar;
            }
            jsonGenerator.F(nVar);
            lVarV.f(obj, jsonGenerator, this);
            jsonGenerator.B();
        } catch (Exception e14) {
            throw I(jsonGenerator, e14);
        }
    }

    @Override // com.fasterxml.jackson.databind.A
    public final x s(Object obj, G<?> g12) {
        G<?> gF2;
        AbstractMap abstractMap = this.f342321n;
        if (abstractMap == null) {
            this.f342321n = this.f341330b.p(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            x xVar = (x) abstractMap.get(obj);
            if (xVar != null) {
                return xVar;
            }
        }
        ArrayList<G<?>> arrayList = this.f342322o;
        if (arrayList == null) {
            this.f342322o = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                gF2 = this.f342322o.get(i12);
                if (gF2.a(g12)) {
                    break;
                }
            }
        }
        gF2 = null;
        if (gF2 == null) {
            gF2 = g12.f();
            this.f342322o.add(gF2);
        }
        x xVar2 = new x(gF2);
        this.f342321n.put(obj, xVar2);
        return xVar2;
    }

    @Override // com.fasterxml.jackson.databind.A
    public final JsonGenerator y() {
        return this.f342323p;
    }
}
