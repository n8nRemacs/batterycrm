package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedColorTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedColorTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedColor;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedColorTypeAdapter implements o<MessageBody.SystemMessageBody.ExtendedColor>, h<MessageBody.SystemMessageBody.ExtendedColor> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.ExtendedColor extendedColor = (MessageBody.SystemMessageBody.ExtendedColor) obj;
        k kVar = new k();
        kVar.t("color", nVar != null ? nVar.c(extendedColor.getColor()) : null);
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.ExtendedColor deserialize(i iVar, Type type, g gVar) {
        String strE = C34328m0.e(iVar.i().D("color"));
        if (strE == null) {
            strE = "";
        }
        return new MessageBody.SystemMessageBody.ExtendedColor(strE);
    }
}
