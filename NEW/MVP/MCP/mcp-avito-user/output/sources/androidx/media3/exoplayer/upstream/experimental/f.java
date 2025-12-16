package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.o;
import androidx.media3.exoplayer.upstream.q;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ExponentialWeightedAverageTimeToFirstByteEstimator.java */
@J
/* loaded from: classes.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<o, Long> f50091a;

    /* renamed from: b, reason: collision with root package name */
    public final double f50092b;

    /* renamed from: c, reason: collision with root package name */
    public final D f50093c;

    /* renamed from: d, reason: collision with root package name */
    public long f50094d;

    /* compiled from: ExponentialWeightedAverageTimeToFirstByteEstimator.java */
    public static class a<K, V> extends LinkedHashMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f50095b = 10;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f50095b;
        }
    }

    public f() {
        D d12 = InterfaceC23115f.f47901a;
        this.f50092b = 0.85d;
        this.f50093c = d12;
        this.f50091a = new a();
        this.f50094d = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void a(o oVar) {
        Long lRemove = this.f50091a.remove(oVar);
        if (lRemove == null) {
            return;
        }
        this.f50093c.getClass();
        long jF2 = M.F(SystemClock.elapsedRealtime()) - lRemove.longValue();
        long j12 = this.f50094d;
        if (j12 == -9223372036854775807L) {
            this.f50094d = jF2;
            return;
        }
        double d12 = this.f50092b;
        this.f50094d = (long) (((1.0d - d12) * jF2) + (j12 * d12));
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void b(o oVar) {
        LinkedHashMap<o, Long> linkedHashMap = this.f50091a;
        linkedHashMap.remove(oVar);
        this.f50093c.getClass();
        linkedHashMap.put(oVar, Long.valueOf(M.F(SystemClock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void reset() {
        this.f50094d = -9223372036854775807L;
    }
}
