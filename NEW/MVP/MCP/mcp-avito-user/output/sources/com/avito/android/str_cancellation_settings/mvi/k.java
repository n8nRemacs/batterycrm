package com.avito.android.str_cancellation_settings.mvi;

import Sy0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "LSy0/c;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<StrCancellationSettingsInternalAction, Sy0.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Sy0.c b(StrCancellationSettingsInternalAction strCancellationSettingsInternalAction) {
        Sy0.c c1041b;
        StrCancellationSettingsInternalAction strCancellationSettingsInternalAction2 = strCancellationSettingsInternalAction;
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.CloseScreen) {
            return c.b.a.f15233a;
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ApplyRequestLoadingError) {
            c1041b = new c.a.C1040a(((StrCancellationSettingsInternalAction.ApplyRequestLoadingError) strCancellationSettingsInternalAction2).f288441b.getMessage());
        } else {
            if (!(strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ApplyRequestSuccess)) {
                return null;
            }
            c1041b = new c.b.C1041b(((StrCancellationSettingsInternalAction.ApplyRequestSuccess) strCancellationSettingsInternalAction2).f288445b);
        }
        return c1041b;
    }
}
