package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.C22285t0;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: CanvasDrawScope.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/b;", "Landroidx/compose/ui/graphics/drawscope/k;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.b f39488a;

    public b(a.b bVar) {
        this.f39488a = bVar;
    }

    public final void a(Path path, int i12) {
        this.f39488a.a().h(path, i12);
    }

    public final void b(float f12, float f13, float f14, float f15, int i12) {
        this.f39488a.a().c(f12, f13, f14, f15, i12);
    }

    public final void c(float f12, float f13, float f14, float f15) {
        a.b bVar = this.f39488a;
        M mA2 = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32)) - (f14 + f12);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) - (f15 + f13);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n.a aVar = l0.n.f413402b;
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            C22285t0.a("Width and height must be greater than or equal to zero");
        }
        bVar.j(jFloatToRawIntBits);
        mA2.m(f12, f13);
    }

    public final void d(long j12, float f12) {
        M mA2 = this.f39488a.a();
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        mA2.m(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        mA2.u(f12);
        mA2.m(-Float.intBitsToFloat(i12), -Float.intBitsToFloat(i13));
    }

    public final void e(float f12, float f13, long j12) {
        M mA2 = this.f39488a.a();
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        mA2.m(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        mA2.g(f12, f13);
        mA2.m(-Float.intBitsToFloat(i12), -Float.intBitsToFloat(i13));
    }

    public final void f(float f12, float f13) {
        this.f39488a.a().m(f12, f13);
    }
}
