package androidx.compose.ui.unit;

import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.A;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextUnit.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/y;", "", "a", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42874b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final A[] f42875c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f42876d;

    /* renamed from: a, reason: collision with root package name */
    public final long f42877a;

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/y$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        A.a aVar = A.f42832b;
        aVar.getClass();
        A a12 = A.a(0L);
        aVar.getClass();
        A a13 = A.a(A.f42833c);
        aVar.getClass();
        f42875c = new A[]{a12, a13, A.a(A.f42834d)};
        f42876d = z.f(0L, Float.NaN);
    }

    private /* synthetic */ y(long j12) {
        this.f42877a = j12;
    }

    public static final /* synthetic */ y a(long j12) {
        return new y(j12);
    }

    public static final boolean b(long j12, long j13) {
        return j12 == j13;
    }

    public static final long c(long j12) {
        return f42875c[(int) ((j12 & 1095216660480L) >>> 32)].f42835a;
    }

    public static final float d(long j12) {
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    public static final boolean e(long j12) {
        return (j12 & 1095216660480L) == 8589934592L;
    }

    @Y61.k
    public static String f(long j12) {
        long jC2 = c(j12);
        A.a aVar = A.f42832b;
        aVar.getClass();
        if (A.b(jC2, 0L)) {
            return "Unspecified";
        }
        aVar.getClass();
        if (A.b(jC2, A.f42833c)) {
            return d(j12) + ".sp";
        }
        aVar.getClass();
        if (!A.b(jC2, A.f42834d)) {
            return "Invalid";
        }
        return d(j12) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f42877a == ((y) obj).f42877a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42877a);
    }

    @Y61.k
    public final String toString() {
        return f(this.f42877a);
    }
}
