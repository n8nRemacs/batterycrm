package com.avito.android.comfortable_deal.submitting.promo.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mq.InterfaceC44120b;

/* compiled from: PromoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "Lmq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<PromoInternalAction, InterfaceC44120b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44120b b(PromoInternalAction promoInternalAction) {
        PromoInternalAction promoInternalAction2 = promoInternalAction;
        if (promoInternalAction2.equals(PromoInternalAction.NavigateBack.f123183b)) {
            return InterfaceC44120b.a.f414769a;
        }
        if (promoInternalAction2 instanceof PromoInternalAction.Error) {
            return new InterfaceC44120b.d(((PromoInternalAction.Error) promoInternalAction2).f123181b);
        }
        if (promoInternalAction2.equals(PromoInternalAction.ScrollToTop.f123185b)) {
            return InterfaceC44120b.c.f414771a;
        }
        if (promoInternalAction2.equals(PromoInternalAction.Success.f123186b)) {
            return InterfaceC44120b.C11845b.f414770a;
        }
        return null;
    }
}
