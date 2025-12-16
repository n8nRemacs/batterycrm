package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NestedScrollModifier.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/i;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f40105b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40106c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40107d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40108e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40109f = 3;

    /* renamed from: a, reason: collision with root package name */
    public final int f40110a;

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/i$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        if (obj instanceof i) {
            return this.f40110a == ((i) obj).f40110a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40110a);
    }

    @k
    public final String toString() {
        int i12 = f40106c;
        int i13 = this.f40110a;
        return a(i13, i12) ? "UserInput" : a(i13, f40107d) ? "SideEffect" : a(i13, f40109f) ? "Relocate" : "Invalid";
    }
}
