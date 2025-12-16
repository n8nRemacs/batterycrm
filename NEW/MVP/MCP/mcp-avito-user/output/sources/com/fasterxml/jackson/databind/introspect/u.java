package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.util.Iterator;

/* compiled from: BeanPropertyDefinition.java */
/* loaded from: classes4.dex */
public abstract class u implements com.fasterxml.jackson.databind.util.u {

    /* renamed from: b, reason: collision with root package name */
    public static final JsonInclude.a f342096b = JsonInclude.a.f340960f;

    public boolean A() {
        return z();
    }

    public boolean B() {
        return false;
    }

    public boolean a() {
        AbstractC36463b abstractC36463bM = m();
        if (abstractC36463bM == null && (abstractC36463bM = s()) == null) {
            abstractC36463bM = o();
        }
        return abstractC36463bM != null;
    }

    public abstract com.fasterxml.jackson.databind.v c();

    public boolean f() {
        return l() != null;
    }

    public abstract com.fasterxml.jackson.databind.u getMetadata();

    public abstract JsonInclude.a h();

    public D i() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty j() {
        return null;
    }

    public Class<?>[] k() {
        return null;
    }

    public final AbstractC36471j l() {
        C36472k c36472kP = p();
        return c36472kP == null ? o() : c36472kP;
    }

    public abstract n m();

    public Iterator<n> n() {
        return com.fasterxml.jackson.databind.util.g.f342598c;
    }

    public abstract C36469h o();

    public abstract C36472k p();

    public abstract com.fasterxml.jackson.databind.h q();

    public abstract Class<?> r();

    public abstract C36472k s();

    public abstract com.fasterxml.jackson.databind.v t();

    public abstract boolean u();

    public abstract boolean v();

    public boolean w(com.fasterxml.jackson.databind.v vVar) {
        return c().equals(vVar);
    }

    public abstract boolean x();

    public abstract boolean z();
}
