package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuActionTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ChannelMenuActionTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/context/ChannelMenuAction;", "Lcom/google/gson/o;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChannelMenuActionTypeAdapter implements com.google.gson.h<ChannelMenuAction>, com.google.gson.o<ChannelMenuAction> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        ChannelMenuAction channelMenuAction = (ChannelMenuAction) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.y("title", channelMenuAction.getTitle());
        if (channelMenuAction.getRawDeepLink() != null) {
            kVar.y(ContextActionHandler.Link.DEEPLINK, channelMenuAction.getRawDeepLink());
        }
        if (channelMenuAction.getConfirmation() != null) {
            kVar.t("confirmation", nVar.c(channelMenuAction.getConfirmation()));
        }
        if (channelMenuAction.getIcon() != null) {
            kVar.t("icon", nVar.c(channelMenuAction.getIcon()));
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final ChannelMenuAction deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        if (!(iVar instanceof com.google.gson.k)) {
            throw new IllegalArgumentException("Unexpected json: " + iVar);
        }
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("title").s();
        String strC = C2.c(kVarI, "icon");
        com.google.gson.i iVarD = kVarI.D("confirmation");
        ActionConfirmation actionConfirmation = (ActionConfirmation) (iVarD == null ? null : gVar.b(iVarD, ActionConfirmation.class));
        String strC2 = C2.c(kVarI, ContextActionHandler.Link.DEEPLINK);
        com.google.gson.i iVarD2 = kVarI.D(ContextActionHandler.Link.DEEPLINK);
        DeepLink deepLink = (DeepLink) (iVarD2 != null ? gVar.b(iVarD2, DeepLink.class) : null);
        return new ChannelMenuAction(strS, deepLink == null ? new NoMatchLink() : deepLink, strC, actionConfirmation, strC2);
    }
}
