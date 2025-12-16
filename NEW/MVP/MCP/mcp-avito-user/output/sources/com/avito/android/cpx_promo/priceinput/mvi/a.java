package com.avito.android.cpx_promo.priceinput.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.priceinput.mvi.entity.CpxPromoPriceInputInternalAction;
import is.C42098c;
import is.InterfaceC42096a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxPromoPriceInputActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lis/a;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "Lis/c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42096a, CpxPromoPriceInputInternalAction, C42098c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CpxPromoPriceInputContent f127323a;

    @Inject
    public a(@Y61.k CpxPromoPriceInputContent cpxPromoPriceInputContent) {
        this.f127323a = cpxPromoPriceInputContent;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CpxPromoPriceInputInternalAction> b(InterfaceC42096a interfaceC42096a, C42098c c42098c) {
        Object save;
        String str;
        Long lZ02;
        CpxPromoPriceInputInternalAction.UpdateHint updateHint;
        Long lZ03;
        InterfaceC42096a interfaceC42096a2 = interfaceC42096a;
        boolean z12 = interfaceC42096a2 instanceof InterfaceC42096a.C11539a;
        C42098c.b bVar = c42098c.f405322d;
        CpxPromoPriceInputContent cpxPromoPriceInputContent = this.f127323a;
        long jLongValue = 0;
        if (!z12) {
            if (!(interfaceC42096a2 instanceof InterfaceC42096a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar == null || bVar.f405328d) {
                CpxPromoInputSource cpxPromoInputSource = cpxPromoPriceInputContent.f127252b;
                if (bVar != null && (str = bVar.f405325a) != null && (lZ02 = C43066x.z0(str)) != null) {
                    jLongValue = lZ02.longValue() * 100;
                }
                save = new CpxPromoPriceInputInternalAction.Save(cpxPromoInputSource, jLongValue);
            } else {
                save = new CpxPromoPriceInputInternalAction.UpdateErrorState(true);
            }
            return new C43210w(save);
        }
        CpxPromoPriceInputInternalAction.InputChange inputChange = new CpxPromoPriceInputInternalAction.InputChange(((InterfaceC42096a.C11539a) interfaceC42096a2).f405314a);
        String str2 = bVar != null ? bVar.f405325a : null;
        if (str2 != null && (lZ03 = C43066x.z0(str2)) != null) {
            jLongValue = lZ03.longValue() * 100;
        }
        CpxPromoPriceInputContent.Input input = cpxPromoPriceInputContent.f127254d;
        CpxPromoPriceInputContent.Input.Constraints constraints = input.f127266f;
        Long l12 = constraints != null ? constraints.f127267b : null;
        CpxPromoPriceInputContent.Input.Constraints constraints2 = input.f127266f;
        if (l12 == null || jLongValue >= constraints.f127267b.longValue()) {
            updateHint = ((constraints2 != null ? constraints2.f127268c : null) == null || jLongValue <= constraints2.f127268c.longValue()) ? new CpxPromoPriceInputInternalAction.UpdateHint(input.f127263c, true) : new CpxPromoPriceInputInternalAction.UpdateHint(constraints2.f127270e, false);
        } else {
            updateHint = new CpxPromoPriceInputInternalAction.UpdateHint(constraints2.f127269d, false);
        }
        return new C43207v(new CpxPromoPriceInputInternalAction[]{inputChange, updateHint, new CpxPromoPriceInputInternalAction.UpdateErrorState(false)});
    }
}
