package l0;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Size.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll0/n;", "", "a", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f413402b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f413403c = 9205357640488583168L;

    /* renamed from: a, reason: collision with root package name */
    public final long f413404a;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/n$a;", "", "<init>", "()V", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ n(long j12) {
        this.f413404a = j12;
    }

    public static final /* synthetic */ n a(long j12) {
        return new n(j12);
    }

    public static final boolean b(long j12, long j13) {
        return j12 == j13;
    }

    public static final float c(long j12) {
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    public static final float d(long j12) {
        return Math.min(Float.intBitsToFloat((int) ((j12 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j12 & 2147483647L)));
    }

    public static final float e(long j12) {
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    @F3
    public static final boolean f(long j12) {
        long j13 = (~((((-9223372034707292160L) & j12) >>> 31) * (-1))) & j12;
        return (((j13 & 4294967295L) & (j13 >>> 32)) == 0) | (j12 == 9205357640488583168L);
    }

    @Y61.k
    public static String g(long j12) {
        if (j12 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(Float.intBitsToFloat((int) (j12 >> 32))) + ", " + c.a(Float.intBitsToFloat((int) (j12 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f413404a == ((n) obj).f413404a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f413404a);
    }

    @Y61.k
    public final String toString() {
        return g(this.f413404a);
    }
}
