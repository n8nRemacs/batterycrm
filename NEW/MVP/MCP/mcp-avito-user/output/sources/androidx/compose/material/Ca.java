package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Ca extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f32497l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ca(androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i32) {
        super(1);
        this.f32497l = i32;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float f12 = Fa.f32641a;
        long j12 = this.f32497l.getF42167b().f39331a;
        float fM02 = gVar2.M0(Fa.f32641a);
        float fM03 = gVar2.M0(Fa.f32642b);
        float f13 = fM03 / 2;
        long jA2 = l0.h.a(f13, l0.g.h(gVar2.v1()));
        long jA3 = l0.h.a(fM02 - f13, l0.g.h(gVar2.v1()));
        androidx.compose.ui.graphics.m1.f39698b.getClass();
        androidx.compose.ui.graphics.drawscope.g.G0(gVar2, j12, jA2, jA3, fM03, androidx.compose.ui.graphics.m1.f39699c, null, 0, 480);
        return kotlin.G0.f406611a;
    }
}
