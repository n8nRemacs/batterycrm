package androidx.compose.ui.text.style;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextMotion.android.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/r;", "", "Landroidx/compose/ui/text/style/r$b;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/w;)V", "a", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42710c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final r f42711d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final r f42712e;

    /* renamed from: a, reason: collision with root package name */
    public final int f42713a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42714b;

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/r$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/r$b;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42715b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42716c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f42717d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f42718e = 3;

        /* renamed from: a, reason: collision with root package name */
        public final int f42719a;

        /* compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/r$b$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        private /* synthetic */ b(int i12) {
            this.f42719a = i12;
        }

        public static final /* synthetic */ b a(int i12) {
            return new b(i12);
        }

        public static final boolean b(int i12, int i13) {
            return i12 == i13;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f42719a == ((b) obj).f42719a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42719a);
        }

        @Y61.k
        public final String toString() {
            int i12 = f42716c;
            int i13 = this.f42719a;
            return b(i13, i12) ? "Linearity.Linear" : b(i13, f42717d) ? "Linearity.FontHinting" : b(i13, f42718e) ? "Linearity.None" : "Invalid";
        }
    }

    static {
        b.a aVar = b.f42715b;
        aVar.getClass();
        f42711d = new r(b.f42717d, false, null);
        aVar.getClass();
        f42712e = new r(b.f42716c, true, null);
    }

    public r(int i12, boolean z12, C42822w c42822w) {
        this.f42713a = i12;
        this.f42714b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return b.b(this.f42713a, rVar.f42713a) && this.f42714b == rVar.f42714b;
    }

    public final int hashCode() {
        b.a aVar = b.f42715b;
        return Boolean.hashCode(this.f42714b) + (Integer.hashCode(this.f42713a) * 31);
    }

    @Y61.k
    public final String toString() {
        return equals(f42711d) ? "TextMotion.Static" : equals(f42712e) ? "TextMotion.Animated" : "Invalid";
    }
}
