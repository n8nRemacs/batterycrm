package com.avito.android.str_cancellation_settings.domain;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StrCancellationSettingsValueValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/domain/q;", "Lcom/avito/android/str_cancellation_settings/domain/p;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {
    @Inject
    public q() {
    }

    @Override // com.avito.android.str_cancellation_settings.domain.p
    public final boolean a(@Y61.l String str, boolean z12, boolean z13, @Y61.l Integer num, @Y61.l Integer num2) {
        Integer numY0 = str != null ? C43066x.y0(str) : null;
        if (!z12 || !z13) {
            return true;
        }
        if (numY0 != null) {
            return (num == null || num.intValue() <= numY0.intValue()) && (num2 == null || num2.intValue() >= numY0.intValue());
        }
        return false;
    }
}
