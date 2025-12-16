package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WizardConfigTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/WizardConfigTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WizardConfigTypeAdapter implements com.google.gson.h<CategoryPublishStep.Wizard.Config> {
    @Override // com.google.gson.h
    public final CategoryPublishStep.Wizard.Config deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        com.google.gson.k kVarI = iVar.i();
        if (!kVarI.f362194b.containsKey("leaves")) {
            return null;
        }
        com.google.gson.f fVarH = kVarI.D("leaves").h();
        if (fVarH.f362000b.isEmpty()) {
            return null;
        }
        com.google.gson.i iVarW = fVarH.w(0);
        iVarW.getClass();
        return iVarW instanceof com.google.gson.m ? new CategoryPublishStep.Wizard.Config((List) gVar.b(fVarH, new Y().getType()), null) : new CategoryPublishStep.Wizard.Config(null, (List) gVar.b(fVarH, new Z().getType()));
    }
}
