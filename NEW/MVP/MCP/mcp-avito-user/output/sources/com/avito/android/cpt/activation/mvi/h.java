package com.avito.android.cpt.activation.mvi;

import Lr.InterfaceC14432b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpt.activation.mvi.entity.CptActivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptActivationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "LLr/b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<CptActivationInternalAction, InterfaceC14432b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14432b b(CptActivationInternalAction cptActivationInternalAction) {
        CptActivationInternalAction cptActivationInternalAction2 = cptActivationInternalAction;
        if (cptActivationInternalAction2 instanceof CptActivationInternalAction.Close) {
            return InterfaceC14432b.a.f10135a;
        }
        if (cptActivationInternalAction2 instanceof CptActivationInternalAction.HandleDeeplink) {
            return new InterfaceC14432b.C0634b(((CptActivationInternalAction.HandleDeeplink) cptActivationInternalAction2).f126298b);
        }
        return null;
    }
}
