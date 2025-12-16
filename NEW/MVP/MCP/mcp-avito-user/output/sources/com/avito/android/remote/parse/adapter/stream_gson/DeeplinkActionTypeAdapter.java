package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import kotlin.Metadata;

/* compiled from: SuggestTypeAdapters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/DeeplinkActionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/search/suggest/SuggestDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkActionTypeAdapter extends TypeAdapter<SuggestDeeplink> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254292a;

    public DeeplinkActionTypeAdapter(@k Gson gson) {
        this.f254292a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SuggestDeeplink read(com.google.gson.stream.a aVar) {
        DeepLink deepLink = (DeepLink) this.f254292a.g(DeepLink.class).read(aVar);
        if (deepLink == null) {
            return null;
        }
        return new SuggestDeeplink(deepLink);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, SuggestDeeplink suggestDeeplink) {
        throw new UnsupportedOperationException();
    }
}
