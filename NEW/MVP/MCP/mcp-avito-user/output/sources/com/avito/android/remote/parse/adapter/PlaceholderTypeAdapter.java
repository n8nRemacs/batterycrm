package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlaceholderTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PlaceholderTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/context/Placeholder;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlaceholderTypeAdapter implements com.google.gson.o<Placeholder>, com.google.gson.h<Placeholder> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        Placeholder placeholder = (Placeholder) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.t("image", nVar.c(placeholder.getImage()));
        kVar.t("description", nVar.c(placeholder.getDescription()));
        kVar.t("button", nVar.c(placeholder.getButton()));
        return kVar;
    }

    @Override // com.google.gson.h
    public final Placeholder deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        if (!(iVar instanceof com.google.gson.k)) {
            throw new IllegalArgumentException("Expected object or null. but got: " + iVar);
        }
        com.google.gson.k kVarI = iVar.i();
        Placeholder.Image image = (Placeholder.Image) gVar.b(kVarI.D("image"), Placeholder.Image.class);
        AttributedText attributedText = (AttributedText) gVar.b(kVarI.D("description"), AttributedText.class);
        com.google.gson.i iVarD = kVarI.D("button");
        return new Placeholder(image, attributedText, (Placeholder.Button) (iVarD != null ? gVar.b(iVarD, Placeholder.Button.class) : null));
    }
}
