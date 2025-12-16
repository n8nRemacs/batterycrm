package com.avito.android.remote.parse.adapter.stream_gson.font_parameter;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.FontParameter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FontParameterTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/font_parameter/FontParameterTypeAdapterFactory;", "Lcom/google/gson/r;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FontParameterTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f254313b;

    public FontParameterTypeAdapterFactory(boolean z12) {
        this.f254313b = z12;
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @l com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar != null ? aVar.getRawType() : null, FontParameter.class)) {
            return this.f254313b ? new FontParameterSafeTypeAdapter(gson) : new FontParameterTypeAdapter(gson);
        }
        return null;
    }
}
