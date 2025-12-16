package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.p;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* compiled from: CollectorBase.java */
/* loaded from: classes4.dex */
class w {

    /* renamed from: b, reason: collision with root package name */
    public static final r[] f342097b = new r[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Annotation[] f342098c = new Annotation[0];

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f342099a;

    public w(AnnotationIntrospector annotationIntrospector) {
        this.f342099a = annotationIntrospector;
    }

    public final p a(p pVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            pVar = pVar.a(annotation);
            if (this.f342099a.r0(annotation)) {
                pVar = d(pVar, annotation);
            }
        }
        return pVar;
    }

    public final p b(Annotation[] annotationArr) {
        p.c cVar = p.f342070a;
        p pVarA = p.a.f342071b;
        for (Annotation annotation : annotationArr) {
            pVarA = pVarA.a(annotation);
            if (this.f342099a.r0(annotation)) {
                pVarA = d(pVarA, annotation);
            }
        }
        return pVarA;
    }

    public final p c(p pVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!pVar.d(annotation)) {
                pVar = pVar.a(annotation);
                AnnotationIntrospector annotationIntrospector = this.f342099a;
                if (annotationIntrospector.r0(annotation)) {
                    for (Annotation annotation2 : com.fasterxml.jackson.databind.util.g.j(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !pVar.d(annotation2)) {
                            pVar = pVar.a(annotation2);
                            if (annotationIntrospector.r0(annotation2)) {
                                pVar = d(pVar, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return pVar;
    }

    public final p d(p pVar, Annotation annotation) {
        for (Annotation annotation2 : com.fasterxml.jackson.databind.util.g.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.f342099a.r0(annotation2)) {
                    pVar = pVar.a(annotation2);
                } else if (!pVar.d(annotation2)) {
                    pVar = d(pVar.a(annotation2), annotation2);
                }
            }
        }
        return pVar;
    }
}
