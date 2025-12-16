package l0;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CornerRadius.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll0/a;", "", "a", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43522a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C11768a f413378b = new C11768a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f413379a;

    /* compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/a$a;", "", "<init>", "()V", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.a$a, reason: collision with other inner class name */
    public static final class C11768a {
        public /* synthetic */ C11768a(C42822w c42822w) {
            this();
        }

        public C11768a() {
        }
    }

    public static final boolean a(long j12, long j13) {
        return j12 == j13;
    }

    @Y61.k
    public static String b(long j12) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.intBitsToFloat(i13)) {
            return "CornerRadius.circular(" + c.a(Float.intBitsToFloat(i12)) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(Float.intBitsToFloat(i12)) + ", " + c.a(Float.intBitsToFloat(i13)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43522a) {
            return this.f413379a == ((C43522a) obj).f413379a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f413379a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f413379a);
    }
}
