package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.component.params_source.ParamsSourceFormParamsMap;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceFormParamsMapAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/ParamsSourceFormParamsMapTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceFormParamsMap;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParamsSourceFormParamsMapTypeAdapter extends TypeAdapter<ParamsSourceFormParamsMap> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104049a;

    public ParamsSourceFormParamsMapTypeAdapter(@k Gson gson) {
        this.f104049a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ParamsSourceFormParamsMap read(com.google.gson.stream.a aVar) throws IOException {
        Type type = new e().getType();
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        Object objC = null;
        while (aVar.k()) {
            if (L.f(aVar.x(), "value")) {
                objC = this.f104049a.c(aVar, type);
            } else {
                aVar.L();
            }
        }
        aVar.g();
        Map map = (Map) objC;
        if (map != null) {
            ParamsSourceFormParamsMap.a aVar2 = ParamsSourceFormParamsMap.f101791c;
        } else {
            map = null;
        }
        if (map != null) {
            return ParamsSourceFormParamsMap.a(map);
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, ParamsSourceFormParamsMap paramsSourceFormParamsMap) {
        throw new UnsupportedOperationException();
    }
}
