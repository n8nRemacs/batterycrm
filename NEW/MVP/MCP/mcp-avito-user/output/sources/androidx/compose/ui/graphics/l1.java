package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathEffect.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/l1;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f39548b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f39549c;

    /* renamed from: a, reason: collision with root package name */
    public final int f39550a;

    /* compiled from: PathEffect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/l1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f39548b = 1;
        f39549c = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            return this.f39550a == ((l1) obj).f39550a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39550a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f39550a;
        return i12 == 0 ? "Translate" : i12 == f39548b ? "Rotate" : i12 == f39549c ? "Morph" : "Unknown";
    }
}
