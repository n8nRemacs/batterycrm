package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.storeParameters.BeduinStoreParametersAction;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinStoreParametersActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/r1;", "LUi/b;", "Lcom/avito/android/beduin_shared/model/action/storeParameters/BeduinStoreParametersAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r1 implements InterfaceC15523b<BeduinStoreParametersAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final lj.c f100373a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.storage.d f100374b;

    @Inject
    public r1(@Y61.k lj.c cVar, @Y61.k com.avito.android.beduin.common.storage.d dVar) {
        this.f100373a = cVar;
        this.f100374b = dVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        Map<String, Object> mapD;
        BeduinStoreParametersAction beduinStoreParametersAction = (BeduinStoreParametersAction) beduinAction;
        com.avito.android.beduin.common.storage.c cVarA = this.f100374b.a(beduinStoreParametersAction.getStorageType());
        Map<String, Map<String, String>> mapC = beduinStoreParametersAction.c();
        if ((mapC == null || mapC.isEmpty()) && ((mapD = beduinStoreParametersAction.d()) == null || mapD.isEmpty())) {
            cVarA.remove(beduinStoreParametersAction.getStorageKey());
            return;
        }
        LinkedHashMap linkedHashMapA = this.f100373a.a(beduinStoreParametersAction.c());
        Map<String, Object> mapD2 = beduinStoreParametersAction.d();
        if (mapD2 == null) {
            mapD2 = kotlin.collections.P0.c();
        }
        cVarA.a(kotlin.collections.P0.k(mapD2, linkedHashMapA), beduinStoreParametersAction.getStorageKey());
    }
}
