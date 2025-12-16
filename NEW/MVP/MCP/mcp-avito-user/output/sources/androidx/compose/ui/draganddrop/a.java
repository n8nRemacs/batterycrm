package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeDragShadowBuilder.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/draganddrop/a;", "Landroid/view/View$DragShadowBuilder;", "Landroidx/compose/ui/unit/d;", "density", "Ll0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "Lkotlin/w;", "drawDragDecoration", "<init>", "(Landroidx/compose/ui/unit/d;JLY41/l;Lkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f38996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38997b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> f38998c;

    public a() {
        throw null;
    }

    public a(androidx.compose.ui.unit.d dVar, long j12, Y41.l lVar, C42822w c42822w) {
        this.f38996a = dVar;
        this.f38997b = j12;
        this.f38998c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(@Y61.k Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.a aVar = new androidx.compose.ui.graphics.drawscope.a();
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        C22245c c22245cA = C22247d.a(canvas);
        a.C1659a c1659a = aVar.f39477b;
        androidx.compose.ui.unit.d dVar = c1659a.f39481a;
        LayoutDirection layoutDirection2 = c1659a.f39482b;
        M m12 = c1659a.f39483c;
        long j12 = c1659a.f39484d;
        c1659a.f39481a = this.f38996a;
        c1659a.f39482b = layoutDirection;
        c1659a.f39483c = c22245cA;
        c1659a.f39484d = this.f38997b;
        c22245cA.k();
        this.f38998c.invoke(aVar);
        c22245cA.i();
        c1659a.f39481a = dVar;
        c1659a.f39482b = layoutDirection2;
        c1659a.f39483c = m12;
        c1659a.f39484d = j12;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(@Y61.k Point point, @Y61.k Point point2) {
        long j12 = this.f38997b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        androidx.compose.ui.unit.d dVar = this.f38996a;
        point.set(dVar.y0(dVar.K(fIntBitsToFloat)), dVar.y0(dVar.K(Float.intBitsToFloat((int) (j12 & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }
}
