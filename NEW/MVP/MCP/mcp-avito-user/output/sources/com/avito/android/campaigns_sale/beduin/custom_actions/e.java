package com.avito.android.campaigns_sale.beduin.custom_actions;

import Ui.InterfaceC15524c;
import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CampaignsSaleActionsRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/e;", "LUi/d;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements Ui.d {
    @Inject
    public e() {
    }

    @Override // Ui.d
    @k
    public final List<InterfaceC15524c> a() {
        return C42745f0.U(BeduinSetChosenItemsAction.INSTANCE, BeduinSaveDraftAction.INSTANCE);
    }
}
