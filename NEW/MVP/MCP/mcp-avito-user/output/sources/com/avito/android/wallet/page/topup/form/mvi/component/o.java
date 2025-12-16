package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.C25543d;
import com.avito.android.arch.mvi.u;
import com.avito.android.payment.ParametersTree;
import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TopUpFormReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "LbP0/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements u<TopUpFormInternalAction, C25543d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f328414b;

    @Inject
    public o(@Y61.k q qVar) {
        this.f328414b = qVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25543d a(TopUpFormInternalAction topUpFormInternalAction, C25543d c25543d) {
        TopUpFormInternalAction topUpFormInternalAction2 = topUpFormInternalAction;
        C25543d c25543d2 = c25543d;
        boolean z12 = topUpFormInternalAction2 instanceof TopUpFormInternalAction.Content;
        q qVar = this.f328414b;
        if (!z12) {
            return topUpFormInternalAction2 instanceof TopUpFormInternalAction.Loading ? q.a(qVar, C25543d.a(c25543d2, C25543d.b.C2001b.f57067a, null, null, 6), false, false, 6) : topUpFormInternalAction2 instanceof TopUpFormInternalAction.RebindContent ? q.a(qVar, c25543d2, ((TopUpFormInternalAction.RebindContent) topUpFormInternalAction2).f328421b, false, 4) : c25543d2;
        }
        TopUpFormInternalAction.Content content = (TopUpFormInternalAction.Content) topUpFormInternalAction2;
        TopUpForm topUpForm = content.f328417b;
        return q.a(qVar, C25543d.a(c25543d2, new C25543d.b.a(topUpForm), new ParametersTree(topUpForm.c()), null, 4), false, content.f328418c, 2);
    }
}
