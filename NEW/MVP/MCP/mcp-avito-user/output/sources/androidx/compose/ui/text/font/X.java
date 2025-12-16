package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontLoadingStrategy.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/X;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42213b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42214c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42215d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f42216a;

    /* compiled from: FontLoadingStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/X$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        return a(i12, 0) ? "Blocking" : a(i12, f42214c) ? "Optional" : a(i12, f42215d) ? "Async" : androidx.appcompat.app.r.p("Invalid(value=", i12, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            return this.f42216a == ((X) obj).f42216a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42216a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f42216a);
    }
}
