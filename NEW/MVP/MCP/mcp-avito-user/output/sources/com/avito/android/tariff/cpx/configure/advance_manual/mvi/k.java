package com.avito.android.tariff.cpx.configure.advance_manual.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.configure.advance_manual.mvi.entity.CpxConfigureAdvanceManualInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import oB0.InterfaceC44621b;

/* compiled from: CpxConfigureAdvanceManualOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/configure/advance_manual/mvi/entity/CpxConfigureAdvanceManualInternalAction;", "LoB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<CpxConfigureAdvanceManualInternalAction, InterfaceC44621b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44621b b(CpxConfigureAdvanceManualInternalAction cpxConfigureAdvanceManualInternalAction) {
        CpxConfigureAdvanceManualInternalAction cpxConfigureAdvanceManualInternalAction2 = cpxConfigureAdvanceManualInternalAction;
        if (!(cpxConfigureAdvanceManualInternalAction2 instanceof CpxConfigureAdvanceManualInternalAction.HandleRequestDeepLink)) {
            if (cpxConfigureAdvanceManualInternalAction2 instanceof CpxConfigureAdvanceManualInternalAction.HandleDeepLink) {
                return new InterfaceC44621b.a(((CpxConfigureAdvanceManualInternalAction.HandleDeepLink) cpxConfigureAdvanceManualInternalAction2).f295840b);
            }
            return null;
        }
        CpxConfigureAdvanceManualInternalAction.HandleRequestDeepLink handleRequestDeepLink = (CpxConfigureAdvanceManualInternalAction.HandleRequestDeepLink) cpxConfigureAdvanceManualInternalAction2;
        DeepLink deepLink = handleRequestDeepLink.f295841b;
        if (deepLink != null) {
            return new InterfaceC44621b.C12173b(deepLink, handleRequestDeepLink.f295842c);
        }
        return null;
    }
}
