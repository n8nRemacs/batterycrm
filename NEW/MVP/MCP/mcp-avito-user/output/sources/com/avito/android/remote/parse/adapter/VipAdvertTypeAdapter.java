package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.section.VipAdvert;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: VipAdvertTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/VipAdvertTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/section/VipAdvert;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VipAdvertTypeAdapter implements com.google.gson.h<VipAdvert> {
    @Override // com.google.gson.h
    public final VipAdvert deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        SerpAdvert serpAdvert = (SerpAdvert) gVar.b(iVar.i(), SerpAdvert.class);
        if (serpAdvert == null) {
            return null;
        }
        return new VipAdvert(serpAdvert);
    }
}
