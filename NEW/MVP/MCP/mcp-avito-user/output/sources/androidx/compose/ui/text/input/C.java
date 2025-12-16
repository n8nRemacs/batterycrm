package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: KeyboardType.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/C;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42345b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42346c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42347d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42348e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42349f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42350g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f42351h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f42352i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f42353j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f42354k = 9;

    /* renamed from: a, reason: collision with root package name */
    public final int f42355a;

    /* compiled from: KeyboardType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/C$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C(int i12) {
        this.f42355a = i12;
    }

    public static final /* synthetic */ C a(int i12) {
        return new C(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, 0) ? "Unspecified" : b(i12, f42346c) ? "Text" : b(i12, f42347d) ? "Ascii" : b(i12, f42348e) ? "Number" : b(i12, f42349f) ? "Phone" : b(i12, f42350g) ? "Uri" : b(i12, f42351h) ? "Email" : b(i12, f42352i) ? "Password" : b(i12, f42353j) ? "NumberPassword" : b(i12, f42354k) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return this.f42355a == ((C) obj).f42355a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42355a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42355a);
    }
}
