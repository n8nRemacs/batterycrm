package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Size;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SizeTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SizeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/Size;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SizeTypeAdapter extends TypeAdapter<Size> {
    @Override // com.google.gson.TypeAdapter
    public final Size read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (kotlin.jvm.internal.L.f(strX, "width")) {
                numValueOf = Integer.valueOf(aVar.q());
            } else if (kotlin.jvm.internal.L.f(strX, "height")) {
                numValueOf2 = Integer.valueOf(aVar.q());
            } else {
                aVar.L();
            }
        }
        aVar.g();
        if (numValueOf == null || numValueOf2 == null) {
            return null;
        }
        return new Size(numValueOf.intValue(), numValueOf2.intValue());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Size size) {
        throw new UnsupportedOperationException();
    }
}
