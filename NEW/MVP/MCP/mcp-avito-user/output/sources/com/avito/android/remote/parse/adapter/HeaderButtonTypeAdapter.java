package com.avito.android.remote.parse.adapter;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.context.HeaderButton;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderButtonTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/HeaderButtonTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/context/HeaderButton;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderButtonTypeAdapter implements com.google.gson.o<HeaderButton>, com.google.gson.h<HeaderButton> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        HeaderButton headerButton = (HeaderButton) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.t("title", nVar.c(headerButton.getTitle()));
        kVar.t(Constants.DEEPLINK, nVar.c(headerButton.getDeeplink()));
        return kVar;
    }

    @Override // com.google.gson.h
    public final HeaderButton deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        if (iVar instanceof com.google.gson.k) {
            com.google.gson.k kVarI = iVar.i();
            return new HeaderButton(kVarI.D("title").s(), kVarI.D(Constants.DEEPLINK).s());
        }
        throw new IllegalArgumentException("Expected object or null. but got: " + iVar);
    }
}
