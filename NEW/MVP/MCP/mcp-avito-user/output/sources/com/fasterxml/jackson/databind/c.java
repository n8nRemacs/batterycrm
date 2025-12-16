package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.io.Serializable;

/* compiled from: BeanProperty.java */
/* loaded from: classes4.dex */
public interface c extends com.fasterxml.jackson.databind.util.u {

    /* renamed from: f2, reason: collision with root package name */
    public static final JsonFormat.b f341455f2 = new JsonFormat.b();

    /* compiled from: BeanProperty.java */
    public static class a implements c {
        @Override // com.fasterxml.jackson.databind.c
        public final AbstractC36471j b() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final v c() {
            return v.f342655f;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final JsonFormat.b d(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
            return JsonFormat.b.f340946i;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final JsonInclude.a e(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final u getMetadata() {
            return u.f342514k;
        }

        @Override // com.fasterxml.jackson.databind.util.u
        public final String getName() {
            return "";
        }

        @Override // com.fasterxml.jackson.databind.c
        public final h getType() {
            return com.fasterxml.jackson.databind.type.n.p();
        }
    }

    /* compiled from: BeanProperty.java */
    public static class b implements c, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final v f341456b;

        /* renamed from: c, reason: collision with root package name */
        public final h f341457c;

        /* renamed from: d, reason: collision with root package name */
        public final u f341458d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC36471j f341459e;

        public b(v vVar, h hVar, v vVar2, AbstractC36471j abstractC36471j, u uVar) {
            this.f341456b = vVar;
            this.f341457c = hVar;
            this.f341458d = uVar;
            this.f341459e = abstractC36471j;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final AbstractC36471j b() {
            return this.f341459e;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final v c() {
            return this.f341456b;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final JsonFormat.b d(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
            AbstractC36471j abstractC36471j;
            JsonFormat.b bVarO;
            JsonFormat.b bVarF = lVar.f(cls);
            AnnotationIntrospector annotationIntrospectorD = lVar.d();
            return (annotationIntrospectorD == null || (abstractC36471j = this.f341459e) == null || (bVarO = annotationIntrospectorD.o(abstractC36471j)) == null) ? bVarF : bVarF.e(bVarO);
        }

        @Override // com.fasterxml.jackson.databind.c
        public final JsonInclude.a e(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls) {
            AbstractC36471j abstractC36471j;
            JsonInclude.a aVarL;
            JsonInclude.a aVarE = lVar.e(cls, this.f341457c.f341930b);
            AnnotationIntrospector annotationIntrospectorD = lVar.d();
            return (annotationIntrospectorD == null || (abstractC36471j = this.f341459e) == null || (aVarL = annotationIntrospectorD.L(abstractC36471j)) == null) ? aVarE : aVarE.a(aVarL);
        }

        @Override // com.fasterxml.jackson.databind.c
        public final u getMetadata() {
            return this.f341458d;
        }

        @Override // com.fasterxml.jackson.databind.util.u
        public final String getName() {
            return this.f341456b.f342656b;
        }

        @Override // com.fasterxml.jackson.databind.c
        public final h getType() {
            return this.f341457c;
        }
    }

    static {
        JsonInclude.a aVar = JsonInclude.a.f340960f;
    }

    AbstractC36471j b();

    v c();

    JsonFormat.b d(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls);

    JsonInclude.a e(com.fasterxml.jackson.databind.cfg.l<?> lVar, Class<?> cls);

    u getMetadata();

    h getType();
}
