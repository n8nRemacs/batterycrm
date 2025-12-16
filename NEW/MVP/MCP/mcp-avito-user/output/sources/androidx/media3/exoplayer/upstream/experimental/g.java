package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.o;
import androidx.media3.exoplayer.upstream.p;
import androidx.media3.exoplayer.upstream.q;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PercentileTimeToFirstByteEstimator.java */
@J
/* loaded from: classes.dex */
public final class g implements q {

    /* renamed from: c, reason: collision with root package name */
    public final D f50098c = InterfaceC23115f.f47901a;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<o, Long> f50096a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final p f50097b = new p(10);

    /* compiled from: PercentileTimeToFirstByteEstimator.java */
    public static class a<K, V> extends LinkedHashMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f50099b = 10;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f50099b;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void a(o oVar) {
        if (this.f50096a.remove(oVar) == null) {
            return;
        }
        this.f50098c.getClass();
        this.f50097b.a(M.F(SystemClock.elapsedRealtime()) - r5.longValue(), 1);
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void b(o oVar) {
        LinkedHashMap<o, Long> linkedHashMap = this.f50096a;
        linkedHashMap.remove(oVar);
        this.f50098c.getClass();
        linkedHashMap.put(oVar, Long.valueOf(M.F(SystemClock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.q
    public final void reset() {
        p pVar = this.f50097b;
        pVar.f50159b.clear();
        pVar.f50161d = -1;
        pVar.f50162e = 0;
        pVar.f50163f = 0;
    }
}
