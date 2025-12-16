package com.avito.android.payment.lib;

import android.view.View;
import com.avito.android.R;
import com.avito.android.payment.ModalState;
import com.avito.android.remote.model.SimpleUserDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PaymentMethodsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class h extends H implements Y41.l<ModalState, G0> {
    @Override // Y41.l
    public final G0 invoke(ModalState modalState) {
        ModalState modalState2 = modalState;
        C33021f c33021f = (C33021f) this.receiver;
        c33021f.getClass();
        if (modalState2 instanceof ModalState.NotifyingDialog) {
            ModalState.NotifyingDialog notifyingDialog = (ModalState.NotifyingDialog) modalState2;
            c33021f.a(notifyingDialog.f213976b, notifyingDialog.f213977c, notifyingDialog.f213978d);
        } else {
            boolean z12 = modalState2 instanceof ModalState.SBOLResultDialog;
            View view = c33021f.f214654a;
            if (z12) {
                c33021f.a(((ModalState.SBOLResultDialog) modalState2).f213980b ? new SimpleUserDialog(view.getContext().getString(R.string.payment_in_progress), view.getContext().getString(R.string.payment_will_be_processed), null) : new SimpleUserDialog(view.getContext().getString(R.string.payment_error), view.getContext().getString(R.string.try_later_or_choose_another_payment_method), null), true, null);
            } else if (modalState2 instanceof ModalState.SBOLAppLaunchError) {
                com.avito.android.component.snackbar.h.c(view, view.getContext().getString(R.string.sbol_app_doesnt_exist), 0, null, null, null, null, 238);
            } else if (modalState2 instanceof ModalState.b) {
                com.avito.android.component.snackbar.h.c(view, ((ModalState.b) modalState2).f213982b, 0, null, null, null, null, 238);
            } else {
                boolean z13 = modalState2 instanceof ModalState.a;
            }
        }
        return G0.f406611a;
    }
}
