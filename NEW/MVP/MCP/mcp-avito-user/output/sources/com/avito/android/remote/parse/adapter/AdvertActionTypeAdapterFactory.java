package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertAction;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: AdvertActionAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AdvertActionTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvertActionTypeAdapterFactory implements com.google.gson.r {
    @Override // com.google.gson.r
    @Y61.l
    public final <T> TypeAdapter<T> a(@Y61.k Gson gson, @Y61.l com.google.gson.reflect.a<T> aVar) {
        if (kotlin.jvm.internal.L.f(aVar != null ? aVar.getRawType() : null, AdvertAction.class)) {
            return new AdvertActionAdapter(gson);
        }
        return null;
    }
}
