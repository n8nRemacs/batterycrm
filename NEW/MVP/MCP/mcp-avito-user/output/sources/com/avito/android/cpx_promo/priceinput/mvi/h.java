package com.avito.android.cpx_promo.priceinput.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpx_promo.priceinput.mvi.entity.CpxPromoPriceInputInternalAction;
import is.InterfaceC42097b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxPromoPriceInputOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "Lis/b;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<CpxPromoPriceInputInternalAction, InterfaceC42097b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42097b b(CpxPromoPriceInputInternalAction cpxPromoPriceInputInternalAction) {
        CpxPromoPriceInputInternalAction cpxPromoPriceInputInternalAction2 = cpxPromoPriceInputInternalAction;
        if (!(cpxPromoPriceInputInternalAction2 instanceof CpxPromoPriceInputInternalAction.Save)) {
            return null;
        }
        CpxPromoPriceInputInternalAction.Save save = (CpxPromoPriceInputInternalAction.Save) cpxPromoPriceInputInternalAction2;
        return new InterfaceC42097b.a(save.f127335b, save.f127336c);
    }
}
