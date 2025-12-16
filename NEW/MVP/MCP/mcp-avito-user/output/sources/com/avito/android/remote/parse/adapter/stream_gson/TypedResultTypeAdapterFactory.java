package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.parse.adapter.C34377u;
import com.avito.android.util.C35983y4;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TypedResultTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/TypedResultTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TypedResultTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f254305b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f254306c;

    public TypedResultTypeAdapterFactory() {
        C34377u.f254314a.getClass();
        this.f254306c = C34377u.f254315b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (!L.f(aVar.getRawType(), TypedResult.class)) {
            return null;
        }
        Type typeA = C35983y4.a(aVar.getType());
        if (typeA != null) {
            return new TypedResultTypeAdapter(gson, typeA, this.f254306c, this.f254305b);
        }
        throw new IllegalArgumentException(("Can't define argument type of " + aVar.getType()).toString());
    }
}
