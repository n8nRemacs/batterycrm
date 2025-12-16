package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/u;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22342u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f40283b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40284c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40285d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40286e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40287f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40288g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f40289h = 6;

    /* renamed from: a, reason: collision with root package name */
    public final int f40290a;

    /* compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/u$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.u$a */
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
        if (obj instanceof C22342u) {
            return this.f40290a == ((C22342u) obj).f40290a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40290a);
    }

    @Y61.k
    public final String toString() {
        int i12 = f40284c;
        int i13 = this.f40290a;
        return a(i13, i12) ? "Press" : a(i13, f40285d) ? "Release" : a(i13, f40286e) ? "Move" : a(i13, f40287f) ? "Enter" : a(i13, f40288g) ? "Exit" : a(i13, f40289h) ? "Scroll" : "Unknown";
    }
}
