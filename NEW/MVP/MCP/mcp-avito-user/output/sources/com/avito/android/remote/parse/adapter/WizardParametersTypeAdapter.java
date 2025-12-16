package com.avito.android.remote.parse.adapter;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.util.InvalidSchemaException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: WizardParametersTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/WizardParametersTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/WizardParameter;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WizardParametersTypeAdapter implements com.google.gson.o<WizardParameter>, com.google.gson.h<WizardParameter> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        WizardParameter wizardParameter = (WizardParameter) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.t("navigation", nVar.c(wizardParameter.getNavigation()));
        kVar.y("title", wizardParameter.getTitle());
        String description = wizardParameter.getDescription();
        if (description != null) {
            kVar.y("description", description);
        }
        kVar.t(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, nVar.c(wizardParameter.getChildren()));
        kVar.v(Boolean.valueOf(wizardParameter.getIsVerticalChange()), "isCrossVertical");
        Navigation rootNavigation = wizardParameter.getRootNavigation();
        if (rootNavigation != null) {
            kVar.t("rootNavigation", nVar.c(rootNavigation));
        }
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26, types: [kotlin.collections.z0] */
    @Override // com.google.gson.h
    public final WizardParameter deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        ArrayList arrayList;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.k kVarI2 = kVarI.I("navigation");
        if (kVarI2 == null) {
            throw new InvalidSchemaException(m0.f406844a.b(ApiError.class), "message", "\"message\" value cannot be empty");
        }
        Navigation navigation2 = (Navigation) gVar.b(kVarI2, Navigation.class);
        com.google.gson.i iVarD = kVarI.D("title");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        String str = strS;
        com.google.gson.i iVarD2 = kVarI.D("description");
        String strS2 = iVarD2 != null ? iVarD2.s() : null;
        com.google.gson.f fVarE = kVarI.E(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN);
        if (fVarE != null) {
            ArrayList arrayList2 = fVarE.f362000b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((com.google.gson.i) it.next(), WizardParameter.class));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C42784z0.f406748b;
        }
        com.google.gson.k kVarI3 = kVarI.I("rootNavigation");
        Navigation navigation3 = kVarI3 != null ? (Navigation) gVar.b(kVarI3, Navigation.class) : null;
        com.google.gson.i iVarD3 = kVarI.D("isCrossVertical");
        boolean zD2 = iVarD3 != null ? iVarD3.d() : false;
        com.google.gson.i iVarD4 = kVarI.D("customUri");
        return new WizardParameter(navigation2, str, strS2, arrayList, navigation3, zD2, iVarD4 != null ? (DeepLink) gVar.b(iVarD4, DeepLink.class) : null);
    }
}
