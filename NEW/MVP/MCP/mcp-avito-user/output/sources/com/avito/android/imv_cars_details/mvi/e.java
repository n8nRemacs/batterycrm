package com.avito.android.imv_cars_details.mvi;

import WM.a;
import WM.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvCarsDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LWM/a;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "LWM/c;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.a<WM.a, ImvCarsDetailsInternalAction, WM.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_cars_details.domain.a f169987a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_cars_details.domain.d f169988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_cars_details.presentation.f f169989c;

    @Inject
    public e(@Y61.k com.avito.android.imv_cars_details.domain.a aVar, @Y61.k com.avito.android.imv_cars_details.domain.d dVar, @Y61.k com.avito.android.imv_cars_details.presentation.f fVar) {
        this.f169987a = aVar;
        this.f169988b = dVar;
        this.f169989c = fVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImvCarsDetailsInternalAction> b(WM.a aVar, WM.c cVar) {
        List<com.avito.conveyor_item.a> list;
        WM.a aVar2 = aVar;
        WM.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            return new C43210w(new ImvCarsDetailsInternalAction.OpenLink(bVar.f17875a, bVar.f17876b));
        }
        if (aVar2 instanceof a.c) {
            c.b bVar2 = cVar2.f17887d;
            return (bVar2 == null || (list = bVar2.f17889b) == null) ? C43175k.w() : new C43152f0(C43175k.G(new b(this, list, aVar2, null)), new c(this, null));
        }
        if (aVar2 instanceof a.d) {
            ((a.d) aVar2).getClass();
            return new C43210w(new ImvCarsDetailsInternalAction.ScrollToItem());
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new ImvCarsDetailsInternalAction.ShowToast(((a.e) aVar2).f17879a));
        }
        if (aVar2 instanceof a.C1266a) {
            return new C43152f0(C43175k.G(new a(((a.C1266a) aVar2).f17874a, this, null)), new d(this, cVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
