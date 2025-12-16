package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import rX0.InterfaceC47610a;

/* compiled from: MapEntryDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class u extends AbstractC36455i<Map.Entry<Object, Object>> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.m f341842i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341843j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341844k;

    public u(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i<Object> iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        super(hVar, (com.fasterxml.jackson.databind.deser.s) null, (Boolean) null);
        if (hVar.i() != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + hVar);
        }
        this.f341842i = mVar;
        this.f341843j = iVar;
        this.f341844k = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        com.fasterxml.jackson.databind.m mVar = this.f341842i;
        com.fasterxml.jackson.databind.m mVarR = mVar == 0 ? fVar.r(hVar.h(0), cVar) : mVar instanceof com.fasterxml.jackson.databind.deser.j ? ((com.fasterxml.jackson.databind.deser.j) mVar).a() : mVar;
        com.fasterxml.jackson.databind.i<?> iVar = this.f341843j;
        com.fasterxml.jackson.databind.i<?> iVarH0 = C.h0(fVar, cVar, iVar);
        com.fasterxml.jackson.databind.h hVarH = hVar.h(1);
        com.fasterxml.jackson.databind.i<?> iVarP = iVarH0 == null ? fVar.p(hVarH, cVar) : fVar.A(iVarH0, cVar, hVarH);
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341844k;
        com.fasterxml.jackson.databind.jsontype.l lVarF = lVar != null ? lVar.f(cVar) : lVar;
        return (mVar == mVarR && iVar == iVarP && lVar == lVarF) ? this : new u(this, mVarR, iVarP, lVarF);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objE;
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.START_OBJECT) {
            jsonTokenF = jsonParser.g0();
        } else if (jsonTokenF != JsonToken.FIELD_NAME && jsonTokenF != JsonToken.END_OBJECT) {
            if (jsonTokenF == JsonToken.START_ARRAY) {
                return E(jsonParser, fVar);
            }
            fVar.B(jsonParser, n0(fVar));
            throw null;
        }
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        if (jsonTokenF != jsonToken) {
            if (jsonTokenF == JsonToken.END_OBJECT) {
                fVar.V(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
                throw null;
            }
            fVar.E(this.f341716b, jsonParser);
            throw null;
        }
        String strD = jsonParser.d();
        Object objA = this.f341842i.a(fVar, strD);
        JsonToken jsonTokenG0 = jsonParser.g0();
        try {
            JsonToken jsonToken2 = JsonToken.VALUE_NULL;
            com.fasterxml.jackson.databind.i<Object> iVar = this.f341843j;
            if (jsonTokenG0 == jsonToken2) {
                objE = iVar.d(fVar);
            } else {
                com.fasterxml.jackson.databind.jsontype.l lVar = this.f341844k;
                objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
            }
            JsonToken jsonTokenG02 = jsonParser.g0();
            if (jsonTokenG02 == JsonToken.END_OBJECT) {
                return new AbstractMap.SimpleEntry(objA, objE);
            }
            if (jsonTokenG02 == jsonToken) {
                fVar.V(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.d());
                throw null;
            }
            fVar.V(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenG02, new Object[0]);
            throw null;
        } catch (Exception e12) {
            AbstractC36455i.r0(fVar, e12, Map.Entry.class, strD);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.d(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342434d;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341843j;
    }

    public u(u uVar, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i<Object> iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        super(uVar, uVar.f341785f, uVar.f341787h);
        this.f341842i = mVar;
        this.f341843j = iVar;
        this.f341844k = lVar;
    }
}
