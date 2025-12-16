package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.avito.android.remote.model.search.suggest.LocalIcon;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.search.suggest.SuggestNewQuery;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestTypeAdapters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/SuggestsTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SuggestsTypeAdapterFactory implements r {
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (L.f(rawType, SuggestDeeplink.class)) {
            return new DeeplinkActionTypeAdapter(gson);
        }
        if (L.f(rawType, SuggestNewQuery.class)) {
            return new SuggestNewQueryTypeAdapter();
        }
        if (L.f(rawType, LocalIcon.class)) {
            return new SuggestLocalIconTypeAdapter();
        }
        if (L.f(rawType, GapSuggestItem.class)) {
            return new SuggestGapTypeAdapter();
        }
        return null;
    }
}
