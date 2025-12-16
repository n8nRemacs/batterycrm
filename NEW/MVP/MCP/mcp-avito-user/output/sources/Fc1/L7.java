package Fc1;

import android.graphics.Paint;
import androidx.compose.ui.graphics.C22273n;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class L7 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f5083n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f5084o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f5085p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(float f12, float f13, float f14, float f15, long j12) {
        super(1);
        this.f5081l = j12;
        this.f5082m = f12;
        this.f5083n = f13;
        this.f5084o = f14;
        this.f5085p = f15;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        long j12 = this.f5081l;
        int iJ2 = androidx.compose.ui.graphics.V.j(androidx.compose.ui.graphics.T.c(j12, 0.0f));
        int iJ3 = androidx.compose.ui.graphics.V.j(androidx.compose.ui.graphics.T.c(j12, 0.2f));
        androidx.compose.ui.graphics.M mA2 = gVar2.getF39478c().a();
        C22273n c22273n = new C22273n();
        Paint paint = c22273n.f39702a;
        paint.setColor(iJ2);
        paint.setShadowLayer(gVar2.M0(this.f5082m), gVar2.M0(this.f5083n), gVar2.M0(this.f5084o), iJ3);
        float fE2 = l0.n.e(gVar2.i());
        float fC2 = l0.n.c(gVar2.i());
        float f12 = this.f5085p;
        mA2.w(0.0f, 0.0f, fE2, fC2, gVar2.M0(f12), gVar2.M0(f12), c22273n);
        return kotlin.G0.f406611a;
    }
}
