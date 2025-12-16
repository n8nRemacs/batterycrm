package com.avito.android.beduin.network.parse;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.checkbox_group.BeduinCheckboxGroupOption;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCheckboxGroupOptionAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCheckboxGroupOptionAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCheckboxGroupOptionAdapterFactory implements r {
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), BeduinCheckboxGroupOption.class)) {
            return new BeduinCheckboxGroupOptionTypeAdapter(gson);
        }
        return null;
    }
}
