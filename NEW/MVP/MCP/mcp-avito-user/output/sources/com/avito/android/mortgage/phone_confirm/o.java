package com.avito.android.mortgage.phone_confirm;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import com.avito.android.mortgage.phone_confirm.PhoneConfirmDialog;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_form.ApplicationClientFormFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: PhoneConfirmDialogHandlerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/o;", "Lcom/avito/android/mortgage/phone_confirm/m;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class o implements m {
    @Inject
    public o() {
    }

    @Override // com.avito.android.mortgage.phone_confirm.m
    public final void a(@Y61.k PhoneConfirmArguments phoneConfirmArguments, @Y61.k Fragment fragment) {
        PhoneConfirmDialog.f201524l0.getClass();
        com.avito.android.lib.util.g.b(PhoneConfirmDialog.a.a(phoneConfirmArguments), fragment.requireContext(), fragment.getParentFragmentManager(), "phone_confirm");
    }

    @Override // com.avito.android.mortgage.phone_confirm.m
    public final void b(@Y61.k ApplicationClientFormFragment applicationClientFormFragment, @Y61.k Y41.a aVar) {
        C22960s.b(applicationClientFormFragment, "PHONE_CONFIRM_DIALOG_KEY", new n(aVar));
    }
}
