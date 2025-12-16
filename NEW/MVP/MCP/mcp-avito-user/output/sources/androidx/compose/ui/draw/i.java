package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DrawModifier.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/unit/d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements androidx.compose.ui.unit.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public e f39046b = r.f39060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public p f39047c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.node.P f39048d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<? extends InterfaceC22264l0> f39049e;

    /* compiled from: DrawModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f39050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
            super(1);
            this.f39050l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
            this.f39050l.invoke(dVar2);
            dVar2.y1();
            return G0.f406611a;
        }
    }

    public static void r(i iVar, C22267c c22267c, Y41.l lVar) {
        LayoutDirection layoutDirection = iVar.f39046b.getLayoutDirection();
        long jI2 = iVar.f39046b.i();
        long jIntBitsToFloat = (((int) Float.intBitsToFloat((int) (jI2 >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (jI2 & 4294967295L))) & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        androidx.compose.ui.node.P p12 = iVar.f39048d;
        p12.S(jIntBitsToFloat, new j(lVar, p12, iVar, layoutDirection, p12.f40671b.f39478c.b(), p12.f40671b.f39478c.d()), c22267c);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF42847c() {
        return this.f39046b.getDensity().getF42847c();
    }

    @Y61.k
    public final p f(@Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        return m(new a(lVar));
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF42846b() {
        return this.f39046b.getDensity().getF42846b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final p m(@Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.d, G0> lVar) {
        p pVar = new p();
        pVar.f39058a = (N) lVar;
        this.f39047c = pVar;
        return pVar;
    }
}
