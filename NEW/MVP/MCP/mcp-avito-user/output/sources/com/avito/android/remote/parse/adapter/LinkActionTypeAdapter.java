package com.avito.android.remote.parse.adapter;

import android.net.Uri;
import com.avito.android.remote.model.LinkAction;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LinkActionTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/LinkActionTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/LinkAction;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LinkActionTypeAdapter implements com.google.gson.h<LinkAction> {
    @Override // com.google.gson.h
    public final LinkAction deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("title");
        String strS = iVarD != null ? iVarD.s() : null;
        com.google.gson.i iVarD2 = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
        String strS2 = iVarD2 != null ? iVarD2.s() : null;
        if (strS2 == null) {
            return null;
        }
        return new LinkAction(strS, Uri.parse(strS2));
    }
}
