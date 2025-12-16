package com.avito.android.bbl.screens.contact_history.mvi;

import Dh.InterfaceC13398b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.bbl.screens.contact_history.mvi.entity.BblContactHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BblContactHistoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "LDh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<BblContactHistoryInternalAction, InterfaceC13398b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13398b b(BblContactHistoryInternalAction bblContactHistoryInternalAction) {
        BblContactHistoryInternalAction bblContactHistoryInternalAction2 = bblContactHistoryInternalAction;
        if (bblContactHistoryInternalAction2 instanceof BblContactHistoryInternalAction.OpenDeepLink) {
            return new InterfaceC13398b.C0182b(((BblContactHistoryInternalAction.OpenDeepLink) bblContactHistoryInternalAction2).f99680b);
        }
        if (bblContactHistoryInternalAction2.equals(BblContactHistoryInternalAction.OnBackClick.f99679b)) {
            return InterfaceC13398b.a.f3356a;
        }
        return null;
    }
}
