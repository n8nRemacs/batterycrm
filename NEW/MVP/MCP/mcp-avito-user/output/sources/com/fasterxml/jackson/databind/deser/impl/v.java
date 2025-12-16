package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PropertyBasedCreator.java */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f341676a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.x f341677b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, com.fasterxml.jackson.databind.deser.v> f341678c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v[] f341679d;

    /* compiled from: PropertyBasedCreator.java */
    public static class a extends HashMap<String, com.fasterxml.jackson.databind.deser.v> {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Locale f341680b;

        @Deprecated
        public a() {
            this(Locale.getDefault());
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return (com.fasterxml.jackson.databind.deser.v) super.get(((String) obj).toLowerCase(this.f341680b));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return (com.fasterxml.jackson.databind.deser.v) super.put(((String) obj).toLowerCase(this.f341680b), (com.fasterxml.jackson.databind.deser.v) obj2);
        }

        public a(Locale locale) {
            this.f341680b = locale;
        }
    }

    public v(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.deser.v[] vVarArr, boolean z12, boolean z13) {
        AbstractC36471j abstractC36471jB;
        this.f341677b = xVar;
        if (z12) {
            this.f341678c = new a(fVar.f341921d.f341506c.f341480h);
        } else {
            this.f341678c = new HashMap<>();
        }
        int length = vVarArr.length;
        this.f341676a = length;
        this.f341679d = new com.fasterxml.jackson.databind.deser.v[length];
        if (z13) {
            com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
            for (com.fasterxml.jackson.databind.deser.v vVar : vVarArr) {
                if (!vVar.w()) {
                    List<com.fasterxml.jackson.databind.v> listEmptyList = vVar.f342101c;
                    if (listEmptyList == null) {
                        AnnotationIntrospector annotationIntrospectorD = eVar.d();
                        if (annotationIntrospectorD != null && (abstractC36471jB = vVar.b()) != null) {
                            listEmptyList = annotationIntrospectorD.F(abstractC36471jB);
                        }
                        listEmptyList = listEmptyList == null ? Collections.emptyList() : listEmptyList;
                        vVar.f342101c = listEmptyList;
                    }
                    if (!listEmptyList.isEmpty()) {
                        Iterator<com.fasterxml.jackson.databind.v> it = listEmptyList.iterator();
                        while (it.hasNext()) {
                            this.f341678c.put(it.next().f342656b, vVar);
                        }
                    }
                }
            }
        }
        for (int i12 = 0; i12 < length; i12++) {
            com.fasterxml.jackson.databind.deser.v vVar2 = vVarArr[i12];
            this.f341679d[i12] = vVar2;
            if (!vVar2.w()) {
                this.f341678c.put(vVar2.f341896d.f342656b, vVar2);
            }
        }
    }

    public static v b(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.deser.x xVar, com.fasterxml.jackson.databind.deser.v[] vVarArr, boolean z12) {
        int length = vVarArr.length;
        com.fasterxml.jackson.databind.deser.v[] vVarArr2 = new com.fasterxml.jackson.databind.deser.v[length];
        for (int i12 = 0; i12 < length; i12++) {
            com.fasterxml.jackson.databind.deser.v vVarE = vVarArr[i12];
            if (!vVarE.t()) {
                vVarE = vVarE.E(fVar.p(vVarE.f341897e, vVarE));
            }
            vVarArr2[i12] = vVarE;
        }
        return new v(fVar, xVar, vVarArr2, z12, false);
    }

    public final Object a(com.fasterxml.jackson.databind.f fVar, y yVar) throws MismatchedInputException {
        Object objU = this.f341677b.u(fVar, this.f341679d, yVar);
        if (objU != null) {
            s sVar = yVar.f341689c;
            if (sVar != null) {
                Object obj = yVar.f341695i;
                com.fasterxml.jackson.databind.deser.v vVar = sVar.f341671g;
                if (obj == null) {
                    fVar.getClass();
                    fVar.U(vVar, String.format("No Object Id found for an instance of %s, to assign to property '%s'", com.fasterxml.jackson.databind.util.g.f(objU), sVar.f341667c), new Object[0]);
                    throw null;
                }
                fVar.t(obj, sVar.f341668d, sVar.f341669e).b(objU);
                if (vVar != null) {
                    objU = vVar.A(objU, yVar.f341695i);
                }
            }
            for (x xVar = yVar.f341694h; xVar != null; xVar = xVar.f341681a) {
                xVar.a(objU);
            }
        }
        return objU;
    }

    public final com.fasterxml.jackson.databind.deser.v c(String str) {
        return this.f341678c.get(str);
    }

    public final y d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, s sVar) {
        return new y(jsonParser, fVar, this.f341676a, sVar);
    }
}
