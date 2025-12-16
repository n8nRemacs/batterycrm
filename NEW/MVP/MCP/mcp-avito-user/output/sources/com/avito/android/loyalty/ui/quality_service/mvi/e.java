package com.avito.android.loyalty.ui.quality_service.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pX.AbstractC47027c;
import pX.InterfaceC47025a;

/* compiled from: QualityServiceActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LpX/a;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "LpX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC47025a, QualityServiceInternalAction, AbstractC47027c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.quality_service.k f183993a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f183994b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MW.a f183995c;

    @Inject
    public e(@Y61.k com.avito.android.loyalty.ui.quality_service.k kVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k MW.a aVar2) {
        this.f183993a = kVar;
        this.f183994b = aVar;
        this.f183995c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<QualityServiceInternalAction> b(InterfaceC47025a interfaceC47025a, AbstractC47027c abstractC47027c) {
        InterfaceC47025a interfaceC47025a2 = interfaceC47025a;
        AbstractC47027c abstractC47027c2 = abstractC47027c;
        if (interfaceC47025a2 instanceof InterfaceC47025a.C12276a) {
            return C43175k.G(new c(this, interfaceC47025a2, null));
        }
        boolean zEquals = interfaceC47025a2.equals(InterfaceC47025a.b.f428574a);
        com.avito.android.loyalty.ui.quality_service.k kVar = this.f183993a;
        if (zEquals) {
            return abstractC47027c2 instanceof AbstractC47027c.b ? new C43210w(QualityServiceInternalAction.Forbidden.f183998b) : C43175k.G(new a(kVar.b(), null, this.f183995c));
        }
        if (interfaceC47025a2 instanceof InterfaceC47025a.c) {
            return C43175k.G(new d(interfaceC47025a2, this, abstractC47027c2, null));
        }
        if (interfaceC47025a2 instanceof InterfaceC47025a.e) {
            return new C43210w(new QualityServiceInternalAction.OpenPopup(((InterfaceC47025a.e) interfaceC47025a2).f428577a));
        }
        if (interfaceC47025a2 instanceof InterfaceC47025a.d) {
            return kVar.a(((InterfaceC47025a.d) interfaceC47025a2).f428576a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
