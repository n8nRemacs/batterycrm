package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: CollectionDeserializer.java */
@InterfaceC47610a
/* renamed from: com.fasterxml.jackson.databind.deser.std.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36454h extends AbstractC36455i<Collection<Object>> implements com.fasterxml.jackson.databind.deser.i {
    private static final long serialVersionUID = -1;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341776i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341777j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341778k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341779l;

    /* compiled from: CollectionDeserializer.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.h$a */
    public static final class a extends z.a {

        /* renamed from: b, reason: collision with root package name */
        public final b f341780b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f341781c;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference) {
            super(unresolvedForwardReference);
            this.f341781c = new ArrayList();
            this.f341780b = bVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.z.a
        public final void a(Object obj, Object obj2) {
            b bVar = this.f341780b;
            Iterator it = bVar.f341783b.iterator();
            Collection<Object> collection = bVar.f341782a;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                boolean zEquals = obj.equals(aVar.f341700a.f341520f.f341697b.f340903d);
                ArrayList arrayList = aVar.f341781c;
                if (zEquals) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(arrayList);
                    return;
                }
                collection = arrayList;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    /* compiled from: CollectionDeserializer.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.h$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<Object> f341782a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f341783b = new ArrayList();

        public b(Class<?> cls, Collection<Object> collection) {
            this.f341782a = collection;
        }

        public final void a(Object obj) {
            ArrayList arrayList = this.f341783b;
            if (arrayList.isEmpty()) {
                this.f341782a.add(obj);
            } else {
                ((a) androidx.appcompat.app.r.j(1, arrayList)).f341781c.add(obj);
            }
        }
    }

    public C36454h(com.fasterxml.jackson.databind.type.e eVar, com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.x xVar) {
        this(eVar, iVar, lVar, xVar, null, null, null);
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) throws InvalidDefinitionException {
        com.fasterxml.jackson.databind.i<Object> iVarP = null;
        com.fasterxml.jackson.databind.h hVar = this.f341784e;
        com.fasterxml.jackson.databind.deser.x xVar = this.f341778k;
        if (xVar != null) {
            if (xVar.l()) {
                com.fasterxml.jackson.databind.h hVarF = xVar.F(fVar.f341921d);
                if (hVarF == null) {
                    fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, xVar.getClass().getName()));
                    throw null;
                }
                iVarP = fVar.p(hVarF, cVar);
            } else if (xVar.i()) {
                com.fasterxml.jackson.databind.h hVarB = xVar.B(fVar.f341921d);
                if (hVarB == null) {
                    fVar.i(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, xVar.getClass().getName()));
                    throw null;
                }
                iVarP = fVar.p(hVarB, cVar);
            }
        }
        com.fasterxml.jackson.databind.i<Object> iVar = iVarP;
        Boolean boolI0 = C.i0(fVar, cVar, Collection.class, JsonFormat.Feature.f340927b);
        com.fasterxml.jackson.databind.i<?> iVar2 = this.f341776i;
        com.fasterxml.jackson.databind.i<?> iVarH0 = C.h0(fVar, cVar, iVar2);
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        com.fasterxml.jackson.databind.i<?> iVarP2 = iVarH0 == null ? fVar.p(hVarN, cVar) : fVar.A(iVarH0, cVar, hVarN);
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341777j;
        com.fasterxml.jackson.databind.jsontype.l lVarF = lVar != null ? lVar.f(cVar) : lVar;
        com.fasterxml.jackson.databind.deser.s sVarG0 = C.g0(fVar, cVar, iVarP2);
        return (Objects.equals(boolI0, this.f341787h) && sVarG0 == this.f341785f && iVar == this.f341779l && iVarP2 == iVar2 && lVarF == lVar) ? this : v0(iVar, iVarP2, lVarF, sVarG0, boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws InvalidFormatException {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341779l;
        if (iVar != null) {
            return (Collection) this.f341778k.z(fVar, iVar.e(jsonParser, fVar));
        }
        if (jsonParser.b0()) {
            return s0(jsonParser, fVar, t0(fVar));
        }
        if (!jsonParser.Y(JsonToken.VALUE_STRING)) {
            return u0(jsonParser, fVar, t0(fVar));
        }
        String strL = jsonParser.L();
        boolean zIsEmpty = strL.isEmpty();
        LogicalType logicalType = LogicalType.f342433c;
        Class<?> cls = this.f341716b;
        if (zIsEmpty) {
            CoercionAction coercionActionN = fVar.n(logicalType, cls, CoercionInputShape.f341469f);
            t(fVar, coercionActionN, strL, "empty String (\"\")");
            if (coercionActionN != null) {
                return (Collection) F(fVar, coercionActionN);
            }
        } else if (C.I(strL)) {
            return (Collection) F(fVar, fVar.o(logicalType, cls));
        }
        return u0(jsonParser, fVar, t0(fVar));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        Collection<Object> collection = (Collection) obj;
        return jsonParser.b0() ? s0(jsonParser, fVar, collection) : u0(jsonParser, fVar, collection);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final com.fasterxml.jackson.databind.deser.x l0() {
        return this.f341778k;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return this.f341776i == null && this.f341777j == null && this.f341779l == null;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342433c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC36455i
    public final com.fasterxml.jackson.databind.i<Object> q0() {
        return this.f341776i;
    }

    public Collection<Object> s0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Collection<Object> collection) throws JsonMappingException {
        Object objE;
        Object objE2;
        jsonParser.k0(collection);
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341776i;
        com.fasterxml.jackson.databind.deser.impl.s sVarN = iVar.n();
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341777j;
        com.fasterxml.jackson.databind.deser.s sVar = this.f341785f;
        boolean z12 = this.f341786g;
        if (sVarN == null) {
            while (true) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    return collection;
                }
                try {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                    } else if (!z12) {
                        objE = sVar.d(fVar);
                    }
                    collection.add(objE);
                } catch (Exception e12) {
                    if (fVar != null && !fVar.O(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        com.fasterxml.jackson.databind.util.g.F(e12);
                    }
                    throw JsonMappingException.i(e12, collection, collection.size());
                }
            }
        } else {
            if (!jsonParser.b0()) {
                return u0(jsonParser, fVar, collection);
            }
            jsonParser.k0(collection);
            b bVar = new b(this.f341784e.n().f341930b, collection);
            while (true) {
                JsonToken jsonTokenG02 = jsonParser.g0();
                if (jsonTokenG02 == JsonToken.END_ARRAY) {
                    return collection;
                }
                try {
                } catch (UnresolvedForwardReference e13) {
                    a aVar = new a(bVar, e13);
                    bVar.f341783b.add(aVar);
                    e13.f341520f.a(aVar);
                } catch (Exception e14) {
                    if (fVar != null && !fVar.O(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        com.fasterxml.jackson.databind.util.g.F(e14);
                    }
                    throw JsonMappingException.i(e14, collection, collection.size());
                }
                if (jsonTokenG02 != JsonToken.VALUE_NULL) {
                    objE2 = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
                } else if (!z12) {
                    objE2 = sVar.d(fVar);
                }
                bVar.a(objE2);
            }
        }
    }

    public Collection<Object> t0(com.fasterxml.jackson.databind.f fVar) {
        return (Collection) this.f341778k.y(fVar);
    }

    public final Collection<Object> u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Collection<Object> collection) throws JsonMappingException {
        Object objE;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f341787h;
        if (bool2 != bool && (bool2 != null || !fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            fVar.B(jsonParser, this.f341784e);
            throw null;
        }
        try {
            if (!jsonParser.Y(JsonToken.VALUE_NULL)) {
                com.fasterxml.jackson.databind.i<Object> iVar = this.f341776i;
                com.fasterxml.jackson.databind.jsontype.l lVar = this.f341777j;
                objE = lVar == null ? iVar.e(jsonParser, fVar) : iVar.g(jsonParser, fVar, lVar);
            } else {
                if (this.f341786g) {
                    return collection;
                }
                objE = this.f341785f.d(fVar);
            }
            collection.add(objE);
            return collection;
        } catch (Exception e12) {
            if (!fVar.O(DeserializationFeature.WRAP_EXCEPTIONS)) {
                com.fasterxml.jackson.databind.util.g.F(e12);
            }
            throw JsonMappingException.i(e12, Object.class, collection.size());
        }
    }

    public C36454h v0(com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.i<?> iVar2, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        return new C36454h(this.f341784e, iVar2, lVar, this.f341778k, iVar, sVar, bool);
    }

    public C36454h(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.i<Object> iVar, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.i<Object> iVar2, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(hVar, sVar, bool);
        this.f341776i = iVar;
        this.f341777j = lVar;
        this.f341778k = xVar;
        this.f341779l = iVar2;
    }
}
