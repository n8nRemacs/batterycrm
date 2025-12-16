package com.avito.android.safety.password_change.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PasswordChangeReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/w;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements com.avito.android.arch.mvi.u<PasswordChangeInternalAction, PasswordChangeState> {
    @Inject
    public w() {
    }

    public static PasswordChangeState b(PasswordChangeState passwordChangeState, boolean z12) {
        return PasswordChangeState.a(passwordChangeState, PasswordChangeState.ViewState.a(passwordChangeState.f257340b, z12, null, null, false, false, 24), null, null, null, null, false, 62);
    }

    @Override // com.avito.android.arch.mvi.u
    public final PasswordChangeState a(PasswordChangeInternalAction passwordChangeInternalAction, PasswordChangeState passwordChangeState) {
        PasswordChangeInternalAction passwordChangeInternalAction2 = passwordChangeInternalAction;
        PasswordChangeState passwordChangeState2 = passwordChangeState;
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.UpdateOldPassword) {
            return PasswordChangeState.a(passwordChangeState2, PasswordChangeState.ViewState.a(passwordChangeState2.f257340b, false, null, null, false, false, 29), ((PasswordChangeInternalAction.UpdateOldPassword) passwordChangeInternalAction2).f257337b, null, null, null, false, 60);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.UpdateNewPassword) {
            return PasswordChangeState.a(passwordChangeState2, PasswordChangeState.ViewState.a(passwordChangeState2.f257340b, false, null, null, false, false, 27), null, ((PasswordChangeInternalAction.UpdateNewPassword) passwordChangeInternalAction2).f257336b, null, null, false, 58);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.SaveFocusedInput) {
            return PasswordChangeState.a(passwordChangeState2, null, null, null, ((PasswordChangeInternalAction.SaveFocusedInput) passwordChangeInternalAction2).f257330b, null, false, 55);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.CredentialsSaveStarted ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowLoading) {
            return b(passwordChangeState2, true);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowError ? true : passwordChangeInternalAction2.equals(PasswordChangeInternalAction.Close.f257315b) ? true : passwordChangeInternalAction2.equals(PasswordChangeInternalAction.NavigateToAuth.f257328b) ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowDialog) {
            return b(passwordChangeState2, false);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.HighlightInputs) {
            PasswordChangeInternalAction.HighlightInputs highlightInputs = (PasswordChangeInternalAction.HighlightInputs) passwordChangeInternalAction2;
            return PasswordChangeState.a(passwordChangeState2, PasswordChangeState.ViewState.a(passwordChangeState2.f257340b, false, highlightInputs.f257324b, highlightInputs.f257325c, false, false, 24), null, null, null, null, false, 62);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.CredentialsLoaded) {
            PasswordChangeInternalAction.CredentialsLoaded credentialsLoaded = (PasswordChangeInternalAction.CredentialsLoaded) passwordChangeInternalAction2;
            return PasswordChangeState.a(passwordChangeState2, null, credentialsLoaded.f257317c, null, InputType.f257312c, credentialsLoaded.f257316b, false, 37);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.LoginLoaded) {
            return PasswordChangeState.a(passwordChangeState2, null, null, null, null, ((PasswordChangeInternalAction.LoginLoaded) passwordChangeInternalAction2).f257326b, false, 47);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.SetSessionsFlowMode) {
            PasswordChangeInternalAction.SetSessionsFlowMode setSessionsFlowMode = (PasswordChangeInternalAction.SetSessionsFlowMode) passwordChangeInternalAction2;
            return PasswordChangeState.a(passwordChangeState2, PasswordChangeState.ViewState.a(passwordChangeState2.f257340b, false, null, null, setSessionsFlowMode.f257331b, setSessionsFlowMode.f257332c, 7), null, null, null, null, false, 62);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.FocusInput) {
            return PasswordChangeState.a(passwordChangeState2, null, null, null, ((PasswordChangeInternalAction.FocusInput) passwordChangeInternalAction2).f257323b, null, false, 55);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ToggleOldPasswordHidden) {
            return PasswordChangeState.a(passwordChangeState2, null, null, null, null, null, ((PasswordChangeInternalAction.ToggleOldPasswordHidden) passwordChangeInternalAction2).f257335b, 31);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.Finish ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.FinishContent ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.OpenPasswordRecovery ? true : passwordChangeInternalAction2.equals(PasswordChangeInternalAction.DisableAutofill.f257318b) ? true : passwordChangeInternalAction2.equals(PasswordChangeInternalAction.NavigateHome.f257327b)) {
            return passwordChangeState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
