package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* compiled from: VirtualAnnotatedMember.java */
/* loaded from: classes4.dex */
public class K extends AbstractC36471j implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Class<?> f341993d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341994e;

    /* renamed from: f, reason: collision with root package name */
    public final String f341995f;

    public K(C36465d c36465d, Class cls, String str, com.fasterxml.jackson.databind.h hVar) {
        super(c36465d, null);
        this.f341993d = cls;
        this.f341994e = hVar;
        this.f341995f = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final /* bridge */ /* synthetic */ AnnotatedElement b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return this.f341995f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f341994e.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(getClass(), obj)) {
            return false;
        }
        K k12 = (K) obj;
        return k12.f341993d == this.f341993d && k12.f341995f.equals(this.f341995f);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f341994e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Class<?> h() {
        return this.f341993d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f341995f.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Member k() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Object l(Object obj) {
        throw new IllegalArgumentException(AK.c.s(new StringBuilder("Cannot get virtual property '"), this.f341995f, "'"));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        return "[virtual " + i() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final AbstractC36463b o(r rVar) {
        return this;
    }
}
