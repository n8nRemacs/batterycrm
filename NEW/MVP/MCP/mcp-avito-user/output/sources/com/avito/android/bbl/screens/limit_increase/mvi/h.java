package com.avito.android.bbl.screens.limit_increase.mvi;

import Eh.InterfaceC13486b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction;
import com.avito.android.error.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LimitIncreaseOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "LEh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<LimitIncreaseInternalAction, InterfaceC13486b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13486b b(LimitIncreaseInternalAction limitIncreaseInternalAction) {
        LimitIncreaseInternalAction limitIncreaseInternalAction2 = limitIncreaseInternalAction;
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.HandleDeeplink) {
            return new InterfaceC13486b.c(((LimitIncreaseInternalAction.HandleDeeplink) limitIncreaseInternalAction2).f99801b);
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.Back) {
            return InterfaceC13486b.a.f4170a;
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.FinishFlow) {
            return InterfaceC13486b.C0247b.f4171a;
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.PostSaveError) {
            return new InterfaceC13486b.d(z.l(((LimitIncreaseInternalAction.PostSaveError) limitIncreaseInternalAction2).f99802b));
        }
        return null;
    }
}
