package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.action.BeduinLogEventAction;
import com.avito.android.beduin.common.analytics.BeduinParametrizedClickStreamEvent;
import com.avito.android.beduin_models.BeduinAction;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinLogEventActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/V;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinLogEventAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class V implements InterfaceC15523b<BeduinLogEventAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f100138a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final lj.c f100139b;

    @Inject
    public V(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k lj.c cVar) {
        this.f100138a = interfaceC28373a;
        this.f100139b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map] */
    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        LinkedHashMap linkedHashMapP;
        BeduinLogEventAction beduinLogEventAction = (BeduinLogEventAction) beduinAction;
        LinkedHashMap linkedHashMapA = this.f100139b.a(beduinLogEventAction.getFormParamsMap());
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            arrayList.add(value instanceof String ? new kotlin.Q(str, value) : new kotlin.Q(str, gson.l(value)));
        }
        Map<String, String> params = beduinLogEventAction.getParams();
        if (params == null) {
            params = kotlin.collections.P0.c();
        }
        ArrayList arrayList2 = arrayList;
        if (params.isEmpty()) {
            linkedHashMapP = kotlin.collections.P0.p(arrayList2);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(params);
            kotlin.collections.P0.m(linkedHashMap, arrayList2);
            linkedHashMapP = linkedHashMap;
        }
        this.f100138a.c(kotlin.jvm.internal.L.f(beduinLogEventAction.getHasSensitiveData(), Boolean.TRUE) ? new BeduinParametrizedClickStreamEvent(beduinLogEventAction.getId(), beduinLogEventAction.getVersion(), linkedHashMapP) : new ParametrizedClickStreamEvent(beduinLogEventAction.getId(), beduinLogEventAction.getVersion(), linkedHashMapP, null, 8, null));
    }
}
