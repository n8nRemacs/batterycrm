package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrokeJoin.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/n1;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39707b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39708c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39709d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f39710a;

    /* compiled from: StrokeJoin.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/n1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ n1(int i12) {
        this.f39710a = i12;
    }

    public static final /* synthetic */ n1 a(int i12) {
        return new n1(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, 0) ? "Miter" : b(i12, f39708c) ? "Round" : b(i12, f39709d) ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            return this.f39710a == ((n1) obj).f39710a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39710a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f39710a);
    }
}
