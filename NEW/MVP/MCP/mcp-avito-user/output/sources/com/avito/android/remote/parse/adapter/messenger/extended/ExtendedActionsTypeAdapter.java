package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.message.MessageBody;
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

/* compiled from: ExtendedActionsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedActionsTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedActions;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedActionsTypeAdapter implements o<MessageBody.SystemMessageBody.ExtendedActions>, h<MessageBody.SystemMessageBody.ExtendedActions> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.ExtendedActions extendedActions = (MessageBody.SystemMessageBody.ExtendedActions) obj;
        k kVar = new k();
        MessageBody.SystemMessageBody.ExtendedButton call = extendedActions.getCall();
        if (call != null) {
            kVar.t("call", nVar != null ? nVar.c(call) : null);
        }
        MessageBody.SystemMessageBody.ExtendedButton message = extendedActions.getMessage();
        if (message != null) {
            kVar.t("message", nVar != null ? nVar.c(message) : null);
        }
        MessageBody.SystemMessageBody.ExtendedButton callback = extendedActions.getCallback();
        if (callback != null) {
            kVar.t("callback", nVar != null ? nVar.c(callback) : null);
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.ExtendedActions deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        x<String, i> xVar = kVarI.f362194b;
        k kVarD = (!xVar.containsKey("call") || kVarI.D("call") == null) ? null : C34328m0.d(kVarI.D("call"));
        k kVarD2 = (!xVar.containsKey("message") || kVarI.D("message") == null) ? null : C34328m0.d(kVarI.D("message"));
        k kVarD3 = (!xVar.containsKey("callback") || kVarI.D("callback") == null) ? null : C34328m0.d(kVarI.D("callback"));
        MessageBody.SystemMessageBody.ExtendedButton extendedButton = kVarD != null ? (MessageBody.SystemMessageBody.ExtendedButton) gVar.b(kVarD, MessageBody.SystemMessageBody.ExtendedButton.class) : null;
        return new MessageBody.SystemMessageBody.ExtendedActions(kVarD3 != null ? (MessageBody.SystemMessageBody.ExtendedButton) gVar.b(kVarD3, MessageBody.SystemMessageBody.ExtendedButton.class) : null, kVarD2 != null ? (MessageBody.SystemMessageBody.ExtendedButton) gVar.b(kVarD2, MessageBody.SystemMessageBody.ExtendedButton.class) : null, extendedButton);
    }
}
