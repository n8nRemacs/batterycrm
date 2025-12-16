package androidx.compose.ui.graphics.painter;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;
import l0.n;

/* compiled from: ColorPainter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/painter/d;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/ui/graphics/T;", "color", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: g, reason: collision with root package name */
    public final long f39735g;

    /* renamed from: h, reason: collision with root package name */
    public float f39736h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    @l
    public U f39737i;

    /* renamed from: j, reason: collision with root package name */
    public final long f39738j;

    public d(long j12, C42822w c42822w) {
        this.f39735g = j12;
        n.f413402b.getClass();
        this.f39738j = n.f413403c;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        this.f39736h = f12;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@l U u12) {
        this.f39737i = u12;
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return T.d(this.f39735g, ((d) obj).f39735g);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h, reason: from getter */
    public final long getF39738j() {
        return this.f39738j;
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f39735g);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@k g gVar) {
        g.c0(gVar, this.f39735g, 0L, 0L, this.f39736h, this.f39737i, 86);
    }

    @k
    public final String toString() {
        return "ColorPainter(color=" + ((Object) T.j(this.f39735g)) + ')';
    }
}
