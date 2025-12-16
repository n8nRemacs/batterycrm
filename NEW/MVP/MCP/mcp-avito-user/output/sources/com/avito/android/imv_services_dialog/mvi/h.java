package com.avito.android.imv_services_dialog.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.imv_services_dialog.mvi.entity.ImvServicesDialogInternalAction;
import jN.InterfaceC42287b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvServicesDialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_services_dialog/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "LjN/b;", "<init>", "()V", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<ImvServicesDialogInternalAction, InterfaceC42287b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42287b b(ImvServicesDialogInternalAction imvServicesDialogInternalAction) {
        ImvServicesDialogInternalAction imvServicesDialogInternalAction2 = imvServicesDialogInternalAction;
        if (imvServicesDialogInternalAction2 instanceof ImvServicesDialogInternalAction.HandleDeeplink) {
            return new InterfaceC42287b.a();
        }
        if (imvServicesDialogInternalAction2 instanceof ImvServicesDialogInternalAction.ShowToastMessage) {
            return new InterfaceC42287b.C11563b(((ImvServicesDialogInternalAction.ShowToastMessage) imvServicesDialogInternalAction2).f170802b);
        }
        return null;
    }
}
