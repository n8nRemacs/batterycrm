package com.avito.android.freemium.screens.rules.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction;
import eF.InterfaceC39998b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FreemiumRulesOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "LeF/b;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<FreemiumRulesInternalAction, InterfaceC39998b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39998b b(FreemiumRulesInternalAction freemiumRulesInternalAction) {
        FreemiumRulesInternalAction freemiumRulesInternalAction2 = freemiumRulesInternalAction;
        if (freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.OpenDeepLink) {
            return new InterfaceC39998b.C11062b(((FreemiumRulesInternalAction.OpenDeepLink) freemiumRulesInternalAction2).f159142b);
        }
        if (freemiumRulesInternalAction2.equals(FreemiumRulesInternalAction.CloseScreen.f159138b)) {
            return InterfaceC39998b.a.f395066a;
        }
        if (freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.AcceptanceError) {
            return new InterfaceC39998b.c(((FreemiumRulesInternalAction.AcceptanceError) freemiumRulesInternalAction2).f159136b);
        }
        return null;
    }
}
