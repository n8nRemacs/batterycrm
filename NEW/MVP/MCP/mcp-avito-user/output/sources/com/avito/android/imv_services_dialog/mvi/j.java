package com.avito.android.imv_services_dialog.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.imv_services_dialog.mvi.entity.ImvServicesDialogInternalAction;
import jN.C42288c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvServicesDialogReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "LjN/c;", "<init>", "()V", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<ImvServicesDialogInternalAction, C42288c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42288c a(ImvServicesDialogInternalAction imvServicesDialogInternalAction, C42288c c42288c) {
        ImvServicesDialogInternalAction imvServicesDialogInternalAction2 = imvServicesDialogInternalAction;
        C42288c c42288c2 = c42288c;
        if (imvServicesDialogInternalAction2 instanceof ImvServicesDialogInternalAction.Content) {
            ImvServicesDialogInternalAction.Content content = (ImvServicesDialogInternalAction.Content) imvServicesDialogInternalAction2;
            return C42288c.a(c42288c2, content.f170800b, content.f170801c, 12);
        }
        if (!(imvServicesDialogInternalAction2 instanceof ImvServicesDialogInternalAction.ChangeFeedbackContainerVisibility)) {
            return c42288c2;
        }
        ((ImvServicesDialogInternalAction.ChangeFeedbackContainerVisibility) imvServicesDialogInternalAction2).getClass();
        return C42288c.a(c42288c2, null, null, 3);
    }
}
