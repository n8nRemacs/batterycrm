package com.fasterxml.jackson.databind.deser;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.annotation.J;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.m;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import lX0.AbstractC43699b;

/* compiled from: DefaultDeserializationContext.java */
/* loaded from: classes4.dex */
public abstract class m extends com.fasterxml.jackson.databind.f implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: l, reason: collision with root package name */
    public transient LinkedHashMap<G.a, z> f341706l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f341707m;

    /* compiled from: DefaultDeserializationContext.java */
    public static final class a extends m {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.m
        public final a c0(com.fasterxml.jackson.databind.e eVar) {
            return new a(this, eVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.m
        public final a d0(com.fasterxml.jackson.databind.e eVar, AbstractC43699b abstractC43699b) {
            return new a(this, eVar, abstractC43699b);
        }
    }

    @Override // com.fasterxml.jackson.databind.f
    public final com.fasterxml.jackson.databind.m P(AbstractC36463b abstractC36463b, Object obj) {
        com.fasterxml.jackson.databind.m mVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.fasterxml.jackson.databind.m) {
            mVar = (com.fasterxml.jackson.databind.m) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == m.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
                return null;
            }
            if (!com.fasterxml.jackson.databind.m.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(C0.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<KeyDeserializer>"));
            }
            com.fasterxml.jackson.databind.e eVar = this.f341921d;
            eVar.f341506c.getClass();
            mVar = (com.fasterxml.jackson.databind.m) com.fasterxml.jackson.databind.util.g.h(eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
        }
        if (mVar instanceof t) {
            ((t) mVar).c(this);
        }
        return mVar;
    }

    public abstract a c0(com.fasterxml.jackson.databind.e eVar);

    public abstract a d0(com.fasterxml.jackson.databind.e eVar, AbstractC43699b abstractC43699b);

    public final Object e0(AbstractC43699b abstractC43699b, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.i iVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.e eVar = this.f341921d;
        eVar.getClass();
        if (!eVar.p(DeserializationFeature.UNWRAP_ROOT_VALUE)) {
            return iVar.e(abstractC43699b, this);
        }
        com.fasterxml.jackson.databind.util.y yVar = eVar.f341513g;
        yVar.getClass();
        com.fasterxml.jackson.databind.v vVarA = yVar.a(hVar.f341930b, eVar);
        JsonToken jsonToken = abstractC43699b.f413872d;
        JsonToken jsonToken2 = JsonToken.START_OBJECT;
        String str = vVarA.f342656b;
        if (jsonToken != jsonToken2) {
            X(jsonToken2, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", com.fasterxml.jackson.databind.util.g.z(str), abstractC43699b.f413872d);
            throw null;
        }
        JsonToken jsonTokenG0 = abstractC43699b.g0();
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonTokenG0 != jsonToken3) {
            X(jsonToken3, "Current token not FIELD_NAME (to contain expected root name %s), but %s", com.fasterxml.jackson.databind.util.g.z(str), abstractC43699b.f413872d);
            throw null;
        }
        String strN = abstractC43699b.n();
        if (!str.equals(strN)) {
            MismatchedInputException mismatchedInputException = new MismatchedInputException((Closeable) this.f341924g, String.format("Root name (%s) does not match expected (%s) for type %s", com.fasterxml.jackson.databind.util.g.z(strN), com.fasterxml.jackson.databind.util.g.c(str), com.fasterxml.jackson.databind.util.g.t(hVar)));
            if (strN == null) {
                throw mismatchedInputException;
            }
            mismatchedInputException.e(hVar.f341930b, strN);
            throw mismatchedInputException;
        }
        abstractC43699b.g0();
        Object objE = iVar.e(abstractC43699b, this);
        JsonToken jsonTokenG02 = abstractC43699b.g0();
        JsonToken jsonToken4 = JsonToken.END_OBJECT;
        if (jsonTokenG02 == jsonToken4) {
            return objE;
        }
        X(jsonToken4, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", com.fasterxml.jackson.databind.util.g.c(str), abstractC43699b.f413872d);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.f
    public final com.fasterxml.jackson.databind.i<Object> m(AbstractC36463b abstractC36463b, Object obj) {
        com.fasterxml.jackson.databind.i<Object> iVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.fasterxml.jackson.databind.i) {
            iVar = (com.fasterxml.jackson.databind.i) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == i.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
                return null;
            }
            if (!com.fasterxml.jackson.databind.i.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(C0.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<JsonDeserializer>"));
            }
            com.fasterxml.jackson.databind.e eVar = this.f341921d;
            eVar.f341506c.getClass();
            iVar = (com.fasterxml.jackson.databind.i) com.fasterxml.jackson.databind.util.g.h(eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
        }
        if (iVar instanceof t) {
            ((t) iVar).c(this);
        }
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.f
    public final z t(Object obj, G<?> g12, I i12) {
        J jD2 = null;
        if (obj == null) {
            return null;
        }
        G.a aVarE = g12.e(obj);
        LinkedHashMap<G.a, z> linkedHashMap = this.f341706l;
        if (linkedHashMap == null) {
            this.f341706l = new LinkedHashMap<>();
        } else {
            z zVar = linkedHashMap.get(aVarE);
            if (zVar != null) {
                return zVar;
            }
        }
        ArrayList arrayList = this.f341707m;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                I i13 = (I) it.next();
                if (i13.b(i12)) {
                    jD2 = i13;
                    break;
                }
            }
        } else {
            this.f341707m = new ArrayList(8);
        }
        if (jD2 == null) {
            jD2 = i12.d();
            this.f341707m.add(jD2);
        }
        z zVar2 = new z(aVarE);
        zVar2.f341699d = jD2;
        this.f341706l.put(aVarE, zVar2);
        return zVar2;
    }
}
