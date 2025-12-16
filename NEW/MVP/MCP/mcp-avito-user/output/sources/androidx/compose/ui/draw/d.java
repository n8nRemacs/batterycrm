package androidx.compose.ui.draw;

import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Blur.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draw/d;", "", "a", "shape", "Landroidx/compose/ui/graphics/h1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final h1 f39038a;

    /* compiled from: Blur.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/d$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        Y0.a aVar = Y0.f39346a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return L.f(this.f39038a, ((d) obj).f39038a);
        }
        return false;
    }

    public final int hashCode() {
        h1 h1Var = this.f39038a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public final String toString() {
        return "BlurredEdgeTreatment(shape=" + this.f39038a + ')';
    }
}
