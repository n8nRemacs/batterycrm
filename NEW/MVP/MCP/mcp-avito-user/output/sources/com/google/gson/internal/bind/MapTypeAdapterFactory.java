package com.google.gson.internal.bind;

import androidx.camera.view.k;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C37623a;
import com.google.gson.internal.C37624b;
import com.google.gson.internal.m;
import com.google.gson.internal.v;
import com.google.gson.internal.y;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes6.dex */
public final class MapTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    public final m f362038b;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter<K> f362039a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeAdapter<V> f362040b;

        /* renamed from: c, reason: collision with root package name */
        public final y<? extends Map<K, V>> f362041c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, y<? extends Map<K, V>> yVar) {
            this.f362039a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f362040b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f362041c = yVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(com.google.gson.stream.a aVar) {
            JsonToken jsonTokenF = aVar.F();
            if (jsonTokenF == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            Map<K, V> mapA = this.f362041c.a();
            JsonToken jsonToken = JsonToken.f362196b;
            TypeAdapter<V> typeAdapter = this.f362040b;
            TypeAdapter<K> typeAdapter2 = this.f362039a;
            if (jsonTokenF == jsonToken) {
                aVar.a();
                while (aVar.k()) {
                    aVar.a();
                    Object obj = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f362074b.read(aVar);
                    if (mapA.put(obj, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f362074b.read(aVar)) != null) {
                        throw new JsonSyntaxException(k.a(obj, "duplicate key: "));
                    }
                    aVar.f();
                }
                aVar.f();
            } else {
                aVar.b();
                while (aVar.k()) {
                    v.f362169a.a(aVar);
                    Object obj2 = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f362074b.read(aVar);
                    if (mapA.put(obj2, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f362074b.read(aVar)) != null) {
                        throw new JsonSyntaxException(k.a(obj2, "duplicate key: "));
                    }
                }
                aVar.g();
            }
            return mapA;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                cVar.j();
                return;
            }
            TypeAdapter<V> typeAdapter = this.f362040b;
            cVar.c();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                cVar.h(String.valueOf(entry.getKey()));
                typeAdapter.write(cVar, entry.getValue());
            }
            cVar.g();
        }
    }

    public MapTypeAdapterFactory(m mVar) {
        this.f362038b = mVar;
    }

    @Override // com.google.gson.r
    public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            C37623a.a(Map.class.isAssignableFrom(rawType));
            Type typeI = C37624b.i(type, rawType, C37624b.f(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(this, gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f362080c : gson.f(com.google.gson.reflect.a.get(type2)), actualTypeArguments[1], gson.f(com.google.gson.reflect.a.get(actualTypeArguments[1])), this.f362038b.a(aVar));
    }
}
