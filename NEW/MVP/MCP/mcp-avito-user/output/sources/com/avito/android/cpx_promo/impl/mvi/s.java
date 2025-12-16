package com.avito.android.cpx_promo.impl.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import es.InterfaceC40150a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxPromoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Les/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements com.avito.android.arch.mvi.t<CpxPromoInternalAction, InterfaceC40150a> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40150a b(CpxPromoInternalAction cpxPromoInternalAction) {
        CpxPromoInternalAction cpxPromoInternalAction2 = cpxPromoInternalAction;
        if (cpxPromoInternalAction2 instanceof CpxPromoInternalAction.OpenDeeplink) {
            CpxPromoInternalAction.OpenDeeplink openDeeplink = (CpxPromoInternalAction.OpenDeeplink) cpxPromoInternalAction2;
            return new InterfaceC40150a.b(openDeeplink.f127077b, openDeeplink.f127078c);
        }
        if (cpxPromoInternalAction2 instanceof CpxPromoInternalAction.Close) {
            return InterfaceC40150a.C11108a.f395402a;
        }
        if (cpxPromoInternalAction2 instanceof CpxPromoInternalAction.ShowErrorToast) {
            return new InterfaceC40150a.c(((CpxPromoInternalAction.ShowErrorToast) cpxPromoInternalAction2).f127082b);
        }
        return null;
    }
}
