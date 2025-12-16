package androidx.compose.ui.text.style;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextAlign.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/i;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42675b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42676c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42677d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42678e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42679f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42680g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f42681h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f42682i = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: a, reason: collision with root package name */
    public final int f42683a;

    /* compiled from: TextAlign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/i$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ i(int i12) {
        this.f42683a = i12;
    }

    public static final /* synthetic */ i a(int i12) {
        return new i(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String c(int i12) {
        return b(i12, f42676c) ? "Left" : b(i12, f42677d) ? "Right" : b(i12, f42678e) ? "Center" : b(i12, f42679f) ? "Justify" : b(i12, f42680g) ? "Start" : b(i12, f42681h) ? "End" : b(i12, f42682i) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f42683a == ((i) obj).f42683a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42683a);
    }

    @Y61.k
    public final String toString() {
        return c(this.f42683a);
    }
}
