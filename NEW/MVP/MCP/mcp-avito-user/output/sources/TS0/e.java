package ts0;

import Y41.r;
import Y61.l;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CounterUp.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts0/e;", "", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f439611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f439612b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final r<Long, Long, Long, Long, G0> f439613c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.gig_timer_widget.a f439614d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public d f439615e;

    /* renamed from: f, reason: collision with root package name */
    public final long f439616f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(long j12, long j13, @l r<? super Long, ? super Long, ? super Long, ? super Long, G0> rVar) {
        this.f439611a = j12;
        this.f439612b = j13;
        this.f439613c = rVar;
        this.f439616f = new Date().getTime();
    }

    public static final void a(e eVar, long j12, com.avito.android.gig_timer_widget.a aVar) {
        long j13 = (31536000000L - j12) + (eVar.f439616f - eVar.f439611a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j13);
        long millis = j13 - TimeUnit.DAYS.toMillis(days);
        long hours = timeUnit.toHours(millis);
        long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
        long minutes = timeUnit.toMinutes(millis2);
        long seconds = timeUnit.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(minutes));
        r<Long, Long, Long, Long, G0> rVar = eVar.f439613c;
        if (rVar != null) {
            rVar.invoke(Long.valueOf(days), Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds));
        }
        aVar.setHours(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1)));
        aVar.setMinutes(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1)));
        aVar.setSeconds(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)));
    }

    public /* synthetic */ e(long j12, long j13, r rVar, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? 1000L : j13, (i12 & 4) != 0 ? null : rVar);
    }
}
