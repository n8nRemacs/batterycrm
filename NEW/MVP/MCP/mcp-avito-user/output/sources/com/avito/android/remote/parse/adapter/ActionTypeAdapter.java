package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ActionTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/Action;", "Lcom/google/gson/o;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionTypeAdapter implements com.google.gson.h<Action>, com.google.gson.o<Action> {
    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        Action action = (Action) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.y("title", action.getTitle());
        if (action.getRawUri() != null) {
            kVar.y(TooltipAttribute.PARAM_DEEP_LINK, action.getRawUri());
        }
        if (action.getConfirmation() != null) {
            kVar.t("confirmation", nVar.c(action.getConfirmation()));
        }
        kVar.t("type", nVar.c(action.getType()));
        if (action.getClosesElement() != null) {
            kVar.v(action.getClosesElement(), "closesElement");
        }
        if (action.getImage() != null) {
            kVar.t("image", nVar.c(action.getImage()));
        }
        if (action.getRubricatorLayout() != null) {
            kVar.t("layout", nVar.c(action.getRubricatorLayout()));
        }
        if (action.getTitleWithTransfer() != null) {
            kVar.t("titleWithTransfer", nVar.c(action.getTitleWithTransfer()));
        }
        if (action.getBackgroundColor() != null) {
            kVar.t("backgroundColor", nVar.c(action.getBackgroundColor()));
        }
        if (action.getRowLine() != null) {
            kVar.t("rowLine", nVar.c(action.getRowLine()));
        }
        if (action.getLandscapeRowLine() != null) {
            kVar.t("landscapeRowLine", nVar.c(action.getLandscapeRowLine()));
        }
        if (action.getLandscapePosition() != null) {
            kVar.t("landscapePosition", nVar.c(action.getLandscapePosition()));
        }
        if (action.isAllCategoriesItem() != null) {
            kVar.v(action.isAllCategoriesItem(), "isAllCategoriesItem");
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.Action deserialize(com.google.gson.i r21, java.lang.reflect.Type r22, com.google.gson.g r23) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.ActionTypeAdapter.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
