package androidx.compose.material;

import androidx.compose.animation.core.C20281g0;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21170f7 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f33566l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f33567m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f33568n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f33569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f33570p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f33571q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21170f7(long j12, long j13, C20281g0.a aVar, C20281g0.a aVar2, C20281g0.a aVar3, C20281g0.a aVar4) {
        super(1);
        this.f33566l = j12;
        this.f33567m = j13;
        this.f33568n = aVar;
        this.f33569o = aVar2;
        this.f33570p = aVar3;
        this.f33571q = aVar4;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fC2 = l0.n.c(gVar2.i());
        C21105a7.d(gVar2, 0.0f, 1.0f, this.f33566l, fC2, 0);
        C20281g0.a aVar = this.f33568n;
        float fFloatValue = ((Number) aVar.getF42167b()).floatValue();
        C20281g0.a aVar2 = this.f33569o;
        if (fFloatValue - ((Number) aVar2.getF42167b()).floatValue() > 0.0f) {
            C21105a7.d(gVar2, ((Number) aVar.getF42167b()).floatValue(), ((Number) aVar2.getF42167b()).floatValue(), this.f33567m, fC2, 0);
        }
        C20281g0.a aVar3 = this.f33570p;
        float fFloatValue2 = ((Number) aVar3.getF42167b()).floatValue();
        C20281g0.a aVar4 = this.f33571q;
        if (fFloatValue2 - ((Number) aVar4.getF42167b()).floatValue() > 0.0f) {
            C21105a7.d(gVar2, ((Number) aVar3.getF42167b()).floatValue(), ((Number) aVar4.getF42167b()).floatValue(), this.f33567m, fC2, 0);
        }
        return kotlin.G0.f406611a;
    }
}
