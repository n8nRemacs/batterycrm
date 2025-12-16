package com.avito.android.remote.parse.adapter.stream_gson;

import android.net.Uri;
import com.avito.android.remote.model.LinkAction;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LinkActionTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/LinkActionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/LinkAction;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LinkActionTypeAdapter extends TypeAdapter<LinkAction> {
    @Override // com.google.gson.TypeAdapter
    public final LinkAction read(com.google.gson.stream.a aVar) throws IOException {
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
        String strB2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (L.f(strX, "title")) {
                strB = aVar.B();
            } else if (L.f(strX, TooltipAttribute.PARAM_DEEP_LINK)) {
                strB2 = aVar.B();
            } else {
                aVar.L();
            }
        }
        aVar.g();
        if (strB == null || strB2 == null) {
            return null;
        }
        return new LinkAction(strB, Uri.parse(strB2));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, LinkAction linkAction) {
        throw new UnsupportedOperationException();
    }
}
