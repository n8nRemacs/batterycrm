package com.avito.android.lib.design.ticking_button;

import Y61.k;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: TickingTimeFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/ticking_button/a;", "Lcom/avito/android/lib/design/ticking_button/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements d {
    @Override // com.avito.android.lib.design.ticking_button.d
    @k
    public final String a(long j12) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j12);
        if (hours <= 0) {
            long minutes = timeUnit.toMinutes(j12);
            long seconds = j12 - TimeUnit.MINUTES.toSeconds(minutes);
            u0 u0Var = u0.f406856a;
            return String.format("%01d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
        }
        long minutes2 = timeUnit.toMinutes(j12);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes3 = minutes2 - timeUnit2.toMinutes(hours);
        long seconds2 = (j12 - timeUnit2.toSeconds(hours)) - TimeUnit.MINUTES.toSeconds(minutes3);
        u0 u0Var2 = u0.f406856a;
        return String.format("%01d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes3), Long.valueOf(seconds2)}, 3));
    }
}
