package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedMessageDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AttributedMessageDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/PretendErrorValue$AttributedMessage;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttributedMessageDeserializer implements com.google.gson.h<PretendErrorValue.AttributedMessage> {
    @Inject
    public AttributedMessageDeserializer() {
    }

    @Override // com.google.gson.h
    public final PretendErrorValue.AttributedMessage deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return new PretendErrorValue.AttributedMessage((AttributedText) gVar.b(iVar.i().D("message"), AttributedText.class));
    }
}
