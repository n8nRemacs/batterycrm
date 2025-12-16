package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;
import java.util.List;

/* compiled from: ConcreteBeanPropertyBase.java */
/* loaded from: classes4.dex */
public abstract class x implements com.fasterxml.jackson.databind.c, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.u f342100b;

    /* renamed from: c, reason: collision with root package name */
    public transient List<com.fasterxml.jackson.databind.v> f342101c;

    public x(com.fasterxml.jackson.databind.u uVar) {
        this.f342100b = uVar == null ? com.fasterxml.jackson.databind.u.f342514k : uVar;
    }

    @Override // com.fasterxml.jackson.databind.c
    public final JsonFormat.b d(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
        AbstractC36471j abstractC36471jB;
        JsonFormat.b bVarF = lVar.f(cls);
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        JsonFormat.b bVarO = (annotationIntrospectorD == null || (abstractC36471jB = b()) == null) ? null : annotationIntrospectorD.o(abstractC36471jB);
        return bVarF == null ? bVarO == null ? com.fasterxml.jackson.databind.c.f341455f2 : bVarO : bVarO == null ? bVarF : bVarF.e(bVarO);
    }

    @Override // com.fasterxml.jackson.databind.c
    public final JsonInclude.a e(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
        AnnotationIntrospector annotationIntrospectorD = lVar.d();
        AbstractC36471j abstractC36471jB = b();
        if (abstractC36471jB == null) {
            return lVar.g(cls);
        }
        JsonInclude.a aVarE = lVar.e(cls, abstractC36471jB.e());
        if (annotationIntrospectorD == null) {
            return aVarE;
        }
        JsonInclude.a aVarL = annotationIntrospectorD.L(abstractC36471jB);
        return aVarE == null ? aVarL : aVarE.a(aVarL);
    }

    @Override // com.fasterxml.jackson.databind.c
    public com.fasterxml.jackson.databind.u getMetadata() {
        return this.f342100b;
    }

    public x(x xVar) {
        this.f342100b = xVar.f342100b;
    }
}
