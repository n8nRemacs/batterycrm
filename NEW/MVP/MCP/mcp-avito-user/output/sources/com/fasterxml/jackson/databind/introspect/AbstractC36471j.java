package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

/* compiled from: AnnotatedMember.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36471j extends AbstractC36463b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient J f342052b;

    /* renamed from: c, reason: collision with root package name */
    public final transient r f342053c;

    public AbstractC36471j(J j12, r rVar) {
        this.f342052b = j12;
        this.f342053c = rVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final <A extends Annotation> A c(Class<A> cls) {
        r rVar = this.f342053c;
        if (rVar == null) {
            return null;
        }
        return (A) rVar.a(cls);
    }

    public final void g(boolean z12) throws SecurityException {
        Member memberK = k();
        if (memberK != null) {
            com.fasterxml.jackson.databind.util.g.e(memberK, z12);
        }
    }

    public abstract Class<?> h();

    public String i() {
        return h().getName() + "#" + d();
    }

    public abstract Member k();

    public abstract Object l(Object obj);

    public final boolean m(Class<?> cls) {
        HashMap<Class<?>, Annotation> map;
        r rVar = this.f342053c;
        if (rVar == null || (map = rVar.f342081b) == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    public final boolean n(Class<? extends Annotation>[] clsArr) {
        r rVar = this.f342053c;
        if (rVar == null || rVar.f342081b == null) {
            return false;
        }
        for (Class<? extends Annotation> cls : clsArr) {
            if (rVar.f342081b.containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public abstract AbstractC36463b o(r rVar);
}
