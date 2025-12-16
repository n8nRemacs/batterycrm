package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.OrderMessage;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderMessageDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/OrderMessageDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/OrderMessage;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderMessageDeserializer implements com.google.gson.h<OrderMessage> {
    @Override // com.google.gson.h
    public final OrderMessage deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.k kVarI2 = kVarI.E("actions").w(0).i();
        String strS = kVarI.D("title").s();
        String strS2 = kVarI.D("description").s();
        String strS3 = kVarI2.D("title").s();
        DeepLink deepLink = (DeepLink) gVar.b(kVarI2.D(TooltipAttribute.PARAM_DEEP_LINK), DeepLink.class);
        return new OrderMessage(strS, strS2, kVarI2.f362194b.containsKey("type") ? new Action(strS3, deepLink, null, strS3, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null) : new Action(strS3, deepLink, null, deepLink.getPath(), null, null, null, null, null, null, null, null, null, null, null, null, 65520, null));
    }
}
