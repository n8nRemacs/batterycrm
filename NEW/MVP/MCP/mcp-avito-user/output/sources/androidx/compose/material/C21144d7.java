package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.d7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21144d7 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f33527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33530o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21144d7(int i12, long j12, float f12, long j13) {
        super(1);
        this.f33527l = j12;
        this.f33528m = i12;
        this.f33529n = f12;
        this.f33530o = j13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fC2 = l0.n.c(gVar2.i());
        C21105a7.d(gVar2, 0.0f, 1.0f, this.f33527l, fC2, this.f33528m);
        C21105a7.d(gVar2, 0.0f, this.f33529n, this.f33530o, fC2, this.f33528m);
        return kotlin.G0.f406611a;
    }
}
