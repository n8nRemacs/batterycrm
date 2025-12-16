package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.container.checkbox_group.BeduinCheckboxGroupOption;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupOptionAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCheckboxGroupOptionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupOption;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCheckboxGroupOptionTypeAdapter extends TypeAdapter<BeduinCheckboxGroupOption> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104039a;

    public BeduinCheckboxGroupOptionTypeAdapter(@k Gson gson) {
        this.f104039a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BeduinCheckboxGroupOption read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        String strB = null;
        Object obj = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (L.f(strX, "id")) {
                strB = aVar.B();
            } else if (L.f(strX, "content")) {
                obj = this.f104039a.g(BeduinModel.class).read(aVar);
            } else {
                aVar.L();
            }
        }
        aVar.g();
        if (strB == null) {
            throw new NullPointerException("id can't be null");
        }
        BeduinModel beduinModel = (BeduinModel) obj;
        if (beduinModel != null) {
            return new BeduinCheckboxGroupOption(strB, Collections.singletonList(beduinModel));
        }
        throw new NullPointerException("content can't be null");
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, BeduinCheckboxGroupOption beduinCheckboxGroupOption) {
        throw new UnsupportedOperationException();
    }
}
