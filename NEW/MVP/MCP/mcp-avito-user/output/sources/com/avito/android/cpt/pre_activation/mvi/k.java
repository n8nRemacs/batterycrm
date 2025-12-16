package com.avito.android.cpt.pre_activation.mvi;

import Xr.InterfaceC17041b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PreActivationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "LXr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<PreActivationInternalAction, InterfaceC17041b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC17041b b(PreActivationInternalAction preActivationInternalAction) {
        PreActivationInternalAction preActivationInternalAction2 = preActivationInternalAction;
        if (preActivationInternalAction2 instanceof PreActivationInternalAction.OpenDeepLink) {
            PreActivationInternalAction.OpenDeepLink openDeepLink = (PreActivationInternalAction.OpenDeepLink) preActivationInternalAction2;
            return new InterfaceC17041b.C1353b(openDeepLink.f126733b, openDeepLink.f126734c);
        }
        if (preActivationInternalAction2.equals(PreActivationInternalAction.CloseScreen.f126731b)) {
            return InterfaceC17041b.a.f19086a;
        }
        if (preActivationInternalAction2 instanceof PreActivationInternalAction.SetResult) {
            return new InterfaceC17041b.c(((PreActivationInternalAction.SetResult) preActivationInternalAction2).f126736b);
        }
        return null;
    }
}
