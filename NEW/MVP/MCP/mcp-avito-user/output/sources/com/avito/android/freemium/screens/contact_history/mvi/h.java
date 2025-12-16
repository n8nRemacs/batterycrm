package com.avito.android.freemium.screens.contact_history.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction;
import dF.InterfaceC39573b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FreemiumContactHistoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "LdF/b;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<FreemiumContactHistoryInternalAction, InterfaceC39573b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39573b b(FreemiumContactHistoryInternalAction freemiumContactHistoryInternalAction) {
        FreemiumContactHistoryInternalAction freemiumContactHistoryInternalAction2 = freemiumContactHistoryInternalAction;
        if (freemiumContactHistoryInternalAction2 instanceof FreemiumContactHistoryInternalAction.OpenDeepLink) {
            return new InterfaceC39573b.C11019b(((FreemiumContactHistoryInternalAction.OpenDeepLink) freemiumContactHistoryInternalAction2).f158997b);
        }
        if (freemiumContactHistoryInternalAction2.equals(FreemiumContactHistoryInternalAction.OnBackClick.f158996b)) {
            return InterfaceC39573b.a.f393756a;
        }
        return null;
    }
}
