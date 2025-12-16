package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.C;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ExternalTypeHandler.java */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341630a;

    /* renamed from: b, reason: collision with root package name */
    public final b[] f341631b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f341632c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f341633d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.util.C[] f341634e;

    /* compiled from: ExternalTypeHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.h f341635a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f341636b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f341637c = new HashMap();

        public a(com.fasterxml.jackson.databind.h hVar) {
            this.f341635a = hVar;
        }

        public final void a(Integer num, String str) {
            HashMap map = this.f341637c;
            Object obj = map.get(str);
            if (obj == null) {
                map.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            map.put(str, linkedList);
        }

        public final void b(com.fasterxml.jackson.databind.deser.v vVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            ArrayList arrayList = this.f341636b;
            Integer numValueOf = Integer.valueOf(arrayList.size());
            arrayList.add(new b(vVar, lVar));
            a(numValueOf, vVar.f341896d.f342656b);
            a(numValueOf, lVar.h());
        }

        public final g c(C36444c c36444c) {
            ArrayList arrayList = this.f341636b;
            int size = arrayList.size();
            b[] bVarArr = new b[size];
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = (b) arrayList.get(i12);
                com.fasterxml.jackson.databind.deser.v vVarE = c36444c.e(bVar.f341640c);
                if (vVarE != null) {
                    bVar.f341641d = vVarE;
                }
                bVarArr[i12] = bVar;
            }
            return new g(this.f341635a, bVarArr, this.f341637c);
        }
    }

    /* compiled from: ExternalTypeHandler.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.deser.v f341638a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.jsontype.l f341639b;

        /* renamed from: c, reason: collision with root package name */
        public final String f341640c;

        /* renamed from: d, reason: collision with root package name */
        public com.fasterxml.jackson.databind.deser.v f341641d;

        public b(com.fasterxml.jackson.databind.deser.v vVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
            this.f341638a = vVar;
            this.f341639b = lVar;
            this.f341640c = lVar.h();
        }
    }

    public g(com.fasterxml.jackson.databind.h hVar, b[] bVarArr, HashMap map) {
        this.f341630a = hVar;
        this.f341631b = bVarArr;
        this.f341632c = map;
        this.f341633d = null;
        this.f341634e = null;
    }

    public final void a(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, int i12, String str) throws MismatchedInputException, JsonGenerationException {
        if (str == null) {
            fVar.W("Internal error in external Type Id handling: `null` type id passed", new Object[0]);
            throw null;
        }
        C.b bVarW0 = this.f341634e[i12].w0(jsonParser);
        JsonToken jsonTokenG0 = bVarW0.g0();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        b[] bVarArr = this.f341631b;
        if (jsonTokenG0 == jsonToken) {
            bVarArr[i12].f341638a.z(obj, null);
            return;
        }
        com.fasterxml.jackson.databind.util.C cK2 = fVar.k(jsonParser);
        cK2.a0();
        cK2.i0(str);
        cK2.y0(bVarW0);
        cK2.A();
        C.b bVarW02 = cK2.w0(jsonParser);
        bVarW02.g0();
        bVarArr[i12].f341638a.h(bVarW02, fVar, obj);
    }

    public final boolean b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, String str, Object obj, String str2, int i12) throws MismatchedInputException, JsonGenerationException {
        if (!str.equals(this.f341631b[i12].f341640c)) {
            return false;
        }
        if (obj != null) {
            com.fasterxml.jackson.databind.util.C[] cArr = this.f341634e;
            if (cArr[i12] != null) {
                a(jsonParser, fVar, obj, i12, str2);
                cArr[i12] = null;
                return true;
            }
        }
        this.f341633d[i12] = str2;
        return true;
    }

    public final Object c(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, y yVar, v vVar) throws MismatchedInputException, JsonGenerationException {
        String strE;
        b[] bVarArr = this.f341631b;
        int length = bVarArr.length;
        Object[] objArr = new Object[length];
        for (int i12 = 0; i12 < length; i12++) {
            String str = this.f341633d[i12];
            b bVar = bVarArr[i12];
            Object objG = null;
            com.fasterxml.jackson.databind.h hVar = this.f341630a;
            com.fasterxml.jackson.databind.util.C[] cArr = this.f341634e;
            if (str == null) {
                com.fasterxml.jackson.databind.util.C c12 = cArr[i12];
                if (c12 != null && c12.f342550j.d(0) != JsonToken.VALUE_NULL) {
                    if (!bVar.f341639b.l()) {
                        String str2 = bVar.f341638a.f341896d.f342656b;
                        Object[] objArr2 = {bVar.f341640c};
                        fVar.getClass();
                        Class<?> cls = hVar.f341930b;
                        MismatchedInputException mismatchedInputException = new MismatchedInputException((Closeable) fVar.f341924g, String.format("Missing external type id property '%s'", objArr2));
                        if (str2 == null) {
                            throw mismatchedInputException;
                        }
                        mismatchedInputException.e(cls, str2);
                        throw mismatchedInputException;
                    }
                    com.fasterxml.jackson.databind.jsontype.l lVar = bVar.f341639b;
                    Class<?> clsG = lVar.g();
                    strE = clsG == null ? null : lVar.i().e(clsG, null);
                }
            } else {
                strE = str;
                if (cArr[i12] == null) {
                    com.fasterxml.jackson.databind.deser.v vVar2 = bVar.f341638a;
                    Boolean bool = vVar2.f342100b.f342515b;
                    if (bool == null || !bool.booleanValue()) {
                        strE = str;
                        if (fVar.O(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        }
                    }
                    String str3 = vVar2.f341896d.f342656b;
                    Object[] objArr3 = {str3, bVarArr[i12].f341640c};
                    fVar.getClass();
                    Class<?> cls2 = hVar.f341930b;
                    MismatchedInputException mismatchedInputException2 = new MismatchedInputException((Closeable) fVar.f341924g, String.format("Missing property '%s' for external type id '%s'", objArr3));
                    if (str3 == null) {
                        throw mismatchedInputException2;
                    }
                    mismatchedInputException2.e(cls2, str3);
                    throw mismatchedInputException2;
                }
            }
            com.fasterxml.jackson.databind.util.C c13 = cArr[i12];
            if (c13 != null) {
                C.b bVarW0 = c13.w0(jsonParser);
                if (bVarW0.g0() != JsonToken.VALUE_NULL) {
                    com.fasterxml.jackson.databind.util.C cK2 = fVar.k(jsonParser);
                    cK2.a0();
                    cK2.i0(strE);
                    cK2.y0(bVarW0);
                    cK2.A();
                    C.b bVarW02 = cK2.w0(jsonParser);
                    bVarW02.g0();
                    objG = bVarArr[i12].f341638a.g(bVarW02, fVar);
                }
                objArr[i12] = objG;
            }
            com.fasterxml.jackson.databind.deser.v vVar3 = bVar.f341638a;
            if (vVar3.m() >= 0) {
                yVar.b(vVar3, objArr[i12]);
                com.fasterxml.jackson.databind.deser.v vVar4 = bVar.f341641d;
                if (vVar4 != null && vVar4.m() >= 0) {
                    Object objE = strE;
                    if (!vVar4.f341897e.x(String.class)) {
                        com.fasterxml.jackson.databind.util.C cK3 = fVar.k(jsonParser);
                        cK3.i0(strE);
                        com.fasterxml.jackson.databind.i<Object> iVarR = vVar4.r();
                        C.b bVarX0 = cK3.x0(cK3.f342543c);
                        bVarX0.g0();
                        objE = iVarR.e(bVarX0, fVar);
                    }
                    yVar.b(vVar4, objE);
                }
            }
        }
        Object objA = vVar.a(fVar, yVar);
        for (int i13 = 0; i13 < length; i13++) {
            com.fasterxml.jackson.databind.deser.v vVar5 = bVarArr[i13].f341638a;
            if (vVar5.m() < 0) {
                vVar5.z(objA, objArr[i13]);
            }
        }
        return objA;
    }

    public final void d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException, JsonGenerationException {
        String strE;
        b[] bVarArr = this.f341631b;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            String str = this.f341633d[i12];
            b bVar = bVarArr[i12];
            com.fasterxml.jackson.databind.util.C[] cArr = this.f341634e;
            if (str == null) {
                com.fasterxml.jackson.databind.util.C c12 = cArr[i12];
                if (c12 != null) {
                    if (c12.f342550j.d(0).f341103i) {
                        C.b bVarW0 = c12.w0(jsonParser);
                        bVarW0.g0();
                        com.fasterxml.jackson.databind.deser.v vVar = bVar.f341638a;
                        Object objA = com.fasterxml.jackson.databind.jsontype.l.a(bVarW0, vVar.f341897e);
                        if (objA != null) {
                            vVar.z(obj, objA);
                        }
                    }
                    boolean zL2 = bVar.f341639b.l();
                    com.fasterxml.jackson.databind.deser.v vVar2 = bVar.f341638a;
                    com.fasterxml.jackson.databind.h hVar = this.f341630a;
                    String str2 = bVar.f341640c;
                    com.fasterxml.jackson.databind.v vVar3 = vVar2.f341896d;
                    if (!zL2) {
                        String str3 = vVar3.f342656b;
                        fVar.getClass();
                        Class<?> cls = hVar.f341930b;
                        MismatchedInputException mismatchedInputException = new MismatchedInputException((Closeable) fVar.f341924g, String.format("Missing external type id property '%s' (and no 'defaultImpl' specified)", str2));
                        if (str3 == null) {
                            throw mismatchedInputException;
                        }
                        mismatchedInputException.e(cls, str3);
                        throw mismatchedInputException;
                    }
                    com.fasterxml.jackson.databind.jsontype.l lVar = bVar.f341639b;
                    Class<?> clsG = lVar.g();
                    strE = clsG != null ? lVar.i().e(clsG, null) : null;
                    if (strE == null) {
                        String str4 = vVar3.f342656b;
                        fVar.getClass();
                        Class<?> cls2 = hVar.f341930b;
                        MismatchedInputException mismatchedInputException2 = new MismatchedInputException((Closeable) fVar.f341924g, String.format("Invalid default type id for property '%s': `null` returned by TypeIdResolver", str2));
                        if (str4 == null) {
                            throw mismatchedInputException2;
                        }
                        mismatchedInputException2.e(cls2, str4);
                        throw mismatchedInputException2;
                    }
                } else {
                    continue;
                }
            } else {
                if (cArr[i12] == null) {
                    com.fasterxml.jackson.databind.deser.v vVar4 = bVar.f341638a;
                    Boolean bool = vVar4.f342100b.f342515b;
                    if ((bool == null || !bool.booleanValue()) && !fVar.O(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        return;
                    }
                    Class<?> cls3 = obj.getClass();
                    String str5 = vVar4.f341896d.f342656b;
                    Object[] objArr = {str5, bVar.f341640c};
                    fVar.getClass();
                    MismatchedInputException mismatchedInputException3 = new MismatchedInputException((Closeable) fVar.f341924g, String.format("Missing property '%s' for external type id '%s'", objArr));
                    if (str5 == null) {
                        throw mismatchedInputException3;
                    }
                    mismatchedInputException3.e(cls3, str5);
                    throw mismatchedInputException3;
                }
                strE = str;
            }
            a(jsonParser, fVar, obj, i12, strE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.f r14, java.lang.Object r15, java.lang.String r16) throws com.fasterxml.jackson.databind.exc.MismatchedInputException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r12 = this;
            r6 = r12
            r1 = r13
            r2 = r14
            r0 = r16
            java.util.HashMap r3 = r6.f341632c
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            boolean r4 = r3 instanceof java.util.List
            r7 = 1
            com.fasterxml.jackson.databind.deser.impl.g$b[] r5 = r6.f341631b
            com.fasterxml.jackson.databind.util.C[] r8 = r6.f341634e
            java.lang.String[] r9 = r6.f341633d
            if (r4 == 0) goto L75
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r10 = r4.intValue()
            r5 = r5[r10]
            java.lang.String r5 = r5.f341640c
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L54
            java.lang.String r0 = r13.L()
            r13.l0()
            int r1 = r4.intValue()
            r9[r1] = r0
        L41:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r3.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9[r1] = r0
            goto L41
        L54:
            com.fasterxml.jackson.databind.util.C r0 = r14.k(r13)
            r0.y0(r13)
            int r1 = r4.intValue()
            r8[r1] = r0
        L61:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r3.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8[r1] = r0
            goto L61
        L74:
            return r7
        L75:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r10 = r3.intValue()
            r3 = r5[r10]
            java.lang.String r3 = r3.f341640c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L95
            java.lang.String r0 = r13.V()
            r9[r10] = r0
            r13.l0()
            if (r15 == 0) goto Lb3
            r0 = r8[r10]
            if (r0 == 0) goto Lb3
            goto La4
        L95:
            com.fasterxml.jackson.databind.util.C r0 = r14.k(r13)
            r0.y0(r13)
            r8[r10] = r0
            if (r15 == 0) goto Lb3
            r0 = r9[r10]
            if (r0 == 0) goto Lb3
        La4:
            r5 = r9[r10]
            r11 = 0
            r9[r10] = r11
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r10
            r0.a(r1, r2, r3, r4, r5)
            r8[r10] = r11
        Lb3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.g.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.f, java.lang.Object, java.lang.String):boolean");
    }

    public final void f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws MismatchedInputException, JsonGenerationException {
        Object obj2 = this.f341632c.get(str);
        if (obj2 == null) {
            return;
        }
        String strL = jsonParser.L();
        if (!(obj2 instanceof List)) {
            b(jsonParser, fVar, str, obj, strL, ((Integer) obj2).intValue());
            return;
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            b(jsonParser, fVar, str, obj, strL, ((Integer) it.next()).intValue());
        }
    }

    public g(g gVar) {
        this.f341630a = gVar.f341630a;
        b[] bVarArr = gVar.f341631b;
        this.f341631b = bVarArr;
        this.f341632c = gVar.f341632c;
        int length = bVarArr.length;
        this.f341633d = new String[length];
        this.f341634e = new com.fasterxml.jackson.databind.util.C[length];
    }
}
