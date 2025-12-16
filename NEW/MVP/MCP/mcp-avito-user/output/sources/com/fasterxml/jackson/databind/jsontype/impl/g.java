package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.camera.core.Q;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.util.C;

/* compiled from: AsPropertyTypeDeserializer.java */
/* loaded from: classes4.dex */
public class g extends a {
    private static final long serialVersionUID = 1;

    /* renamed from: j, reason: collision with root package name */
    public final JsonTypeInfo.As f342145j;

    /* renamed from: k, reason: collision with root package name */
    public final String f342146k;

    public g(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.m mVar, String str, boolean z12, com.fasterxml.jackson.databind.h hVar2, JsonTypeInfo.As as2) {
        super(hVar, mVar, str, z12, hVar2);
        this.f342146k = AK.c.k("missing type id property '", this.f342167f, "'");
        this.f342145j = as2;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final Object b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        return jsonParser.Y(JsonToken.START_ARRAY) ? p(jsonParser, fVar) : d(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public Object d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonGenerationException {
        String strV;
        Object objQ;
        if (jsonParser.b() && (objQ = jsonParser.Q()) != null) {
            return m(jsonParser, fVar, objQ);
        }
        JsonToken jsonTokenF = jsonParser.f();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        String str = this.f342146k;
        C cK2 = null;
        if (jsonTokenF == jsonToken) {
            jsonTokenF = jsonParser.g0();
        } else if (jsonTokenF != JsonToken.FIELD_NAME) {
            return r(jsonParser, fVar, null, str);
        }
        boolean zK2 = fVar.f341921d.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            jsonParser.g0();
            String str2 = this.f342167f;
            if ((strD.equals(str2) || (zK2 && strD.equalsIgnoreCase(str2))) && (strV = jsonParser.V()) != null) {
                return q(jsonParser, fVar, cK2, strV);
            }
            if (cK2 == null) {
                cK2 = fVar.k(jsonParser);
            }
            cK2.G(strD);
            cK2.y0(jsonParser);
            jsonTokenF = jsonParser.g0();
        }
        return r(jsonParser, fVar, cK2, str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public com.fasterxml.jackson.databind.jsontype.l f(com.fasterxml.jackson.databind.c cVar) {
        return cVar == this.f342165d ? this : new g(this, cVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final JsonTypeInfo.As k() {
        return this.f342145j;
    }

    public final Object q(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, C c12, String str) throws JsonGenerationException, InvalidTypeIdException {
        com.fasterxml.jackson.databind.i<Object> iVarO = o(fVar, str);
        if (this.f342168g) {
            if (c12 == null) {
                c12 = fVar.k(jsonParser);
            }
            c12.G(jsonParser.d());
            c12.i0(str);
        }
        if (c12 != null) {
            jsonParser.c();
            jsonParser = com.fasterxml.jackson.core.util.l.n0(c12.w0(jsonParser), jsonParser);
        }
        if (jsonParser.f() != JsonToken.END_OBJECT) {
            jsonParser.g0();
        }
        return iVarO.e(jsonParser, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, C c12, String str) throws InvalidTypeIdException {
        boolean zL2 = l();
        com.fasterxml.jackson.databind.h hVar = this.f342164c;
        if (!zL2) {
            Object objA = com.fasterxml.jackson.databind.jsontype.l.a(jsonParser, hVar);
            if (objA != null) {
                return objA;
            }
            if (jsonParser.b0()) {
                return p(jsonParser, fVar);
            }
            if (jsonParser.Y(JsonToken.VALUE_STRING) && fVar.O(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.L().trim().isEmpty()) {
                return null;
            }
        }
        com.fasterxml.jackson.databind.i<Object> iVarN = n(fVar);
        if (iVarN != null) {
            if (c12 != null) {
                c12.B();
                jsonParser = c12.w0(jsonParser);
                jsonParser.g0();
            }
            return iVarN.e(jsonParser, fVar);
        }
        fVar.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        throw new InvalidTypeIdException(fVar.f341924g, com.fasterxml.jackson.databind.d.a(String.format("Could not resolve subtype of %s", hVar), str));
    }

    public g(g gVar, com.fasterxml.jackson.databind.c cVar) {
        String strA;
        super(gVar, cVar);
        com.fasterxml.jackson.databind.c cVar2 = this.f342165d;
        if (cVar2 == null) {
            strA = AK.c.k("missing type id property '", this.f342167f, "'");
        } else {
            strA = Q.a("missing type id property '", this.f342167f, "' (for POJO property '", cVar2.getName(), "')");
        }
        this.f342146k = strA;
        this.f342145j = gVar.f342145j;
    }
}
