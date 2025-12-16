package com.avito.android.cpx_promo.v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ks.InterfaceC43492a;

/* compiled from: CpxPromoV2OneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/u;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lks/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u implements com.avito.android.arch.mvi.t<CpxPromoV2InternalAction, InterfaceC43492a> {
    @Inject
    public u() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43492a b(CpxPromoV2InternalAction cpxPromoV2InternalAction) {
        CpxPromoV2InternalAction cpxPromoV2InternalAction2 = cpxPromoV2InternalAction;
        if (cpxPromoV2InternalAction2 instanceof CpxPromoV2InternalAction.OpenDeeplink) {
            CpxPromoV2InternalAction.OpenDeeplink openDeeplink = (CpxPromoV2InternalAction.OpenDeeplink) cpxPromoV2InternalAction2;
            return new InterfaceC43492a.b(openDeeplink.f127587b, openDeeplink.f127588c);
        }
        if (cpxPromoV2InternalAction2 instanceof CpxPromoV2InternalAction.Close) {
            return InterfaceC43492a.C11761a.f413252a;
        }
        if (cpxPromoV2InternalAction2 instanceof CpxPromoV2InternalAction.ShowErrorToast) {
            return new InterfaceC43492a.c(((CpxPromoV2InternalAction.ShowErrorToast) cpxPromoV2InternalAction2).f127592b);
        }
        return null;
    }
}
