package com.avito.android.remote.parse.adapter.inline_filters;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterMultiSelectValueTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterMultiSelectValueTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InlineFilterMultiSelectValueTypeAdapter extends TypeAdapter<InlineFilterValue.InlineFilterMultiSelectValue> {
    @Override // com.google.gson.TypeAdapter
    public final InlineFilterValue.InlineFilterMultiSelectValue read(com.google.gson.stream.a aVar) {
        ArrayList arrayList = new ArrayList();
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362196b;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.a();
        while (aVar.k()) {
            arrayList.add(aVar.B());
        }
        aVar.f();
        return new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue) {
        throw new UnsupportedOperationException();
    }
}
