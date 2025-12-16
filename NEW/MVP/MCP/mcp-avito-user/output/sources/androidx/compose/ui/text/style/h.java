package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: LineHeightStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/h;", "", "Landroidx/compose/ui/text/style/h$a;", "alignment", "Landroidx/compose/ui/text/style/h$d;", "trim", "Landroidx/compose/ui/text/style/h$c;", "mode", "<init>", "(FIILkotlin/jvm/internal/w;)V", "(FILkotlin/jvm/internal/w;)V", "a", "b", "c", "d", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f42657d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final h f42658e;

    /* renamed from: a, reason: collision with root package name */
    public final float f42659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42661c;

    /* compiled from: LineHeightStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/h$a;", "", "a", "topRatio", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C1690a f42662b = new C1690a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final float f42663c;

        /* renamed from: d, reason: collision with root package name */
        public static final float f42664d;

        /* renamed from: e, reason: collision with root package name */
        public static final float f42665e;

        /* renamed from: a, reason: collision with root package name */
        public final float f42666a;

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/h$a$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.h$a$a, reason: collision with other inner class name */
        public static final class C1690a {
            public /* synthetic */ C1690a(C42822w c42822w) {
                this();
            }

            public C1690a() {
            }
        }

        static {
            b(0.0f);
            b(0.5f);
            f42663c = 0.5f;
            b(-1.0f);
            f42664d = -1.0f;
            b(1.0f);
            f42665e = 1.0f;
        }

        private /* synthetic */ a(float f12) {
            this.f42666a = f12;
        }

        public static final /* synthetic */ a a(float f12) {
            return new a(f12);
        }

        public static void b(float f12) {
            if ((0.0f > f12 || f12 > 1.0f) && f12 != -1.0f) {
                C50028a.c("topRatio should be in [0..1] range or -1");
            }
        }

        @Y61.k
        public static String c(float f12) {
            if (f12 == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f12 == f42663c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f12 == f42664d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f12 == f42665e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f12 + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.f42666a, ((a) obj).f42666a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f42666a);
        }

        @Y61.k
        public final String toString() {
            return c(this.f42666a);
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/h$b;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/h$c;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42667b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42668c = 1;

        /* renamed from: a, reason: collision with root package name */
        public final int f42669a;

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/h$c$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        private /* synthetic */ c(int i12) {
            this.f42669a = i12;
        }

        public static final /* synthetic */ c a(int i12) {
            return new c(i12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f42669a == ((c) obj).f42669a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42669a);
        }

        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Mode(value="), this.f42669a, ')');
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/h$d;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42670b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42671c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f42672d = 16;

        /* renamed from: e, reason: collision with root package name */
        public static final int f42673e = 17;

        /* renamed from: a, reason: collision with root package name */
        public final int f42674a;

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/h$d$a;", "", "<init>", "()V", "", "FlagTrimBottom", "I", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        private /* synthetic */ d(int i12) {
            this.f42674a = i12;
        }

        public static final /* synthetic */ d a(int i12) {
            return new d(i12);
        }

        @Y61.k
        public static String b(int i12) {
            return i12 == f42671c ? "LineHeightStyle.Trim.FirstLineTop" : i12 == f42672d ? "LineHeightStyle.Trim.LastLineBottom" : i12 == f42673e ? "LineHeightStyle.Trim.Both" : i12 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f42674a == ((d) obj).f42674a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42674a);
        }

        @Y61.k
        public final String toString() {
            return b(this.f42674a);
        }
    }

    static {
        a.f42662b.getClass();
        float f12 = a.f42664d;
        d.f42670b.getClass();
        int i12 = d.f42673e;
        c.f42667b.getClass();
        f42658e = new h(f12, i12, 0, null);
    }

    public h(float f12, int i12, int i13, C42822w c42822w) {
        this.f42659a = f12;
        this.f42660b = i12;
        this.f42661c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        float f12 = hVar.f42659a;
        a.C1690a c1690a = a.f42662b;
        if (Float.compare(this.f42659a, f12) == 0) {
            d.a aVar = d.f42670b;
            if (this.f42660b == hVar.f42660b && this.f42661c == hVar.f42661c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.C1690a c1690a = a.f42662b;
        int iHashCode = Float.hashCode(this.f42659a) * 31;
        d.a aVar = d.f42670b;
        int iE2 = androidx.appcompat.app.r.e(this.f42660b, iHashCode, 31);
        c.a aVar2 = c.f42667b;
        return Integer.hashCode(this.f42661c) + iE2;
    }

    @Y61.k
    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.c(this.f42659a)) + ", trim=" + ((Object) d.b(this.f42660b)) + ",mode=" + ((Object) ("Mode(value=" + this.f42661c + ')')) + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(float f12, int i12, C42822w c42822w) {
        this(f12, i12, 0, null);
        c.f42667b.getClass();
    }
}
