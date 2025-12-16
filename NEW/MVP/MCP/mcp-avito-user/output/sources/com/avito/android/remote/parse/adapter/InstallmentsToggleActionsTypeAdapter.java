package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.installments.InstallmentsSwitcherActionData;
import com.avito.android.remote.model.installments.LogEventActionData;
import com.avito.android.remote.model.installments.OpenLinkSwitcherActionData;
import com.avito.android.remote.model.installments.ToggleSwitcherActionData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: InstallmentsToggleActionsTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/InstallmentsToggleActionsTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/installments/InstallmentsSwitcherActionData;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentsToggleActionsTypeAdapter extends RuntimeTypeAdapter<InstallmentsSwitcherActionData> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254188a;

    public InstallmentsToggleActionsTypeAdapter() {
        super(null, "params", null, 5, null);
        this.f254188a = P0.j(new kotlin.Q("openLink", OpenLinkSwitcherActionData.class), new kotlin.Q("toggle", ToggleSwitcherActionData.class), new kotlin.Q("logEvent", LogEventActionData.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends InstallmentsSwitcherActionData>> getMapping() {
        return this.f254188a;
    }
}
