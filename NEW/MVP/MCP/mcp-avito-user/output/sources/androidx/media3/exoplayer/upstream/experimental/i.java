package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.m;
import java.util.ArrayDeque;

/* compiled from: SlidingWeightedAverageBandwidthStatistic.java */
@J
/* loaded from: classes.dex */
public class i implements androidx.media3.exoplayer.upstream.experimental.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f50100a;

    /* renamed from: b, reason: collision with root package name */
    public final m f50101b;

    /* renamed from: c, reason: collision with root package name */
    public final D f50102c;

    /* renamed from: d, reason: collision with root package name */
    public double f50103d;

    /* renamed from: e, reason: collision with root package name */
    public double f50104e;

    /* compiled from: SlidingWeightedAverageBandwidthStatistic.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f50105a;

        /* renamed from: b, reason: collision with root package name */
        public final double f50106b;

        public a(long j12, double d12) {
            this.f50105a = j12;
            this.f50106b = d12;
        }
    }

    /* compiled from: SlidingWeightedAverageBandwidthStatistic.java */
    public interface b {
    }

    public i() {
        m mVar = new m(6);
        D d12 = InterfaceC23115f.f47901a;
        this.f50100a = new ArrayDeque<>();
        this.f50101b = mVar;
        this.f50102c = d12;
    }

    public final void a(long j12, long j13) {
        while (true) {
            ArrayDeque<a> arrayDeque = this.f50100a;
            this.f50101b.getClass();
            if (arrayDeque.size() < 10) {
                double dSqrt = Math.sqrt(j12);
                long j14 = (j12 * 8000000) / j13;
                this.f50102c.getClass();
                SystemClock.elapsedRealtime();
                arrayDeque.add(new a(j14, dSqrt));
                this.f50103d = (j14 * dSqrt) + this.f50103d;
                this.f50104e += dSqrt;
                return;
            }
            a aVarRemove = arrayDeque.remove();
            double d12 = this.f50103d;
            double d13 = aVarRemove.f50105a;
            double d14 = aVarRemove.f50106b;
            this.f50103d = d12 - (d13 * d14);
            this.f50104e -= d14;
        }
    }
}
