package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathOperation.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/P0;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39298b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39299c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39300d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39301e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39302f = 4;

    /* renamed from: a, reason: collision with root package name */
    public final int f39303a;

    /* compiled from: PathOperation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/P0$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P0) {
            return this.f39303a == ((P0) obj).f39303a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39303a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f39303a;
        return a(i12, 0) ? "Difference" : a(i12, f39299c) ? "Intersect" : a(i12, f39300d) ? "Union" : a(i12, f39301e) ? "Xor" : a(i12, f39302f) ? "ReverseDifference" : "Unknown";
    }
}
