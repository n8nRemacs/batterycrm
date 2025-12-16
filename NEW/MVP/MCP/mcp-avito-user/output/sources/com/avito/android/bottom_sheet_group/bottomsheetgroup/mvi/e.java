package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi;

import bk.InterfaceC25669a;
import com.avito.android.arch.mvi.a;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupInternalAction;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BottomSheetGroupActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lbk/a;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC25669a, BottomSheetGroupInternalAction, BottomSheetGroupState> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BottomSheetGroupInternalAction> b(InterfaceC25669a interfaceC25669a, BottomSheetGroupState bottomSheetGroupState) {
        InterfaceC25669a interfaceC25669a2 = interfaceC25669a;
        BottomSheetGroupState bottomSheetGroupState2 = bottomSheetGroupState;
        if (interfaceC25669a2 instanceof InterfaceC25669a.C2013a) {
            return C43175k.G(new a(2, null));
        }
        if (interfaceC25669a2 instanceof InterfaceC25669a.d) {
            return C43175k.G(new b(bottomSheetGroupState2, null));
        }
        if (interfaceC25669a2 instanceof InterfaceC25669a.c) {
            return C43175k.G(new c(interfaceC25669a2, null));
        }
        if (interfaceC25669a2 instanceof InterfaceC25669a.b) {
            return C43175k.G(new d(interfaceC25669a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
