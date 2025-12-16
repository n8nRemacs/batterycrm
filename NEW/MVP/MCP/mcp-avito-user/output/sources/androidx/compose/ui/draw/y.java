package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.C22278p0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Shadow.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {
    public static androidx.compose.ui.v a(androidx.compose.ui.v vVar, float f12, h1 h1Var, boolean z12, int i12) {
        if ((i12 & 4) != 0) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            z12 = Float.compare(f12, (float) 0) > 0;
        }
        boolean z13 = z12;
        long j12 = C22278p0.f39720a;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        return (Float.compare(f12, (float) 0) > 0 || z13) ? vVar.d0(new ShadowGraphicsLayerElement(f12, h1Var, z13, j12, j12, null)) : vVar;
    }
}
