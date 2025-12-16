package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.RawJson;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: RawJsonTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RawJsonTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/RawJson;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RawJsonTypeAdapter implements com.google.gson.o<RawJson>, com.google.gson.h<RawJson> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.google.gson.l f254213a = new com.google.gson.l();

    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        String value = ((RawJson) obj).getValue();
        this.f254213a.getClass();
        return com.google.gson.l.b(value);
    }

    @Override // com.google.gson.h
    public final RawJson deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return new RawJson(iVar.toString());
    }
}
