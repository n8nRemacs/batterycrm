package androidx.compose.ui.graphics.layer;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositingStrategy.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/b;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.layer.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22266b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39571b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39572c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39573d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f39574a;

    /* compiled from: CompositingStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/layer/b$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.layer.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a() {
            a aVar = C22266b.f39571b;
        }

        public static int b() {
            return C22266b.f39573d;
        }

        public static int c() {
            return C22266b.f39572c;
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22266b) {
            return this.f39574a == ((C22266b) obj).f39574a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39574a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("CompositingStrategy(value="), this.f39574a, ')');
    }
}
