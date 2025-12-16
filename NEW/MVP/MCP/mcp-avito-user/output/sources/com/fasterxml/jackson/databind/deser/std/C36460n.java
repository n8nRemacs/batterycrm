package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.EnumSet;
import java.util.Objects;

/* compiled from: EnumSetDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36460n extends C<EnumSet<?>> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341808e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Enum<?>> f341809f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.s f341810g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341811h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f341812i;

    public C36460n(com.fasterxml.jackson.databind.h hVar) {
        super((Class<?>) EnumSet.class);
        this.f341808e = hVar;
        if (!hVar.C()) {
            throw new IllegalArgumentException("Type " + hVar + " not Java Enum type");
        }
        this.f341809f = null;
        this.f341812i = null;
        this.f341810g = null;
        this.f341811h = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        Boolean boolI0 = C.i0(fVar, cVar, EnumSet.class, JsonFormat.Feature.f340927b);
        com.fasterxml.jackson.databind.i<Enum<?>> iVar = this.f341809f;
        com.fasterxml.jackson.databind.h hVar = this.f341808e;
        com.fasterxml.jackson.databind.i<?> iVarP = iVar == null ? fVar.p(hVar, cVar) : fVar.A(iVar, cVar, hVar);
        return (Objects.equals(this.f341812i, boolI0) && iVar == iVarP && this.f341810g == iVarP) ? this : new C36460n(this, iVarP, C.g0(fVar, cVar, iVarP), boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(this.f341808e.f341930b);
        if (jsonParser.b0()) {
            q0(jsonParser, fVar, enumSetNoneOf);
        } else {
            r0(jsonParser, fVar, enumSetNoneOf);
        }
        return enumSetNoneOf;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        EnumSet enumSet = (EnumSet) obj;
        if (jsonParser.b0()) {
            q0(jsonParser, fVar, enumSet);
        } else {
            r0(jsonParser, fVar, enumSet);
        }
        return enumSet;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342526d;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return EnumSet.noneOf(this.f341808e.f341930b);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341808e.f341932d == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342433c;
    }

    public final void q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, EnumSet enumSet) throws JsonMappingException {
        Enum<?> enumE;
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.g0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    return;
                }
                if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                    enumE = this.f341809f.e(jsonParser, fVar);
                } else if (!this.f341811h) {
                    enumE = (Enum) this.f341810g.d(fVar);
                }
                if (enumE != null) {
                    enumSet.add(enumE);
                }
            } catch (Exception e12) {
                throw JsonMappingException.i(e12, enumSet, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    public final void r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, EnumSet enumSet) throws JsonMappingException {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f341812i;
        if (bool2 != bool && (bool2 != null || !fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            fVar.E(EnumSet.class, jsonParser);
            throw null;
        }
        if (jsonParser.Y(JsonToken.VALUE_NULL)) {
            fVar.B(jsonParser, this.f341808e);
            throw null;
        }
        try {
            Enum<?> enumE = this.f341809f.e(jsonParser, fVar);
            if (enumE != null) {
                enumSet.add(enumE);
            }
        } catch (Exception e12) {
            throw JsonMappingException.i(e12, enumSet, enumSet.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36460n(C36460n c36460n, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(c36460n);
        this.f341808e = c36460n.f341808e;
        this.f341809f = iVar;
        this.f341810g = sVar;
        this.f341811h = com.fasterxml.jackson.databind.deser.impl.q.a(sVar);
        this.f341812i = bool;
    }
}
