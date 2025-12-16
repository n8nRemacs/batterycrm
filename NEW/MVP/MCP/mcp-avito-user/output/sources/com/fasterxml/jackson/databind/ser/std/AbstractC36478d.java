package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.util.ArrayList;
import java.util.Set;
import uX0.InterfaceC48995d;
import vX0.InterfaceC49281c;

/* compiled from: BeanSerializerBase.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36478d extends M<Object> implements com.fasterxml.jackson.databind.ser.j, com.fasterxml.jackson.databind.ser.p, InterfaceC48995d, InterfaceC49281c {

    /* renamed from: l, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.ser.d[] f342366l;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.d[] f342368e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.d[] f342369f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.a f342370g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f342371h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC36471j f342372i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.impl.i f342373j;

    /* renamed from: k, reason: collision with root package name */
    public final JsonFormat.Shape f342374k;

    /* compiled from: BeanSerializerBase.java */
    /* renamed from: com.fasterxml.jackson.databind.ser.std.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342375a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f342375a = iArr;
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342375a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342375a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new com.fasterxml.jackson.databind.v("#object-ref", null);
        f342366l = new com.fasterxml.jackson.databind.ser.d[0];
    }

    public AbstractC36478d(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.ser.f fVar, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super(hVar);
        this.f342367d = hVar;
        this.f342368e = dVarArr;
        this.f342369f = dVarArr2;
        if (fVar == null) {
            this.f342372i = null;
            this.f342370g = null;
            this.f342371h = null;
            this.f342373j = null;
            this.f342374k = null;
            return;
        }
        this.f342372i = fVar.f342261g;
        this.f342370g = fVar.f342259e;
        this.f342371h = fVar.f342260f;
        this.f342373j = fVar.f342262h;
        this.f342374k = fVar.f342255a.f().f340948c;
    }

    public static final com.fasterxml.jackson.databind.ser.d[] t(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.util.t tVar) {
        if (dVarArr == null || dVarArr.length == 0 || tVar == null || tVar == com.fasterxml.jackson.databind.util.t.f342628b) {
            return dVarArr;
        }
        int length = dVarArr.length;
        com.fasterxml.jackson.databind.ser.d[] dVarArr2 = new com.fasterxml.jackson.databind.ser.d[length];
        for (int i12 = 0; i12 < length; i12++) {
            com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i12];
            if (dVar != null) {
                dVarArr2[i12] = dVar.i(tVar);
            }
        }
        return dVarArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r24, com.fasterxml.jackson.databind.c r25) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AbstractC36478d.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    @Override // com.fasterxml.jackson.databind.ser.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.fasterxml.jackson.databind.A r11) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r10 = this;
            r0 = 0
            com.fasterxml.jackson.databind.ser.d[] r1 = r10.f342369f
            if (r1 != 0) goto L7
            r2 = r0
            goto L8
        L7:
            int r2 = r1.length
        L8:
            com.fasterxml.jackson.databind.ser.d[] r3 = r10.f342368e
            int r4 = r3.length
        Lb:
            if (r0 >= r4) goto Laa
            r5 = r3[r0]
            boolean r6 = r5.f342250q
            if (r6 != 0) goto L28
            com.fasterxml.jackson.databind.l<java.lang.Object> r6 = r5.f342247n
            if (r6 == 0) goto L18
            goto L28
        L18:
            com.fasterxml.jackson.databind.ser.std.w r6 = r11.f341335g
            if (r6 == 0) goto L28
            r5.g(r6)
            if (r0 >= r2) goto L28
            r7 = r1[r0]
            if (r7 == 0) goto L28
            r7.g(r6)
        L28:
            com.fasterxml.jackson.databind.l<java.lang.Object> r6 = r5.f342246m
            if (r6 == 0) goto L2e
            goto La6
        L2e:
            com.fasterxml.jackson.databind.z r6 = r11.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r6.d()
            r7 = 0
            if (r6 == 0) goto L5e
            com.fasterxml.jackson.databind.introspect.j r8 = r5.f342243j
            if (r8 == 0) goto L5e
            java.lang.Object r6 = r6.U(r8)
            if (r6 == 0) goto L5e
            com.fasterxml.jackson.databind.util.i r6 = r11.c(r6)
            com.fasterxml.jackson.databind.type.n r8 = r11.e()
            com.fasterxml.jackson.databind.h r8 = r6.b(r8)
            boolean r9 = r8.F()
            if (r9 == 0) goto L54
            goto L58
        L54:
            com.fasterxml.jackson.databind.l r7 = r11.w(r8, r5)
        L58:
            com.fasterxml.jackson.databind.ser.std.H r9 = new com.fasterxml.jackson.databind.ser.std.H
            r9.<init>(r6, r8, r7)
            r7 = r9
        L5e:
            if (r7 != 0) goto L99
            com.fasterxml.jackson.databind.h r6 = r5.f342240g
            if (r6 != 0) goto L7b
            com.fasterxml.jackson.databind.h r6 = r5.f342239f
            boolean r7 = r6.E()
            if (r7 != 0) goto L7b
            boolean r7 = r6.B()
            if (r7 != 0) goto L78
            int r7 = r6.i()
            if (r7 <= 0) goto La6
        L78:
            r5.f342241h = r6
            goto La6
        L7b:
            com.fasterxml.jackson.databind.l r7 = r11.w(r6, r5)
            boolean r8 = r6.B()
            if (r8 == 0) goto L99
            com.fasterxml.jackson.databind.h r6 = r6.n()
            java.lang.Object r6 = r6.f341933e
            com.fasterxml.jackson.databind.jsontype.o r6 = (com.fasterxml.jackson.databind.jsontype.o) r6
            if (r6 == 0) goto L99
            boolean r8 = r7 instanceof com.fasterxml.jackson.databind.ser.i
            if (r8 == 0) goto L99
            com.fasterxml.jackson.databind.ser.i r7 = (com.fasterxml.jackson.databind.ser.i) r7
            com.fasterxml.jackson.databind.ser.i r7 = r7.p(r6)
        L99:
            if (r0 >= r2) goto La3
            r6 = r1[r0]
            if (r6 == 0) goto La3
            r6.h(r7)
            goto La6
        La3:
            r5.h(r7)
        La6:
            int r0 = r0 + 1
            goto Lb
        Laa:
            com.fasterxml.jackson.databind.ser.a r0 = r10.f342370g
            if (r0 == 0) goto Lc4
            com.fasterxml.jackson.databind.l<java.lang.Object> r1 = r0.f342230c
            boolean r2 = r1 instanceof com.fasterxml.jackson.databind.ser.j
            if (r2 == 0) goto Lc4
            com.fasterxml.jackson.databind.c$b r2 = r0.f342228a
            com.fasterxml.jackson.databind.l r11 = r11.A(r1, r2)
            r0.f342230c = r11
            boolean r1 = r11 instanceof com.fasterxml.jackson.databind.ser.std.C36494u
            if (r1 == 0) goto Lc4
            com.fasterxml.jackson.databind.ser.std.u r11 = (com.fasterxml.jackson.databind.ser.std.C36494u) r11
            r0.f342231d = r11
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AbstractC36478d.b(com.fasterxml.jackson.databind.A):void");
    }

    @Override // com.fasterxml.jackson.databind.l
    public void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        if (this.f342373j != null) {
            p(obj, jsonGenerator, a12, oVar);
            return;
        }
        WritableTypeId writableTypeIdR = r(oVar, obj, JsonToken.START_OBJECT);
        oVar.e(jsonGenerator, writableTypeIdR);
        jsonGenerator.j(obj);
        if (this.f342371h != null) {
            v(obj, jsonGenerator, a12);
            throw null;
        }
        u(obj, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdR);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean i() {
        return this.f342373j != null;
    }

    public final void p(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        com.fasterxml.jackson.databind.ser.impl.i iVar = this.f342373j;
        com.fasterxml.jackson.databind.ser.impl.x xVarS = a12.s(obj, iVar.f342285c);
        if (xVarS.b(jsonGenerator, a12, iVar)) {
            return;
        }
        if (xVarS.f342319b == null) {
            xVarS.f342319b = xVarS.f342318a.c(obj);
        }
        Object obj2 = xVarS.f342319b;
        if (iVar.f342287e) {
            iVar.f342286d.f(obj2, jsonGenerator, a12);
            return;
        }
        WritableTypeId writableTypeIdR = r(oVar, obj, JsonToken.START_OBJECT);
        oVar.e(jsonGenerator, writableTypeIdR);
        jsonGenerator.j(obj);
        xVarS.a(jsonGenerator, a12, iVar);
        if (this.f342371h != null) {
            v(obj, jsonGenerator, a12);
            throw null;
        }
        u(obj, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdR);
    }

    public final void q(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, boolean z12) {
        com.fasterxml.jackson.databind.ser.impl.i iVar = this.f342373j;
        com.fasterxml.jackson.databind.ser.impl.x xVarS = a12.s(obj, iVar.f342285c);
        if (xVarS.b(jsonGenerator, a12, iVar)) {
            return;
        }
        if (xVarS.f342319b == null) {
            xVarS.f342319b = xVarS.f342318a.c(obj);
        }
        Object obj2 = xVarS.f342319b;
        if (iVar.f342287e) {
            iVar.f342286d.f(obj2, jsonGenerator, a12);
            return;
        }
        if (z12) {
            jsonGenerator.f0(obj);
        }
        xVarS.a(jsonGenerator, a12, iVar);
        if (this.f342371h != null) {
            v(obj, jsonGenerator, a12);
            throw null;
        }
        u(obj, jsonGenerator, a12);
        if (z12) {
            jsonGenerator.B();
        }
    }

    public final WritableTypeId r(com.fasterxml.jackson.databind.jsontype.o oVar, Object obj, JsonToken jsonToken) {
        AbstractC36471j abstractC36471j = this.f342372i;
        if (abstractC36471j == null) {
            return oVar.d(jsonToken, obj);
        }
        Object objL = abstractC36471j.l(obj);
        if (objL == null) {
            objL = "";
        }
        WritableTypeId writableTypeIdD = oVar.d(jsonToken, obj);
        writableTypeIdD.f341266c = objL;
        return writableTypeIdD;
    }

    public abstract AbstractC36478d s();

    public final void u(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        if (this.f342369f != null) {
            a12.getClass();
        }
        com.fasterxml.jackson.databind.ser.d[] dVarArr = this.f342368e;
        int i12 = 0;
        try {
            int length = dVarArr.length;
            while (i12 < length) {
                com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i12];
                if (dVar != null) {
                    dVar.l(obj, jsonGenerator, a12);
                }
                i12++;
            }
            com.fasterxml.jackson.databind.ser.a aVar = this.f342370g;
            if (aVar != null) {
                aVar.a(obj, jsonGenerator, a12);
            }
        } catch (Exception e12) {
            M.o(a12, e12, obj, i12 != dVarArr.length ? dVarArr[i12].f342237d.f341186b : "[anySetter]");
            throw null;
        } catch (StackOverflowError e13) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e13);
            jsonMappingException.e(obj, i12 != dVarArr.length ? dVarArr[i12].f342237d.f341186b : "[anySetter]");
            throw jsonMappingException;
        }
    }

    public final void v(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        if (this.f342369f != null) {
            a12.getClass();
        }
        m(a12, this.f342371h, obj);
        throw null;
    }

    public abstract AbstractC36478d w(Set<String> set, Set<String> set2);

    public abstract AbstractC36478d x(Object obj);

    public abstract AbstractC36478d y(com.fasterxml.jackson.databind.ser.impl.i iVar);

    public abstract AbstractC36478d z(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2);

    public AbstractC36478d(AbstractC36478d abstractC36478d, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super(abstractC36478d.f342353b);
        this.f342367d = abstractC36478d.f342367d;
        this.f342368e = dVarArr;
        this.f342369f = dVarArr2;
        this.f342372i = abstractC36478d.f342372i;
        this.f342370g = abstractC36478d.f342370g;
        this.f342373j = abstractC36478d.f342373j;
        this.f342371h = abstractC36478d.f342371h;
        this.f342374k = abstractC36478d.f342374k;
    }

    public AbstractC36478d(AbstractC36478d abstractC36478d, com.fasterxml.jackson.databind.ser.impl.i iVar, Object obj) {
        super(abstractC36478d.f342353b);
        this.f342367d = abstractC36478d.f342367d;
        this.f342368e = abstractC36478d.f342368e;
        this.f342369f = abstractC36478d.f342369f;
        this.f342372i = abstractC36478d.f342372i;
        this.f342370g = abstractC36478d.f342370g;
        this.f342373j = iVar;
        this.f342371h = obj;
        this.f342374k = abstractC36478d.f342374k;
    }

    public AbstractC36478d(AbstractC36478d abstractC36478d, Set<String> set, Set<String> set2) {
        super(abstractC36478d.f342353b);
        this.f342367d = abstractC36478d.f342367d;
        com.fasterxml.jackson.databind.ser.d[] dVarArr = abstractC36478d.f342368e;
        com.fasterxml.jackson.databind.ser.d[] dVarArr2 = abstractC36478d.f342369f;
        int length = dVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = dVarArr2 == null ? null : new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i12];
            if (!com.fasterxml.jackson.databind.util.n.b(dVar.f342237d.f341186b, set, set2)) {
                arrayList.add(dVar);
                if (dVarArr2 != null) {
                    arrayList2.add(dVarArr2[i12]);
                }
            }
        }
        this.f342368e = (com.fasterxml.jackson.databind.ser.d[]) arrayList.toArray(new com.fasterxml.jackson.databind.ser.d[arrayList.size()]);
        this.f342369f = arrayList2 != null ? (com.fasterxml.jackson.databind.ser.d[]) arrayList2.toArray(new com.fasterxml.jackson.databind.ser.d[arrayList2.size()]) : null;
        this.f342372i = abstractC36478d.f342372i;
        this.f342370g = abstractC36478d.f342370g;
        this.f342373j = abstractC36478d.f342373j;
        this.f342371h = abstractC36478d.f342371h;
        this.f342374k = abstractC36478d.f342374k;
    }
}
