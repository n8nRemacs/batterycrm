package com.avito.android.mortgage.selected_appeal.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import k10.InterfaceC42472b;
import kotlin.Metadata;

/* compiled from: SelectedAppealOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lk10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<SelectedAppealInternalAction, InterfaceC42472b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42472b b(SelectedAppealInternalAction selectedAppealInternalAction) {
        SelectedAppealInternalAction selectedAppealInternalAction2 = selectedAppealInternalAction;
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.Dismiss) {
            return InterfaceC42472b.a.f405989a;
        }
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.UnselectAppealLoadingCompleted) {
            return InterfaceC42472b.C11601b.f405990a;
        }
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.UnselectAppealLoadingFailed) {
            return new InterfaceC42472b.c(com.avito.android.printable_text.b.c(R.string.mortgage_unknown_error_description, new Serializable[0]));
        }
        return null;
    }
}
