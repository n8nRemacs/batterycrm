package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Type;

/* compiled from: TypeResolutionContext.java */
/* loaded from: classes4.dex */
public interface J {

    /* compiled from: TypeResolutionContext.java */
    public static class a implements J {

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.type.n f341991b;

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.type.m f341992c;

        public a(com.fasterxml.jackson.databind.type.n nVar, com.fasterxml.jackson.databind.type.m mVar) {
            this.f341991b = nVar;
            this.f341992c = mVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.J
        public final com.fasterxml.jackson.databind.h a(Type type) {
            return this.f341991b.b(null, type, this.f341992c);
        }
    }

    /* compiled from: TypeResolutionContext.java */
    public static class b implements J {
        @Override // com.fasterxml.jackson.databind.introspect.J
        public final com.fasterxml.jackson.databind.h a(Type type) {
            throw null;
        }
    }

    com.fasterxml.jackson.databind.h a(Type type);
}
