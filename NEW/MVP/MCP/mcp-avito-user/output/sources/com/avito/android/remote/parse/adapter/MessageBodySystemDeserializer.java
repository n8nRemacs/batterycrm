package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: MessageBodySystemDeserializer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/MessageBodySystemDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageBodySystemDeserializer implements com.google.gson.h<MessageBody.SystemMessageBody> {
    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        String strC = C2.c(iVar.i(), "text");
        return strC == null ? new MessageBody.SystemMessageBody.Unknown() : new MessageBody.SystemMessageBody.Text(strC);
    }
}
