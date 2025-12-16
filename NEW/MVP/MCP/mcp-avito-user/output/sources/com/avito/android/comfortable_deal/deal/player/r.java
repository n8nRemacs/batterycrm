package com.avito.android.comfortable_deal.deal.player;

import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: CallTimeFormatUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r {
    @Y61.k
    public static final String a(long j12) {
        Duration durationOfMillis = Duration.ofMillis(j12);
        long minutes = durationOfMillis.toMinutes();
        long seconds = durationOfMillis.minusMinutes(minutes).getSeconds();
        u0 u0Var = u0.f406856a;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
    }

    @Y61.k
    public static final String b(long j12) {
        Duration durationOfSeconds = Duration.ofSeconds(j12);
        long minutes = durationOfSeconds.toMinutes();
        long seconds = durationOfSeconds.minusMinutes(minutes).getSeconds();
        u0 u0Var = u0.f406856a;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
    }
}
