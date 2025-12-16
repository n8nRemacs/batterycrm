package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ab_tests.AbTestsConfigResponse;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import u3.C48777a;

/* compiled from: AbTestsConfigTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AbTestsConfigTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/ab_tests/AbTestsConfigResponse;", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbTestsConfigTypeAdapter extends TypeAdapter<AbTestsConfigResponse> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f254145a;

    /* compiled from: AbTestsConfigTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254146a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f254146a = iArr;
        }
    }

    public AbTestsConfigTypeAdapter(@Y61.k Gson gson) {
        this.f254145a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AbTestsConfigResponse read(com.google.gson.stream.a aVar) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        while (aVar.k()) {
            String strX = aVar.x();
            JsonToken jsonTokenF2 = aVar.F();
            if ((jsonTokenF2 == null ? -1 : a.f254146a[jsonTokenF2.ordinal()]) == 1) {
                C48777a c48777a = (C48777a) this.f254145a.g(C48777a.class).read(aVar);
                if (c48777a != null) {
                    linkedHashMap.put(strX, c48777a);
                }
            } else {
                aVar.L();
            }
        }
        aVar.g();
        return new AbTestsConfigResponse(linkedHashMap);
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(com.google.gson.stream.c cVar, AbTestsConfigResponse abTestsConfigResponse) {
    }
}
