package com.avito.android.remote.parse.adapter.stream_gson;

import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import kotlin.Metadata;

/* compiled from: SuggestTypeAdapters.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/SuggestGapTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/search/suggest/GapSuggestItem;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SuggestGapTypeAdapter extends TypeAdapter<GapSuggestItem> {
    @Override // com.google.gson.TypeAdapter
    public final GapSuggestItem read(com.google.gson.stream.a aVar) {
        return new GapSuggestItem(aVar.q());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, GapSuggestItem gapSuggestItem) {
        throw new UnsupportedOperationException();
    }
}
