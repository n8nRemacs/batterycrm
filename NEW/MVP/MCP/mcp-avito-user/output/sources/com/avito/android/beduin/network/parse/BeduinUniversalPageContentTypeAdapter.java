package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.common.action.BeduinUniversalPageContentImpl;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: BeduinUniversalPageContentAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinUniversalPageContentTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinUniversalPageContentTypeAdapter extends TypeAdapter<BeduinUniversalPageContent> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f104047a;

    public BeduinUniversalPageContentTypeAdapter(@k Gson gson) {
        this.f104047a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BeduinUniversalPageContent read(com.google.gson.stream.a aVar) {
        return (BeduinUniversalPageContent) this.f104047a.g(BeduinUniversalPageContentImpl.class).read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, BeduinUniversalPageContent beduinUniversalPageContent) {
        throw new UnsupportedOperationException();
    }
}
