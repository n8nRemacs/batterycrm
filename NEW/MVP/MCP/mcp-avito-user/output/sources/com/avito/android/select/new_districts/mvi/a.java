package com.avito.android.select.new_districts.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.District;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictInternalAction;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictState;
import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import eq0.InterfaceC40146a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FilterSelectDistrictActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Leq0/a;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40146a, SelectDistrictInternalAction, SelectDistrictState> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectDistrictInternalAction> b(InterfaceC40146a interfaceC40146a, SelectDistrictState selectDistrictState) {
        District district;
        C43210w c43210w;
        InterfaceC40146a interfaceC40146a2 = interfaceC40146a;
        SelectDistrictState selectDistrictState2 = selectDistrictState;
        if (interfaceC40146a2 instanceof InterfaceC40146a.e) {
            InterfaceC40146a.e eVar = (InterfaceC40146a.e) interfaceC40146a2;
            return new C43210w(new SelectDistrictInternalAction.DistrictSelectionChange(eVar.f395385a, eVar.f395387c, eVar.f395386b));
        }
        if (interfaceC40146a2 instanceof InterfaceC40146a.g) {
            InterfaceC40146a.g gVar = (InterfaceC40146a.g) interfaceC40146a2;
            return new C43210w(new SelectDistrictInternalAction.RegionSelectionChange(gVar.f395389a, gVar.f395391c, gVar.f395390b));
        }
        if (interfaceC40146a2 instanceof InterfaceC40146a.h) {
            return new C43210w(new SelectDistrictInternalAction.RegionExpandChange(((InterfaceC40146a.h) interfaceC40146a2).f395392a));
        }
        if (interfaceC40146a2.equals(InterfaceC40146a.C11105a.f395380a)) {
            c43210w = new C43210w(SelectDistrictInternalAction.GoBack.f265810b);
        } else {
            if (!interfaceC40146a2.equals(InterfaceC40146a.c.f395383a)) {
                if (!interfaceC40146a2.equals(InterfaceC40146a.d.f395384a)) {
                    if (interfaceC40146a2 instanceof InterfaceC40146a.f) {
                        return new C43210w(new SelectDistrictInternalAction.SearchUpdate(((InterfaceC40146a.f) interfaceC40146a2).f395388a));
                    }
                    if (!(interfaceC40146a2 instanceof InterfaceC40146a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC40146a.b bVar = (InterfaceC40146a.b) interfaceC40146a2;
                    return new C43210w(new SelectDistrictInternalAction.DistrictSelectionChange(bVar.f395381a, bVar.f395382b, false));
                }
                ArrayList arrayList = new ArrayList();
                List<Boolean> list = selectDistrictState2.f265820d;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (list.get(i12).booleanValue()) {
                        UiItem uiItem = selectDistrictState2.f265818b.get(i12);
                        UiItem.DistrictItem districtItem = uiItem instanceof UiItem.DistrictItem ? (UiItem.DistrictItem) uiItem : null;
                        if (districtItem != null && (district = districtItem.f265844g) != null) {
                            arrayList.add(district);
                        }
                    }
                }
                return new C43210w(new SelectDistrictInternalAction.Confirm(arrayList));
            }
            c43210w = new C43210w(SelectDistrictInternalAction.ClearSelection.f265805b);
        }
        return c43210w;
    }
}
