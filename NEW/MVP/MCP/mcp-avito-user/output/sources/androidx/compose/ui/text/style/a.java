package androidx.compose.ui.text.style;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BaselineShift.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/a;", "", "a", "multiplier", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C1689a f42629b = new C1689a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f42630a;

    /* compiled from: BaselineShift.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/a$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name */
    public static final class C1689a {
        public /* synthetic */ C1689a(C42822w c42822w) {
            this();
        }

        public C1689a() {
        }
    }

    private /* synthetic */ a(float f12) {
        this.f42630a = f12;
    }

    public static final /* synthetic */ a a(float f12) {
        return new a(f12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f42630a, ((a) obj).f42630a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42630a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f42630a + ')';
    }
}
