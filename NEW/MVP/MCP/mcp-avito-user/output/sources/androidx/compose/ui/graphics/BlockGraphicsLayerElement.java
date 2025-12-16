package androidx.compose.ui.graphics;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/graphics/H;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BlockGraphicsLayerElement extends AbstractC22430p0<H> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC22276o0, kotlin.G0> f39217b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@Y61.k Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        this.f39217b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new H(this.f39217b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        H h12 = (H) dVar;
        h12.f39275p = this.f39217b;
        AbstractC22443w0 abstractC22443w0 = C22421l.e(h12, 2).f40912q;
        if (abstractC22443w0 != null) {
            abstractC22443w0.b2(h12.f39275p, true);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kotlin.jvm.internal.L.f(this.f39217b, ((BlockGraphicsLayerElement) obj).f39217b);
    }

    public final int hashCode() {
        return this.f39217b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.l(new StringBuilder("BlockGraphicsLayerElement(block="), this.f39217b, ')');
    }
}
