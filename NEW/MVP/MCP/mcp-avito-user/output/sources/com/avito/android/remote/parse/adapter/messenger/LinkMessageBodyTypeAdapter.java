package com.avito.android.remote.parse.adapter.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.util.C2;
import com.avito.android.util.V2;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LinkMessageBodyTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/LinkMessageBodyTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Link;", "Lcom/google/gson/h;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LinkMessageBodyTypeAdapter implements o<MessageBody.Link>, h<MessageBody.Link> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.Link link = (MessageBody.Link) obj;
        k kVar = new k();
        kVar.t(ContextActionHandler.Link.URL, nVar.c(link.getUrl()));
        if (link.getRandomId() != null) {
            kVar.t(MessageBody.RANDOM_ID, nVar.c(link.getRandomId()));
        }
        if (link.getPreview() != null) {
            kVar.t(MessageSuggest.PREVIEW, nVar.a(link.getPreview(), MessageBody.Link.Preview.class));
        }
        kVar.t("urlsAreTrusted", nVar.c(Boolean.valueOf(link.getUrlsAreTrusted())));
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.Link deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        String strS = kVarI.D(ContextActionHandler.Link.URL).s();
        String strC = C2.c(kVarI, MessageBody.RANDOM_ID);
        i iVarD = kVarI.D(MessageSuggest.PREVIEW);
        Boolean boolA = C2.a(kVarI, "urlsAreTrusted");
        boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
        if (iVarD == null) {
            return new MessageBody.Link(strS, null, strC, zBooleanValue);
        }
        try {
            return new MessageBody.Link(strS, (MessageBody.Link.Preview) gVar.b(iVarD, MessageBody.Link.Preview.class), strC, zBooleanValue);
        } catch (Throwable th2) {
            V2.f318762a.a("LinkMessageBodyTypeAdapter", "Failed to deserialize MessageBody.Link: " + iVar, th2);
            return new MessageBody.Link(strS, null, strC, zBooleanValue);
        }
    }
}
