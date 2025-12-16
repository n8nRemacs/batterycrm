package androidx.compose.ui.graphics;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22274n0 {
    @F3
    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        return vVar.d0(new BlockGraphicsLayerElement(lVar));
    }

    public static androidx.compose.ui.v b(androidx.compose.ui.v vVar, float f12, float f13, float f14, float f15, float f16, h1 h1Var, boolean z12, int i12) {
        float f17 = (i12 & 1) != 0 ? 1.0f : f12;
        float f18 = (i12 & 2) != 0 ? 1.0f : f13;
        float f19 = (i12 & 4) != 0 ? 1.0f : f14;
        float f22 = (i12 & 32) != 0 ? 0.0f : f15;
        float f23 = (i12 & 256) != 0 ? 0.0f : f16;
        r1.f39755b.getClass();
        long j12 = r1.f39756c;
        h1 h1Var2 = (i12 & 2048) != 0 ? Y0.f39346a : h1Var;
        boolean z13 = (i12 & 4096) != 0 ? false : z12;
        long j13 = C22278p0.f39720a;
        C22250e0.f39504b.getClass();
        return vVar.d0(new GraphicsLayerElement(f17, f18, f19, 0.0f, 0.0f, f22, 0.0f, 0.0f, f23, 8.0f, j12, h1Var2, z13, null, j13, j13, 0, null));
    }
}
