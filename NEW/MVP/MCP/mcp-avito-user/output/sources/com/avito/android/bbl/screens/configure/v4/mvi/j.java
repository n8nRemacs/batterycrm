package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.InterfaceC13147b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BblConfigureV4OneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "LBh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<BblConfigureV4InternalAction, InterfaceC13147b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13147b b(BblConfigureV4InternalAction bblConfigureV4InternalAction) {
        BblConfigureV4InternalAction bblConfigureV4InternalAction2 = bblConfigureV4InternalAction;
        if (!(bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.HandleDeeplink)) {
            if (bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.Back) {
                return InterfaceC13147b.a.f1595a;
            }
            return null;
        }
        BblConfigureV4InternalAction.HandleDeeplink handleDeeplink = (BblConfigureV4InternalAction.HandleDeeplink) bblConfigureV4InternalAction2;
        DeepLink deepLink = handleDeeplink.f99496b;
        if (deepLink != null) {
            return new InterfaceC13147b.C0067b(handleDeeplink.f99497c, deepLink);
        }
        return null;
    }
}
