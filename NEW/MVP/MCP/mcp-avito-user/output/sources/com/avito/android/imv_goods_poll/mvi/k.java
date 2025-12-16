package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import fN.InterfaceC40320b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsPollOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "LfN/b;", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<ImvGoodsPollInternalAction, InterfaceC40320b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40320b b(ImvGoodsPollInternalAction imvGoodsPollInternalAction) {
        ImvGoodsPollInternalAction imvGoodsPollInternalAction2 = imvGoodsPollInternalAction;
        if (imvGoodsPollInternalAction2 instanceof ImvGoodsPollInternalAction.ShowError) {
            return InterfaceC40320b.C11147b.f395861a;
        }
        if (imvGoodsPollInternalAction2 instanceof ImvGoodsPollInternalAction.ShowLoaded) {
            return InterfaceC40320b.a.f395860a;
        }
        return null;
    }
}
