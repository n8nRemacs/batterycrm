package shark.internal;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/s0;", "K", "V", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class s0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a f438596a;

    /* renamed from: b, reason: collision with root package name */
    public int f438597b;

    /* renamed from: c, reason: collision with root package name */
    public int f438598c;

    /* renamed from: d, reason: collision with root package name */
    public final int f438599d;

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"shark/internal/s0$a", "Ljava/util/LinkedHashMap;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class a extends LinkedHashMap<K, V> {
        public a(int i12) {
            super(i12, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(@Y61.l Map.Entry<K, V> entry) {
            return super.size() > s0.this.f438599d;
        }
    }

    public s0(int i12) {
        this.f438599d = i12;
        if (i12 <= 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "maxSize=", " <= 0").toString());
        }
        this.f438596a = new a(i12);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f438597b;
        int i13 = this.f438598c + i12;
        int i14 = i13 != 0 ? (i12 * 100) / i13 : 0;
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Arrays.copyOf(new Object[]{Integer.valueOf(this.f438599d), Integer.valueOf(this.f438597b), Integer.valueOf(this.f438598c), Integer.valueOf(i14)}, 4));
    }
}
