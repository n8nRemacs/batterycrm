package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21995yc extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f37764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f37765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.drawscope.o f37766n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f37767o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21995yc(Y41.a<Float> aVar, long j12, androidx.compose.ui.graphics.drawscope.o oVar, long j13) {
        super(1);
        this.f37764l = aVar;
        this.f37765m = j12;
        this.f37766n = oVar;
        this.f37767o = j13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        float fFloatValue = this.f37764l.invoke().floatValue() * 360.0f;
        androidx.compose.ui.graphics.drawscope.o oVar = this.f37766n;
        Ac.b(gVar2, 0.0f, 360.0f, this.f37765m, oVar);
        Ac.b(gVar2, 270.0f, fFloatValue, this.f37767o, oVar);
        return kotlin.G0.f406611a;
    }
}
