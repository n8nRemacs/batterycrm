package com.avito.android.bundles.remote.adapter;

import Dk.C13408a;
import com.avito.android.bundles.remote.model.BenefitIconName;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: BenefitColoredIconAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bundles/remote/adapter/BenefitColoredIconAdapter;", "Lcom/google/gson/h;", "LDk/a;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BenefitColoredIconAdapter implements h<C13408a> {
    @Override // com.google.gson.h
    public final C13408a deserialize(i iVar, Type type, g gVar) {
        BenefitIconName benefitIconName;
        k kVarI = iVar.i();
        String strS = kVarI.D("iconName").s();
        UniversalColor universalColor = (UniversalColor) gVar.b(kVarI.D("color"), UniversalColor.class);
        BenefitIconName.f108326b.getClass();
        BenefitIconName[] benefitIconNameArrValues = BenefitIconName.values();
        int length = benefitIconNameArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                benefitIconName = null;
                break;
            }
            benefitIconName = benefitIconNameArrValues[i12];
            benefitIconName.getClass();
            if ("checkmark".equals(strS)) {
                break;
            }
            i12++;
        }
        if (benefitIconName == null) {
            benefitIconName = BenefitIconName.f108327c;
        }
        return new C13408a(benefitIconName, universalColor);
    }
}
