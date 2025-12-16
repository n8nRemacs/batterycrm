package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes6.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f362073a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f362074b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f362075c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f362073a = gson;
        this.f362074b = typeAdapter;
        this.f362075c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(com.google.gson.stream.a aVar) {
        return this.f362074b.read(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, T t12) {
        ?? r02 = this.f362075c;
        Class<?> cls = (t12 == null || !(r02 == Object.class || (r02 instanceof TypeVariable) || (r02 instanceof Class))) ? r02 : t12.getClass();
        TypeAdapter<T> typeAdapter = this.f362074b;
        if (cls != r02) {
            TypeAdapter<T> typeAdapterF = this.f362073a.f(com.google.gson.reflect.a.get((Type) cls));
            if (!(typeAdapterF instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = typeAdapterF;
            }
        }
        typeAdapter.write(cVar, t12);
    }
}
