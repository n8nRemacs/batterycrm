package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import VY.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BottomSheetInputReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "LVY/c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<BottomSheetInputInternalAction, VY.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final VY.c a(BottomSheetInputInternalAction bottomSheetInputInternalAction, VY.c cVar) {
        BottomSheetInputInternalAction bottomSheetInputInternalAction2 = bottomSheetInputInternalAction;
        VY.c cVar2 = cVar;
        if (bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.ButtonStateChanged) {
            boolean z12 = ((BottomSheetInputInternalAction.ButtonStateChanged) bottomSheetInputInternalAction2).f195482b;
            boolean z13 = cVar2.f17194c;
            cVar2.getClass();
            return new VY.c(z12, z13);
        }
        if (!(bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.LoadingStateChanged)) {
            if (bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.ShowError ? true : bottomSheetInputInternalAction2.equals(BottomSheetInputInternalAction.CloseScreen.f195483b)) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z14 = ((BottomSheetInputInternalAction.LoadingStateChanged) bottomSheetInputInternalAction2).f195484b;
        boolean z15 = cVar2.f17193b;
        c.a aVar = VY.c.f17191d;
        cVar2.getClass();
        return new VY.c(z15, z14);
    }
}
