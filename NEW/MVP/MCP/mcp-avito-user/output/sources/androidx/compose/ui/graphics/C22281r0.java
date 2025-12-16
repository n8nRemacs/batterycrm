package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageBitmap.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/r0;", "", "a", "value", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22281r0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39749b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39750c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39751d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39752e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39753f = 4;

    /* renamed from: a, reason: collision with root package name */
    public final int f39754a;

    /* compiled from: ImageBitmap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/r0$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.r0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22281r0(int i12) {
        this.f39754a = i12;
    }

    public static final /* synthetic */ C22281r0 a(int i12) {
        return new C22281r0(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22281r0) {
            return this.f39754a == ((C22281r0) obj).f39754a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39754a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f39754a;
        return b(i12, 0) ? "Argb8888" : b(i12, f39750c) ? "Alpha8" : b(i12, f39751d) ? "Rgb565" : b(i12, f39752e) ? "F16" : b(i12, f39753f) ? "Gpu" : "Unknown";
    }
}
