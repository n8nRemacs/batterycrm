package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36469h;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.K;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SimpleBeanPropertyDefinition.java */
/* loaded from: classes4.dex */
public class z extends com.fasterxml.jackson.databind.introspect.u {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f342648h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final AnnotationIntrospector f342649c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC36471j f342650d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.u f342651e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f342652f;

    /* renamed from: g, reason: collision with root package name */
    public final JsonInclude.a f342653g;

    public z(AnnotationIntrospector annotationIntrospector, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.u uVar, JsonInclude.a aVar) {
        this.f342649c = annotationIntrospector;
        this.f342650d = abstractC36471j;
        this.f342652f = vVar;
        this.f342651e = uVar == null ? com.fasterxml.jackson.databind.u.f342513j : uVar;
        this.f342653g = aVar;
    }

    public static z C(com.fasterxml.jackson.databind.cfg.l lVar, K k12, com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.u uVar, JsonInclude.Include include) {
        JsonInclude.a aVar;
        JsonInclude.Include include2;
        if (include == null || include == (include2 = JsonInclude.Include.f340958f)) {
            aVar = com.fasterxml.jackson.databind.introspect.u.f342096b;
        } else {
            JsonInclude.a aVar2 = JsonInclude.a.f340960f;
            aVar = include != include2 ? new JsonInclude.a(include, null, null, null) : JsonInclude.a.f340960f;
        }
        return new z(lVar.d(), k12, vVar, uVar, aVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean A() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.v c() {
        return this.f342652f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.u getMetadata() {
        return this.f342651e;
    }

    @Override // com.fasterxml.jackson.databind.util.u
    public final String getName() {
        return this.f342652f.f342656b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final JsonInclude.a h() {
        return this.f342653g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.introspect.n m() {
        AbstractC36471j abstractC36471j = this.f342650d;
        if (abstractC36471j instanceof com.fasterxml.jackson.databind.introspect.n) {
            return (com.fasterxml.jackson.databind.introspect.n) abstractC36471j;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final Iterator<com.fasterxml.jackson.databind.introspect.n> n() {
        com.fasterxml.jackson.databind.introspect.n nVarM = m();
        return nVarM == null ? g.f342598c : Collections.singleton(nVarM).iterator();
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final C36469h o() {
        AbstractC36471j abstractC36471j = this.f342650d;
        if (abstractC36471j instanceof C36469h) {
            return (C36469h) abstractC36471j;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final C36472k p() {
        AbstractC36471j abstractC36471j = this.f342650d;
        if ((abstractC36471j instanceof C36472k) && ((C36472k) abstractC36471j).w().length == 0) {
            return (C36472k) abstractC36471j;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.h q() {
        AbstractC36471j abstractC36471j = this.f342650d;
        return abstractC36471j == null ? com.fasterxml.jackson.databind.type.n.p() : abstractC36471j.f();
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final Class<?> r() {
        AbstractC36471j abstractC36471j = this.f342650d;
        return abstractC36471j == null ? Object.class : abstractC36471j.e();
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final C36472k s() {
        AbstractC36471j abstractC36471j = this.f342650d;
        if ((abstractC36471j instanceof C36472k) && ((C36472k) abstractC36471j).w().length == 1) {
            return (C36472k) abstractC36471j;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final com.fasterxml.jackson.databind.v t() {
        AnnotationIntrospector annotationIntrospector = this.f342649c;
        if (annotationIntrospector == null || this.f342650d == null) {
            return null;
        }
        return annotationIntrospector.g0();
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean u() {
        return this.f342650d instanceof com.fasterxml.jackson.databind.introspect.n;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean v() {
        return this.f342650d instanceof C36469h;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean w(com.fasterxml.jackson.databind.v vVar) {
        return this.f342652f.equals(vVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean x() {
        return s() != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.u
    public final boolean z() {
        return false;
    }
}
