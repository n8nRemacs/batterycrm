package l0;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Offset.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll0/g;", "", "a", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f413384b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f413385c = 9187343241974906880L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f413386d = 9205357640488583168L;

    /* renamed from: a, reason: collision with root package name */
    public final long f413387a;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/g$a;", "", "<init>", "()V", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a() {
            a aVar = g.f413384b;
        }

        public a() {
        }
    }

    private /* synthetic */ g(long j12) {
        this.f413387a = j12;
    }

    public static final /* synthetic */ g a(long j12) {
        return new g(j12);
    }

    public static long b(int i12, long j12, float f12) {
        float fIntBitsToFloat = (i12 & 1) != 0 ? Float.intBitsToFloat((int) (j12 >> 32)) : 0.0f;
        if ((i12 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
    }

    @F3
    public static final long c(long j12, float f12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / f12;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / f12;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final boolean d(long j12, long j13) {
        return j12 == j13;
    }

    @F3
    public static final float e(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    @F3
    public static final float f(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public static final float g(long j12) {
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    public static final float h(long j12) {
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    @F3
    public static final long i(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    @F3
    public static final long j(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @F3
    public static final long k(long j12, float f12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) * f12;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) * f12;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    @Y61.k
    public static String l(long j12) {
        if ((9223372034707292159L & j12) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(Float.intBitsToFloat((int) (j12 >> 32))) + ", " + c.a(Float.intBitsToFloat((int) (j12 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f413387a == ((g) obj).f413387a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f413387a);
    }

    @Y61.k
    public final String toString() {
        return l(this.f413387a);
    }
}
