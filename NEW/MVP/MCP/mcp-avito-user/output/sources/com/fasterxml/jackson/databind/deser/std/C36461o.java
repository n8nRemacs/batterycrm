package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* compiled from: FactoryBasedEnumDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C36461o extends C<Object> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341813e;

    /* renamed from: f, reason: collision with root package name */
    public final C36472k f341814f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<?> f341815g;

    /* renamed from: h, reason: collision with root package name */
    public final H f341816h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v[] f341817i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f341818j;

    /* renamed from: k, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.deser.impl.v f341819k;

    public C36461o(Class cls, C36472k c36472k, com.fasterxml.jackson.databind.h hVar, H h12, com.fasterxml.jackson.databind.deser.v[] vVarArr) {
        super((Class<?>) cls);
        this.f341814f = c36472k;
        this.f341818j = true;
        this.f341813e = (hVar.x(String.class) || hVar.x(CharSequence.class)) ? null : hVar;
        this.f341815g = null;
        this.f341816h = h12;
        this.f341817i = vVarArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.h hVar;
        return (this.f341815g == null && (hVar = this.f341813e) != null && this.f341817i == null) ? new C36461o(this, (com.fasterxml.jackson.databind.i<?>) fVar.p(hVar, cVar)) : this;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objV;
        C36472k c36472k = this.f341814f;
        Class<?> cls = this.f341716b;
        com.fasterxml.jackson.databind.i<?> iVar = this.f341815g;
        if (iVar != null) {
            objV = iVar.e(jsonParser, fVar);
        } else {
            if (!this.f341818j) {
                jsonParser.l0();
                try {
                    return c36472k.p();
                } catch (Exception e12) {
                    Throwable thS = com.fasterxml.jackson.databind.util.g.s(e12);
                    com.fasterxml.jackson.databind.util.g.E(thS);
                    fVar.x(cls, thS);
                    throw null;
                }
            }
            com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341817i;
            if (vVarArr != null) {
                if (!jsonParser.c0()) {
                    fVar.W("Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", com.fasterxml.jackson.databind.util.g.t(n0(fVar)), c36472k, jsonParser.f());
                    throw null;
                }
                if (this.f341819k == null) {
                    this.f341819k = com.fasterxml.jackson.databind.deser.impl.v.b(fVar, this.f341816h, vVarArr, fVar.f341921d.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.g0();
                com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341819k;
                com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, null);
                JsonToken jsonTokenF = jsonParser.f();
                while (jsonTokenF == JsonToken.FIELD_NAME) {
                    String strD = jsonParser.d();
                    jsonParser.g0();
                    com.fasterxml.jackson.databind.deser.v vVarC = vVar.c(strD);
                    if (!yVarD.f(strD) || vVarC != null) {
                        if (vVarC != null) {
                            try {
                                yVarD.b(vVarC, vVarC.g(jsonParser, fVar));
                            } catch (Exception e13) {
                                String str = vVarC.f341896d.f342656b;
                                Throwable thS2 = com.fasterxml.jackson.databind.util.g.s(e13);
                                com.fasterxml.jackson.databind.util.g.D(thS2);
                                boolean z12 = fVar == null || fVar.O(DeserializationFeature.WRAP_EXCEPTIONS);
                                if (thS2 instanceof IOException) {
                                    if (!z12 || !(thS2 instanceof JacksonException)) {
                                        throw ((IOException) thS2);
                                    }
                                } else if (!z12) {
                                    com.fasterxml.jackson.databind.util.g.F(thS2);
                                }
                                int i12 = JsonMappingException.f341373e;
                                throw JsonMappingException.h(thS2, new JsonMappingException.a(cls, str));
                            }
                        } else {
                            jsonParser.l0();
                        }
                    }
                    jsonTokenF = jsonParser.g0();
                }
                return vVar.a(fVar, yVarD);
            }
            JsonToken jsonTokenF2 = jsonParser.f();
            if (jsonTokenF2 == null || jsonTokenF2.f341103i) {
                objV = jsonParser.V();
            } else {
                jsonParser.l0();
                objV = "";
            }
        }
        try {
            return c36472k.f342054e.invoke(cls, objV);
        } catch (Exception e14) {
            Throwable thS3 = com.fasterxml.jackson.databind.util.g.s(e14);
            com.fasterxml.jackson.databind.util.g.E(thS3);
            if ((thS3 instanceof IllegalArgumentException) && fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            fVar.x(cls, thS3);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return this.f341815g == null ? e(jsonParser, fVar) : lVar.b(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341816h;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342440j;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.FALSE;
    }

    public C36461o(Class<?> cls, C36472k c36472k) {
        super(cls);
        this.f341814f = c36472k;
        this.f341818j = false;
        this.f341813e = null;
        this.f341815g = null;
        this.f341816h = null;
        this.f341817i = null;
    }

    public C36461o(C36461o c36461o, com.fasterxml.jackson.databind.i<?> iVar) {
        super(c36461o.f341716b);
        this.f341813e = c36461o.f341813e;
        this.f341814f = c36461o.f341814f;
        this.f341818j = c36461o.f341818j;
        this.f341816h = c36461o.f341816h;
        this.f341817i = c36461o.f341817i;
        this.f341815g = iVar;
    }
}
