package com.avito.android.loyalty.ui.criteria_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import javax.inject.Inject;
import kX.AbstractC42642c;
import kX.InterfaceC42640a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CriteriaGrayActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LkX/a;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "LkX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC42640a, CriteriaGrayInternalAction, AbstractC42642c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.criteria_gray.f f183614a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JW.a f183615b;

    @Inject
    public d(@Y61.k com.avito.android.loyalty.ui.criteria_gray.f fVar, @Y61.k JW.a aVar) {
        this.f183614a = fVar;
        this.f183615b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CriteriaGrayInternalAction> b(InterfaceC42640a interfaceC42640a, AbstractC42642c abstractC42642c) {
        C43210w c43210w;
        InterfaceC42640a interfaceC42640a2 = interfaceC42640a;
        AbstractC42642c abstractC42642c2 = abstractC42642c;
        if (interfaceC42640a2 instanceof InterfaceC42640a.c) {
            return new C43210w(new CriteriaGrayInternalAction.OpenDeeplink(((InterfaceC42640a.c) interfaceC42640a2).f406361a));
        }
        if (interfaceC42640a2 instanceof InterfaceC42640a.d) {
            return new C43210w(new CriteriaGrayInternalAction.OpenUrl(((InterfaceC42640a.d) interfaceC42640a2).f406362a));
        }
        if (interfaceC42640a2 instanceof InterfaceC42640a.b) {
            c43210w = new C43210w(CriteriaGrayInternalAction.NavigateBack.f183621b);
        } else {
            if (!interfaceC42640a2.equals(InterfaceC42640a.e.f406363a)) {
                if (interfaceC42640a2 instanceof InterfaceC42640a.C11618a) {
                    return C43175k.G(new c(interfaceC42640a2, this, abstractC42642c2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(abstractC42642c2 instanceof AbstractC42642c.d)) {
                return C43175k.G(new a(this.f183614a.a(), null, this.f183615b));
            }
            c43210w = new C43210w(CriteriaGrayInternalAction.NavigateToMain.f183622b);
        }
        return c43210w;
    }
}
