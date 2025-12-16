package com.avito.android.tariff.cpx.levels.mvi;

import HB0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxLevelsOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "LHB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<CpxLevelsInternalAction, HB0.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final HB0.b b(CpxLevelsInternalAction cpxLevelsInternalAction) {
        DeepLink deepLink;
        CpxLevelsInternalAction cpxLevelsInternalAction2 = cpxLevelsInternalAction;
        if (cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.HandleDeeplink) {
            DeepLink deepLink2 = ((CpxLevelsInternalAction.HandleDeeplink) cpxLevelsInternalAction2).f297128b;
            if (deepLink2 != null) {
                return new b.C0398b(deepLink2);
            }
            return null;
        }
        if (!(cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.CloseWithResult) || (deepLink = ((CpxLevelsInternalAction.CloseWithResult) cpxLevelsInternalAction2).f297124b) == null) {
            return null;
        }
        return new b.a(deepLink);
    }
}
