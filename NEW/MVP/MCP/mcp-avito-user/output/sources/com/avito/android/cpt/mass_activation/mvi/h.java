package com.avito.android.cpt.mass_activation.mvi;

import Vr.InterfaceC15710b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptMassActivationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "LVr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<CptMassActivationInternalAction, InterfaceC15710b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15710b b(CptMassActivationInternalAction cptMassActivationInternalAction) {
        CptMassActivationInternalAction cptMassActivationInternalAction2 = cptMassActivationInternalAction;
        if (cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.HandleDeeplink) {
            return new InterfaceC15710b.C1206b(((CptMassActivationInternalAction.HandleDeeplink) cptMassActivationInternalAction2).f126594b);
        }
        if (cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.SetEmptyResult) {
            return InterfaceC15710b.c.f17431a;
        }
        if (cptMassActivationInternalAction2 instanceof CptMassActivationInternalAction.CloseWithDeeplinkResult) {
            return new InterfaceC15710b.a(((CptMassActivationInternalAction.CloseWithDeeplinkResult) cptMassActivationInternalAction2).f126590b);
        }
        return null;
    }
}
