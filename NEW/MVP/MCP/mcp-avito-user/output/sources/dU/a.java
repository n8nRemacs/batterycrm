package DU;

import Y61.l;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.u;
import androidx.window.layout.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Window.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_compose_shared_adaptive"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    @InterfaceC22132o
    public static final long a(@l A a12) {
        a12.C(-224539715);
        a12.o(AndroidCompositionLocals_androidKt.f41068a);
        p.f55345a.getClass();
        Rect rectC = p.a.a().b((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b)).f55343a.c();
        long jWidth = (rectC.width() << 32) | (rectC.height() & 4294967295L);
        u.a aVar = u.f42871b;
        a12.h();
        return jWidth;
    }
}
