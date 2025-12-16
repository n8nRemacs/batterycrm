package com.avito.android.remote.parse.adapter.messenger.extended;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedTextFieldsTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/extended/ExtendedTextFieldsTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$ExtendedTextFields;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedTextFieldsTypeAdapter implements o<MessageBody.SystemMessageBody.ExtendedTextFields>, h<MessageBody.SystemMessageBody.ExtendedTextFields> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.ExtendedTextFields extendedTextFields = (MessageBody.SystemMessageBody.ExtendedTextFields) obj;
        if (extendedTextFields instanceof MessageBody.SystemMessageBody.ExtendedTextFields.Text) {
            k kVar = new k();
            kVar.t("type", nVar != null ? nVar.c(((MessageBody.SystemMessageBody.ExtendedTextFields.Text) extendedTextFields).getType()) : null);
            kVar.t("content", nVar != null ? nVar.a(((MessageBody.SystemMessageBody.ExtendedTextFields.Text) extendedTextFields).getContent(), AttributedText.class) : null);
            return kVar;
        }
        if (!(extendedTextFields instanceof MessageBody.SystemMessageBody.ExtendedTextFields.Content)) {
            return new k();
        }
        k kVar2 = new k();
        kVar2.t("type", nVar != null ? nVar.c(((MessageBody.SystemMessageBody.ExtendedTextFields.Content) extendedTextFields).getType()) : null);
        kVar2.t("content", nVar != null ? nVar.c(((MessageBody.SystemMessageBody.ExtendedTextFields.Content) extendedTextFields).getContent()) : null);
        return kVar2;
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody.ExtendedTextFields deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        String strE = C34328m0.e(kVarI.D("type"));
        if (!L.f(strE, "text")) {
            return L.f(strE, "geo") ? new MessageBody.SystemMessageBody.ExtendedTextFields.Content(strE, (MessageBody.SystemMessageBody.ExtendedContent) gVar.b(kVarI.D("content"), MessageBody.SystemMessageBody.ExtendedContent.class)) : new MessageBody.SystemMessageBody.ExtendedTextFields.Text("", new AttributedText("", C42784z0.f406748b, 0, 4, null));
        }
        i iVarD = kVarI.D("content");
        AttributedText attributedText = (AttributedText) (iVarD == null ? null : gVar.b(iVarD, AttributedText.class));
        if (attributedText == null) {
            attributedText = new AttributedText("Ошибка", C42784z0.f406748b, 0, 4, null);
        }
        return new MessageBody.SystemMessageBody.ExtendedTextFields.Text(strE, attributedText);
    }
}
