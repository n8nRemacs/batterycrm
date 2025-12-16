package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.MultigeoConfig;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CharParameterWidgetConfigDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CharParameterWidgetConfigDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CharParameterWidgetConfigDeserializer implements com.google.gson.h<CharParameter.Widget.Config> {
    @Override // com.google.gson.h
    public final CharParameter.Widget.Config deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (!(iVar instanceof com.google.gson.k)) {
            return null;
        }
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("onValidationFailedDeeplink");
        DeepLink deepLink = (DeepLink) (iVarD == null ? null : gVar.b(iVarD, DeepLink.class));
        com.google.gson.i iVarD2 = kVarI.D("shouldHideValueForAnalytics");
        Boolean boolValueOf = iVarD2 != null ? Boolean.valueOf(iVarD2.d()) : null;
        com.google.gson.i iVarD3 = kVarI.D("autoDescription");
        CharParameter.AutoDescription autoDescription = (CharParameter.AutoDescription) (iVarD3 == null ? null : gVar.b(iVarD3, CharParameter.AutoDescription.class));
        com.google.gson.i iVarD4 = kVarI.D("autoBeautification");
        CharParameter.AutoBeautification autoBeautification = (CharParameter.AutoBeautification) (iVarD4 == null ? null : gVar.b(iVarD4, CharParameter.AutoBeautification.class));
        com.google.gson.i iVarD5 = kVarI.D("multigeo");
        MultigeoConfig multigeoConfig = (MultigeoConfig) (iVarD5 == null ? null : gVar.b(iVarD5, MultigeoConfig.class));
        com.google.gson.i iVarD6 = kVarI.D("limit");
        return new CharParameter.Widget.Config(deepLink, boolValueOf, autoDescription, autoBeautification, multigeoConfig, iVarD6 != null ? Long.valueOf(iVarD6.l()) : null);
    }
}
