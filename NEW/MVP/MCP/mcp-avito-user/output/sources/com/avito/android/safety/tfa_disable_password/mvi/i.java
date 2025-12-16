package com.avito.android.safety.tfa_disable_password.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.component.toast.f;
import com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import wo0.InterfaceC49660b;

/* compiled from: TfaDisablePasswordOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lwo0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<TfaDisablePasswordInternalAction, InterfaceC49660b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49660b b(TfaDisablePasswordInternalAction tfaDisablePasswordInternalAction) {
        TfaDisablePasswordInternalAction tfaDisablePasswordInternalAction2 = tfaDisablePasswordInternalAction;
        if (tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.Close.f258119b)) {
            return new InterfaceC49660b.a(false);
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.Finish) {
            return new InterfaceC49660b.a(true);
        }
        if (tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.ForgotPassword.f258120b)) {
            return InterfaceC49660b.C12831b.f441786a;
        }
        if (tfaDisablePasswordInternalAction2.equals(TfaDisablePasswordInternalAction.ShowKeyboard.f258124b)) {
            return InterfaceC49660b.c.f441787a;
        }
        if (tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.HighlightInput) {
            return InterfaceC49660b.c.f441787a;
        }
        if (!(tfaDisablePasswordInternalAction2 instanceof TfaDisablePasswordInternalAction.ShowError)) {
            return null;
        }
        f.c.f125255c.getClass();
        return new InterfaceC49660b.d(((TfaDisablePasswordInternalAction.ShowError) tfaDisablePasswordInternalAction2).f258122b, f.c.a.b());
    }
}
