package com.avito.android.auto_select.confirmation_dialog.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetInternalAction;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetState;
import ef.InterfaceC40098a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoSelectConfirmationBottomSheetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lef/a;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40098a, AutoSelectConfirmationBottomSheetInternalAction, AutoSelectConfirmationBottomSheetState> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutoSelectConfirmationBottomSheetInternalAction> b(InterfaceC40098a interfaceC40098a, AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState) {
        InterfaceC40098a interfaceC40098a2 = interfaceC40098a;
        if (interfaceC40098a2 instanceof InterfaceC40098a.C11099a) {
            return new C43210w(new AutoSelectConfirmationBottomSheetInternalAction.DeeplinkClicked(((InterfaceC40098a.C11099a) interfaceC40098a2).f395307a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
