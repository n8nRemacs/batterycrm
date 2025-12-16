package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TransformOrigin.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/r1;", "", "a", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39755b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f39756c = s1.a(0.5f, 0.5f);

    /* renamed from: a, reason: collision with root package name */
    public final long f39757a;

    /* compiled from: TransformOrigin.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/r1$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ r1(long j12) {
        this.f39757a = j12;
    }

    public static final /* synthetic */ r1 a(long j12) {
        return new r1(j12);
    }

    public static final boolean b(long j12, long j13) {
        return j12 == j13;
    }

    public static final float c(long j12) {
        return Float.intBitsToFloat((int) (j12 >> 32));
    }

    public static final float d(long j12) {
        return Float.intBitsToFloat((int) (j12 & 4294967295L));
    }

    public static String e(long j12) {
        return "TransformOrigin(packedValue=" + j12 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            return this.f39757a == ((r1) obj).f39757a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39757a);
    }

    public final String toString() {
        return e(this.f39757a);
    }
}
