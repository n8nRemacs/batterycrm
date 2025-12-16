package com.avito.android.bbl.screens.configure.v2.mvi;

import Ah.InterfaceC13033b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.bbl.screens.configure.v2.mvi.entity.BblConfigureV2InternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BblConfigureV2OneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "LAh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<BblConfigureV2InternalAction, InterfaceC13033b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13033b b(BblConfigureV2InternalAction bblConfigureV2InternalAction) {
        BblConfigureV2InternalAction.HandleDeeplink handleDeeplink;
        DeepLink deepLink;
        BblConfigureV2InternalAction bblConfigureV2InternalAction2 = bblConfigureV2InternalAction;
        if (bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.Back) {
            return InterfaceC13033b.a.f566a;
        }
        InterfaceC13033b.C0022b c0022b = null;
        if ((bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.HandleDeeplink) && (deepLink = (handleDeeplink = (BblConfigureV2InternalAction.HandleDeeplink) bblConfigureV2InternalAction2).f99369b) != null) {
            c0022b = new InterfaceC13033b.C0022b(deepLink, handleDeeplink.f99370c, handleDeeplink.f99371d);
        }
        return c0022b;
    }
}
