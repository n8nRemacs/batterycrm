package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InlineDensity.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "", "a", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C1626a f31612b = new C1626a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f31613c = a(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f31614a;

    /* compiled from: InlineDensity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.a$a, reason: collision with other inner class name */
    public static final class C1626a {
        public /* synthetic */ C1626a(C42822w c42822w) {
            this();
        }

        public C1626a() {
        }
    }

    public static long a(float f12, float f13) {
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Y61.k
    public static String b(long j12) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j12 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j12 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f31614a == ((a) obj).f31614a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31614a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f31614a);
    }
}
