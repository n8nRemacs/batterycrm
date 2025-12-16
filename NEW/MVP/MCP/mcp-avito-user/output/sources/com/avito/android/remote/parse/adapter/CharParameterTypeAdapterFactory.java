package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: CharParameterTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CharParameterTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CharParameterTypeAdapterFactory implements com.google.gson.r {
    @Override // com.google.gson.r
    @Y61.l
    public final <T> TypeAdapter<T> a(@Y61.k Gson gson, @Y61.k com.google.gson.reflect.a<T> aVar) {
        if (!kotlin.jvm.internal.L.f(aVar.getRawType(), CharParameter.class)) {
            return null;
        }
        final TypeAdapter<T> typeAdapterH = gson.h(this, aVar);
        return (TypeAdapter<T>) new TypeAdapter<CharParameter>() { // from class: com.avito.android.remote.parse.adapter.CharParameterTypeAdapterFactory$create$result$1
            @Override // com.google.gson.TypeAdapter
            public final CharParameter read(com.google.gson.stream.a aVar2) {
                CharParameter charParameter = typeAdapterH.read(aVar2);
                if (charParameter == null) {
                    return null;
                }
                if (charParameter.getValue() != null) {
                    return charParameter;
                }
                DisplayingOptions displayingOptions = charParameter.getDisplayingOptions();
                charParameter.setValue(displayingOptions != null ? displayingOptions.getDefaultValue() : null);
                return charParameter;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, CharParameter charParameter) {
                typeAdapterH.write(cVar, charParameter);
            }
        };
    }
}
