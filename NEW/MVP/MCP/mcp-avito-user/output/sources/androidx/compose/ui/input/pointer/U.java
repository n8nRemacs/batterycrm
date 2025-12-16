package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/U;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f40189b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40190c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40191d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40192e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40193f = 4;

    /* renamed from: a, reason: collision with root package name */
    public final int f40194a;

    /* compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/U$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Y61.k
    public static String b(int i12) {
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            return this.f40194a == ((U) obj).f40194a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40194a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f40194a);
    }
}
