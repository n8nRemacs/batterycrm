package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ic extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f34882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f34883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f34884n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(long j12, long j13, Y41.a aVar) {
        super(1);
        this.f34882l = j12;
        this.f34883m = aVar;
        this.f34884n = j13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fC2 = l0.n.c(gVar2.i());
        Ac.c(gVar2, 0.0f, 1.0f, this.f34882l, fC2, 0);
        Ac.c(gVar2, 0.0f, this.f34883m.invoke().floatValue(), this.f34884n, fC2, 0);
        return kotlin.G0.f406611a;
    }
}
