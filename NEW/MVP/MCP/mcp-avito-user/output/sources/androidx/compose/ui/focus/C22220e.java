package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FocusDirection.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/e;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22220e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f39163b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f39164c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39165d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39166e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39167f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f39168g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f39169h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f39170i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f39171j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f39172a;

    /* compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/e$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22220e(int i12) {
        this.f39172a = i12;
    }

    public static final /* synthetic */ C22220e a(int i12) {
        return new C22220e(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, f39164c) ? "Next" : b(i12, f39165d) ? "Previous" : b(i12, f39166e) ? "Left" : b(i12, f39167f) ? "Right" : b(i12, f39168g) ? "Up" : b(i12, f39169h) ? "Down" : b(i12, f39170i) ? "Enter" : b(i12, f39171j) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22220e) {
            return this.f39172a == ((C22220e) obj).f39172a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39172a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f39172a);
    }
}
