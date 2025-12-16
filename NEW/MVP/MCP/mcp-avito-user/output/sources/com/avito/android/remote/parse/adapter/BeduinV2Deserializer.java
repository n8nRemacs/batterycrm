package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.BeduinV2;
import com.avito.android.util.V2;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: BeduinV2Deserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/BeduinV2Deserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/BeduinV2;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2Deserializer implements com.google.gson.h<BeduinV2> {
    @Override // com.google.gson.h
    public final BeduinV2 deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        if (iVar instanceof com.google.gson.k) {
            return new BeduinV2(iVar.toString());
        }
        V2.f318762a.e("Unexpected beduinV2 json: " + iVar, null);
        return null;
    }
}
