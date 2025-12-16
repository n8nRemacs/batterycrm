package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* compiled from: LegacyCursorAnchorInfoBuilder.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/D;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class D {
    static {
        new D();
    }

    @X41.n
    @Y61.k
    public static final void a(@Y61.k CursorAnchorInfo.Builder builder, @Y61.k androidx.compose.ui.text.o0 o0Var, @Y61.k l0.j jVar) {
        if (jVar.k()) {
            return;
        }
        int iE2 = o0Var.f42527b.e(jVar.f413391b);
        float f12 = jVar.f413393d;
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        int iE3 = g12.e(f12);
        if (iE2 > iE3) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(o0Var.g(iE2), g12.f(iE2), o0Var.h(iE2), g12.b(iE2));
            if (iE2 == iE3) {
                return;
            } else {
                iE2++;
            }
        }
    }
}
