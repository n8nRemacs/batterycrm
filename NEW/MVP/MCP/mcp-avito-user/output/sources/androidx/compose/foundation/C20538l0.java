package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.a;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;

/* compiled from: Border.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20538l0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f28189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.J f28190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f28191n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f28192o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f28193p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f28194q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f28195r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.drawscope.o f28196s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20538l0(boolean z12, androidx.compose.ui.graphics.J j12, long j13, float f12, float f13, long j14, long j15, androidx.compose.ui.graphics.drawscope.o oVar) {
        super(1);
        this.f28189l = z12;
        this.f28190m = j12;
        this.f28191n = j13;
        this.f28192o = f12;
        this.f28193p = f13;
        this.f28194q = j14;
        this.f28195r = j15;
        this.f28196s = oVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) throws Throwable {
        long j12;
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        if (this.f28189l) {
            androidx.compose.ui.graphics.drawscope.g.Z0(dVar2, this.f28190m, 0L, 0L, this.f28191n, null, 246);
        } else {
            long j13 = this.f28191n;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
            float f12 = this.f28192o;
            if (fIntBitsToFloat < f12) {
                float f13 = this.f28193p;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.i() >> 32));
                float f14 = this.f28193p;
                float f15 = fIntBitsToFloat2 - f14;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dVar2.i() & 4294967295L)) - f14;
                androidx.compose.ui.graphics.S.f39317b.getClass();
                androidx.compose.ui.graphics.J j14 = this.f28190m;
                long j15 = this.f28191n;
                a.b f39478c = dVar2.getF39478c();
                long jE2 = f39478c.e();
                f39478c.a().k();
                try {
                    f39478c.f39485a.b(f13, f13, f15, fIntBitsToFloat3, 0);
                    try {
                        androidx.compose.ui.graphics.drawscope.g.Z0(dVar2, j14, 0L, 0L, j15, null, 246);
                        H.C(f39478c, jE2);
                    } catch (Throwable th2) {
                        th = th2;
                        j12 = jE2;
                        H.C(f39478c, j12);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j12 = jE2;
                }
            } else {
                androidx.compose.ui.graphics.drawscope.g.Z0(dVar2, this.f28190m, this.f28194q, this.f28195r, C20529i0.c(j13, f12), this.f28196s, JfifUtil.MARKER_RST0);
            }
        }
        return kotlin.G0.f406611a;
    }
}
