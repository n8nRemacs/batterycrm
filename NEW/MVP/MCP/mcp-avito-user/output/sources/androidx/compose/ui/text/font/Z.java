package androidx.compose.ui.text.font;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontStyle.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/Z;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42217b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42218c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f42219a;

    /* compiled from: FontStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/Z$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @InterfaceC42830m
    private /* synthetic */ Z(int i12) {
        this.f42219a = i12;
    }

    public static final /* synthetic */ Z a(int i12) {
        return new Z(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, 0) ? "Normal" : b(i12, f42218c) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            return this.f42219a == ((Z) obj).f42219a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42219a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42219a);
    }
}
