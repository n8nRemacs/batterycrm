package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.e<?>> f362141a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f362142b;

    /* renamed from: c, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f362143c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    public class a<T> implements y<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.e f362144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f362145b;

        public a(com.google.gson.e eVar, Type type) {
            this.f362144a = eVar;
            this.f362145b = type;
        }

        @Override // com.google.gson.internal.y
        public final T a() {
            return (T) this.f362144a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    public class b<T> implements y<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.e f362146a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f362147b;

        public b(com.google.gson.e eVar, Type type) {
            this.f362146a = eVar;
            this.f362147b = type;
        }

        @Override // com.google.gson.internal.y
        public final T a() {
            return (T) this.f362146a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    public class c<T> implements y<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f362148a;

        public c(String str) {
            this.f362148a = str;
        }

        @Override // com.google.gson.internal.y
        public final T a() {
            throw new JsonIOException(this.f362148a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    public class d<T> implements y<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f362149a;

        public d(String str) {
            this.f362149a = str;
        }

        @Override // com.google.gson.internal.y
        public final T a() {
            throw new JsonIOException(this.f362149a);
        }
    }

    public m(List list, boolean z12, Map map) {
        this.f362141a = map;
        this.f362142b = z12;
        this.f362143c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.internal.y<T> a(com.google.gson.reflect.a<T> r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.a(com.google.gson.reflect.a):com.google.gson.internal.y");
    }

    public final String toString() {
        return this.f362141a.toString();
    }
}
