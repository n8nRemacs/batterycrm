package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.j;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Closeable;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: JsonNodeDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC36452f<T extends com.fasterxml.jackson.databind.j> extends C<T> {

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f341772e;

    /* compiled from: JsonNodeDeserializer.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public com.fasterxml.jackson.databind.node.f[] f341773a;

        /* renamed from: b, reason: collision with root package name */
        public int f341774b;

        /* renamed from: c, reason: collision with root package name */
        public int f341775c;

        public final void a(com.fasterxml.jackson.databind.node.f fVar) {
            int i12 = this.f341774b;
            int i13 = this.f341775c;
            if (i12 < i13) {
                com.fasterxml.jackson.databind.node.f[] fVarArr = this.f341773a;
                this.f341774b = i12 + 1;
                fVarArr[i12] = fVar;
                return;
            }
            if (this.f341773a == null) {
                this.f341775c = 10;
                this.f341773a = new com.fasterxml.jackson.databind.node.f[10];
            } else {
                int iMin = Math.min(4000, Math.max(20, i13 >> 1)) + i13;
                this.f341775c = iMin;
                this.f341773a = (com.fasterxml.jackson.databind.node.f[]) Arrays.copyOf(this.f341773a, iMin);
            }
            com.fasterxml.jackson.databind.node.f[] fVarArr2 = this.f341773a;
            int i14 = this.f341774b;
            this.f341774b = i14 + 1;
            fVarArr2[i14] = fVar;
        }
    }

    public AbstractC36452f(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this.f341772e = bool;
    }

    public static com.fasterxml.jackson.databind.j u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
        Object objX = jsonParser.x();
        if (objX == null) {
            mVar.getClass();
            return com.fasterxml.jackson.databind.node.r.f342215b;
        }
        if (objX.getClass() == byte[].class) {
            byte[] bArr = (byte[]) objX;
            mVar.getClass();
            com.fasterxml.jackson.databind.node.d dVar = com.fasterxml.jackson.databind.node.d.f342188c;
            return bArr.length == 0 ? com.fasterxml.jackson.databind.node.d.f342188c : new com.fasterxml.jackson.databind.node.d(bArr);
        }
        if (objX instanceof com.fasterxml.jackson.databind.util.x) {
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.u((com.fasterxml.jackson.databind.util.x) objX);
        }
        if (objX instanceof com.fasterxml.jackson.databind.j) {
            return (com.fasterxml.jackson.databind.j) objX;
        }
        mVar.getClass();
        return new com.fasterxml.jackson.databind.node.u(objX);
    }

    public static com.fasterxml.jackson.databind.node.y v0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.node.m mVar) {
        JsonParser.NumberType numberTypeB = jsonParser.B();
        if (numberTypeB == JsonParser.NumberType.f341079g) {
            return mVar.a(jsonParser.q());
        }
        if (fVar.O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (!jsonParser.d0()) {
                return mVar.a(jsonParser.q());
            }
            double dU2 = jsonParser.u();
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.h(dU2);
        }
        if (numberTypeB == JsonParser.NumberType.f341077e) {
            float fY2 = jsonParser.y();
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.i(fY2);
        }
        double dU3 = jsonParser.u();
        mVar.getClass();
        return new com.fasterxml.jackson.databind.node.h(dU3);
    }

    public static com.fasterxml.jackson.databind.node.y w0(JsonParser jsonParser, int i12, com.fasterxml.jackson.databind.node.m mVar) {
        if (i12 != 0) {
            if ((i12 & DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.f341372c) != 0) {
                BigInteger bigIntegerH = jsonParser.h();
                mVar.getClass();
                return bigIntegerH == null ? com.fasterxml.jackson.databind.node.r.f342215b : new com.fasterxml.jackson.databind.node.c(bigIntegerH);
            }
            long jA2 = jsonParser.A();
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.n(jA2);
        }
        JsonParser.NumberType numberTypeB = jsonParser.B();
        if (numberTypeB == JsonParser.NumberType.f341074b) {
            int iZ2 = jsonParser.z();
            mVar.getClass();
            com.fasterxml.jackson.databind.node.j[] jVarArr = com.fasterxml.jackson.databind.node.j.f342198c;
            return (iZ2 > 10 || iZ2 < -1) ? new com.fasterxml.jackson.databind.node.j(iZ2) : com.fasterxml.jackson.databind.node.j.f342198c[iZ2 - (-1)];
        }
        if (numberTypeB == JsonParser.NumberType.f341075c) {
            long jA3 = jsonParser.A();
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.n(jA3);
        }
        BigInteger bigIntegerH2 = jsonParser.h();
        mVar.getClass();
        return bigIntegerH2 == null ? com.fasterxml.jackson.databind.node.r.f342215b : new com.fasterxml.jackson.databind.node.c(bigIntegerH2);
    }

    public static com.fasterxml.jackson.databind.node.y x0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.node.m mVar) {
        int i12 = fVar.f341922e;
        int i13 = C.f341715d & i12;
        JsonParser.NumberType numberType = JsonParser.NumberType.f341075c;
        JsonParser.NumberType numberTypeB = i13 != 0 ? (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.f341372c & i12) != 0 ? JsonParser.NumberType.f341076d : (i12 & DeserializationFeature.USE_LONG_FOR_INTS.f341372c) != 0 ? numberType : jsonParser.B() : jsonParser.B();
        if (numberTypeB == JsonParser.NumberType.f341074b) {
            int iZ2 = jsonParser.z();
            mVar.getClass();
            com.fasterxml.jackson.databind.node.j[] jVarArr = com.fasterxml.jackson.databind.node.j.f342198c;
            return (iZ2 > 10 || iZ2 < -1) ? new com.fasterxml.jackson.databind.node.j(iZ2) : com.fasterxml.jackson.databind.node.j.f342198c[iZ2 - (-1)];
        }
        if (numberTypeB == numberType) {
            long jA2 = jsonParser.A();
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.n(jA2);
        }
        BigInteger bigIntegerH = jsonParser.h();
        mVar.getClass();
        return bigIntegerH == null ? com.fasterxml.jackson.databind.node.r.f342215b : new com.fasterxml.jackson.databind.node.c(bigIntegerH);
    }

    public static void y0(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.node.m mVar, String str, com.fasterxml.jackson.databind.node.t tVar, com.fasterxml.jackson.databind.j jVar, com.fasterxml.jackson.databind.j jVar2) throws MismatchedInputException {
        if (fVar.O(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            throw new MismatchedInputException((Closeable) fVar.f341924g, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str));
        }
        if (fVar.N(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jVar instanceof com.fasterxml.jackson.databind.node.a) {
                ((com.fasterxml.jackson.databind.node.a) jVar).g(jVar2);
                tVar.g(str, jVar);
                return;
            }
            mVar.getClass();
            com.fasterxml.jackson.databind.node.a aVar = new com.fasterxml.jackson.databind.node.a(mVar);
            aVar.g(jVar);
            aVar.g(jVar2);
            tVar.g(str, aVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.b(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.i
    public LogicalType q() {
        return LogicalType.f342436f;
    }

    public final com.fasterxml.jackson.databind.j q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
        int iG2 = jsonParser.g();
        if (iG2 == 2) {
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.t(mVar);
        }
        switch (iG2) {
            case 6:
                String strL = jsonParser.L();
                mVar.getClass();
                return com.fasterxml.jackson.databind.node.m.b(strL);
            case 7:
                return x0(jsonParser, fVar, mVar);
            case 8:
                return v0(jsonParser, fVar, mVar);
            case 9:
                mVar.getClass();
                return com.fasterxml.jackson.databind.node.e.f342190c;
            case 10:
                mVar.getClass();
                return com.fasterxml.jackson.databind.node.e.f342191d;
            case 11:
                mVar.getClass();
                return com.fasterxml.jackson.databind.node.r.f342215b;
            case 12:
                return u0(jsonParser, fVar);
            default:
                fVar.E(this.f341716b, jsonParser);
                throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.i
    public Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return this.f341772e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final void r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.node.m mVar, a aVar, com.fasterxml.jackson.databind.node.f fVar2) throws MismatchedInputException {
        com.fasterxml.jackson.databind.j jVarB;
        int i12 = fVar.f341922e & C.f341715d;
        do {
            if (fVar2 instanceof com.fasterxml.jackson.databind.node.t) {
                com.fasterxml.jackson.databind.node.t tVar = (com.fasterxml.jackson.databind.node.t) fVar2;
                String strE0 = jsonParser.e0();
                while (strE0 != null) {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == null) {
                        jsonTokenG0 = JsonToken.NOT_AVAILABLE;
                    }
                    int i13 = jsonTokenG0.f341099e;
                    if (i13 == 1) {
                        mVar.getClass();
                        com.fasterxml.jackson.databind.node.t tVar2 = new com.fasterxml.jackson.databind.node.t(mVar);
                        com.fasterxml.jackson.databind.j jVarG = tVar.g(strE0, tVar2);
                        if (jVarG != null) {
                            y0(fVar, mVar, strE0, tVar, jVarG, tVar2);
                        }
                        aVar.a(fVar2);
                        fVar2 = tVar2;
                        tVar = fVar2;
                    } else if (i13 != 3) {
                        switch (i13) {
                            case 6:
                                String strL = jsonParser.L();
                                mVar.getClass();
                                jVarB = com.fasterxml.jackson.databind.node.m.b(strL);
                                break;
                            case 7:
                                jVarB = w0(jsonParser, i12, mVar);
                                break;
                            case 8:
                                jVarB = v0(jsonParser, fVar, mVar);
                                break;
                            case 9:
                                mVar.getClass();
                                jVarB = com.fasterxml.jackson.databind.node.e.f342190c;
                                break;
                            case 10:
                                mVar.getClass();
                                jVarB = com.fasterxml.jackson.databind.node.e.f342191d;
                                break;
                            case 11:
                                mVar.getClass();
                                jVarB = com.fasterxml.jackson.databind.node.r.f342215b;
                                break;
                            default:
                                jVarB = t0(jsonParser, fVar);
                                break;
                        }
                        com.fasterxml.jackson.databind.j jVar = jVarB;
                        com.fasterxml.jackson.databind.j jVarG2 = tVar.g(strE0, jVar);
                        if (jVarG2 != null) {
                            y0(fVar, mVar, strE0, tVar, jVarG2, jVar);
                        }
                    } else {
                        mVar.getClass();
                        com.fasterxml.jackson.databind.node.a aVar2 = new com.fasterxml.jackson.databind.node.a(mVar);
                        com.fasterxml.jackson.databind.j jVarG3 = tVar.g(strE0, aVar2);
                        if (jVarG3 != null) {
                            y0(fVar, mVar, strE0, tVar, jVarG3, aVar2);
                        }
                        aVar.a(fVar2);
                        fVar2 = aVar2;
                    }
                    strE0 = jsonParser.e0();
                    tVar = tVar;
                }
                int i14 = aVar.f341774b;
                if (i14 == 0) {
                    fVar2 = null;
                } else {
                    com.fasterxml.jackson.databind.node.f[] fVarArr = aVar.f341773a;
                    int i15 = i14 - 1;
                    aVar.f341774b = i15;
                    fVar2 = fVarArr[i15];
                }
            } else {
                com.fasterxml.jackson.databind.node.a aVar3 = (com.fasterxml.jackson.databind.node.a) fVar2;
                while (true) {
                    JsonToken jsonTokenG02 = jsonParser.g0();
                    if (jsonTokenG02 == null) {
                        jsonTokenG02 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenG02.f341099e) {
                        case 1:
                            aVar.a(fVar2);
                            mVar.getClass();
                            fVar2 = new com.fasterxml.jackson.databind.node.t(mVar);
                            aVar3.g(fVar2);
                            break;
                        case 2:
                        case 5:
                        default:
                            aVar3.g(t0(jsonParser, fVar));
                        case 3:
                            aVar.a(fVar2);
                            mVar.getClass();
                            fVar2 = new com.fasterxml.jackson.databind.node.a(mVar);
                            aVar3.g(fVar2);
                            break;
                        case 4:
                            break;
                        case 6:
                            String strL2 = jsonParser.L();
                            mVar.getClass();
                            aVar3.g(com.fasterxml.jackson.databind.node.m.b(strL2));
                        case 7:
                            aVar3.g(w0(jsonParser, i12, mVar));
                        case 8:
                            aVar3.g(v0(jsonParser, fVar, mVar));
                        case 9:
                            mVar.getClass();
                            aVar3.g(com.fasterxml.jackson.databind.node.e.f342190c);
                        case 10:
                            mVar.getClass();
                            aVar3.g(com.fasterxml.jackson.databind.node.e.f342191d);
                        case 11:
                            mVar.getClass();
                            aVar3.g(com.fasterxml.jackson.databind.node.r.f342215b);
                    }
                }
            }
        } while (fVar2 != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.j] */
    public final com.fasterxml.jackson.databind.node.t s0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.node.m mVar, a aVar) throws MismatchedInputException {
        com.fasterxml.jackson.databind.node.f tVar;
        mVar.getClass();
        com.fasterxml.jackson.databind.node.t tVar2 = new com.fasterxml.jackson.databind.node.t(mVar);
        String strD = jsonParser.d();
        while (strD != null) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            if (jsonTokenG0 == null) {
                jsonTokenG0 = JsonToken.NOT_AVAILABLE;
            }
            int i12 = jsonTokenG0.f341099e;
            if (i12 == 1) {
                tVar = new com.fasterxml.jackson.databind.node.t(mVar);
                r0(jsonParser, fVar, mVar, aVar, tVar);
            } else if (i12 != 3) {
                tVar = q0(jsonParser, fVar);
            } else {
                tVar = new com.fasterxml.jackson.databind.node.a(mVar);
                r0(jsonParser, fVar, mVar, aVar, tVar);
            }
            com.fasterxml.jackson.databind.j jVarG = tVar2.g(strD, tVar);
            if (jVarG != null) {
                y0(fVar, mVar, strD, tVar2, jVarG, tVar);
            }
            strD = jsonParser.e0();
        }
        return tVar2;
    }

    public final com.fasterxml.jackson.databind.j t0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        int iG2 = jsonParser.g();
        if (iG2 == 2) {
            com.fasterxml.jackson.databind.node.m mVar = fVar.f341921d.f341910l;
            mVar.getClass();
            return new com.fasterxml.jackson.databind.node.t(mVar);
        }
        if (iG2 == 8) {
            return v0(jsonParser, fVar, fVar.f341921d.f341910l);
        }
        if (iG2 == 12) {
            return u0(jsonParser, fVar);
        }
        fVar.E(this.f341716b, jsonParser);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.j z0(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.f r13, com.fasterxml.jackson.databind.node.t r14, com.fasterxml.jackson.databind.deser.std.AbstractC36452f.a r15) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.AbstractC36452f.z0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f, com.fasterxml.jackson.databind.node.t, com.fasterxml.jackson.databind.deser.std.f$a):com.fasterxml.jackson.databind.j");
    }
}
