package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinPersistCounterAction;
import com.avito.android.beduin_models.BeduinAction;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BeduinPersistCounterActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/A0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinPersistCounterAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A0 implements InterfaceC15523b<BeduinPersistCounterAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.storage.d f100046a;

    @Inject
    public A0(@Y61.k com.avito.android.beduin.common.storage.d dVar) {
        this.f100046a = dVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinPersistCounterAction beduinPersistCounterAction = (BeduinPersistCounterAction) beduinAction;
        com.avito.android.beduin.common.storage.c cVarA = this.f100046a.a(beduinPersistCounterAction.getStorageType());
        if (beduinPersistCounterAction.getCounterValues().isEmpty()) {
            cVarA.remove(beduinPersistCounterAction.getStorageKey());
            return;
        }
        Map<String, Object> map = cVarA.get(beduinPersistCounterAction.getStorageKey());
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : beduinPersistCounterAction.getCounterValues().entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            Integer numY0 = C43066x.y0(linkedHashMap.getOrDefault(key, 0).toString());
            if (numY0 != null) {
                linkedHashMap.put(key, Integer.valueOf(numY0.intValue() + iIntValue));
            }
        }
        cVarA.a(linkedHashMap, beduinPersistCounterAction.getStorageKey());
    }
}
