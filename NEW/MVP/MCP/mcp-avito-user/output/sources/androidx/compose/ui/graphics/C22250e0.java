package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GraphicsLayerModifier.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/e0;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22250e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39504b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39505c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39506d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f39507a;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/e0$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.e0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a() {
            a aVar = C22250e0.f39504b;
        }

        public static int b() {
            return C22250e0.f39506d;
        }

        public static int c() {
            return C22250e0.f39505c;
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public static String b(int i12) {
        return androidx.appcompat.app.r.p("CompositingStrategy(value=", i12, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22250e0) {
            return this.f39507a == ((C22250e0) obj).f39507a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39507a);
    }

    public final String toString() {
        return b(this.f39507a);
    }
}
