package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ActionNullable;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionNullableDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ActionNullableDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ActionNullable;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionNullableDeserializer implements com.google.gson.h<ActionNullable> {
    @Override // com.google.gson.h
    public final ActionNullable deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("title").s();
        com.google.gson.i iVarD = kVarI.D(TooltipAttribute.PARAM_DEEP_LINK);
        return new ActionNullable(strS, (DeepLink) (iVarD == null ? null : gVar.b(iVarD, DeepLink.class)));
    }
}
