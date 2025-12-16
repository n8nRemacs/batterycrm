package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.impl.k;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.IOException;
import java.util.Map;
import rX0.InterfaceC47610a;

/* compiled from: MapEntrySerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class h extends com.fasterxml.jackson.databind.ser.i<Map.Entry<?, ?>> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342272d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342273e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342274f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342275g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342276h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342277i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.o f342278j;

    /* renamed from: k, reason: collision with root package name */
    public k f342279k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f342280l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f342281m;

    /* compiled from: MapEntrySerializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342282a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f342282a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342282a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342282a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342282a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342282a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342282a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public h(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2, com.fasterxml.jackson.databind.h hVar3, boolean z12, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.c cVar) {
        super(hVar);
        this.f342274f = hVar2;
        this.f342275g = hVar3;
        this.f342273e = z12;
        this.f342278j = oVar;
        this.f342272d = cVar;
        this.f342279k = k.b.f342293a;
        this.f342280l = null;
        this.f342281m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r12, com.fasterxml.jackson.databind.c r13) {
        /*
            r11 = this;
            com.fasterxml.jackson.databind.z r0 = r12.f341330b
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r0.d()
            r2 = 0
            if (r13 != 0) goto Lb
            r3 = r2
            goto Lf
        Lb:
            com.fasterxml.jackson.databind.introspect.j r3 = r13.b()
        Lf:
            if (r3 == 0) goto L2c
            if (r1 == 0) goto L2c
            java.lang.Object r4 = r1.t(r3)
            if (r4 == 0) goto L1e
            com.fasterxml.jackson.databind.l r4 = r12.H(r3, r4)
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.lang.Object r1 = r1.d(r3)
            if (r1 == 0) goto L2a
            com.fasterxml.jackson.databind.l r1 = r12.H(r3, r1)
            goto L2e
        L2a:
            r1 = r2
            goto L2e
        L2c:
            r1 = r2
            r4 = r1
        L2e:
            if (r1 != 0) goto L32
            com.fasterxml.jackson.databind.l<java.lang.Object> r1 = r11.f342277i
        L32:
            com.fasterxml.jackson.databind.l r1 = com.fasterxml.jackson.databind.ser.std.M.k(r12, r13, r1)
            com.fasterxml.jackson.databind.h r3 = r11.f342275g
            if (r1 != 0) goto L48
            boolean r5 = r11.f342273e
            if (r5 == 0) goto L48
            boolean r5 = r3.F()
            if (r5 != 0) goto L48
            com.fasterxml.jackson.databind.l r1 = r12.p(r3, r13)
        L48:
            r8 = r1
            if (r4 != 0) goto L4d
            com.fasterxml.jackson.databind.l<java.lang.Object> r4 = r11.f342276h
        L4d:
            if (r4 != 0) goto L57
            com.fasterxml.jackson.databind.h r1 = r11.f342274f
            com.fasterxml.jackson.databind.l r1 = r12.r(r1, r13)
        L55:
            r7 = r1
            goto L5c
        L57:
            com.fasterxml.jackson.databind.l r1 = r12.B(r4, r13)
            goto L55
        L5c:
            if (r13 == 0) goto Lb2
            com.fasterxml.jackson.annotation.JsonInclude$a r13 = r13.e(r0, r2)
            if (r13 == 0) goto Lb2
            com.fasterxml.jackson.annotation.JsonInclude$Include r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.f340958f
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = r13.f340962c
            if (r1 == r0) goto Lb2
            int r0 = r1.ordinal()
            r1 = 1
            if (r0 == r1) goto L8b
            com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.f340956d
            r5 = 2
            if (r0 == r5) goto Laa
            r5 = 3
            if (r0 == r5) goto La7
            r4 = 4
            if (r0 == r4) goto L92
            r3 = 5
            if (r0 == r3) goto L83
            r12 = 0
        L80:
            r10 = r12
        L81:
            r9 = r2
            goto Lb7
        L83:
            java.lang.Class<?> r13 = r13.f340964e
            java.lang.Object r2 = r12.C(r13)
            if (r2 != 0) goto L8d
        L8b:
            r10 = r1
            goto L81
        L8d:
            boolean r12 = r12.E(r2)
            goto L80
        L92:
            java.lang.Object r2 = com.fasterxml.jackson.databind.util.C36498d.b(r3)
            if (r2 == 0) goto L8b
            java.lang.Class r12 = r2.getClass()
            boolean r12 = r12.isArray()
            if (r12 == 0) goto L8b
            java.lang.Object r2 = com.fasterxml.jackson.databind.util.C36496b.a(r2)
            goto L8b
        La7:
            r10 = r1
            r9 = r4
            goto Lb7
        Laa:
            boolean r12 = r3.f()
            if (r12 == 0) goto L8b
            r2 = r4
            goto L8b
        Lb2:
            java.lang.Object r2 = r11.f342280l
            boolean r12 = r11.f342281m
            goto L80
        Lb7:
            com.fasterxml.jackson.databind.ser.impl.h r12 = new com.fasterxml.jackson.databind.ser.impl.h
            r5 = r12
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.h.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(A a12, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.f342281m;
        }
        Object obj2 = this.f342280l;
        if (obj2 != null) {
            com.fasterxml.jackson.databind.l<Object> lVar = this.f342277i;
            if (lVar == null) {
                Class<?> cls = value.getClass();
                com.fasterxml.jackson.databind.l<Object> lVarD = this.f342279k.d(cls);
                if (lVarD == null) {
                    try {
                        k kVar = this.f342279k;
                        kVar.getClass();
                        com.fasterxml.jackson.databind.l<Object> lVarQ = a12.q(cls, this.f342272d);
                        k kVarC = kVar.c(cls, lVarQ);
                        if (kVar != kVarC) {
                            this.f342279k = kVarC;
                        }
                        lVar = lVarQ;
                    } catch (JsonMappingException unused) {
                    }
                } else {
                    lVar = lVarD;
                }
            }
            return obj2 == JsonInclude.Include.f340956d ? lVar.d(a12, value) : obj2.equals(value);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) obj;
        jsonGenerator.f0(entry);
        r(entry, jsonGenerator, a12);
        jsonGenerator.B();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) obj;
        jsonGenerator.j(entry);
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_OBJECT, entry));
        r(entry, jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new h(this, this.f342276h, this.f342277i, this.f342280l, this.f342281m);
    }

    public final void r(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, A a12) throws IOException {
        com.fasterxml.jackson.databind.l<Object> lVar;
        Object key = entry.getKey();
        com.fasterxml.jackson.databind.l lVar2 = key == null ? a12.f341336h : this.f342276h;
        Object value = entry.getValue();
        if (value != null) {
            lVar = this.f342277i;
            if (lVar == null) {
                Class<?> cls = value.getClass();
                com.fasterxml.jackson.databind.l<Object> lVarD = this.f342279k.d(cls);
                if (lVarD == null) {
                    com.fasterxml.jackson.databind.h hVar = this.f342275g;
                    boolean zV2 = hVar.v();
                    com.fasterxml.jackson.databind.c cVar = this.f342272d;
                    if (zV2) {
                        k kVar = this.f342279k;
                        k.d dVarB = kVar.b(a12.n(hVar, cls), a12, cVar);
                        k kVar2 = dVarB.f342296b;
                        if (kVar != kVar2) {
                            this.f342279k = kVar2;
                        }
                        lVar = dVarB.f342295a;
                    } else {
                        k kVar3 = this.f342279k;
                        kVar3.getClass();
                        com.fasterxml.jackson.databind.l<Object> lVarQ = a12.q(cls, cVar);
                        k kVarC = kVar3.c(cls, lVarQ);
                        if (kVar3 != kVarC) {
                            this.f342279k = kVarC;
                        }
                        lVar = lVarQ;
                    }
                } else {
                    lVar = lVarD;
                }
            }
            Object obj = this.f342280l;
            if (obj != null && ((obj == JsonInclude.Include.f340956d && lVar.d(a12, value)) || obj.equals(value))) {
                return;
            }
        } else if (this.f342281m) {
            return;
        } else {
            lVar = a12.f341335g;
        }
        lVar2.f(key, jsonGenerator, a12);
        com.fasterxml.jackson.databind.jsontype.o oVar = this.f342278j;
        try {
            if (oVar == null) {
                lVar.f(value, jsonGenerator, a12);
            } else {
                lVar.g(value, jsonGenerator, a12, oVar);
            }
        } catch (Exception e12) {
            M.o(a12, e12, entry, "" + key);
            throw null;
        }
    }

    public h(h hVar, com.fasterxml.jackson.databind.l lVar, com.fasterxml.jackson.databind.l lVar2, Object obj, boolean z12) {
        super(Map.class, 0);
        hVar.getClass();
        this.f342274f = hVar.f342274f;
        this.f342275g = hVar.f342275g;
        this.f342273e = hVar.f342273e;
        this.f342278j = hVar.f342278j;
        this.f342276h = lVar;
        this.f342277i = lVar2;
        this.f342279k = k.b.f342293a;
        this.f342272d = hVar.f342272d;
        this.f342280l = obj;
        this.f342281m = z12;
    }
}
