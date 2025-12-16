package com.avito.android.cpx_promo.priceinput.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.priceinput.mvi.entity.CpxPromoPriceInputInternalAction;
import com.avito.android.cpx_promo.v2.compose.a;
import is.C42098c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxPromoPriceInputReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "Lis/c;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<CpxPromoPriceInputInternalAction, C42098c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42098c a(CpxPromoPriceInputInternalAction cpxPromoPriceInputInternalAction, C42098c c42098c) {
        CpxPromoPriceInputInternalAction cpxPromoPriceInputInternalAction2 = cpxPromoPriceInputInternalAction;
        C42098c c42098c2 = c42098c;
        C42098c.b bVarA = null;
        if (cpxPromoPriceInputInternalAction2 instanceof CpxPromoPriceInputInternalAction.Content) {
            CpxPromoPriceInputContent cpxPromoPriceInputContent = ((CpxPromoPriceInputInternalAction.Content) cpxPromoPriceInputInternalAction2).f127333b;
            String str = cpxPromoPriceInputContent.f127253c;
            CpxPromoPriceInputContent.Input input = cpxPromoPriceInputContent.f127254d;
            String str2 = input.f127262b;
            Long l12 = input.f127264d;
            C42098c.b bVar = new C42098c.b(l12 != null ? Long.valueOf(l12.longValue() / 100).toString() : null, input.f127263c, true, input.f127265e, false);
            String str3 = cpxPromoPriceInputContent.f127257g;
            return new C42098c(str, str2, bVar, cpxPromoPriceInputContent.f127255e, str3 != null ? new a.C3789a(str3) : null);
        }
        boolean z12 = cpxPromoPriceInputInternalAction2 instanceof CpxPromoPriceInputInternalAction.InputChange;
        C42098c.b bVar2 = c42098c2.f405322d;
        if (z12) {
            return C42098c.a(c42098c2, bVar2 != null ? C42098c.b.a(bVar2, ((CpxPromoPriceInputInternalAction.InputChange) cpxPromoPriceInputInternalAction2).f127334b, null, false, false, 30) : null);
        }
        if (!(cpxPromoPriceInputInternalAction2 instanceof CpxPromoPriceInputInternalAction.UpdateHint)) {
            if (cpxPromoPriceInputInternalAction2 instanceof CpxPromoPriceInputInternalAction.UpdateErrorState) {
                return C42098c.a(c42098c2, bVar2 != null ? C42098c.b.a(bVar2, null, null, false, ((CpxPromoPriceInputInternalAction.UpdateErrorState) cpxPromoPriceInputInternalAction2).f127337b, 15) : null);
            }
            return c42098c2;
        }
        if (bVar2 != null) {
            CpxPromoPriceInputInternalAction.UpdateHint updateHint = (CpxPromoPriceInputInternalAction.UpdateHint) cpxPromoPriceInputInternalAction2;
            bVarA = C42098c.b.a(bVar2, null, updateHint.f127338b, updateHint.f127339c, false, 21);
        }
        return C42098c.a(c42098c2, bVarA);
    }
}
