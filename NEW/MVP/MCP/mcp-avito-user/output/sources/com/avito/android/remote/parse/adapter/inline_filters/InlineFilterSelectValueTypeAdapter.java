package com.avito.android.remote.parse.adapter.inline_filters;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import kotlin.Metadata;

/* compiled from: InlineFilterSelectValueTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterSelectValueTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectValue;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InlineFilterSelectValueTypeAdapter extends TypeAdapter<InlineFilterValue.InlineFilterSelectValue> {
    @Override // com.google.gson.TypeAdapter
    public final InlineFilterValue.InlineFilterSelectValue read(com.google.gson.stream.a aVar) {
        return new InlineFilterValue.InlineFilterSelectValue(aVar.B());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, InlineFilterValue.InlineFilterSelectValue inlineFilterSelectValue) {
        throw new UnsupportedOperationException();
    }
}
