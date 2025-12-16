package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14778b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WizardReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LPe0/b;", "Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<InterfaceC14778b, WizardState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final WizardState a(InterfaceC14778b interfaceC14778b, WizardState wizardState) {
        InterfaceC14778b interfaceC14778b2 = interfaceC14778b;
        WizardState wizardState2 = wizardState;
        if (interfaceC14778b2 instanceof InterfaceC14778b.a) {
            return WizardState.a(wizardState2, false, null, ((InterfaceC14778b.a) interfaceC14778b2).f13195a, 4);
        }
        if (interfaceC14778b2.equals(InterfaceC14778b.g.f13201a)) {
            return WizardState.a(wizardState2, true, null, null, 12);
        }
        if (interfaceC14778b2 instanceof InterfaceC14778b.i) {
            return WizardState.a(wizardState2, false, ((InterfaceC14778b.i) interfaceC14778b2).f13203a, null, 11);
        }
        if (interfaceC14778b2 instanceof InterfaceC14778b.e ? true : interfaceC14778b2 instanceof InterfaceC14778b.d ? true : interfaceC14778b2 instanceof InterfaceC14778b.C0854b ? true : interfaceC14778b2.equals(InterfaceC14778b.c.f13196a) ? true : interfaceC14778b2 instanceof InterfaceC14778b.h ? true : interfaceC14778b2 instanceof InterfaceC14778b.f) {
            return wizardState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
