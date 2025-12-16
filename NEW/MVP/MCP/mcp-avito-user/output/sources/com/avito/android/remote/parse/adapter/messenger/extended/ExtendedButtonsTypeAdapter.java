package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.C2;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedButtonsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedButtonsTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedButton;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedButtonsTypeAdapter implements o<MessageBody.SystemMessageBody.ExtendedButton>, h<MessageBody.SystemMessageBody.ExtendedButton> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.ExtendedButton extendedButton = (MessageBody.SystemMessageBody.ExtendedButton) obj;
        k kVar = new k();
        String title = extendedButton.getTitle();
        if (title != null) {
            kVar.t("title", nVar != null ? nVar.c(title) : null);
        }
        String style = extendedButton.getStyle();
        if (style != null) {
            kVar.t(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, nVar != null ? nVar.c(style) : null);
        }
        if (extendedButton.getUri() != null) {
            kVar.y(ContextActionHandler.Link.DEEPLINK, extendedButton.getUri());
        }
        String uri = extendedButton.getUri();
        if (uri != null) {
            kVar.t(TooltipAttribute.PARAM_DEEP_LINK, nVar != null ? nVar.c(uri) : null);
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.ExtendedButton deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        x<String, i> xVar = kVarI.f362194b;
        if (!xVar.containsKey("title")) {
            return null;
        }
        String strE = C34328m0.e(kVarI.D("title"));
        String strE2 = xVar.containsKey(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE) ? C34328m0.e(kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)) : "accentSmall";
        String strC = C2.c(kVarI, TooltipAttribute.PARAM_DEEP_LINK);
        i iVarD = kVarI.D(ContextActionHandler.Link.DEEPLINK);
        DeepLink noMatchLink = (DeepLink) (iVarD != null ? gVar.b(iVarD, DeepLink.class) : null);
        if (noMatchLink == null) {
            noMatchLink = new NoMatchLink();
        }
        return new MessageBody.SystemMessageBody.ExtendedButton(strE, strE2, strC, noMatchLink);
    }
}
