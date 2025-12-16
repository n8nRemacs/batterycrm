package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rX0.InterfaceC47610a;

/* compiled from: UntypedObjectDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class O extends C<Object> implements com.fasterxml.jackson.databind.deser.t, com.fasterxml.jackson.databind.deser.i {

    /* renamed from: l, reason: collision with root package name */
    public static final Object[] f341762l = new Object[0];
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341763e;

    /* renamed from: f, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341764f;

    /* renamed from: g, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341765g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f341766h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341767i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341768j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f341769k;

    /* compiled from: UntypedObjectDeserializer.java */
    @InterfaceC47610a
    public static class a extends C<Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f341770f = new a();
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f341771e;

        public a() {
            this(false);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return r0(jsonParser, fVar, 0);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
            if (this.f341771e) {
                return r0(jsonParser, fVar, 0);
            }
            int iG2 = jsonParser.g();
            if (iG2 != 1) {
                if (iG2 != 2) {
                    if (iG2 == 3) {
                        if (jsonParser.g0() == JsonToken.END_ARRAY) {
                            return obj;
                        }
                        if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            do {
                                collection.add(r0(jsonParser, fVar, 0));
                            } while (jsonParser.g0() != JsonToken.END_ARRAY);
                        }
                        return r0(jsonParser, fVar, 0);
                    }
                    if (iG2 != 4) {
                        if (iG2 == 5) {
                        }
                        return r0(jsonParser, fVar, 0);
                    }
                }
                return obj;
            }
            if (jsonParser.g0() == JsonToken.END_OBJECT) {
                return obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String strD = jsonParser.d();
                do {
                    jsonParser.g0();
                    Object obj2 = map.get(strD);
                    Object objF = obj2 != null ? f(jsonParser, fVar, obj2) : r0(jsonParser, fVar, 0);
                    if (objF != obj2) {
                        map.put(strD, objF);
                    }
                    strD = jsonParser.e0();
                } while (strD != null);
                return obj;
            }
            return r0(jsonParser, fVar, 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
        public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) throws MismatchedInputException {
            int iG2 = jsonParser.g();
            if (iG2 != 1 && iG2 != 3) {
                switch (iG2) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.L();
                    case 7:
                        return fVar.O(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.h() : jsonParser.D();
                    case 8:
                        return fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.q() : jsonParser.D();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.x();
                    default:
                        fVar.E(Object.class, jsonParser);
                        throw null;
                }
            }
            return lVar.b(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342436f;
        }

        public final void q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, LinkedHashMap linkedHashMap, String str, Object obj, Object obj2, String str2) throws MismatchedInputException, JsonParseException {
            boolean zN2 = fVar.N(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (zN2) {
                if (obj instanceof List) {
                    ((List) obj).add(obj2);
                    linkedHashMap.put(str, obj);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj);
                    arrayList.add(obj2);
                    linkedHashMap.put(str, arrayList);
                }
            }
            while (str2 != null) {
                jsonParser.g0();
                Object objR0 = r0(jsonParser, fVar, 0);
                Object objPut = linkedHashMap.put(str2, objR0);
                if (objPut != null && zN2) {
                    if (objPut instanceof List) {
                        ((List) objPut).add(objR0);
                        linkedHashMap.put(str2, objPut);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(objPut);
                        arrayList2.add(objR0);
                        linkedHashMap.put(str2, arrayList2);
                    }
                }
                str2 = jsonParser.e0();
            }
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
            if (this.f341771e) {
                return Boolean.FALSE;
            }
            return null;
        }

        public final Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, int i12) throws MismatchedInputException, JsonParseException {
            LinkedHashMap linkedHashMap;
            int i13 = 2;
            switch (jsonParser.g()) {
                case 1:
                    if (jsonParser.g0() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    if (jsonTokenG0 == jsonToken) {
                        return fVar.O(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? O.f341762l : new ArrayList(2);
                    }
                    if (i12 > 1000) {
                        throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
                    }
                    if (fVar.O(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        int i14 = i12 + 1;
                        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
                        Object[] objArrG = vVarQ.g();
                        int i15 = 0;
                        while (true) {
                            Object objR0 = r0(jsonParser, fVar, i14);
                            if (i15 >= objArrG.length) {
                                objArrG = vVarQ.c(objArrG);
                                i15 = 0;
                            }
                            int i16 = i15 + 1;
                            objArrG[i15] = objR0;
                            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                                return vVarQ.e(i16, objArrG);
                            }
                            i15 = i16;
                        }
                    } else {
                        int i17 = i12 + 1;
                        Object objR02 = r0(jsonParser, fVar, i17);
                        if (jsonParser.g0() == jsonToken) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(objR02);
                            return arrayList;
                        }
                        Object objR03 = r0(jsonParser, fVar, i17);
                        if (jsonParser.g0() == jsonToken) {
                            ArrayList arrayList2 = new ArrayList(2);
                            arrayList2.add(objR02);
                            arrayList2.add(objR03);
                            return arrayList2;
                        }
                        com.fasterxml.jackson.databind.util.v vVarQ2 = fVar.Q();
                        Object[] objArrG2 = vVarQ2.g();
                        objArrG2[0] = objR02;
                        objArrG2[1] = objR03;
                        int i18 = 2;
                        while (true) {
                            Object objR04 = r0(jsonParser, fVar, i17);
                            i13++;
                            if (i18 >= objArrG2.length) {
                                objArrG2 = vVarQ2.c(objArrG2);
                                i18 = 0;
                            }
                            int i19 = i18 + 1;
                            objArrG2[i18] = objR04;
                            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                                ArrayList arrayList3 = new ArrayList(i13);
                                vVarQ2.d(objArrG2, i19, arrayList3);
                                return arrayList3;
                            }
                            i18 = i19;
                        }
                    }
                case 4:
                default:
                    fVar.E(Object.class, jsonParser);
                    throw null;
                case 5:
                    break;
                case 6:
                    return jsonParser.L();
                case 7:
                    return fVar.J(C.f341715d) ? C.B(jsonParser, fVar) : jsonParser.D();
                case 8:
                    return fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.q() : jsonParser.D();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.x();
            }
            if (i12 > 1000) {
                throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
            }
            int i22 = i12 + 1;
            String strD = jsonParser.d();
            jsonParser.g0();
            Object objR05 = r0(jsonParser, fVar, i22);
            String strE0 = jsonParser.e0();
            if (strE0 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
                linkedHashMap2.put(strD, objR05);
                return linkedHashMap2;
            }
            jsonParser.g0();
            Object objR06 = r0(jsonParser, fVar, i22);
            String strE02 = jsonParser.e0();
            if (strE02 == null) {
                linkedHashMap = new LinkedHashMap(4);
                linkedHashMap.put(strD, objR05);
                if (linkedHashMap.put(strE0, objR06) != null) {
                    q0(jsonParser, fVar, linkedHashMap, strD, objR05, objR06, strE02);
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(strD, objR05);
                if (linkedHashMap.put(strE0, objR06) != null) {
                    q0(jsonParser, fVar, linkedHashMap, strD, objR05, objR06, strE02);
                } else {
                    String strE03 = strE02;
                    while (true) {
                        jsonParser.g0();
                        Object objR07 = r0(jsonParser, fVar, i22);
                        Object objPut = linkedHashMap.put(strE03, objR07);
                        if (objPut != null) {
                            q0(jsonParser, fVar, linkedHashMap, strE03, objPut, objR07, jsonParser.e0());
                        } else {
                            strE03 = jsonParser.e0();
                            if (strE03 == null) {
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        public a(boolean z12) {
            super((Class<?>) Object.class);
            this.f341771e = z12;
        }
    }

    @Deprecated
    public O() {
        this((com.fasterxml.jackson.databind.h) null, (com.fasterxml.jackson.databind.h) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.fasterxml.jackson.databind.deser.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f r3, com.fasterxml.jackson.databind.c r4) {
        /*
            r2 = this;
            r0 = 1
            if (r4 != 0) goto L15
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            com.fasterxml.jackson.databind.e r3 = r3.f341921d
            com.fasterxml.jackson.databind.cfg.f r3 = r3.f341514h
            r3.getClass()
            r3 = 0
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L15
            r3 = r0
            goto L16
        L15:
            r3 = 0
        L16:
            com.fasterxml.jackson.databind.i<java.lang.Object> r4 = r2.f341765g
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.i<java.lang.Object> r4 = r2.f341766h
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.i<java.lang.Object> r4 = r2.f341763e
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.i<java.lang.Object> r4 = r2.f341764f
            if (r4 != 0) goto L39
            java.lang.Class r4 = r2.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.O> r1 = com.fasterxml.jackson.databind.deser.std.O.class
            if (r4 != r1) goto L39
            if (r3 == 0) goto L36
            com.fasterxml.jackson.databind.deser.std.O$a r3 = new com.fasterxml.jackson.databind.deser.std.O$a
            r3.<init>(r0)
            goto L38
        L36:
            com.fasterxml.jackson.databind.deser.std.O$a r3 = com.fasterxml.jackson.databind.deser.std.O.a.f341770f
        L38:
            return r3
        L39:
            boolean r4 = r2.f341769k
            if (r3 == r4) goto L43
            com.fasterxml.jackson.databind.deser.std.O r4 = new com.fasterxml.jackson.databind.deser.std.O
            r4.<init>(r2, r3)
            return r4
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.O.a(com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.i");
    }

    @Override // com.fasterxml.jackson.databind.deser.t
    public final void c(com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.h hVarL = fVar.l(Object.class);
        com.fasterxml.jackson.databind.h hVarL2 = fVar.l(String.class);
        com.fasterxml.jackson.databind.type.n nVarE = fVar.e();
        com.fasterxml.jackson.databind.h hVar = this.f341767i;
        if (hVar == null) {
            com.fasterxml.jackson.databind.i<Object> iVarS = fVar.s(nVarE.f(hVarL, List.class));
            if (com.fasterxml.jackson.databind.util.g.x(iVarS)) {
                iVarS = null;
            }
            this.f341764f = iVarS;
        } else {
            this.f341764f = fVar.s(hVar);
        }
        com.fasterxml.jackson.databind.h hVar2 = this.f341768j;
        if (hVar2 == null) {
            com.fasterxml.jackson.databind.i<Object> iVarS2 = fVar.s(nVarE.i(Map.class, hVarL2, hVarL));
            if (com.fasterxml.jackson.databind.util.g.x(iVarS2)) {
                iVarS2 = null;
            }
            this.f341763e = iVarS2;
        } else {
            this.f341763e = fVar.s(hVar2);
        }
        com.fasterxml.jackson.databind.i<Object> iVarS3 = fVar.s(hVarL2);
        if (com.fasterxml.jackson.databind.util.g.x(iVarS3)) {
            iVarS3 = null;
        }
        this.f341765g = iVarS3;
        com.fasterxml.jackson.databind.i<Object> iVarS4 = fVar.s(nVarE.l(Number.class));
        if (com.fasterxml.jackson.databind.util.g.x(iVarS4)) {
            iVarS4 = null;
        }
        this.f341766h = iVarS4;
        com.fasterxml.jackson.databind.type.k kVarP = com.fasterxml.jackson.databind.type.n.p();
        this.f341763e = fVar.A(this.f341763e, null, kVarP);
        this.f341764f = fVar.A(this.f341764f, null, kVarP);
        this.f341765g = fVar.A(this.f341765g, null, kVarP);
        this.f341766h = fVar.A(this.f341766h, null, kVarP);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        switch (jsonParser.g()) {
            case 1:
            case 2:
            case 5:
                com.fasterxml.jackson.databind.i<Object> iVar = this.f341763e;
                return iVar != null ? iVar.e(jsonParser, fVar) : t0(jsonParser, fVar);
            case 3:
                if (fVar.O(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return s0(jsonParser, fVar);
                }
                com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341764f;
                return iVar2 != null ? iVar2.e(jsonParser, fVar) : r0(jsonParser, fVar);
            case 4:
            default:
                fVar.E(Object.class, jsonParser);
                throw null;
            case 6:
                com.fasterxml.jackson.databind.i<Object> iVar3 = this.f341765g;
                return iVar3 != null ? iVar3.e(jsonParser, fVar) : jsonParser.L();
            case 7:
                com.fasterxml.jackson.databind.i<Object> iVar4 = this.f341766h;
                return iVar4 != null ? iVar4.e(jsonParser, fVar) : fVar.J(C.f341715d) ? C.B(jsonParser, fVar) : jsonParser.D();
            case 8:
                com.fasterxml.jackson.databind.i<Object> iVar5 = this.f341766h;
                return iVar5 != null ? iVar5.e(jsonParser, fVar) : fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.q() : jsonParser.D();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.x();
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        if (this.f341769k) {
            return e(jsonParser, fVar);
        }
        switch (jsonParser.g()) {
            case 1:
            case 2:
            case 5:
                com.fasterxml.jackson.databind.i<Object> iVar = this.f341763e;
                if (iVar == null) {
                    if (!(obj instanceof Map)) {
                        break;
                    } else {
                        Map map = (Map) obj;
                        JsonToken jsonTokenF = jsonParser.f();
                        if (jsonTokenF == JsonToken.START_OBJECT) {
                            jsonTokenF = jsonParser.g0();
                        }
                        if (jsonTokenF != JsonToken.END_OBJECT) {
                            String strD = jsonParser.d();
                            do {
                                jsonParser.g0();
                                Object obj2 = map.get(strD);
                                Object objF = obj2 != null ? f(jsonParser, fVar, obj2) : e(jsonParser, fVar);
                                if (objF != obj2) {
                                    map.put(strD, objF);
                                }
                                strD = jsonParser.e0();
                            } while (strD != null);
                        }
                    }
                } else {
                    break;
                }
                break;
            case 3:
                com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341764f;
                if (iVar2 == null) {
                    if (!(obj instanceof Collection)) {
                        if (!fVar.O(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        Collection collection = (Collection) obj;
                        while (jsonParser.g0() != JsonToken.END_ARRAY) {
                            collection.add(e(jsonParser, fVar));
                        }
                        break;
                    }
                } else {
                    break;
                }
            case 6:
                com.fasterxml.jackson.databind.i<Object> iVar3 = this.f341765g;
                if (iVar3 == null) {
                    break;
                } else {
                    break;
                }
            case 7:
                com.fasterxml.jackson.databind.i<Object> iVar4 = this.f341766h;
                if (iVar4 == null) {
                    if (!fVar.J(C.f341715d)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                com.fasterxml.jackson.databind.i<Object> iVar5 = this.f341766h;
                if (iVar5 == null) {
                    if (!fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return e(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 != 1 && iG2 != 3) {
            switch (iG2) {
                case 5:
                    break;
                case 6:
                    com.fasterxml.jackson.databind.i<Object> iVar = this.f341765g;
                    return iVar != null ? iVar.e(jsonParser, fVar) : jsonParser.L();
                case 7:
                    com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341766h;
                    return iVar2 != null ? iVar2.e(jsonParser, fVar) : fVar.J(C.f341715d) ? C.B(jsonParser, fVar) : jsonParser.D();
                case 8:
                    com.fasterxml.jackson.databind.i<Object> iVar3 = this.f341766h;
                    return iVar3 != null ? iVar3.e(jsonParser, fVar) : fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.q() : jsonParser.D();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.x();
                default:
                    fVar.E(Object.class, jsonParser);
                    throw null;
            }
        }
        return lVar.b(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final LogicalType q() {
        return LogicalType.f342436f;
    }

    public final void q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, LinkedHashMap linkedHashMap, String str, Object obj, Object obj2, String str2) throws MismatchedInputException {
        boolean zN2 = fVar.N(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zN2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                linkedHashMap.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                linkedHashMap.put(str, arrayList);
            }
        }
        while (str2 != null) {
            jsonParser.g0();
            Object objE = e(jsonParser, fVar);
            Object objPut = linkedHashMap.put(str2, objE);
            if (objPut != null && zN2) {
                if (objPut instanceof List) {
                    ((List) objPut).add(objE);
                    linkedHashMap.put(str, objPut);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(objPut);
                    arrayList2.add(objE);
                    linkedHashMap.put(str, arrayList2);
                }
            }
            str2 = jsonParser.e0();
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return null;
    }

    public final ArrayList r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        JsonToken jsonTokenG0 = jsonParser.g0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i12 = 2;
        if (jsonTokenG0 == jsonToken) {
            return new ArrayList(2);
        }
        Object objE = e(jsonParser, fVar);
        if (jsonParser.g0() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objE);
            return arrayList;
        }
        Object objE2 = e(jsonParser, fVar);
        if (jsonParser.g0() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objE);
            arrayList2.add(objE2);
            return arrayList2;
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        Object[] objArrG = vVarQ.g();
        objArrG[0] = objE;
        objArrG[1] = objE2;
        int i13 = 2;
        while (true) {
            Object objE3 = e(jsonParser, fVar);
            i12++;
            if (i13 >= objArrG.length) {
                objArrG = vVarQ.c(objArrG);
                i13 = 0;
            }
            int i14 = i13 + 1;
            objArrG[i13] = objE3;
            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i12);
                vVarQ.d(objArrG, i14, arrayList3);
                return arrayList3;
            }
            i13 = i14;
        }
    }

    public final Object[] s0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.g0() == JsonToken.END_ARRAY) {
            return f341762l;
        }
        com.fasterxml.jackson.databind.util.v vVarQ = fVar.Q();
        Object[] objArrG = vVarQ.g();
        int i12 = 0;
        while (true) {
            Object objE = e(jsonParser, fVar);
            if (i12 >= objArrG.length) {
                objArrG = vVarQ.c(objArrG);
                i12 = 0;
            }
            int i13 = i12 + 1;
            objArrG[i12] = objE;
            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                return vVarQ.e(i13, objArrG);
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap t0(com.fasterxml.jackson.core.JsonParser r20, com.fasterxml.jackson.databind.f r21) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r19 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r20.f()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto Le
            java.lang.String r0 = r20.e0()
        Lc:
            r7 = r0
            goto L1d
        Le:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto L17
            java.lang.String r0 = r20.d()
            goto Lc
        L17:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r2 = 0
            if (r0 != r1) goto La2
            r7 = r2
        L1d:
            r0 = 2
            if (r7 != 0) goto L26
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            return r1
        L26:
            r20.g0()
            java.lang.Object r8 = r19.e(r20, r21)
            java.lang.String r1 = r20.e0()
            if (r1 != 0) goto L3c
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r1.put(r7, r8)
            return r1
        L3c:
            r20.g0()
            java.lang.Object r9 = r19.e(r20, r21)
            java.lang.String r10 = r20.e0()
            if (r10 != 0) goto L63
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r2 = 4
            r0.<init>(r2)
            r0.put(r7, r8)
            java.lang.Object r1 = r0.put(r1, r9)
            if (r1 == 0) goto L62
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r0
            r3.q0(r4, r5, r6, r7, r8, r9, r10)
        L62:
            return r0
        L63:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0.put(r7, r8)
            java.lang.Object r1 = r0.put(r1, r9)
            if (r1 == 0) goto L7c
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r0
            r3.q0(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L7c:
            r15 = r10
        L7d:
            r20.g0()
            java.lang.Object r1 = r19.e(r20, r21)
            java.lang.Object r16 = r0.put(r15, r1)
            if (r16 == 0) goto L9b
            java.lang.String r18 = r20.e0()
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r0
            r17 = r1
            r11.q0(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L9b:
            java.lang.String r15 = r20.e0()
            if (r15 != 0) goto L7d
            return r0
        La2:
            r1 = r19
            java.lang.Class<?> r0 = r1.f341716b
            r3 = r20
            r4 = r21
            r4.E(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.O.t0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f):java.util.LinkedHashMap");
    }

    public O(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2) {
        super((Class<?>) Object.class);
        this.f341767i = hVar;
        this.f341768j = hVar2;
        this.f341769k = false;
    }

    public O(O o12, boolean z12) {
        super((Class<?>) Object.class);
        this.f341763e = o12.f341763e;
        this.f341764f = o12.f341764f;
        this.f341765g = o12.f341765g;
        this.f341766h = o12.f341766h;
        this.f341767i = o12.f341767i;
        this.f341768j = o12.f341768j;
        this.f341769k = z12;
    }
}
