package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.impl.C36443b;
import com.fasterxml.jackson.databind.deser.impl.C36444c;
import com.fasterxml.jackson.databind.deser.impl.D;
import com.fasterxml.jackson.databind.deser.impl.E;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: BeanDeserializer.java */
/* loaded from: classes4.dex */
public class c extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public volatile transient com.fasterxml.jackson.databind.util.t f341543A;

    /* renamed from: z, reason: collision with root package name */
    public transient NullPointerException f341544z;

    /* compiled from: BeanDeserializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341545a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f341546b;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341546b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341546b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341546b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f341545a = iArr2;
            try {
                iArr2[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f341545a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f341545a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f341545a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f341545a[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f341545a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f341545a[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f341545a[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f341545a[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f341545a[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: BeanDeserializer.java */
    public static class b extends z.a {

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.f f341547b;

        /* renamed from: c, reason: collision with root package name */
        public final v f341548c;

        /* renamed from: d, reason: collision with root package name */
        public Object f341549d;

        public b(com.fasterxml.jackson.databind.f fVar, UnresolvedForwardReference unresolvedForwardReference, com.fasterxml.jackson.databind.h hVar, v vVar) {
            super(unresolvedForwardReference, hVar);
            this.f341547b = fVar;
            this.f341548c = vVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.z.a
        public final void a(Object obj, Object obj2) throws MismatchedInputException {
            Object obj3 = this.f341549d;
            v vVar = this.f341548c;
            if (obj3 != null) {
                vVar.z(obj3, obj2);
            } else {
                this.f341547b.U(vVar, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", vVar.f341896d.f342656b, vVar.n().getName());
                throw null;
            }
        }
    }

    public c() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public final Object E(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341555i;
        if (iVar != null || (iVar = this.f341554h) != null) {
            Object objX = this.f341553g.x(fVar, iVar.e(jsonParser, fVar));
            if (this.f341560n != null) {
                G0(fVar, objX);
            }
            return objX;
        }
        CoercionAction coercionActionN = fVar.n(LogicalType.f342435e, o(), CoercionInputShape.f341468e);
        boolean zO2 = fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zO2 || coercionActionN != CoercionAction.f341460b) {
            JsonToken jsonTokenG0 = jsonParser.g0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return null;
                }
                if (iOrdinal == 3) {
                    return l(fVar);
                }
                fVar.C(n0(fVar), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
                throw null;
            }
            if (zO2) {
                Object objE = e(jsonParser, fVar);
                if (jsonParser.g0() == jsonToken) {
                    return objE;
                }
                o0(fVar);
                throw null;
            }
        }
        fVar.B(jsonParser, n0(fVar));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d H0(C36444c c36444c) {
        return new c(this, c36444c);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d I0(Set set, Set set2) {
        return new c(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d J0() {
        return new c(this, true);
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d K0(com.fasterxml.jackson.databind.deser.impl.s sVar) {
        return new c(this, sVar);
    }

    public final Object P0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, v vVar) throws IOException {
        try {
            return vVar.g(jsonParser, fVar);
        } catch (Exception e12) {
            d.L0(fVar, e12, this.f341551e.f341930b, vVar.f341896d.f342656b);
            throw null;
        }
    }

    public final Object Q0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, com.fasterxml.jackson.databind.deser.impl.g gVar) throws IOException {
        if (this.f341565s) {
            fVar.getClass();
        }
        JsonToken jsonTokenF = jsonParser.f();
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            JsonToken jsonTokenG0 = jsonParser.g0();
            v vVarE = this.f341559m.e(strD);
            if (vVarE != null) {
                if (jsonTokenG0.f341103i) {
                    gVar.f(jsonParser, fVar, obj, strD);
                }
                try {
                    vVarE.h(jsonParser, fVar, obj);
                } catch (Exception e12) {
                    d.L0(fVar, e12, obj, strD);
                    throw null;
                }
            } else if (com.fasterxml.jackson.databind.util.n.b(strD, this.f341562p, this.f341563q)) {
                C0(jsonParser, fVar, obj, strD);
            } else if (gVar.e(jsonParser, fVar, obj, strD)) {
                continue;
            } else {
                u uVar = this.f341561o;
                if (uVar != null) {
                    try {
                        uVar.b(jsonParser, fVar, obj, strD);
                    } catch (Exception e13) {
                        d.L0(fVar, e13, obj, strD);
                        throw null;
                    }
                } else {
                    p0(jsonParser, fVar, obj, strD);
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        gVar.d(jsonParser, fVar, obj);
        return obj;
    }

    public Object R0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objG;
        com.fasterxml.jackson.databind.deser.impl.s sVar = this.f341570x;
        if (sVar != null) {
            sVar.f341668d.getClass();
        }
        boolean z12 = this.f341557k;
        E[] eArr = this.f341560n;
        boolean z13 = this.f341565s;
        C36444c c36444c = this.f341559m;
        x xVar = this.f341553g;
        if (!z12) {
            Object objY = xVar.y(fVar);
            jsonParser.k0(objY);
            if (jsonParser.a() && (objG = jsonParser.G()) != null) {
                t0(jsonParser, fVar, objY, objG);
            }
            if (eArr != null) {
                G0(fVar, objY);
            }
            if (z13) {
                fVar.getClass();
            }
            if (jsonParser.Z()) {
                String strD = jsonParser.d();
                do {
                    jsonParser.g0();
                    v vVarE = c36444c.e(strD);
                    if (vVarE != null) {
                        try {
                            vVarE.h(jsonParser, fVar, objY);
                        } catch (Exception e12) {
                            d.L0(fVar, e12, objY, strD);
                            throw null;
                        }
                    } else {
                        F0(jsonParser, fVar, objY, strD);
                    }
                    strD = jsonParser.e0();
                } while (strD != null);
            }
            return objY;
        }
        D d12 = this.f341568v;
        com.fasterxml.jackson.databind.h hVar = this.f341551e;
        Set<String> set = this.f341562p;
        Set<String> set2 = this.f341563q;
        if (d12 == null) {
            com.fasterxml.jackson.databind.deser.impl.g gVar = this.f341569w;
            if (gVar == null) {
                return A0(jsonParser, fVar);
            }
            if (this.f341556j == null) {
                com.fasterxml.jackson.databind.i<Object> iVar = this.f341554h;
                if (iVar != null) {
                    return xVar.z(fVar, iVar.e(jsonParser, fVar));
                }
                Object objY2 = xVar.y(fVar);
                com.fasterxml.jackson.databind.deser.impl.g gVar2 = this.f341569w;
                gVar2.getClass();
                Q0(jsonParser, fVar, objY2, new com.fasterxml.jackson.databind.deser.impl.g(gVar2));
                return objY2;
            }
            com.fasterxml.jackson.databind.deser.impl.g gVar3 = new com.fasterxml.jackson.databind.deser.impl.g(gVar);
            com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341556j;
            com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, sVar);
            if (z13) {
                fVar.getClass();
            }
            JsonToken jsonTokenF = jsonParser.f();
            while (jsonTokenF == JsonToken.FIELD_NAME) {
                String strD2 = jsonParser.d();
                JsonToken jsonTokenG0 = jsonParser.g0();
                v vVarC = vVar.c(strD2);
                if (!yVarD.f(strD2) || vVarC != null) {
                    if (vVarC == null) {
                        v vVarE2 = c36444c.e(strD2);
                        if (vVarE2 != null) {
                            if (jsonTokenG0.f341103i) {
                                gVar3.f(jsonParser, fVar, null, strD2);
                            }
                            yVarD.e(vVarE2, vVarE2.g(jsonParser, fVar));
                        } else if (!gVar3.e(jsonParser, fVar, null, strD2)) {
                            if (com.fasterxml.jackson.databind.util.n.b(strD2, set, set2)) {
                                C0(jsonParser, fVar, hVar.f341930b, strD2);
                            } else {
                                u uVar = this.f341561o;
                                if (uVar != null) {
                                    yVarD.c(uVar, strD2, uVar.a(jsonParser, fVar));
                                } else {
                                    p0(jsonParser, fVar, this.f341716b, strD2);
                                }
                            }
                        }
                    } else if (!gVar3.e(jsonParser, fVar, null, strD2) && yVarD.b(vVarC, P0(jsonParser, fVar, vVarC))) {
                        jsonParser.g0();
                        try {
                            Object objA = vVar.a(fVar, yVarD);
                            if (objA.getClass() == hVar.f341930b) {
                                Q0(jsonParser, fVar, objA, gVar3);
                                return objA;
                            }
                            fVar.i(String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", hVar, objA.getClass()));
                            throw null;
                        } catch (Exception e13) {
                            d.L0(fVar, e13, hVar.f341930b, strD2);
                            throw null;
                        }
                    }
                }
                jsonTokenF = jsonParser.g0();
            }
            try {
                return gVar3.c(jsonParser, fVar, yVarD, vVar);
            } catch (Exception e14) {
                O0(e14, fVar);
                throw null;
            }
        }
        com.fasterxml.jackson.databind.i<Object> iVar2 = this.f341554h;
        if (iVar2 != null) {
            return xVar.z(fVar, iVar2.e(jsonParser, fVar));
        }
        com.fasterxml.jackson.databind.deser.impl.v vVar2 = this.f341556j;
        if (vVar2 == null) {
            C cK2 = fVar.k(jsonParser);
            cK2.e0();
            Object objY3 = xVar.y(fVar);
            jsonParser.k0(objY3);
            if (eArr != null) {
                G0(fVar, objY3);
            }
            String strD3 = jsonParser.Z() ? jsonParser.d() : null;
            while (strD3 != null) {
                jsonParser.g0();
                v vVarE3 = c36444c.e(strD3);
                if (vVarE3 != null) {
                    try {
                        vVarE3.h(jsonParser, fVar, objY3);
                    } catch (Exception e15) {
                        d.L0(fVar, e15, objY3, strD3);
                        throw null;
                    }
                } else if (com.fasterxml.jackson.databind.util.n.b(strD3, set, set2)) {
                    C0(jsonParser, fVar, objY3, strD3);
                } else if (this.f341561o == null) {
                    cK2.G(strD3);
                    cK2.y0(jsonParser);
                } else {
                    C cK3 = fVar.k(jsonParser);
                    cK3.y0(jsonParser);
                    cK2.G(strD3);
                    cK2.v0(cK3);
                    try {
                        u uVar2 = this.f341561o;
                        C.b bVarX0 = cK3.x0(cK3.f342543c);
                        bVarX0.g0();
                        uVar2.b(bVarX0, fVar, objY3, strD3);
                    } catch (Exception e16) {
                        d.L0(fVar, e16, objY3, strD3);
                        throw null;
                    }
                }
                strD3 = jsonParser.e0();
            }
            cK2.B();
            this.f341568v.a(fVar, objY3, cK2);
            return objY3;
        }
        com.fasterxml.jackson.databind.deser.impl.y yVarD2 = vVar2.d(jsonParser, fVar, sVar);
        C cK4 = fVar.k(jsonParser);
        cK4.e0();
        JsonToken jsonTokenF2 = jsonParser.f();
        while (jsonTokenF2 == JsonToken.FIELD_NAME) {
            String strD4 = jsonParser.d();
            jsonParser.g0();
            v vVarC2 = vVar2.c(strD4);
            if (!yVarD2.f(strD4) || vVarC2 != null) {
                if (vVarC2 == null) {
                    v vVarE4 = c36444c.e(strD4);
                    if (vVarE4 != null) {
                        yVarD2.e(vVarE4, P0(jsonParser, fVar, vVarE4));
                    } else if (com.fasterxml.jackson.databind.util.n.b(strD4, set, set2)) {
                        C0(jsonParser, fVar, hVar.f341930b, strD4);
                    } else if (this.f341561o == null) {
                        cK4.G(strD4);
                        cK4.y0(jsonParser);
                    } else {
                        C cK5 = fVar.k(jsonParser);
                        cK5.y0(jsonParser);
                        cK4.G(strD4);
                        cK4.v0(cK5);
                        try {
                            u uVar3 = this.f341561o;
                            C.b bVarX02 = cK5.x0(cK5.f342543c);
                            bVarX02.g0();
                            yVarD2.c(uVar3, strD4, uVar3.a(bVarX02, fVar));
                        } catch (Exception e17) {
                            d.L0(fVar, e17, hVar.f341930b, strD4);
                            throw null;
                        }
                    }
                } else if (yVarD2.b(vVarC2, P0(jsonParser, fVar, vVarC2))) {
                    JsonToken jsonTokenG02 = jsonParser.g0();
                    try {
                        Object objA2 = vVar2.a(fVar, yVarD2);
                        jsonParser.k0(objA2);
                        while (jsonTokenG02 == JsonToken.FIELD_NAME) {
                            cK4.y0(jsonParser);
                            jsonTokenG02 = jsonParser.g0();
                        }
                        JsonToken jsonToken = JsonToken.END_OBJECT;
                        if (jsonTokenG02 != jsonToken) {
                            fVar.Y(this, jsonToken, "Attempted to unwrap '%s' value", hVar.f341930b.getName());
                            throw null;
                        }
                        cK4.B();
                        if (objA2.getClass() == hVar.f341930b) {
                            this.f341568v.a(fVar, objA2, cK4);
                            return objA2;
                        }
                        fVar.U(vVarC2, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                        throw null;
                    } catch (Exception e18) {
                        O0(e18, fVar);
                        throw null;
                    }
                }
            }
            jsonTokenF2 = jsonParser.g0();
        }
        try {
            Object objA3 = vVar2.a(fVar, yVarD2);
            this.f341568v.a(fVar, objA3, cK4);
            return objA3;
        } catch (Exception e19) {
            O0(e19, fVar);
            throw null;
        }
    }

    public final Object S0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        Object objY = this.f341553g.y(fVar);
        jsonParser.k0(objY);
        if (jsonParser.Z()) {
            String strD = jsonParser.d();
            do {
                jsonParser.g0();
                v vVarE = this.f341559m.e(strD);
                if (vVarE != null) {
                    try {
                        vVarE.h(jsonParser, fVar, objY);
                    } catch (Exception e12) {
                        d.L0(fVar, e12, objY, strD);
                        throw null;
                    }
                } else {
                    F0(jsonParser, fVar, objY, strD);
                }
                strD = jsonParser.e0();
            } while (strD != null);
        }
        return objY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    @Override // com.fasterxml.jackson.databind.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.f r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r6.c0()
            com.fasterxml.jackson.databind.deser.impl.s r1 = r5.f341570x
            if (r0 == 0) goto L23
            boolean r0 = r5.f341558l
            if (r0 == 0) goto L14
            r6.g0()
            java.lang.Object r6 = r5.S0(r6, r7)
            return r6
        L14:
            r6.g0()
            if (r1 == 0) goto L1e
            java.lang.Object r6 = r5.R0(r6, r7)
            return r6
        L1e:
            java.lang.Object r6 = r5.R0(r6, r7)
            return r6
        L23:
            com.fasterxml.jackson.core.JsonToken r0 = r6.f()
            r2 = 0
            if (r0 == 0) goto Lfb
            int r0 = r0.ordinal()
            switch(r0) {
                case 2: goto Le6;
                case 3: goto Le1;
                case 4: goto L31;
                case 5: goto Le6;
                case 6: goto L7b;
                case 7: goto L75;
                case 8: goto L6f;
                case 9: goto L69;
                case 10: goto L63;
                case 11: goto L63;
                case 12: goto L33;
                default: goto L31;
            }
        L31:
            goto Lfb
        L33:
            boolean r0 = r6.j0()
            if (r0 == 0) goto L5b
            com.fasterxml.jackson.databind.util.C r0 = r7.k(r6)
            r0.B()
            com.fasterxml.jackson.databind.util.C$b r6 = r0.w0(r6)
            r6.g0()
            boolean r0 = r5.f341558l
            if (r0 == 0) goto L52
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            java.lang.Object r7 = r5.S0(r6, r7)
            goto L56
        L52:
            java.lang.Object r7 = r5.R0(r6, r7)
        L56:
            r6.close()
            goto Lfa
        L5b:
            com.fasterxml.jackson.databind.h r0 = r5.n0(r7)
            r7.B(r6, r0)
            throw r2
        L63:
            java.lang.Object r7 = r5.w0(r6, r7)
            goto Lfa
        L69:
            java.lang.Object r7 = r5.x0(r6, r7)
            goto Lfa
        L6f:
            java.lang.Object r7 = r5.y0(r6, r7)
            goto Lfa
        L75:
            java.lang.Object r7 = r5.B0(r6, r7)
            goto Lfa
        L7b:
            if (r1 == 0) goto L84
            java.lang.Object r6 = r5.z0(r6, r7)
        L81:
            r7 = r6
            goto Lfa
        L84:
            com.fasterxml.jackson.databind.i r0 = r5.q0()
            if (r0 == 0) goto La2
            com.fasterxml.jackson.databind.deser.x r1 = r5.f341553g
            boolean r3 = r1.h()
            if (r3 != 0) goto La2
            java.lang.Object r6 = r0.e(r6, r7)
            java.lang.Object r6 = r1.z(r7, r6)
            com.fasterxml.jackson.databind.deser.impl.E[] r0 = r5.f341560n
            if (r0 == 0) goto L81
            r5.G0(r7, r6)
            goto L81
        La2:
            java.lang.Object r6 = r6.x()
            if (r6 == 0) goto L81
            java.lang.Class r0 = r6.getClass()
            com.fasterxml.jackson.databind.h r1 = r5.f341551e
            boolean r0 = r1.J(r0)
            if (r0 != 0) goto L81
            com.fasterxml.jackson.databind.e r0 = r7.f341921d
            r0.getClass()
        Lb9:
            if (r2 == 0) goto Lc5
            T r0 = r2.f342626a
            com.fasterxml.jackson.databind.deser.n r0 = (com.fasterxml.jackson.databind.deser.n) r0
            r0.getClass()
            com.fasterxml.jackson.databind.util.r<T> r2 = r2.f342627b
            goto Lb9
        Lc5:
            java.lang.Class<?> r0 = r1.f341930b
            java.lang.String r0 = com.fasterxml.jackson.databind.util.g.A(r0)
            java.lang.String r1 = com.fasterxml.jackson.databind.util.g.f(r6)
            java.lang.String r2 = "Cannot deserialize value of type "
            java.lang.String r3 = " from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type "
            java.lang.String r4 = ": incompatible types"
            java.lang.String r0 = androidx.camera.core.Q.a(r2, r0, r3, r1, r4)
            com.fasterxml.jackson.databind.exc.InvalidFormatException r1 = new com.fasterxml.jackson.databind.exc.InvalidFormatException
            lX0.b r7 = r7.f341924g
            r1.<init>(r7, r0, r6)
            throw r1
        Le1:
            java.lang.Object r7 = r5.E(r6, r7)
            goto Lfa
        Le6:
            boolean r0 = r5.f341558l
            if (r0 == 0) goto Lef
            java.lang.Object r7 = r5.S0(r6, r7)
            goto Lfa
        Lef:
            if (r1 == 0) goto Lf6
            java.lang.Object r7 = r5.R0(r6, r7)
            goto Lfa
        Lf6:
            java.lang.Object r7 = r5.R0(r6, r7)
        Lfa:
            return r7
        Lfb:
            com.fasterxml.jackson.databind.h r0 = r5.n0(r7)
            r7.B(r6, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.c.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IOException {
        String strD;
        jsonParser.k0(obj);
        if (this.f341560n != null) {
            G0(fVar, obj);
        }
        D d12 = this.f341568v;
        C36444c c36444c = this.f341559m;
        if (d12 == null) {
            com.fasterxml.jackson.databind.deser.impl.g gVar = this.f341569w;
            if (gVar != null) {
                gVar.getClass();
                Q0(jsonParser, fVar, obj, new com.fasterxml.jackson.databind.deser.impl.g(gVar));
                return obj;
            }
            if (!jsonParser.c0()) {
                if (jsonParser.Z()) {
                    strD = jsonParser.d();
                }
                return obj;
            }
            strD = jsonParser.e0();
            if (strD == null) {
                return obj;
            }
            if (this.f341565s) {
                fVar.getClass();
            }
            do {
                jsonParser.g0();
                v vVarE = c36444c.e(strD);
                if (vVarE != null) {
                    try {
                        vVarE.h(jsonParser, fVar, obj);
                    } catch (Exception e12) {
                        d.L0(fVar, e12, obj, strD);
                        throw null;
                    }
                } else {
                    F0(jsonParser, fVar, obj, strD);
                }
                strD = jsonParser.e0();
            } while (strD != null);
            return obj;
        }
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.START_OBJECT) {
            jsonTokenF = jsonParser.g0();
        }
        C cK2 = fVar.k(jsonParser);
        cK2.e0();
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD2 = jsonParser.d();
            v vVarE2 = c36444c.e(strD2);
            jsonParser.g0();
            if (vVarE2 != null) {
                try {
                    vVarE2.h(jsonParser, fVar, obj);
                } catch (Exception e13) {
                    d.L0(fVar, e13, obj, strD2);
                    throw null;
                }
            } else if (com.fasterxml.jackson.databind.util.n.b(strD2, this.f341562p, this.f341563q)) {
                C0(jsonParser, fVar, obj, strD2);
            } else if (this.f341561o == null) {
                cK2.G(strD2);
                cK2.y0(jsonParser);
            } else {
                C cK3 = fVar.k(jsonParser);
                cK3.y0(jsonParser);
                cK2.G(strD2);
                cK2.v0(cK3);
                try {
                    u uVar = this.f341561o;
                    C.b bVarX0 = cK3.x0(cK3.f342543c);
                    bVarX0.g0();
                    uVar.b(bVarX0, fVar, obj, strD2);
                } catch (Exception e14) {
                    d.L0(fVar, e14, obj, strD2);
                    throw null;
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        cK2.B();
        this.f341568v.a(fVar, obj, cK2);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final Object r0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws IOException {
        com.fasterxml.jackson.databind.deser.impl.v vVar = this.f341556j;
        com.fasterxml.jackson.databind.deser.impl.y yVarD = vVar.d(jsonParser, fVar, this.f341570x);
        if (this.f341565s) {
            fVar.getClass();
        }
        JsonToken jsonTokenF = jsonParser.f();
        ArrayList arrayList = null;
        C cK2 = null;
        while (true) {
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            com.fasterxml.jackson.databind.h hVar = this.f341551e;
            if (jsonTokenF != jsonToken) {
                try {
                    Object objA = vVar.a(fVar, yVarD);
                    if (this.f341560n != null) {
                        G0(fVar, objA);
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).f341549d = objA;
                        }
                    }
                    if (cK2 != null) {
                        if (objA.getClass() != hVar.f341930b) {
                            return D0(null, fVar, objA, cK2);
                        }
                        E0(fVar, objA, cK2);
                    }
                    return objA;
                } catch (Exception e12) {
                    O0(e12, fVar);
                    throw null;
                }
            }
            String strD = jsonParser.d();
            jsonParser.g0();
            v vVarC = vVar.c(strD);
            if (!yVarD.f(strD) || vVarC != null) {
                if (vVarC == null) {
                    v vVarE = this.f341559m.e(strD);
                    if (vVarE != null) {
                        try {
                            yVarD.e(vVarE, P0(jsonParser, fVar, vVarE));
                        } catch (UnresolvedForwardReference e13) {
                            b bVar = new b(fVar, e13, vVarE.f341897e, vVarE);
                            e13.f341520f.a(bVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bVar);
                        }
                    } else if (com.fasterxml.jackson.databind.util.n.b(strD, this.f341562p, this.f341563q)) {
                        C0(jsonParser, fVar, hVar.f341930b, strD);
                    } else {
                        u uVar = this.f341561o;
                        if (uVar != null) {
                            try {
                                yVarD.c(uVar, strD, uVar.a(jsonParser, fVar));
                            } catch (Exception e14) {
                                d.L0(fVar, e14, hVar.f341930b, strD);
                                throw null;
                            }
                        } else if (this.f341564r) {
                            jsonParser.l0();
                        } else {
                            if (cK2 == null) {
                                cK2 = fVar.k(jsonParser);
                            }
                            cK2.G(strD);
                            cK2.y0(jsonParser);
                        }
                    }
                } else if (yVarD.b(vVarC, P0(jsonParser, fVar, vVarC))) {
                    jsonParser.g0();
                    try {
                        Object objA2 = vVar.a(fVar, yVarD);
                        if (objA2 == null) {
                            Class<?> cls = hVar.f341930b;
                            if (this.f341544z == null) {
                                this.f341544z = new NullPointerException("JSON Creator returned null");
                            }
                            fVar.x(cls, this.f341544z);
                            throw null;
                        }
                        jsonParser.k0(objA2);
                        if (objA2.getClass() != hVar.f341930b) {
                            return D0(jsonParser, fVar, objA2, cK2);
                        }
                        if (cK2 != null) {
                            E0(fVar, objA2, cK2);
                        }
                        f(jsonParser, fVar, objA2);
                        return objA2;
                    } catch (Exception e15) {
                        O0(e15, fVar);
                        throw null;
                    }
                }
            }
            jsonTokenF = jsonParser.g0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.d, com.fasterxml.jackson.databind.i
    public com.fasterxml.jackson.databind.i<Object> s(com.fasterxml.jackson.databind.util.t tVar) {
        if (getClass() != c.class || this.f341543A == tVar) {
            return this;
        }
        this.f341543A = tVar;
        try {
            return new c(this, tVar);
        } finally {
            this.f341543A = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.d
    public final d v0() {
        return new C36443b(this, this.f341559m.f341608g);
    }
}
