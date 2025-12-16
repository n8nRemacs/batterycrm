package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Placeholder.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/V;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f41956b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f41957c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f41958d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41959e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f41960f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f41961g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f41962h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f41963i = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f41964a;

    /* compiled from: Placeholder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/V$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        return a(i12, f41957c) ? "AboveBaseline" : a(i12, f41958d) ? "Top" : a(i12, f41959e) ? "Bottom" : a(i12, f41960f) ? "Center" : a(i12, f41961g) ? "TextTop" : a(i12, f41962h) ? "TextBottom" : a(i12, f41963i) ? "TextCenter" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            return this.f41964a == ((V) obj).f41964a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41964a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f41964a);
    }
}
