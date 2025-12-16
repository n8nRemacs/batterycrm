package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.section.VipAdvert;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import kotlin.Metadata;

/* compiled from: VipAdvertTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/NewVipAdvertTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/section/VipAdvert;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NewVipAdvertTypeAdapter extends TypeAdapter<VipAdvert> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TypeAdapter<SerpAdvert> f254295a;

    public NewVipAdvertTypeAdapter(@k TypeAdapter<SerpAdvert> typeAdapter) {
        this.f254295a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final VipAdvert read(com.google.gson.stream.a aVar) {
        return new VipAdvert(this.f254295a.read(aVar));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, VipAdvert vipAdvert) {
        throw new UnsupportedOperationException();
    }
}
