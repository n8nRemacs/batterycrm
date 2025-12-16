package com.avito.android.installments.form.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsFormReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/installments/form/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<InstallmentsFormInternalAction, InstallmentsFormState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final InstallmentsFormState a(InstallmentsFormInternalAction installmentsFormInternalAction, InstallmentsFormState installmentsFormState) {
        InstallmentsFormState installmentsFormState2;
        InstallmentsFormInternalAction installmentsFormInternalAction2 = installmentsFormInternalAction;
        InstallmentsFormState installmentsFormState3 = installmentsFormState;
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.LoadUrl) {
            return InstallmentsFormState.a(installmentsFormState3, null, ((InstallmentsFormInternalAction.LoadUrl) installmentsFormInternalAction2).f172755b, 1);
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowContent) {
            return InstallmentsFormState.a(installmentsFormState3, InstallmentsFormState.Status.f172772c, null, 6);
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowLoading) {
            return InstallmentsFormState.a(installmentsFormState3, InstallmentsFormState.Status.f172771b, null, 6);
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowRequestFormUrlError) {
            installmentsFormState2 = new InstallmentsFormState(InstallmentsFormState.Status.f172773d, null, ((InstallmentsFormInternalAction.ShowRequestFormUrlError) installmentsFormInternalAction2).f172762b);
        } else {
            if (!(installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowUrlWebLoadingError)) {
                return installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowUnknownError ? new InstallmentsFormState(InstallmentsFormState.Status.f172773d, null, null) : installmentsFormState3;
            }
            installmentsFormState2 = new InstallmentsFormState(InstallmentsFormState.Status.f172773d, ((InstallmentsFormInternalAction.ShowUrlWebLoadingError) installmentsFormInternalAction2).f172764b, null);
        }
        return installmentsFormState2;
    }
}
