package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.InterfaceC25541b;
import com.avito.android.arch.mvi.t;
import com.avito.android.error.z;
import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TopUpFormOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "LbP0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements t<TopUpFormInternalAction, InterfaceC25541b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25541b b(TopUpFormInternalAction topUpFormInternalAction) {
        TopUpFormInternalAction topUpFormInternalAction2 = topUpFormInternalAction;
        if (topUpFormInternalAction2 instanceof TopUpFormInternalAction.SubmitTopUp) {
            return new InterfaceC25541b.C2000b(((TopUpFormInternalAction.SubmitTopUp) topUpFormInternalAction2).f328422b);
        }
        if (topUpFormInternalAction2 instanceof TopUpFormInternalAction.Error) {
            return new InterfaceC25541b.a(z.l(((TopUpFormInternalAction.Error) topUpFormInternalAction2).f328419b));
        }
        return null;
    }
}
