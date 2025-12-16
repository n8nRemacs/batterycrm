package com.avito.android.safety.tfa_disable_password.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import wo0.C49661c;

/* compiled from: TfaDisablePasswordReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lwo0/c;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<TfaDisablePasswordInternalAction, C49661c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49661c a(TfaDisablePasswordInternalAction tfaDisablePasswordInternalAction, C49661c c49661c) {
        TfaDisablePasswordInternalAction tfaDisablePasswordInternalAction2 = tfaDisablePasswordInternalAction;
        C49661c c49661c2 = c49661c;
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.HighlightInput) {
            return C49661c.a(c49661c2, null, false, ((TfaDisablePasswordInternalAction.HighlightInput) tfaDisablePasswordInternalAction2).f258121b, false, 3);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.ShowError) {
            return C49661c.a(c49661c2, null, false, null, false, 7);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.ShowLoading) {
            return C49661c.a(c49661c2, null, false, null, true, 3);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.TogglePasswordHidden) {
            return C49661c.a(c49661c2, null, ((TfaDisablePasswordInternalAction.TogglePasswordHidden) tfaDisablePasswordInternalAction2).f258125b, null, false, 13);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.UpdatePassword) {
            return C49661c.a(c49661c2, ((TfaDisablePasswordInternalAction.UpdatePassword) tfaDisablePasswordInternalAction2).f258126b, false, null, false, 10);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.Finish ? true : tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.Close.f258119b)) {
            return C49661c.a(c49661c2, null, false, null, false, 7);
        }
        if (tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.ShowKeyboard.f258124b) ? true : tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.ForgotPassword.f258120b)) {
            return c49661c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
