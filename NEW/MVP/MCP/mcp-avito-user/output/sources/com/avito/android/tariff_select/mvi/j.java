package com.avito.android.tariff_select.mvi;

import ZD0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_select.mvi.entity.TariffSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffSelectOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_select/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "LZD0/b;", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<TariffSelectInternalAction, ZD0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ZD0.b b(TariffSelectInternalAction tariffSelectInternalAction) {
        DeepLink deepLink;
        TariffSelectInternalAction tariffSelectInternalAction2 = tariffSelectInternalAction;
        if (tariffSelectInternalAction2 instanceof TariffSelectInternalAction.Back) {
            return b.a.f19991a;
        }
        if (!(tariffSelectInternalAction2 instanceof TariffSelectInternalAction.HandleDeeplink) || (deepLink = ((TariffSelectInternalAction.HandleDeeplink) tariffSelectInternalAction2).f301236b) == null) {
            return null;
        }
        return new b.C1427b(deepLink);
    }
}
