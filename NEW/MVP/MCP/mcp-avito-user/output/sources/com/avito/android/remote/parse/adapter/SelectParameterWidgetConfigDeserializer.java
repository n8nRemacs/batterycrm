package com.avito.android.remote.parse.adapter;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SwitcherAction;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectParameterWidgetConfigDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SelectParameterWidgetConfigDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectParameterWidgetConfigDeserializer implements com.google.gson.h<SelectParameter.Widget.Config> {
    @Override // com.google.gson.h
    public final SelectParameter.Widget.Config deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        TooltipOptions tooltipOptions;
        ArrayList arrayList;
        TooltipOptions.Button button;
        if (!(iVar instanceof com.google.gson.k)) {
            return null;
        }
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("onValidationFailedDeeplink");
        DeepLink deepLink = (DeepLink) (iVarD == null ? null : gVar.b(iVarD, DeepLink.class));
        com.google.gson.i iVarD2 = kVarI.D("emptyValue");
        String strS = iVarD2 != null ? iVarD2.s() : null;
        com.google.gson.i iVarD3 = kVarI.D(TooltipAttribute.ATTRIBUTE_TYPE);
        if (iVarD3 != null) {
            com.google.gson.k kVarI2 = iVarD3.i();
            com.google.gson.i iVarD4 = kVarI2.D("text");
            String strS2 = iVarD4 != null ? iVarD4.s() : null;
            com.google.gson.i iVarD5 = kVarI2.D("showOnValue");
            Boolean boolValueOf = iVarD5 != null ? Boolean.valueOf(iVarD5.d()) : null;
            com.google.gson.i iVarD6 = kVarI2.D("onShowRegexp");
            String strS3 = iVarD6 != null ? iVarD6.s() : null;
            com.google.gson.i iVarD7 = kVarI2.D("button");
            if (iVarD7 != null) {
                com.google.gson.i iVarD8 = iVarD7.i().D("text");
                String strS4 = iVarD8 != null ? iVarD8.s() : null;
                com.google.gson.i iVarD9 = kVarI.D(Constants.DEEPLINK);
                DeepLink noMatchLink = (DeepLink) (iVarD9 == null ? null : gVar.b(iVarD9, DeepLink.class));
                if (noMatchLink == null) {
                    noMatchLink = new NoMatchLink();
                }
                button = new TooltipOptions.Button(strS4, noMatchLink);
            } else {
                button = null;
            }
            tooltipOptions = new TooltipOptions(strS2, boolValueOf, button, strS3);
        } else {
            tooltipOptions = null;
        }
        com.google.gson.i iVarD10 = kVarI.D("readOnly");
        Boolean boolValueOf2 = iVarD10 != null ? Boolean.valueOf(iVarD10.d()) : null;
        com.google.gson.i iVarD11 = kVarI.D("errorText");
        String strS5 = iVarD11 != null ? iVarD11.s() : null;
        com.google.gson.i iVarD12 = kVarI.D("suggests");
        if (iVarD12 != null) {
            ArrayList arrayList2 = iVarD12.h().f362000b;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(gVar.b((com.google.gson.i) it.next(), Long.class));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        com.google.gson.i iVarD13 = kVarI.D("switcherAction");
        return new SelectParameter.Widget.Config(deepLink, strS, tooltipOptions, boolValueOf2, strS5, arrayList, (SwitcherAction) (iVarD13 != null ? gVar.b(iVarD13, SwitcherAction.class) : null));
    }
}
