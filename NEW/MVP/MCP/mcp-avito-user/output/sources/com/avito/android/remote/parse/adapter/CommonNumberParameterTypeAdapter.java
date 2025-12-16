package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.MultipleIntParameter;
import com.avito.android.remote.model.category_parameters.RangeIntParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: CommonNumberParameterTypeAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CommonNumberParameterTypeAdapter;", "Lcom/google/gson/r;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonNumberParameterTypeAdapter implements com.google.gson.r {
    @Override // com.google.gson.r
    @Y61.l
    public final <T> TypeAdapter<T> a(@Y61.k final Gson gson, @Y61.k final com.google.gson.reflect.a<T> aVar) {
        if (kotlin.jvm.internal.L.f(aVar.getRawType(), EditableParameter.class)) {
            return (TypeAdapter<T>) new TypeAdapter<Object>() { // from class: com.avito.android.remote.parse.adapter.CommonNumberParameterTypeAdapter$create$result$1
                @Override // com.google.gson.TypeAdapter
                @Y61.k
                public final Object read(@Y61.l com.google.gson.stream.a aVar2) {
                    TypeAdapter typeAdapterH;
                    com.google.gson.i iVarD;
                    com.google.gson.i iVarD2;
                    Gson gson2 = gson;
                    com.google.gson.k kVar = (com.google.gson.k) gson2.c(aVar2, com.google.gson.k.class);
                    com.google.gson.i iVarD3 = kVar.D("isRange");
                    com.google.gson.i iVarD4 = kVar.D("widget");
                    boolean zD2 = (iVarD4 == null || (iVarD = iVarD4.i().D(Navigation.CONFIG)) == null || (iVarD2 = iVarD.i().D("isLegacyIntRange")) == null) ? true : iVarD2.d();
                    com.google.gson.i iVarD5 = kVar.D("multiple");
                    CommonNumberParameterTypeAdapter commonNumberParameterTypeAdapter = this;
                    if (iVarD3 == null || !iVarD3.d()) {
                        typeAdapterH = (iVarD5 == null || !iVarD5.d()) ? gson2.h(commonNumberParameterTypeAdapter, com.google.gson.reflect.a.get(IntParameter.class)) : gson2.h(commonNumberParameterTypeAdapter, com.google.gson.reflect.a.get(MultipleIntParameter.class));
                    } else {
                        typeAdapterH = gson2.h(commonNumberParameterTypeAdapter, zD2 ? com.google.gson.reflect.a.get(LegacyRangeIntParameter.class) : com.google.gson.reflect.a.get(RangeIntParameter.class));
                    }
                    return typeAdapterH.fromJsonTree(kVar);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(@Y61.k com.google.gson.stream.c cVar, @Y61.k Object obj) {
                    gson.h(this, aVar).write(cVar, obj);
                }
            };
        }
        return null;
    }
}
