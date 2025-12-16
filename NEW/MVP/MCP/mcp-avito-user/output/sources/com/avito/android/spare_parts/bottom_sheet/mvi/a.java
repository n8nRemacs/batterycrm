package com.avito.android.spare_parts.bottom_sheet.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.spare_parts.bottom_sheet.mvi.entity.SparePartsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tx0.C48737c;
import tx0.InterfaceC48735a;

/* compiled from: SparePartsBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ltx0/a;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "Ltx0/c;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC48735a, SparePartsBottomSheetInternalAction, C48737c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.spare_parts.bottom_sheet.f f284793a;

    @Inject
    public a(@Y61.k com.avito.android.spare_parts.bottom_sheet.f fVar) {
        this.f284793a = fVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SparePartsBottomSheetInternalAction> b(InterfaceC48735a interfaceC48735a, C48737c c48737c) {
        InterfaceC48735a interfaceC48735a2 = interfaceC48735a;
        C48737c c48737c2 = c48737c;
        if (interfaceC48735a2 instanceof InterfaceC48735a.C12694a) {
            SparePartsGroup sparePartsGroup = ((InterfaceC48735a.C12694a) interfaceC48735a2).f439670a;
            this.f284793a.a(sparePartsGroup.getText());
            return new C43210w(new SparePartsBottomSheetInternalAction.AddGroup(sparePartsGroup));
        }
        if (interfaceC48735a2.equals(InterfaceC48735a.b.f439671a)) {
            return new C43210w(c48737c2.f439675b.size() > 1 ? SparePartsBottomSheetInternalAction.PopGroupsStack.f284807b : SparePartsBottomSheetInternalAction.Close.f284805b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
