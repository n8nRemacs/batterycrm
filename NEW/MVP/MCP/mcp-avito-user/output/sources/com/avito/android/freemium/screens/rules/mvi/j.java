package com.avito.android.freemium.screens.rules.mvi;

import androidx.compose.runtime.internal.P;
import cF.C27031a;
import com.avito.android.arch.mvi.u;
import com.avito.android.freemium.screens.rules.mvi.entity.FreemiumRulesInternalAction;
import eF.C39999c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FreemiumRulesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/freemium/screens/rules/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/freemium/screens/rules/mvi/entity/FreemiumRulesInternalAction;", "LeF/c;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<FreemiumRulesInternalAction, C39999c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39999c a(FreemiumRulesInternalAction freemiumRulesInternalAction, C39999c c39999c) {
        FreemiumRulesInternalAction freemiumRulesInternalAction2 = freemiumRulesInternalAction;
        C39999c c39999c2 = c39999c;
        if (!(freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.Content)) {
            return freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.Loading ? C39999c.a(c39999c2, true, null, null, 28) : freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.Error ? C39999c.a(c39999c2, false, ((FreemiumRulesInternalAction.Error) freemiumRulesInternalAction2).f159140b, null, 28) : freemiumRulesInternalAction2 instanceof FreemiumRulesInternalAction.AcceptanceLoading ? C39999c.a(c39999c2, false, null, new C39999c.a(c39999c2.f395075f.f395076a, ((FreemiumRulesInternalAction.AcceptanceLoading) freemiumRulesInternalAction2).f159137b), 15) : c39999c2;
        }
        C27031a c27031a = ((FreemiumRulesInternalAction.Content) freemiumRulesInternalAction2).f159139b;
        return new C39999c(false, null, new C39999c.C11063c(String.valueOf(c27031a.getContactCounter().getCount()), (float) c27031a.getContactCounter().getProgress(), c27031a.getTitle()), c27031a.getDescription(), new C39999c.a(c27031a.getButtonTitle(), false));
    }
}
