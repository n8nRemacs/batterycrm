package com.avito.android.remote.parse.adapter.stream_gson;

import AK.c;
import Y61.k;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TypedResultTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/TypedResultTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/TypedResult;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TypedResultTypeAdapter extends TypeAdapter<TypedResult<?>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254301a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f254302b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f254303c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f254304d;

    public TypedResultTypeAdapter(@k Gson gson, @k Type type, @k Map map, @k LinkedHashMap linkedHashMap) {
        this.f254301a = gson;
        this.f254302b = type;
        this.f254303c = map;
        this.f254304d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final TypedResult.Error a(com.google.gson.stream.a aVar, String str) {
        Type type = (Type) this.f254303c.get(str);
        return type == null ? new TypedResult.Error(new ApiError.UnknownError(c.k("Unknown \"", str, "\"."), null, null, 6, null), null, 2, null) : new TypedResult.Error((ApiError) this.f254301a.c(aVar, type), null, 2, null);
    }

    @Override // com.google.gson.TypeAdapter
    public final TypedResult<?> read(com.google.gson.stream.a aVar) throws IOException {
        TypedResult<?> typedResultA;
        aVar.b();
        String strX = aVar.x();
        LinkedHashMap linkedHashMap = this.f254304d;
        Type type = this.f254302b;
        Map map = (Map) linkedHashMap.get(type);
        Gson gson = this.f254301a;
        if (map == null) {
            typedResultA = L.f(strX, "success") ? new TypedResult.Success<>(gson.c(aVar, type)) : a(aVar, strX);
        } else {
            Type type2 = (Type) map.get(strX);
            typedResultA = type2 == null ? a(aVar, strX) : new TypedResult.Success<>(gson.c(aVar, type2));
        }
        while (aVar.k()) {
            aVar.L();
        }
        aVar.g();
        return typedResultA;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, TypedResult<?> typedResult) {
        throw new UnsupportedOperationException();
    }
}
