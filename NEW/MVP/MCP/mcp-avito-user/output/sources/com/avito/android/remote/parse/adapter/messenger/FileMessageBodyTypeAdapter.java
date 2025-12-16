package com.avito.android.remote.parse.adapter.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C2;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FIleMessageBodyTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/FileMessageBodyTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$File;", "Lcom/google/gson/h;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FileMessageBodyTypeAdapter implements o<MessageBody.File>, h<MessageBody.File> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.File file = (MessageBody.File) obj;
        k kVar = new k();
        kVar.t("fileId", nVar.c(file.getFileId()));
        kVar.t("name", nVar.c(file.getName()));
        kVar.t(MessageBody.File.SIZE_IN_BYTES, nVar.c(Long.valueOf(file.getSizeBytes())));
        String mimeType = file.getMimeType();
        if (mimeType != null) {
            kVar.t(MessageBody.File.MIME_TYPE, nVar.c(mimeType));
        }
        String randomId = file.getRandomId();
        if (randomId != null) {
            kVar.t(MessageBody.RANDOM_ID, nVar.c(randomId));
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.File deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        return new MessageBody.File(kVarI.D("fileId").s(), kVarI.D("name").s(), kVarI.D(MessageBody.File.SIZE_IN_BYTES).l(), C2.c(kVarI, MessageBody.File.MIME_TYPE), C2.c(kVarI, MessageBody.RANDOM_ID));
    }
}
