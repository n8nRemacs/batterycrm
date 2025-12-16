package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.util.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import rX0.InterfaceC47610a;

/* compiled from: TokenBufferSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class T extends M<com.fasterxml.jackson.databind.util.C> {
    public T() {
        super(com.fasterxml.jackson.databind.util.C.class);
    }

    public static void p(com.fasterxml.jackson.databind.util.C c12, JsonGenerator jsonGenerator) throws JsonGenerationException {
        boolean z12 = c12.f342548h;
        C.c cVar = c12.f342550j;
        boolean z13 = z12 && cVar.f342572d != null;
        int i12 = -1;
        while (true) {
            i12++;
            if (i12 >= 16) {
                cVar = cVar.f342569a;
                if (cVar == null) {
                    return;
                }
                z13 = z12 && cVar.f342572d != null;
                i12 = 0;
            }
            JsonToken jsonTokenD = cVar.d(i12);
            if (jsonTokenD == null) {
                return;
            }
            if (z13) {
                Object objC = cVar.c(i12);
                if (objC != null) {
                    jsonGenerator.S(objC);
                }
                TreeMap<Integer, Object> treeMap = cVar.f342572d;
                Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i12 + i12));
                if (obj != null) {
                    jsonGenerator.l0(obj);
                }
            }
            int iOrdinal = jsonTokenD.ordinal();
            Object[] objArr = cVar.f342571c;
            switch (iOrdinal) {
                case 1:
                    jsonGenerator.e0();
                    break;
                case 2:
                    jsonGenerator.B();
                    break;
                case 3:
                    jsonGenerator.a0();
                    break;
                case 4:
                    jsonGenerator.A();
                    break;
                case 5:
                    Object obj2 = objArr[i12];
                    if (!(obj2 instanceof com.fasterxml.jackson.core.l)) {
                        jsonGenerator.G((String) obj2);
                        break;
                    } else {
                        jsonGenerator.F((com.fasterxml.jackson.core.l) obj2);
                        break;
                    }
                case 6:
                    Object obj3 = objArr[i12];
                    if (!(obj3 instanceof com.fasterxml.jackson.databind.util.x)) {
                        if (!(obj3 instanceof com.fasterxml.jackson.databind.k)) {
                            jsonGenerator.z(obj3);
                            break;
                        } else {
                            jsonGenerator.writeObject(obj3);
                            break;
                        }
                    } else {
                        Object obj4 = ((com.fasterxml.jackson.databind.util.x) obj3).f342646b;
                        if (!(obj4 instanceof com.fasterxml.jackson.databind.k)) {
                            if (!(obj4 instanceof com.fasterxml.jackson.core.l)) {
                                jsonGenerator.Z(String.valueOf(obj4));
                                break;
                            } else {
                                jsonGenerator.Y((com.fasterxml.jackson.core.l) obj4);
                                break;
                            }
                        } else {
                            jsonGenerator.writeObject(obj4);
                            break;
                        }
                    }
                case 7:
                    Object obj5 = objArr[i12];
                    if (!(obj5 instanceof com.fasterxml.jackson.core.l)) {
                        jsonGenerator.i0((String) obj5);
                        break;
                    } else {
                        jsonGenerator.h0((com.fasterxml.jackson.core.l) obj5);
                        break;
                    }
                case 8:
                    Object obj6 = objArr[i12];
                    if (!(obj6 instanceof Integer)) {
                        if (!(obj6 instanceof BigInteger)) {
                            if (!(obj6 instanceof Long)) {
                                if (!(obj6 instanceof Short)) {
                                    jsonGenerator.L(((Number) obj6).intValue());
                                    break;
                                } else {
                                    jsonGenerator.Q(((Short) obj6).shortValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.M(((Long) obj6).longValue());
                                break;
                            }
                        } else {
                            jsonGenerator.P((BigInteger) obj6);
                            break;
                        }
                    } else {
                        jsonGenerator.L(((Integer) obj6).intValue());
                        break;
                    }
                case 9:
                    Object obj7 = objArr[i12];
                    if (obj7 instanceof Double) {
                        jsonGenerator.I(((Double) obj7).doubleValue());
                        break;
                    } else if (obj7 instanceof BigDecimal) {
                        jsonGenerator.O((BigDecimal) obj7);
                        break;
                    } else if (obj7 instanceof Float) {
                        jsonGenerator.J(((Float) obj7).floatValue());
                        break;
                    } else if (obj7 == null) {
                        jsonGenerator.H();
                        break;
                    } else {
                        if (!(obj7 instanceof String)) {
                            c12.a("Unrecognized value type for VALUE_NUMBER_FLOAT: " + obj7.getClass().getName() + ", cannot serialize");
                            throw null;
                        }
                        jsonGenerator.N((String) obj7);
                        break;
                    }
                case 10:
                    jsonGenerator.y(true);
                    break;
                case 11:
                    jsonGenerator.y(false);
                    break;
                case 12:
                    jsonGenerator.H();
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws JsonGenerationException {
        p((com.fasterxml.jackson.databind.util.C) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws JsonGenerationException {
        com.fasterxml.jackson.databind.util.C c12 = (com.fasterxml.jackson.databind.util.C) obj;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_EMBEDDED_OBJECT, c12));
        p(c12, jsonGenerator);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
