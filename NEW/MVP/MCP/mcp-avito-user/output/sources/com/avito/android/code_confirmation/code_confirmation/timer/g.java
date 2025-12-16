package com.avito.android.code_confirmation.code_confirmation.timer;

import com.avito.android.date_time_formatter.b;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TimerFormatter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/timer/g;", "Lcom/avito/android/util/t1;", "", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements InterfaceC35945t1<Long> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Long l12) {
        Long l13 = l12;
        long jLongValue = l13 != null ? l13.longValue() : 0L;
        com.avito.android.date_time_formatter.b.f132563a.getClass();
        return b.a.a(jLongValue);
    }
}
