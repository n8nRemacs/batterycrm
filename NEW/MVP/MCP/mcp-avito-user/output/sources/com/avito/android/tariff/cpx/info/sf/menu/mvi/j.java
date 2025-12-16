package com.avito.android.tariff.cpx.info.sf.menu.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff.cpx.info.sf.menu.deeplink.TariffCpxInfoSfMenuAction;
import com.avito.android.tariff.cpx.info.sf.menu.mvi.entity.TariffCpxInfoSfMenuInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import zB0.C50434c;

/* compiled from: TariffCpxInfoSfMenuReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "LzB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TariffCpxInfoSfMenuInternalAction, C50434c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50434c a(TariffCpxInfoSfMenuInternalAction tariffCpxInfoSfMenuInternalAction, C50434c c50434c) {
        TariffCpxInfoSfMenuInternalAction tariffCpxInfoSfMenuInternalAction2 = tariffCpxInfoSfMenuInternalAction;
        C50434c c50434c2 = c50434c;
        if (!(tariffCpxInfoSfMenuInternalAction2 instanceof TariffCpxInfoSfMenuInternalAction.OpenScreen)) {
            return c50434c2;
        }
        List<TariffCpxInfoSfMenuAction> actions = ((TariffCpxInfoSfMenuInternalAction.OpenScreen) tariffCpxInfoSfMenuInternalAction2).f296805b.f296784b.getActions();
        ArrayList arrayList = new ArrayList(C42745f0.q(actions, 10));
        for (TariffCpxInfoSfMenuAction tariffCpxInfoSfMenuAction : actions) {
            arrayList.add(new C50434c.a(tariffCpxInfoSfMenuAction.getTitle(), tariffCpxInfoSfMenuAction.getIconName(), tariffCpxInfoSfMenuAction.getDeepLink()));
        }
        return new C50434c(arrayList);
    }
}
