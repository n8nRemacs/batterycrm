package com.avito.android.safety.password_change.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.safety.password_change.PasswordChangeParams;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ro0.InterfaceC47697b;

/* compiled from: PasswordChangeOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/u;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements com.avito.android.arch.mvi.t<PasswordChangeInternalAction, InterfaceC47697b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PasswordChangeParams f257409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f257410c;

    @Inject
    public u(@Y61.k PasswordChangeParams passwordChangeParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f257409b = passwordChangeParams;
        this.f257410c = aVar;
    }

    public final InterfaceC47697b.a a(String str, String str2) {
        PasswordChangeParams passwordChangeParams = this.f257409b;
        if (!com.avito.android.safety.password_change.t.a(passwordChangeParams)) {
            return new InterfaceC47697b.a(true, str);
        }
        b.a.a(this.f257410c, new SessionsInfoLink(new SessionsInfoLink.SessionsInfoParams(SessionsInfoLink.SessionsInfoMode.f133965c, passwordChangeParams.f257232b == PasswordChangeParams.LogicFlow.f257238b, passwordChangeParams.f257233c, str2, passwordChangeParams.f257235e)), null, null, 6);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47697b b(PasswordChangeInternalAction passwordChangeInternalAction) {
        InterfaceC47697b.c cVar;
        PasswordChangeInternalAction passwordChangeInternalAction2 = passwordChangeInternalAction;
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.FocusInput) {
            return new InterfaceC47697b.c(((PasswordChangeInternalAction.FocusInput) passwordChangeInternalAction2).f257323b);
        }
        String str = null;
        Object[] objArr = 0;
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.HighlightInputs) {
            PasswordChangeInternalAction.HighlightInputs highlightInputs = (PasswordChangeInternalAction.HighlightInputs) passwordChangeInternalAction2;
            if (highlightInputs.f257324b != null) {
                cVar = new InterfaceC47697b.c(InputType.f257311b);
            } else if (highlightInputs.f257325c != null) {
                cVar = new InterfaceC47697b.c(InputType.f257312c);
            }
            return cVar;
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowDialog) {
            return new InterfaceC47697b.h();
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowError) {
            f.c.f125255c.getClass();
            return new InterfaceC47697b.i(((PasswordChangeInternalAction.ShowError) passwordChangeInternalAction2).f257333b, f.c.a.b());
        }
        if (passwordChangeInternalAction2.equals(PasswordChangeInternalAction.Close.f257315b)) {
            return new InterfaceC47697b.a(false, str, 2, objArr == true ? 1 : 0);
        }
        if (passwordChangeInternalAction2.equals(PasswordChangeInternalAction.NavigateToAuth.f257328b)) {
            return InterfaceC47697b.e.f430182a;
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.CredentialsLoaded) {
            return new InterfaceC47697b.g(((PasswordChangeInternalAction.CredentialsLoaded) passwordChangeInternalAction2).f257317c);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.FinishContent) {
            PasswordChangeInternalAction.FinishContent finishContent = (PasswordChangeInternalAction.FinishContent) passwordChangeInternalAction2;
            return a(finishContent.f257321b, finishContent.f257322c);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.Finish) {
            PasswordChangeInternalAction.Finish finish = (PasswordChangeInternalAction.Finish) passwordChangeInternalAction2;
            return a(finish.f257319b, finish.f257320c);
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.OpenPasswordRecovery) {
            return new InterfaceC47697b.f(((PasswordChangeInternalAction.OpenPasswordRecovery) passwordChangeInternalAction2).f257329b);
        }
        if (passwordChangeInternalAction2.equals(PasswordChangeInternalAction.NavigateHome.f257327b)) {
            return InterfaceC47697b.d.f430181a;
        }
        if (passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ToggleOldPasswordHidden) {
            return new InterfaceC47697b.j(((PasswordChangeInternalAction.ToggleOldPasswordHidden) passwordChangeInternalAction2).f257335b);
        }
        if (passwordChangeInternalAction2.equals(PasswordChangeInternalAction.DisableAutofill.f257318b)) {
            return InterfaceC47697b.C12394b.f430179a;
        }
        if (!(passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.ShowLoading ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.SaveFocusedInput ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.UpdateNewPassword ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.LoginLoaded ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.SetSessionsFlowMode ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.CredentialsSaveStarted ? true : passwordChangeInternalAction2 instanceof PasswordChangeInternalAction.UpdateOldPassword)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
