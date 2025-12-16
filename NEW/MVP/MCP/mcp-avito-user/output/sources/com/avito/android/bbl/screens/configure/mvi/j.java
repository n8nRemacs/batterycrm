package com.avito.android.bbl.screens.configure.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.bbl.screens.configure.mvi.entity.BblConfigureInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import yh.InterfaceC50250b;

/* compiled from: BblConfigureOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lyh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<BblConfigureInternalAction, InterfaceC50250b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50250b b(BblConfigureInternalAction bblConfigureInternalAction) {
        BblConfigureInternalAction.HandleDeeplink handleDeeplink;
        DeepLink deepLink;
        BblConfigureInternalAction bblConfigureInternalAction2 = bblConfigureInternalAction;
        if (bblConfigureInternalAction2 instanceof BblConfigureInternalAction.Back) {
            return InterfaceC50250b.a.f443452a;
        }
        InterfaceC50250b.C12915b c12915b = null;
        if ((bblConfigureInternalAction2 instanceof BblConfigureInternalAction.HandleDeeplink) && (deepLink = (handleDeeplink = (BblConfigureInternalAction.HandleDeeplink) bblConfigureInternalAction2).f99221b) != null) {
            c12915b = new InterfaceC50250b.C12915b(deepLink, handleDeeplink.f99222c, handleDeeplink.f99223d);
        }
        return c12915b;
    }
}
