package com.avito.android.safety.password_setting.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PasswordSettingReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<PasswordSettingInternalAction, PasswordSettingState> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final PasswordSettingState a(PasswordSettingInternalAction passwordSettingInternalAction, PasswordSettingState passwordSettingState) {
        PasswordSettingInternalAction passwordSettingInternalAction2 = passwordSettingInternalAction;
        PasswordSettingState passwordSettingState2 = passwordSettingState;
        boolean z12 = passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.ShowLoading;
        PasswordSettingState.ViewState viewState = passwordSettingState2.f257503b;
        if (z12) {
            viewState.getClass();
            return PasswordSettingState.a(passwordSettingState2, new PasswordSettingState.ViewState(null, true), null, null, 6);
        }
        if (passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.CredentialsSaveStarted) {
            PrintableText printableText = viewState.f257507c;
            viewState.getClass();
            return PasswordSettingState.a(passwordSettingState2, new PasswordSettingState.ViewState(printableText, true), null, null, 6);
        }
        if (passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.ShowError ? true : passwordSettingInternalAction2.equals(PasswordSettingInternalAction.Close.f257489b)) {
            viewState.getClass();
            return PasswordSettingState.a(passwordSettingState2, new PasswordSettingState.ViewState(null, false), null, null, 6);
        }
        if (passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.HighlightInput) {
            viewState.getClass();
            return PasswordSettingState.a(passwordSettingState2, new PasswordSettingState.ViewState(((PasswordSettingInternalAction.HighlightInput) passwordSettingInternalAction2).f257496b, false), null, null, 6);
        }
        if (passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.LoginLoaded) {
            return PasswordSettingState.a(passwordSettingState2, null, null, ((PasswordSettingInternalAction.LoginLoaded) passwordSettingInternalAction2).f257497b, 3);
        }
        if (passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.UpdatePassword) {
            boolean z13 = viewState.f257506b;
            viewState.getClass();
            return PasswordSettingState.a(passwordSettingState2, new PasswordSettingState.ViewState(null, z13), ((PasswordSettingInternalAction.UpdatePassword) passwordSettingInternalAction2).f257500b, null, 4);
        }
        if (passwordSettingInternalAction2.equals(PasswordSettingInternalAction.FocusInput.f257495b) ? true : passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.FinishContent ? true : passwordSettingInternalAction2.equals(PasswordSettingInternalAction.DisableAutofill.f257490b) ? true : passwordSettingInternalAction2 instanceof PasswordSettingInternalAction.Finish) {
            return passwordSettingState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
