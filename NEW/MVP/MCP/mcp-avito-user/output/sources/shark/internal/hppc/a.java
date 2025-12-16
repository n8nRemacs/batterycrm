package shark.internal.hppc;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: HPPC.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/hppc/a;", "", "<init>", "()V", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f438525a = new a();

    public static int a(double d12, int i12) {
        long jCeil = (long) Math.ceil(i12 / d12);
        if (jCeil == i12) {
            jCeil++;
        }
        long j12 = jCeil - 1;
        long j13 = j12 | (j12 >> 1);
        long j14 = j13 | (j13 >> 2);
        long j15 = j14 | (j14 >> 4);
        long j16 = j15 | (j15 >> 8);
        long j17 = j16 | (j16 >> 16);
        long jMax = Math.max(4, (j17 | (j17 >> 32)) + 1);
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        u0 u0Var = u0.f406856a;
        throw new RuntimeException(String.format(Locale.ROOT, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Double.valueOf(d12)}, 2)));
    }

    public static int b(long j12) {
        long j13 = j12 * (-7046029254386353131L);
        return (int) (j13 ^ (j13 >>> 32));
    }

    public static int c(int i12, int i13, double d12) {
        if (i12 != 1073741824) {
            return i12 << 1;
        }
        u0 u0Var = u0.f406856a;
        throw new RuntimeException(String.format(Locale.ROOT, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Double.valueOf(d12)}, 2)));
    }
}
