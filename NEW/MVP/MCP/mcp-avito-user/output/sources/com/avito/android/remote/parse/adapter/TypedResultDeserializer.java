package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35983y4;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TypedResultDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/TypedResultDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/TypedResult;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class TypedResultDeserializer implements com.google.gson.h<TypedResult<?>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254254a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f254255b;

    public TypedResultDeserializer() {
        C34377u.f254314a.getClass();
        this.f254255b = C34377u.f254315b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final TypedResult.Error a(com.google.gson.g gVar, String str, com.google.gson.k kVar, Type type) {
        if (this.f254255b.containsKey(str)) {
            return new TypedResult.Error((ApiError) gVar.b(kVar, ApiError.class), null, 2, null);
        }
        return new TypedResult.Error(new ApiError.UnknownError("Unknown status \"" + str + "\" for type " + type, null, null, 6, null), null, 2, null);
    }

    @Override // com.google.gson.h
    public final TypedResult<?> deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Type typeA = C35983y4.a(type);
        if (typeA == null) {
            throw new IllegalArgumentException(("Can't define argument type of " + type).toString());
        }
        com.google.gson.k kVarI = iVar.i();
        String strS = X.a(kVarI, "status").s();
        com.google.gson.k kVarI2 = X.a(kVarI, "result").i();
        Map map = (Map) this.f254254a.get(typeA);
        if (map == null) {
            return kotlin.jvm.internal.L.f(strS, "ok") ? new TypedResult.Success(gVar.b(kVarI2, typeA)) : a(gVar, strS, kVarI, typeA);
        }
        Type type2 = (Type) map.get(strS);
        return type2 == null ? a(gVar, strS, kVarI, typeA) : new TypedResult.Success(gVar.b(kVarI2, type2));
    }
}
