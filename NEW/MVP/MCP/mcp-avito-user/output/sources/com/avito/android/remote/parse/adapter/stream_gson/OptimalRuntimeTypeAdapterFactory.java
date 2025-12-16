package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OptimalRuntimeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/OptimalRuntimeTypeAdapterFactory;", "T", "Lcom/google/gson/r;", "a", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OptimalRuntimeTypeAdapterFactory<T> implements r {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f254296d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<T> f254297b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, Class<? extends T>> f254298c = new LinkedHashMap<>();

    /* compiled from: OptimalRuntimeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/OptimalRuntimeTypeAdapterFactory$a;", "", "<init>", "()V", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static OptimalRuntimeTypeAdapterFactory a(a aVar, Class cls) {
            aVar.getClass();
            return new OptimalRuntimeTypeAdapterFactory(cls);
        }

        public a() {
        }
    }

    public OptimalRuntimeTypeAdapterFactory(@k Class cls) {
        this.f254297b = cls;
        new LinkedHashMap();
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (!L.f(aVar.getRawType(), this.f254297b)) {
            return null;
        }
        LinkedHashMap<String, Class<? extends T>> linkedHashMap = this.f254298c;
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<String, Class<? extends T>> entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), gson.f(com.google.gson.reflect.a.get((Class) entry.getValue())));
        }
        return new TypeAdapter<T>() { // from class: com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory$create$1
            @Override // com.google.gson.TypeAdapter
            @l
            public final T read(@k com.google.gson.stream.a aVar2) throws IOException {
                aVar2.b();
                T t12 = null;
                if (aVar2.k()) {
                    TypeAdapter<? extends T> typeAdapter = linkedHashMap2.get(aVar2.x());
                    if (typeAdapter == null) {
                        typeAdapter = null;
                    }
                    if (typeAdapter != null) {
                        t12 = typeAdapter.read(aVar2);
                    } else {
                        aVar2.L();
                    }
                }
                aVar2.g();
                return t12;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(@k c cVar, T t12) {
                this.getClass();
                throw new UnsupportedOperationException();
            }
        }.nullSafe();
    }

    @k
    public final void b(@k Class cls, @k String str) {
        LinkedHashMap<String, Class<? extends T>> linkedHashMap = this.f254298c;
        if (linkedHashMap.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        linkedHashMap.put(str, cls);
    }
}
