package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Excluder implements com.google.gson.r, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Excluder f362008d = new Excluder();

    /* renamed from: b, reason: collision with root package name */
    public List<com.google.gson.a> f362009b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public List<com.google.gson.a> f362010c = Collections.emptyList();

    public static boolean j(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // com.google.gson.r
    public final <T> TypeAdapter<T> a(final Gson gson, final com.google.gson.reflect.a<T> aVar) {
        final boolean z12;
        final boolean z13;
        Class<? super T> rawType = aVar.getRawType();
        boolean zF2 = f(rawType);
        if (zF2) {
            z12 = true;
        } else {
            g(true, rawType);
            z12 = false;
        }
        if (zF2) {
            z13 = true;
        } else {
            g(false, rawType);
            z13 = false;
        }
        if (z12 || z13) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public TypeAdapter<T> f362011a;

                @Override // com.google.gson.TypeAdapter
                public final T read(com.google.gson.stream.a aVar2) throws IOException {
                    if (z13) {
                        aVar2.L();
                        return null;
                    }
                    TypeAdapter<T> typeAdapterH = this.f362011a;
                    if (typeAdapterH == null) {
                        typeAdapterH = gson.h(Excluder.this, aVar);
                        this.f362011a = typeAdapterH;
                    }
                    return typeAdapterH.read(aVar2);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(com.google.gson.stream.c cVar, T t12) throws IOException {
                    if (z12) {
                        cVar.j();
                        return;
                    }
                    TypeAdapter<T> typeAdapterH = this.f362011a;
                    if (typeAdapterH == null) {
                        typeAdapterH = gson.h(Excluder.this, aVar);
                        this.f362011a = typeAdapterH;
                    }
                    typeAdapterH.write(cVar, t12);
                }
            };
        }
        return null;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e12) {
            throw new AssertionError(e12);
        }
    }

    public final boolean f(Class<?> cls) {
        return j(cls);
    }

    public final boolean g(boolean z12, Class cls) {
        Iterator<com.google.gson.a> it = (z12 ? this.f362009b : this.f362010c).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return false;
    }

    public final boolean i(Field field, boolean z12) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || j(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z12 ? this.f362009b : this.f362010c;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }
}
