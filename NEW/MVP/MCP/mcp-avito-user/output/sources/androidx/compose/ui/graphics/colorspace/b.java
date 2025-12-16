package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ColorModel.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b;", "", "a", "packedValue", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39380b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f39381c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f39382d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f39383e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f39384f;

    /* renamed from: a, reason: collision with root package name */
    public final long f39385a;

    /* compiled from: ColorModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        long j12 = 3;
        long j13 = j12 << 32;
        f39381c = (0 & 4294967295L) | j13;
        f39382d = (1 & 4294967295L) | j13;
        f39383e = j13 | (2 & 4294967295L);
        f39384f = (j12 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j12, long j13) {
        return j12 == j13;
    }

    @Y61.k
    public static String b(long j12) {
        return a(j12, f39381c) ? "Rgb" : a(j12, f39382d) ? "Xyz" : a(j12, f39383e) ? "Lab" : a(j12, f39384f) ? "Cmyk" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f39385a == ((b) obj).f39385a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39385a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f39385a);
    }
}
