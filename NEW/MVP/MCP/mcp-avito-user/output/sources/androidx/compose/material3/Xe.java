package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Xe extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {
    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        boolean z12 = gVar2.getLayoutDirection() == LayoutDirection.f42839c;
        long jA2 = l0.h.a(0.0f, l0.g.h(gVar2.v1()));
        long jA3 = l0.h.a(l0.n.e(gVar2.i()), l0.g.h(gVar2.v1()));
        long j12 = z12 ? jA3 : jA2;
        long j13 = z12 ? jA2 : jA3;
        gVar2.M0(Tf.f35502d);
        float fM02 = gVar2.M0(Tf.f35503e);
        androidx.compose.ui.graphics.m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, 0L, j12, j13, fM02, androidx.compose.ui.graphics.m1.f39699c, null, 0, 480);
        l0.g.g(j12);
        l0.g.g(j13);
        l0.g.g(j12);
        throw null;
    }
}
