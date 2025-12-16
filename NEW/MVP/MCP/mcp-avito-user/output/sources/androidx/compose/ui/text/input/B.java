package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: KeyboardCapitalization.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/B;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42339b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42340c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42341d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42342e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42343f = 3;

    /* renamed from: a, reason: collision with root package name */
    public final int f42344a;

    /* compiled from: KeyboardCapitalization.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/B$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ B(int i12) {
        this.f42344a = i12;
    }

    public static final /* synthetic */ B a(int i12) {
        return new B(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, f42340c) ? "Unspecified" : b(i12, 0) ? "None" : b(i12, f42341d) ? "Characters" : b(i12, f42342e) ? "Words" : b(i12, f42343f) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f42344a == ((B) obj).f42344a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42344a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42344a);
    }
}
