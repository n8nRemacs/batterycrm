package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.arch.mvi.a;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rG0.AbstractC47541a;

/* compiled from: PointInfoActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/g;", "Lcom/avito/android/arch/mvi/a;", "LrG0/a$c;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<AbstractC47541a.c, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.domain.k f305350a;

    @Inject
    public g(@Y61.k com.avito.android.universal_map.map_mvi.domain.k kVar) {
        this.f305350a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UniversalMapInternalAction> b(@Y61.k AbstractC47541a.c cVar, @Y61.k com.avito.android.universal_map.map.mvi.entity.e eVar) {
        boolean zEquals = cVar.equals(AbstractC47541a.c.C12364c.f429694a);
        com.avito.android.universal_map.map.mvi.entity.c cVar2 = eVar.f305596c;
        if (!zEquals) {
            if (cVar.equals(AbstractC47541a.c.C12363a.f429692a)) {
                return cVar2.f305575d instanceof c.a.C9381a ? new C43210w(UniversalMapInternalAction.PointInfoInternalAction.CollapsePointInfoBottomSheet.f305515b) : C43175k.w();
            }
            if (cVar.equals(AbstractC47541a.c.b.f429693a)) {
                return new C43210w(UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet.f305516b);
            }
            throw new NoWhenBranchMatchedException();
        }
        Marker.Pin pin = cVar2.f305572a;
        if (pin != null) {
            InterfaceC43160i<UniversalMapInternalAction> interfaceC43160iA = this.f305350a.a(pin.f304925e, cVar2.f305573b);
            if (interfaceC43160iA != null) {
                return interfaceC43160iA;
            }
        }
        return C43175k.w();
    }
}
