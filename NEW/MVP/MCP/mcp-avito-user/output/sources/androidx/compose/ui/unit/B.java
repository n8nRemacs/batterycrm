package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Velocity.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/B;", "", "a", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42836b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f42837a;

    /* compiled from: Velocity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/B$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ B(long j12) {
        this.f42837a = j12;
    }

    public static final /* synthetic */ B a(long j12) {
        return new B(j12);
    }

    public static long b(float f12, float f13, int i12, long j12) {
        if ((i12 & 1) != 0) {
            f12 = Float.intBitsToFloat((int) (j12 >> 32));
        }
        if ((i12 & 2) != 0) {
            f13 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public static final float c(long j12) {
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    public static final float d(long j12) {
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    @F3
    public static final long e(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    @F3
    public static final long f(long j12, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @F3
    public static final long g(long j12, float f12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) * f12;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) * f12;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    @Y61.k
    public static String h(long j12) {
        return "(" + c(j12) + ", " + d(j12) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f42837a == ((B) obj).f42837a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42837a);
    }

    @Y61.k
    public final String toString() {
        return h(this.f42837a);
    }
}
