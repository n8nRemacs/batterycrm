package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;
import lX0.AbstractC43699b;
import tX0.C48613a;

/* compiled from: ObjectReader.java */
/* loaded from: classes4.dex */
public class s extends com.fasterxml.jackson.core.j implements com.fasterxml.jackson.core.r, Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final e f342222b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.m f342223c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonFactory f342224d;

    /* renamed from: e, reason: collision with root package name */
    public final h f342225e;

    /* renamed from: f, reason: collision with root package name */
    public final i<Object> f342226f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<h, i<Object>> f342227g;

    public s(C48613a c48613a, e eVar, h hVar) {
        i<Object> iVarU;
        this.f342222b = eVar;
        com.fasterxml.jackson.databind.deser.m mVar = c48613a.f341420h;
        this.f342223c = mVar;
        ConcurrentHashMap<h, i<Object>> concurrentHashMap = c48613a.f341421i;
        this.f342227g = concurrentHashMap;
        this.f342224d = c48613a.f341414b;
        this.f342225e = hVar;
        eVar.getClass();
        eVar.p(DeserializationFeature.UNWRAP_ROOT_VALUE);
        if (hVar == null || !eVar.p(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            iVarU = null;
        } else {
            iVarU = concurrentHashMap.get(hVar);
            if (iVarU == null) {
                try {
                    iVarU = mVar.c0(eVar).u(hVar);
                    if (iVarU != null) {
                        concurrentHashMap.put(hVar, iVarU);
                    }
                } catch (JacksonException unused) {
                }
            }
        }
        this.f342226f = iVarU;
    }

    @Override // com.fasterxml.jackson.core.j
    public final void a(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public final i b(com.fasterxml.jackson.databind.deser.m mVar) throws InvalidDefinitionException {
        i<Object> iVar = this.f342226f;
        if (iVar != null) {
            return iVar;
        }
        h hVar = this.f342225e;
        if (hVar == null) {
            mVar.i("No value type configured for ObjectReader");
            throw null;
        }
        ConcurrentHashMap<h, i<Object>> concurrentHashMap = this.f342227g;
        i<Object> iVar2 = concurrentHashMap.get(hVar);
        if (iVar2 != null) {
            return iVar2;
        }
        i<Object> iVarU = mVar.u(hVar);
        if (iVarU != null) {
            concurrentHashMap.put(hVar, iVarU);
            return iVarU;
        }
        mVar.i("Cannot find a deserializer for type " + hVar);
        throw null;
    }

    public final void c(AbstractC43699b abstractC43699b, com.fasterxml.jackson.databind.deser.m mVar, h hVar) throws MismatchedInputException {
        JsonToken jsonTokenG0 = abstractC43699b.g0();
        if (jsonTokenG0 != null) {
            Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
            Class<?> cls = hVar == null ? null : hVar.f341930b;
            mVar.getClass();
            throw new MismatchedInputException((Closeable) abstractC43699b, "Trailing token (of type " + jsonTokenG0 + ") found after value (bound as " + com.fasterxml.jackson.databind.util.g.A(cls) + "): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`");
        }
    }
}
