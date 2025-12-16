package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;

/* compiled from: TypeSerializerBase.java */
/* loaded from: classes4.dex */
public abstract class t extends com.fasterxml.jackson.databind.jsontype.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.m f342177a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342178b;

    public t(com.fasterxml.jackson.databind.jsontype.m mVar, com.fasterxml.jackson.databind.c cVar) {
        this.f342177a = mVar;
        this.f342178b = cVar;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public String b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws JsonGenerationException {
        if (writableTypeId.f341266c == null) {
            Object obj = writableTypeId.f341264a;
            Class<?> cls = writableTypeId.f341265b;
            com.fasterxml.jackson.databind.jsontype.m mVar = this.f342177a;
            writableTypeId.f341266c = cls == null ? mVar.a(obj) : mVar.e(cls, obj);
        }
        jsonGenerator.getClass();
        Object obj2 = writableTypeId.f341266c;
        boolean zF2 = jsonGenerator.f();
        JsonToken jsonToken = writableTypeId.f341269f;
        if (zF2) {
            writableTypeId.f341270g = false;
            jsonGenerator.l0(obj2);
        } else {
            String strValueOf = obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
            writableTypeId.f341270g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.f341268e;
            if (jsonToken != JsonToken.START_OBJECT) {
                inclusion.getClass();
                if (inclusion == WritableTypeId.Inclusion.f341273d || inclusion == WritableTypeId.Inclusion.f341274e) {
                    inclusion = WritableTypeId.Inclusion.f341271b;
                    writableTypeId.f341268e = inclusion;
                }
            }
            int iOrdinal = inclusion.ordinal();
            if (iOrdinal == 1) {
                jsonGenerator.e0();
                jsonGenerator.G(strValueOf);
            } else {
                if (iOrdinal == 2) {
                    jsonGenerator.f0(writableTypeId.f341264a);
                    jsonGenerator.k0(writableTypeId.f341267d, strValueOf);
                    return writableTypeId;
                }
                if (iOrdinal != 3 && iOrdinal != 4) {
                    jsonGenerator.a0();
                    jsonGenerator.i0(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.f0(writableTypeId.f341264a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.a0();
        }
        return writableTypeId;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.o
    public final WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        jsonGenerator.getClass();
        JsonToken jsonToken = writableTypeId.f341269f;
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.B();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.A();
        }
        if (writableTypeId.f341270g) {
            int iOrdinal = writableTypeId.f341268e.ordinal();
            if (iOrdinal == 0) {
                jsonGenerator.A();
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    jsonGenerator.B();
                } else {
                    Object obj = writableTypeId.f341266c;
                    jsonGenerator.k0(writableTypeId.f341267d, obj instanceof String ? (String) obj : String.valueOf(obj));
                }
            }
        }
        return writableTypeId;
    }
}
