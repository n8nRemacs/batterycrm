package ts0;

import Y41.r;
import Y61.k;
import Y61.l;
import android.widget.LinearLayout;
import com.avito.android.serp_core.timer.CounterFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Counter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts0/a;", "", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ts0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48712a {

    /* renamed from: a, reason: collision with root package name */
    public final long f439602a;

    /* renamed from: b, reason: collision with root package name */
    public final long f439603b;

    /* renamed from: c, reason: collision with root package name */
    public final long f439604c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CounterFormat f439605d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final r<Long, Long, Long, Long, G0> f439606e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public LinearLayout f439607f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public b f439608g;

    /* compiled from: Counter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12688a {
        static {
            int[] iArr = new int[CounterFormat.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CounterFormat counterFormat = CounterFormat.f273988b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48712a(long j12, long j13, long j14, @k CounterFormat counterFormat, @l r<? super Long, ? super Long, ? super Long, ? super Long, G0> rVar) {
        this.f439602a = j12;
        this.f439603b = j13;
        this.f439604c = j14;
        this.f439605d = counterFormat;
        this.f439606e = rVar;
    }

    public static final void a(C48712a c48712a, long j12, g gVar) {
        long j13 = j12 + c48712a.f439604c;
        int iOrdinal = c48712a.f439605d.ordinal();
        r<Long, Long, Long, Long, G0> rVar = c48712a.f439606e;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j13);
            long millis = j13 - TimeUnit.HOURS.toMillis(hours);
            long minutes = timeUnit.toMinutes(millis);
            long seconds = timeUnit.toSeconds(millis - TimeUnit.MINUTES.toMillis(minutes));
            if (rVar != null) {
                rVar.invoke(0L, Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds));
            }
            gVar.setHours(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1)));
            gVar.setMinutes(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1)));
            gVar.setSeconds(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)));
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long days = timeUnit2.toDays(j13);
        long millis2 = j13 - TimeUnit.DAYS.toMillis(days);
        long hours2 = timeUnit2.toHours(millis2);
        long millis3 = millis2 - TimeUnit.HOURS.toMillis(hours2);
        long minutes2 = timeUnit2.toMinutes(millis3);
        long seconds2 = timeUnit2.toSeconds(millis3 - TimeUnit.MINUTES.toMillis(minutes2));
        if (rVar != null) {
            rVar.invoke(Long.valueOf(days), Long.valueOf(hours2), Long.valueOf(minutes2), Long.valueOf(seconds2));
        }
        gVar.setHours(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours2)}, 1)));
        gVar.setMinutes(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes2)}, 1)));
        gVar.setSeconds(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds2)}, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@k g gVar) {
        this.f439607f = (LinearLayout) gVar;
        if (this.f439608g == null) {
            b bVar = new b(this.f439602a - new Date().getTime(), this, this.f439603b);
            bVar.start();
            this.f439608g = bVar;
        }
    }

    public /* synthetic */ C48712a(long j12, long j13, long j14, CounterFormat counterFormat, r rVar, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? 1000L : j13, (i12 & 4) != 0 ? 0L : j14, (i12 & 8) != 0 ? CounterFormat.f273989c : counterFormat, (i12 & 16) != 0 ? null : rVar);
    }
}
