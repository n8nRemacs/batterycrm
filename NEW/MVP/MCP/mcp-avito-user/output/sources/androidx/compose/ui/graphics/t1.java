package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VertexMode.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/t1;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f39758b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f39759c;

    /* renamed from: a, reason: collision with root package name */
    public final int f39760a;

    /* compiled from: VertexMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/t1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f39758b = 1;
        f39759c = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            return this.f39760a == ((t1) obj).f39760a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39760a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f39760a;
        return i12 == 0 ? "Triangles" : i12 == f39758b ? "TriangleStrip" : i12 == f39759c ? "TriangleFan" : "Unknown";
    }
}
