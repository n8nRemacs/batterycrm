package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/k;", "", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22368k {

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/k$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.k$a */
    public interface a {
        boolean a();
    }

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/k$b;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    /* renamed from: androidx.compose.ui.layout.k$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f40472b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f40473c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f40474d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f40475e = 3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f40476f = 4;

        /* renamed from: g, reason: collision with root package name */
        public static final int f40477g = 5;

        /* renamed from: h, reason: collision with root package name */
        public static final int f40478h = 6;

        /* renamed from: a, reason: collision with root package name */
        public final int f40479a;

        /* compiled from: BeyondBoundsLayout.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/k$b$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.k$b$a */
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
            if (obj instanceof b) {
                return this.f40479a == ((b) obj).f40479a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f40479a);
        }

        @Y61.k
        public final String toString() {
            int i12 = f40473c;
            int i13 = this.f40479a;
            return a(i13, i12) ? "Before" : a(i13, f40474d) ? "After" : a(i13, f40475e) ? "Left" : a(i13, f40476f) ? "Right" : a(i13, f40477g) ? "Above" : a(i13, f40478h) ? "Below" : "invalid LayoutDirection";
        }
    }

    @Y61.l
    <T> T O1(int i12, @Y61.k Y41.l<? super a, ? extends T> lVar);
}
