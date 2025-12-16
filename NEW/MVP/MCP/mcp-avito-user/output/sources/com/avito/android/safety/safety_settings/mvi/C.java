package com.avito.android.safety.safety_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/C;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lvo0/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements com.avito.android.arch.mvi.t<SafetySettingsInternalAction, InterfaceC49362a> {
    @Inject
    public C() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49362a b(SafetySettingsInternalAction safetySettingsInternalAction) {
        SafetySettingsInternalAction safetySettingsInternalAction2 = safetySettingsInternalAction;
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.NavigateBack) {
            return new InterfaceC49362a.C12791a(((SafetySettingsInternalAction.NavigateBack) safetySettingsInternalAction2).f257712b);
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.NavigateToAuth) {
            return InterfaceC49362a.b.f440961a;
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowToastBarError) {
            return InterfaceC49362a.f.a(com.avito.android.printable_text.b.f(((SafetySettingsInternalAction.ShowToastBarError) safetySettingsInternalAction2).f257720b));
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.OpenDisableTfaConfirmScreen) {
            return InterfaceC49362a.d.f440962a;
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.SuccessEnableTfa) {
            return InterfaceC49362a.g.a(com.avito.android.printable_text.b.c(R.string.safety_settings_enable_tfa_success_message, new Serializable[0]));
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowSuccessDisableTfaToastBar) {
            return InterfaceC49362a.g.a(com.avito.android.printable_text.b.c(R.string.safety_settings_disable_tfa_success_message, new Serializable[0]));
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowSuccessChangedPassword) {
            return InterfaceC49362a.g.a(com.avito.android.printable_text.b.f(((SafetySettingsInternalAction.ShowSuccessChangedPassword) safetySettingsInternalAction2).f257718b));
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.AdditionalContentError) {
            return InterfaceC49362a.e.f440963a;
        }
        if (safetySettingsInternalAction2 instanceof SafetySettingsInternalAction.ShowSessionDeleteError) {
            return InterfaceC49362a.f.a(com.avito.android.printable_text.b.c(R.string.safety_settings_session_delete_error_message, new Serializable[0]));
        }
        return null;
    }
}
