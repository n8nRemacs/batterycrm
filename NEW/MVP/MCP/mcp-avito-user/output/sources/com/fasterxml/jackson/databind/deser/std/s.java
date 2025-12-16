package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.AbstractC36452f;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;

/* compiled from: JsonNodeDeserializer.java */
/* loaded from: classes4.dex */
public class s extends AbstractC36452f<com.fasterxml.jackson.databind.j> {

    /* renamed from: f, reason: collision with root package name */
    public static final s f341823f = new s();

    /* compiled from: JsonNodeDeserializer.java */
    public static final class a extends AbstractC36452f<com.fasterxml.jackson.databind.node.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f341824f = new a();
        private static final long serialVersionUID = 1;

        public a() {
            super(com.fasterxml.jackson.databind.node.a.class, Boolean.TRUE);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            if (!jsonParser.b0()) {
                fVar.E(com.fasterxml.jackson.databind.node.a.class, jsonParser);
                throw null;
            }
            com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
            mVar.getClass();
            com.fasterxml.jackson.databind.node.a aVar = new com.fasterxml.jackson.databind.node.a(mVar);
            r0(jsonParser, fVar, mVar, new AbstractC36452f.a(), aVar);
            return aVar;
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
            com.fasterxml.jackson.databind.node.a aVar = (com.fasterxml.jackson.databind.node.a) obj;
            if (jsonParser.b0()) {
                r0(jsonParser, fVar, fVar.f341921d.f341910l, new AbstractC36452f.a(), aVar);
                return aVar;
            }
            fVar.E(com.fasterxml.jackson.databind.node.a.class, jsonParser);
            throw null;
        }
    }

    /* compiled from: JsonNodeDeserializer.java */
    public static final class b extends AbstractC36452f<com.fasterxml.jackson.databind.node.t> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f341825f = new b();
        private static final long serialVersionUID = 1;

        public b() {
            super(com.fasterxml.jackson.databind.node.t.class, Boolean.TRUE);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
            if (jsonParser.c0()) {
                mVar.getClass();
                com.fasterxml.jackson.databind.node.t tVar = new com.fasterxml.jackson.databind.node.t(mVar);
                r0(jsonParser, fVar, mVar, new AbstractC36452f.a(), tVar);
                return tVar;
            }
            if (jsonParser.Y(JsonToken.FIELD_NAME)) {
                return s0(jsonParser, fVar, mVar, new AbstractC36452f.a());
            }
            if (jsonParser.Y(JsonToken.END_OBJECT)) {
                mVar.getClass();
                return new com.fasterxml.jackson.databind.node.t(mVar);
            }
            fVar.E(com.fasterxml.jackson.databind.node.t.class, jsonParser);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
            com.fasterxml.jackson.databind.node.t tVar = (com.fasterxml.jackson.databind.node.t) obj;
            if (jsonParser.c0() || jsonParser.Y(JsonToken.FIELD_NAME)) {
                return (com.fasterxml.jackson.databind.node.t) z0(jsonParser, fVar, tVar, new AbstractC36452f.a());
            }
            fVar.E(com.fasterxml.jackson.databind.node.t.class, jsonParser);
            throw null;
        }
    }

    public s() {
        super(com.fasterxml.jackson.databind.j.class, null);
    }

    public static com.fasterxml.jackson.databind.i<? extends com.fasterxml.jackson.databind.j> A0(Class<?> cls) {
        return cls == com.fasterxml.jackson.databind.node.t.class ? b.f341825f : cls == com.fasterxml.jackson.databind.node.a.class ? a.f341824f : f341823f;
    }

    @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public final Object b(com.fasterxml.jackson.databind.f fVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) {
        fVar.f341921d.f341910l.getClass();
        return com.fasterxml.jackson.databind.node.r.f342215b;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.node.f tVar;
        AbstractC36452f.a aVar = new AbstractC36452f.a();
        com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
        int iG2 = jsonParser.g();
        if (iG2 == 1) {
            mVar.getClass();
            tVar = new com.fasterxml.jackson.databind.node.t(mVar);
            r0(jsonParser, fVar, mVar, aVar, tVar);
        } else {
            if (iG2 == 2) {
                mVar.getClass();
                return new com.fasterxml.jackson.databind.node.t(mVar);
            }
            if (iG2 != 3) {
                return iG2 != 5 ? q0(jsonParser, fVar) : s0(jsonParser, fVar, mVar, aVar);
            }
            mVar.getClass();
            tVar = new com.fasterxml.jackson.databind.node.a(mVar);
            r0(jsonParser, fVar, mVar, aVar, tVar);
        }
        return tVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36452f, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.b(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36452f, com.fasterxml.jackson.databind.i
    public final /* bridge */ /* synthetic */ boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36452f, com.fasterxml.jackson.databind.i
    public final /* bridge */ /* synthetic */ LogicalType q() {
        return LogicalType.f342436f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36452f, com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return this.f341772e;
    }
}
