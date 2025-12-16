package com.avito.android.remote.parse.adapter;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RuntimeTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapterFactory;", "T", "Lcom/google/gson/r;", "a", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RuntimeTypeAdapterFactory<T> implements com.google.gson.r {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f254218g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Class<?> f254219b;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Class<?> f254223f;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254221d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254222e = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f254220c = "type";

    /* compiled from: RuntimeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapterFactory$a;", "", "<init>", "()V", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public RuntimeTypeAdapterFactory(@Y61.k Class cls) {
        this.f254219b = cls;
    }

    @Override // com.google.gson.r
    @Y61.l
    public final <R> TypeAdapter<R> a(@Y61.k Gson gson, @Y61.k com.google.gson.reflect.a<R> aVar) {
        if (!kotlin.jvm.internal.L.f(aVar.getRawType(), this.f254219b)) {
            return null;
        }
        LinkedHashMap linkedHashMap = this.f254221d;
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Class cls = (Class) entry.getValue();
            com.google.gson.r rVar = (com.google.gson.r) this.f254222e.get(str);
            linkedHashMap2.put(str, rVar != null ? rVar.a(gson, com.google.gson.reflect.a.get(cls)) : gson.h(this, com.google.gson.reflect.a.get(cls)));
        }
        Class<?> cls2 = this.f254223f;
        final TypeAdapter<T> typeAdapterH = cls2 != null ? gson.h(this, com.google.gson.reflect.a.get((Class) cls2)) : null;
        return new TypeAdapter<R>() { // from class: com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory$create$1
            @Override // com.google.gson.TypeAdapter
            @Y61.l
            public final R read(@Y61.k com.google.gson.stream.a aVar2) {
                com.google.gson.i iVarA = com.google.gson.internal.C.a(aVar2);
                com.google.gson.k kVarI = iVarA.i();
                RuntimeTypeAdapterFactory<T> runtimeTypeAdapterFactory = this.f254224a;
                String str2 = runtimeTypeAdapterFactory.f254220c;
                com.google.gson.i iVarK = kVarI.K(str2);
                if (iVarK == null) {
                    throw new JsonParseException("cannot deserialize " + runtimeTypeAdapterFactory.f254219b + " because it does not define a field named " + str2);
                }
                Object obj = linkedHashMap2.get(iVarK.s());
                TypeAdapter<R> typeAdapter = obj instanceof TypeAdapter ? (TypeAdapter) obj : null;
                if (typeAdapter == null) {
                    typeAdapter = typeAdapterH;
                }
                if (typeAdapter != null) {
                    return typeAdapter.fromJsonTree(iVarA);
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(@Y61.k com.google.gson.stream.c cVar, R r12) {
                StringBuilder sb2 = new StringBuilder("Unsupported type ");
                sb2.append(r12 != null ? r12.getClass().getName() : null);
                throw new UnsupportedOperationException(sb2.toString());
            }
        }.nullSafe();
    }

    @X41.j
    @Y61.k
    public final void b(@Y61.k Class cls, @Y61.k String str, @Y61.l com.google.gson.r rVar) {
        if (rVar != null) {
            this.f254222e.put(str, rVar);
        }
        LinkedHashMap linkedHashMap = this.f254221d;
        if (linkedHashMap.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        linkedHashMap.put(str, cls);
    }
}
