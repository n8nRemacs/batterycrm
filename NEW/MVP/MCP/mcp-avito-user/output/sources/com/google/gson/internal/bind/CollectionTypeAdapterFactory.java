package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C37623a;
import com.google.gson.internal.C37624b;
import com.google.gson.internal.m;
import com.google.gson.internal.y;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class CollectionTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    public final m f362028b;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter<E> f362029a;

        /* renamed from: b, reason: collision with root package name */
        public final y<? extends Collection<E>> f362030b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, y<? extends Collection<E>> yVar) {
            this.f362029a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f362030b = yVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(com.google.gson.stream.a aVar) {
            if (aVar.F() == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            Collection<E> collectionA = this.f362030b.a();
            aVar.a();
            while (aVar.k()) {
                collectionA.add(((TypeAdapterRuntimeTypeWrapper) this.f362029a).f362074b.read(aVar));
            }
            aVar.f();
            return collectionA;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.j();
                return;
            }
            cVar.b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f362029a.write(cVar, it.next());
            }
            cVar.f();
        }
    }

    public CollectionTypeAdapterFactory(m mVar) {
        this.f362028b = mVar;
    }

    @Override // com.google.gson.r
    public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C37623a.a(Collection.class.isAssignableFrom(rawType));
        Type typeI = C37624b.i(type, rawType, C37624b.f(type, rawType, Collection.class), new HashMap());
        Class cls = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls, gson.f(com.google.gson.reflect.a.get(cls)), this.f362028b.a(aVar));
    }
}
