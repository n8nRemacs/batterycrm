package androidx.compose.material3;

import androidx.compose.animation.core.C20281g0;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Kc extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f35007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f35008m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f35009n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f35010o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f35011p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f35012q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kc(long j12, long j13, C20281g0.a aVar, C20281g0.a aVar2, C20281g0.a aVar3, C20281g0.a aVar4) {
        super(1);
        this.f35007l = j12;
        this.f35008m = aVar;
        this.f35009n = aVar2;
        this.f35010o = j13;
        this.f35011p = aVar3;
        this.f35012q = aVar4;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fC2 = l0.n.c(gVar2.i());
        Ac.c(gVar2, 0.0f, 1.0f, this.f35007l, fC2, 0);
        C20281g0.a aVar = this.f35008m;
        float fFloatValue = ((Number) aVar.getF42167b()).floatValue();
        C20281g0.a aVar2 = this.f35009n;
        if (fFloatValue - ((Number) aVar2.getF42167b()).floatValue() > 0.0f) {
            Ac.c(gVar2, ((Number) aVar.getF42167b()).floatValue(), ((Number) aVar2.getF42167b()).floatValue(), this.f35010o, fC2, 0);
        }
        C20281g0.a aVar3 = this.f35011p;
        float fFloatValue2 = ((Number) aVar3.getF42167b()).floatValue();
        C20281g0.a aVar4 = this.f35012q;
        if (fFloatValue2 - ((Number) aVar4.getF42167b()).floatValue() > 0.0f) {
            Ac.c(gVar2, ((Number) aVar3.getF42167b()).floatValue(), ((Number) aVar4.getF42167b()).floatValue(), this.f35010o, fC2, 0);
        }
        return kotlin.G0.f406611a;
    }
}
