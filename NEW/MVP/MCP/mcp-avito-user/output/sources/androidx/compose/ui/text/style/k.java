package androidx.compose.ui.text.style;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextDirection.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/k;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42689b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42690c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42691d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42692e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42693f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42694g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f42695h = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: a, reason: collision with root package name */
    public final int f42696a;

    /* compiled from: TextDirection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/k$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ k(int i12) {
        this.f42696a = i12;
    }

    public static final /* synthetic */ k a(int i12) {
        return new k(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, f42690c) ? "Ltr" : b(i12, f42691d) ? "Rtl" : b(i12, f42692e) ? "Content" : b(i12, f42693f) ? "ContentOrLtr" : b(i12, f42694g) ? "ContentOrRtl" : b(i12, f42695h) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f42696a == ((k) obj).f42696a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42696a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42696a);
    }
}
