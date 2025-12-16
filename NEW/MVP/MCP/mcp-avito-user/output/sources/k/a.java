package K;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ContainerHelpers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final int[] f9204a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @k
    public static final long[] f9205b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @k
    public static final Object[] f9206c = new Object[0];

    public static final int a(int i12, int i13, @k int[] iArr) {
        int i14 = i12 - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            int i17 = iArr[i16];
            if (i17 < i13) {
                i15 = i16 + 1;
            } else {
                if (i17 <= i13) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return ~i15;
    }

    public static final int b(int i12, long j12, @k long[] jArr) {
        int i13 = i12 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            long j13 = jArr[i15];
            if (j13 < j12) {
                i14 = i15 + 1;
            } else {
                if (j13 <= j12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }
}
