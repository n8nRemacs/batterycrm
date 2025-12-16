package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.util.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: AnnotatedCreatorCollector.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C36468g extends w {

    /* renamed from: d, reason: collision with root package name */
    public final C36465d f342039d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342040e;

    /* renamed from: f, reason: collision with root package name */
    public C36467f f342041f;

    public C36468g(AnnotationIntrospector annotationIntrospector, C36465d c36465d, boolean z12) {
        super(annotationIntrospector);
        this.f342039d = c36465d;
        this.f342040e = z12;
    }

    public final r e(g.a aVar, g.a aVar2) {
        if (!this.f342040e) {
            return new r();
        }
        Annotation[] declaredAnnotations = aVar.f342600b;
        if (declaredAnnotations == null) {
            declaredAnnotations = aVar.f342599a.getDeclaredAnnotations();
            aVar.f342600b = declaredAnnotations;
        }
        p pVarB = b(declaredAnnotations);
        if (aVar2 != null) {
            Annotation[] declaredAnnotations2 = aVar2.f342600b;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = aVar2.f342599a.getDeclaredAnnotations();
                aVar2.f342600b = declaredAnnotations2;
            }
            pVarB = a(pVarB, declaredAnnotations2);
        }
        return pVarB.b();
    }

    public final r[] f(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f342040e) {
            return w.f342097b;
        }
        int length = annotationArr.length;
        r[] rVarArr = new r[length];
        for (int i12 = 0; i12 < length; i12++) {
            p.c cVar = p.f342070a;
            p pVarA = a(p.a.f342071b, annotationArr[i12]);
            if (annotationArr2 != null) {
                pVarA = a(pVarA, annotationArr2[i12]);
            }
            rVarArr[i12] = pVarA.b();
        }
        return rVarArr;
    }

    public final C36472k g(Method method, J j12, Method method2) {
        int length = method.getParameterTypes().length;
        AnnotationIntrospector annotationIntrospector = this.f342099a;
        r[] rVarArr = w.f342097b;
        if (annotationIntrospector == null) {
            r rVar = new r();
            if (length != 0) {
                rVarArr = new r[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVarArr[i12] = new r();
                }
            }
            return new C36472k(j12, method, rVar, rVarArr);
        }
        if (length == 0) {
            p pVarB = b(method.getDeclaredAnnotations());
            if (method2 != null) {
                pVarB = a(pVarB, method2.getDeclaredAnnotations());
            }
            return new C36472k(j12, method, pVarB.b(), rVarArr);
        }
        p pVarB2 = b(method.getDeclaredAnnotations());
        if (method2 != null) {
            pVarB2 = a(pVarB2, method2.getDeclaredAnnotations());
        }
        return new C36472k(j12, method, pVarB2.b(), f(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    public final C36467f h(g.a aVar, g.a aVar2) {
        int length = aVar.f342602d;
        Constructor<?> constructor = aVar.f342599a;
        if (length < 0) {
            length = constructor.getParameterTypes().length;
            aVar.f342602d = length;
        }
        C36465d c36465d = this.f342039d;
        r[] rVarArr = w.f342097b;
        if (this.f342099a == null) {
            r rVar = new r();
            if (length != 0) {
                rVarArr = new r[length];
                for (int i12 = 0; i12 < length; i12++) {
                    rVarArr[i12] = new r();
                }
            }
            return new C36467f(c36465d, constructor, rVar, rVarArr);
        }
        if (length == 0) {
            return new C36467f(c36465d, constructor, e(aVar, aVar2), rVarArr);
        }
        Annotation[][] parameterAnnotations = aVar.f342601c;
        if (parameterAnnotations == null) {
            parameterAnnotations = constructor.getParameterAnnotations();
            aVar.f342601c = parameterAnnotations;
        }
        Annotation[][] annotationArr = null;
        rVarArrF = null;
        r[] rVarArrF = null;
        if (length != parameterAnnotations.length) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            Annotation[] annotationArr2 = com.fasterxml.jackson.databind.util.g.f342596a;
            if (Enum.class.isAssignableFrom(declaringClass) && length == parameterAnnotations.length + 2) {
                Annotation[][] annotationArr3 = new Annotation[parameterAnnotations.length + 2][];
                System.arraycopy(parameterAnnotations, 0, annotationArr3, 2, parameterAnnotations.length);
                rVarArrF = f(annotationArr3, null);
                parameterAnnotations = annotationArr3;
            } else if (declaringClass.isMemberClass() && length == parameterAnnotations.length + 1) {
                Annotation[][] annotationArr4 = new Annotation[parameterAnnotations.length + 1][];
                System.arraycopy(parameterAnnotations, 0, annotationArr4, 1, parameterAnnotations.length);
                annotationArr4[0] = w.f342098c;
                rVarArrF = f(annotationArr4, null);
                parameterAnnotations = annotationArr4;
            }
            if (rVarArrF == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", constructor.getDeclaringClass().getName(), Integer.valueOf(length), Integer.valueOf(parameterAnnotations.length)));
            }
        } else {
            if (aVar2 != null) {
                Annotation[][] parameterAnnotations2 = aVar2.f342601c;
                if (parameterAnnotations2 == null) {
                    parameterAnnotations2 = aVar2.f342599a.getParameterAnnotations();
                    aVar2.f342601c = parameterAnnotations2;
                }
                annotationArr = parameterAnnotations2;
            }
            rVarArrF = f(parameterAnnotations, annotationArr);
        }
        return new C36467f(c36465d, constructor, e(aVar, aVar2), rVarArrF);
    }
}
