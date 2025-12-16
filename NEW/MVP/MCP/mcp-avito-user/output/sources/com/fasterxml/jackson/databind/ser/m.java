package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.z;

/* compiled from: PropertyBuilder.java */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final z f342324a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.b f342325b;

    /* renamed from: c, reason: collision with root package name */
    public final AnnotationIntrospector f342326c;

    /* renamed from: d, reason: collision with root package name */
    public Object f342327d;

    /* renamed from: e, reason: collision with root package name */
    public final JsonInclude.a f342328e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342329f;

    /* compiled from: PropertyBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342330a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f342330a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342330a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342330a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342330a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342330a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342330a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public m(z zVar, com.fasterxml.jackson.databind.b bVar) {
        this.f342324a = zVar;
        this.f342325b = bVar;
        JsonInclude.a aVarA = JsonInclude.a.f340960f;
        JsonInclude.a aVarK = bVar.k(aVarA);
        zVar.l(bVar.f341454a.f341930b).getClass();
        aVarA = aVarK != null ? aVarK.a(aVarA) : aVarA;
        JsonInclude.a aVar = zVar.f341514h.f341488b;
        this.f342328e = aVar == null ? aVarA : aVar.a(aVarA);
        this.f342329f = aVarA.f340961b == JsonInclude.Include.f340957e;
        this.f342326c = zVar.d();
    }

    public final com.fasterxml.jackson.databind.h a(AbstractC36471j abstractC36471j, boolean z12, com.fasterxml.jackson.databind.h hVar) {
        AnnotationIntrospector annotationIntrospector = this.f342326c;
        com.fasterxml.jackson.databind.h hVarV0 = annotationIntrospector.v0(this.f342324a, abstractC36471j, hVar);
        if (hVarV0 != hVar) {
            Class<?> cls = hVarV0.f341930b;
            Class<?> cls2 = hVar.f341930b;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + abstractC36471j.d() + "': class " + cls.getName() + " not a super-type of (declared) class " + cls2.getName());
            }
            hVar = hVarV0;
            z12 = true;
        }
        JsonSerialize.Typing typingX = annotationIntrospector.X(abstractC36471j);
        if (typingX != null && typingX != JsonSerialize.Typing.f341452d) {
            z12 = typingX == JsonSerialize.Typing.f341451c;
        }
        if (z12) {
            return hVar.Q();
        }
        return null;
    }
}
