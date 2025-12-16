package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsets.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/q3;", "", "a", "value", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f28716b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f28717c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final int f28718d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28719e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28720f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28721g = 8 | 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f28722h = 4 | 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f28723i = 16;

    /* renamed from: j, reason: collision with root package name */
    public static final int f28724j = 32;

    /* renamed from: k, reason: collision with root package name */
    public static final int f28725k = 8 | 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f28726l = 4 | 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f28727m = 16 | 32;

    /* renamed from: a, reason: collision with root package name */
    public final int f28728a;

    /* compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/q3$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i13 = f28721g;
        if ((i12 & i13) == i13) {
            c(sb3, "Start");
        }
        int i14 = f28725k;
        if ((i12 & i14) == i14) {
            c(sb3, "Left");
        }
        int i15 = f28723i;
        if ((i12 & i15) == i15) {
            c(sb3, "Top");
        }
        int i16 = f28722h;
        if ((i12 & i16) == i16) {
            c(sb3, "End");
        }
        int i17 = f28726l;
        if ((i12 & i17) == i17) {
            c(sb3, "Right");
        }
        int i18 = f28724j;
        if ((i12 & i18) == i18) {
            c(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }

    public static final void c(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q3) {
            return this.f28728a == ((q3) obj).f28728a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28728a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f28728a);
    }
}
