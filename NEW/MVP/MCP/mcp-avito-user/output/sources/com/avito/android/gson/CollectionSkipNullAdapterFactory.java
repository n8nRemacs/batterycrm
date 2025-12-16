package com.avito.android.gson;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: CollectionSkipNullAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gson/CollectionSkipNullAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollectionSkipNullAdapterFactory implements r {
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        Type typeA;
        if (Collection.class.isAssignableFrom(aVar.getRawType()) && (typeA = a.a(aVar.getType())) != null) {
            return new CollectionSkipNullAdapter(gson.h(this, aVar), gson.f(com.google.gson.reflect.a.get(typeA)));
        }
        return null;
    }
}
