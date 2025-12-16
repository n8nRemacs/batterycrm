package com.avito.android.auto_contacts.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoContactsPackagesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<AutoContactsPackagesInternalAction, AutoContactsPackagesUiState> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AutoContactsPackagesUiState a(AutoContactsPackagesInternalAction autoContactsPackagesInternalAction, AutoContactsPackagesUiState autoContactsPackagesUiState) {
        AutoContactsPackagesInternalAction autoContactsPackagesInternalAction2 = autoContactsPackagesInternalAction;
        return autoContactsPackagesInternalAction2 instanceof AutoContactsPackagesInternalAction.ContentLoadingStarted ? AutoContactsPackagesUiState.Loading.f94956b : autoContactsPackagesInternalAction2 instanceof AutoContactsPackagesInternalAction.ContentLoaded ? new AutoContactsPackagesUiState.Success(((AutoContactsPackagesInternalAction.ContentLoaded) autoContactsPackagesInternalAction2).f94951b) : autoContactsPackagesInternalAction2 instanceof AutoContactsPackagesInternalAction.ErrorOccurred ? new AutoContactsPackagesUiState.Error(((AutoContactsPackagesInternalAction.ErrorOccurred) autoContactsPackagesInternalAction2).f94952b) : autoContactsPackagesUiState;
    }
}
