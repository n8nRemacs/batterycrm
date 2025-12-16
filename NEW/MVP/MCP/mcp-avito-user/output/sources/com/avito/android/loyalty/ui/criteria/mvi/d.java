package com.avito.android.loyalty.ui.criteria.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.loyalty.ui.criteria.mvi.entity.CriteriaInternalAction;
import iX.AbstractC41357c;
import iX.InterfaceC41355a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CriteriaActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LiX/a;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "LiX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC41355a, CriteriaInternalAction, AbstractC41357c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.criteria.c f183535a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JW.a f183536b;

    @Inject
    public d(@Y61.k com.avito.android.loyalty.ui.criteria.c cVar, @Y61.k JW.a aVar) {
        this.f183535a = cVar;
        this.f183536b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CriteriaInternalAction> b(InterfaceC41355a interfaceC41355a, AbstractC41357c abstractC41357c) {
        C43210w c43210w;
        InterfaceC41355a interfaceC41355a2 = interfaceC41355a;
        AbstractC41357c abstractC41357c2 = abstractC41357c;
        if (interfaceC41355a2 instanceof InterfaceC41355a.c) {
            return new C43210w(new CriteriaInternalAction.OpenDeeplink(((InterfaceC41355a.c) interfaceC41355a2).f398534a));
        }
        if (interfaceC41355a2 instanceof InterfaceC41355a.d) {
            return new C43210w(new CriteriaInternalAction.OpenUrl(((InterfaceC41355a.d) interfaceC41355a2).f398535a));
        }
        if (interfaceC41355a2 instanceof InterfaceC41355a.b) {
            c43210w = new C43210w(CriteriaInternalAction.NavigateBack.f183542b);
        } else {
            if (!interfaceC41355a2.equals(InterfaceC41355a.e.f398536a)) {
                if (interfaceC41355a2 instanceof InterfaceC41355a.C11379a) {
                    return C43175k.G(new c(interfaceC41355a2, this, abstractC41357c2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(abstractC41357c2 instanceof AbstractC41357c.C11381c)) {
                return C43175k.G(new a(this.f183535a.a(), null, this.f183536b));
            }
            c43210w = new C43210w(CriteriaInternalAction.NavigateToMain.f183543b);
        }
        return c43210w;
    }
}
