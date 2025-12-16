package androidx.compose.ui.graphics.painter;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrushPainter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/c;", "Landroidx/compose/ui/graphics/painter/e;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g, reason: collision with root package name */
    public float f39733g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public U f39734h;

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        this.f39733g = f12;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@l U u12) {
        this.f39734h = u12;
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        return L.f(null, null);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@k g gVar) {
        g.e0(gVar, null, 0L, 0L, this.f39733g, null, this.f39734h, 86);
    }

    @k
    public final String toString() {
        return "BrushPainter(brush=null)";
    }
}
