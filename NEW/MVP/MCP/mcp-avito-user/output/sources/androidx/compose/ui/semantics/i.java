package androidx.compose.ui.semantics;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SemanticsProperties.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/i;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f41744b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f41745c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f41746d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41747e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f41748f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f41749g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f41750h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f41751i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f41752j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f41753a;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/i$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ i(int i12) {
        this.f41753a = i12;
    }

    public static final /* synthetic */ i a(int i12) {
        return new i(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f41753a == ((i) obj).f41753a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41753a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f41753a;
        return b(i12, 0) ? "Button" : b(i12, f41745c) ? "Checkbox" : b(i12, f41746d) ? "Switch" : b(i12, f41747e) ? "RadioButton" : b(i12, f41748f) ? "Tab" : b(i12, f41749g) ? "Image" : b(i12, f41750h) ? "DropdownList" : b(i12, f41751i) ? "Picker" : b(i12, f41752j) ? "Carousel" : "Unknown";
    }
}
