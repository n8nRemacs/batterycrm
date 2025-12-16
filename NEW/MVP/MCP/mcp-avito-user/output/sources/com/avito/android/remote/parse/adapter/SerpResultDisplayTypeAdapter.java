package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: SerpResultDisplayTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SerpResultDisplayTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/SerpDisplayType;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SerpResultDisplayTypeAdapter extends TypeAdapter<SerpDisplayType> {
    @Override // com.google.gson.TypeAdapter
    public final SerpDisplayType read(com.google.gson.stream.a aVar) {
        return SerpDisplayType.INSTANCE.fromString(aVar.B());
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(com.google.gson.stream.c cVar, SerpDisplayType serpDisplayType) {
    }
}
