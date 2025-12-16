package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import VY.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BottomSheetInputOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "LVY/b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<BottomSheetInputInternalAction, VY.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final VY.b b(BottomSheetInputInternalAction bottomSheetInputInternalAction) {
        BottomSheetInputInternalAction bottomSheetInputInternalAction2 = bottomSheetInputInternalAction;
        if (bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.ShowError) {
            return new b.C1184b(((BottomSheetInputInternalAction.ShowError) bottomSheetInputInternalAction2).f195485b);
        }
        if (bottomSheetInputInternalAction2.equals(BottomSheetInputInternalAction.CloseScreen.f195483b)) {
            return b.a.f17189a;
        }
        if (bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.LoadingStateChanged ? true : bottomSheetInputInternalAction2 instanceof BottomSheetInputInternalAction.ButtonStateChanged) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
