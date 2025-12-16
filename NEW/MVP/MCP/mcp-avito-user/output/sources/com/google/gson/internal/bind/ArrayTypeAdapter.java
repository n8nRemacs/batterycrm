package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C37624b;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final r f362025c = new r() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Type type = aVar.getType();
            boolean z12 = type instanceof GenericArrayType;
            if (!z12 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z12 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.f(com.google.gson.reflect.a.get(genericComponentType)), C37624b.g(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f362026a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<E> f362027b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f362027b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f362026a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final Object read(com.google.gson.stream.a aVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f362027b).f362074b.read(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f362026a, size);
        for (int i12 = 0; i12 < size; i12++) {
            Array.set(objNewInstance, i12, arrayList.get(i12));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.j();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i12 = 0; i12 < length; i12++) {
            this.f362027b.write(cVar, Array.get(obj, i12));
        }
        cVar.f();
    }
}
