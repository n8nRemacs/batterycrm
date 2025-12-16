package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImeAction.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/u;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22654u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42467b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42468c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42469d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42470e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42471f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42472g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f42473h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f42474i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f42475j = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f42476a;

    /* compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/u$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22654u(int i12) {
        this.f42476a = i12;
    }

    public static final /* synthetic */ C22654u a(int i12) {
        return new C22654u(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, f42468c) ? "Unspecified" : b(i12, 0) ? "None" : b(i12, f42469d) ? "Default" : b(i12, f42470e) ? "Go" : b(i12, f42471f) ? "Search" : b(i12, f42472g) ? "Send" : b(i12, f42473h) ? "Previous" : b(i12, f42474i) ? "Next" : b(i12, f42475j) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22654u) {
            return this.f42476a == ((C22654u) obj).f42476a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42476a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42476a);
    }
}
