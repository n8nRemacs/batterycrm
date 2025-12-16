package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrokeCap.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/m1;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39698b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39699c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39700d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f39701a;

    /* compiled from: StrokeCap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/m1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ m1(int i12) {
        this.f39701a = i12;
    }

    public static final /* synthetic */ m1 a(int i12) {
        return new m1(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, 0) ? "Butt" : b(i12, f39699c) ? "Round" : b(i12, f39700d) ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return this.f39701a == ((m1) obj).f39701a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39701a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f39701a);
    }
}
