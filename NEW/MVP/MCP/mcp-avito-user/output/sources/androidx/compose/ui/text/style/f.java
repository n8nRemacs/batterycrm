package androidx.compose.ui.text.style;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LineBreak.android.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/f;", "", "a", "b", "c", "d", "mask", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42639b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42640c;

    /* renamed from: a, reason: collision with root package name */
    public final int f42641a;

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/f$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/f$b;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42642b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42643c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f42644d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f42645e = 3;

        /* renamed from: a, reason: collision with root package name */
        public final int f42646a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/f$b$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            return a(i12, f42643c) ? "Strategy.Simple" : a(i12, f42644d) ? "Strategy.HighQuality" : a(i12, f42645e) ? "Strategy.Balanced" : a(i12, 0) ? "Strategy.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f42646a == ((b) obj).f42646a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42646a);
        }

        @Y61.k
        public final String toString() {
            return b(this.f42646a);
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/f$c;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42647b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42648c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f42649d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f42650e = 3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f42651f = 4;

        /* renamed from: a, reason: collision with root package name */
        public final int f42652a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/f$c$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            return a(i12, f42648c) ? "Strictness.None" : a(i12, f42649d) ? "Strictness.Loose" : a(i12, f42650e) ? "Strictness.Normal" : a(i12, f42651f) ? "Strictness.Strict" : a(i12, 0) ? "Strictness.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f42652a == ((c) obj).f42652a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42652a);
        }

        @Y61.k
        public final String toString() {
            return b(this.f42652a);
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/f$d;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f42653b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f42654c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f42655d = 2;

        /* renamed from: a, reason: collision with root package name */
        public final int f42656a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/f$d$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        @Y61.k
        public static String a(int i12) {
            return i12 == f42654c ? "WordBreak.None" : i12 == f42655d ? "WordBreak.Phrase" : i12 == 0 ? "WordBreak.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f42656a == ((d) obj).f42656a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42656a);
        }

        @Y61.k
        public final String toString() {
            return a(this.f42656a);
        }
    }

    static {
        b.f42642b.getClass();
        int i12 = b.f42643c;
        c.f42647b.getClass();
        int i13 = c.f42650e;
        d.f42653b.getClass();
        f42640c = i12 | (i13 << 8) | (d.f42654c << 16);
    }

    private /* synthetic */ f(int i12) {
        this.f42641a = i12;
    }

    public static final /* synthetic */ f a(int i12) {
        return new f(i12);
    }

    @Y61.k
    public static String b(int i12) {
        return "LineBreak(strategy=" + ((Object) b.b(i12 & 255)) + ", strictness=" + ((Object) c.b((i12 >> 8) & 255)) + ", wordBreak=" + ((Object) d.a((i12 >> 16) & 255)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f42641a == ((f) obj).f42641a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42641a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f42641a);
    }
}
