package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.node.P;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class j extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> f39051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f39052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f39053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f39054o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f39055p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f39056q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y41.l lVar, P p12, androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, androidx.compose.ui.unit.d dVar2, LayoutDirection layoutDirection2) {
        super(1);
        this.f39051l = lVar;
        this.f39052m = p12;
        this.f39053n = dVar;
        this.f39054o = layoutDirection;
        this.f39055p = dVar2;
        this.f39056q = layoutDirection2;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        LayoutDirection layoutDirection = this.f39056q;
        androidx.compose.ui.unit.d dVar = this.f39055p;
        a.b f39478c = gVar2.getF39478c();
        f39478c.g(this.f39053n);
        f39478c.i(this.f39054o);
        try {
            this.f39051l.invoke(this.f39052m);
            a.b f39478c2 = gVar2.getF39478c();
            f39478c2.g(dVar);
            f39478c2.i(layoutDirection);
            return G0.f406611a;
        } catch (Throwable th2) {
            a.b f39478c3 = gVar2.getF39478c();
            f39478c3.g(dVar);
            f39478c3.i(layoutDirection);
            throw th2;
        }
    }
}
