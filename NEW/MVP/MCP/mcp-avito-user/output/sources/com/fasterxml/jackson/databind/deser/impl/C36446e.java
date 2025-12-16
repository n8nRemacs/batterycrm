package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.H;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

/* compiled from: CreatorCollector.java */
/* renamed from: com.fasterxml.jackson.databind.deser.impl.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36446e {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f341619j = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.b f341620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f341621b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341622c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.introspect.o[] f341623d = new com.fasterxml.jackson.databind.introspect.o[11];

    /* renamed from: e, reason: collision with root package name */
    public int f341624e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f341625f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341626g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341627h;

    /* renamed from: i, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341628i;

    public C36446e(com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.cfg.l<?> lVar) {
        this.f341620a = bVar;
        lVar.getClass();
        this.f341621b = lVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        this.f341622c = lVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final com.fasterxml.jackson.databind.h a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.introspect.o oVar, com.fasterxml.jackson.databind.deser.v[] vVarArr) {
        if (!this.f341625f || oVar == null) {
            return null;
        }
        int i12 = 0;
        if (vVarArr != null) {
            int length = vVarArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (vVarArr[i13] == null) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
        }
        com.fasterxml.jackson.databind.cfg.l<?> lVar = fVar.f341921d;
        com.fasterxml.jackson.databind.h hVarU = oVar.u(i12);
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        if (annotationIntrospectorD == null) {
            return hVarU;
        }
        com.fasterxml.jackson.databind.introspect.n nVarS = oVar.s(i12);
        Object objK = annotationIntrospectorD.k(nVarS);
        return objK != null ? hVarU.S(fVar.m(nVarS, objK)) : annotationIntrospectorD.u0(lVar, nVarS, hVarU);
    }

    public final void b(com.fasterxml.jackson.databind.introspect.o oVar, boolean z12, com.fasterxml.jackson.databind.deser.v[] vVarArr, int i12) {
        if (oVar.u(i12).z()) {
            if (e(oVar, 10, z12)) {
                this.f341627h = vVarArr;
            }
        } else if (e(oVar, 8, z12)) {
            this.f341626g = vVarArr;
        }
    }

    public final void c(com.fasterxml.jackson.databind.introspect.o oVar, boolean z12, com.fasterxml.jackson.databind.deser.v[] vVarArr) {
        Integer num;
        if (e(oVar, 9, z12)) {
            if (vVarArr.length > 1) {
                HashMap map = new HashMap();
                int length = vVarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    String str = vVarArr[i12].f341896d.f342656b;
                    if ((!str.isEmpty() || vVarArr[i12].o() == null) && (num = (Integer) map.put(str, Integer.valueOf(i12))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", str, num, Integer.valueOf(i12), com.fasterxml.jackson.databind.util.g.A(this.f341620a.f341454a.f341930b)));
                    }
                }
            }
            this.f341628i = vVarArr;
        }
    }

    public final H d(com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
        com.fasterxml.jackson.databind.introspect.o[] oVarArr = this.f341623d;
        com.fasterxml.jackson.databind.h hVarA = a(fVar, oVarArr[8], this.f341626g);
        com.fasterxml.jackson.databind.h hVarA2 = a(fVar, oVarArr[10], this.f341627h);
        H h12 = new H(this.f341620a.f341454a);
        com.fasterxml.jackson.databind.introspect.o oVar = oVarArr[0];
        com.fasterxml.jackson.databind.introspect.o oVar2 = oVarArr[8];
        com.fasterxml.jackson.databind.deser.v[] vVarArr = this.f341626g;
        com.fasterxml.jackson.databind.introspect.o oVar3 = oVarArr[9];
        com.fasterxml.jackson.databind.deser.v[] vVarArr2 = this.f341628i;
        h12.f341735d = oVar;
        h12.f341739h = oVar2;
        h12.f341738g = hVarA;
        h12.f341740i = vVarArr;
        h12.f341736e = oVar3;
        h12.f341737f = vVarArr2;
        com.fasterxml.jackson.databind.introspect.o oVar4 = oVarArr[10];
        com.fasterxml.jackson.databind.deser.v[] vVarArr3 = this.f341627h;
        h12.f341742k = oVar4;
        h12.f341741j = hVarA2;
        h12.f341743l = vVarArr3;
        h12.f341744m = oVarArr[1];
        h12.f341745n = oVarArr[2];
        h12.f341746o = oVarArr[3];
        h12.f341747p = oVarArr[4];
        h12.f341748q = oVarArr[5];
        h12.f341749r = oVarArr[6];
        h12.f341750s = oVarArr[7];
        return h12;
    }

    public final boolean e(com.fasterxml.jackson.databind.introspect.o oVar, int i12, boolean z12) {
        boolean z13;
        int i13 = 1 << i12;
        this.f341625f = true;
        com.fasterxml.jackson.databind.introspect.o[] oVarArr = this.f341623d;
        com.fasterxml.jackson.databind.introspect.o oVar2 = oVarArr[i12];
        if (oVar2 != null) {
            boolean z14 = false;
            if ((this.f341624e & i13) == 0) {
                z13 = !z12;
            } else {
                if (!z12) {
                    return false;
                }
                z13 = true;
            }
            if (z13 && oVar2.getClass() == oVar.getClass()) {
                Class<?> clsV = oVar2.v(0);
                Class<?> clsV2 = oVar.v(0);
                String[] strArr = f341619j;
                if (clsV == clsV2) {
                    Class<?> clsH = oVar.h();
                    Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
                    if (Enum.class.isAssignableFrom(clsH) && "valueOf".equals(oVar.d())) {
                        return false;
                    }
                    if (Enum.class.isAssignableFrom(oVar2.h()) && "valueOf".equals(oVar2.d())) {
                        z14 = true;
                    }
                    if (!z14) {
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", strArr[i12], z12 ? "explicitly marked" : "implicitly discovered", oVar2, oVar));
                    }
                } else {
                    if (clsV2.isAssignableFrom(clsV)) {
                        return false;
                    }
                    if (!clsV.isAssignableFrom(clsV2)) {
                        if (clsV.isPrimitive() == clsV2.isPrimitive()) {
                            throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", strArr[i12], z12 ? "explicitly marked" : "implicitly discovered", oVar2, oVar));
                        }
                        if (clsV.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (z12) {
            this.f341624e |= i13;
        }
        if (oVar != null && this.f341621b) {
            com.fasterxml.jackson.databind.util.g.e((Member) oVar.b(), this.f341622c);
        }
        oVarArr[i12] = oVar;
        return true;
    }
}
