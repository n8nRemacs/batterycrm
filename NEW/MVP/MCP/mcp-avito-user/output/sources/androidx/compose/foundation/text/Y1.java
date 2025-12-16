package androidx.compose.foundation.text;

import androidx.compose.runtime.C22040c3;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import l0.g;

/* compiled from: TextFieldCursor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Y1 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.input.internal.I f30620l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30621m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30622n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30623o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.J f30624p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(androidx.compose.foundation.text.input.internal.I i12, androidx.compose.ui.text.input.L l12, androidx.compose.ui.text.input.W w12, C20985q1 c20985q1, androidx.compose.ui.graphics.J j12) {
        super(1);
        this.f30620l = i12;
        this.f30621m = l12;
        this.f30622n = w12;
        this.f30623o = c20985q1;
        this.f30624p = j12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.text.o0 o0Var;
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        float f12 = ((C22040c3) this.f30620l.f30840c).f();
        if (f12 != 0.0f) {
            long j12 = this.f30622n.f42384b;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            int iB2 = this.f30621m.b((int) (j12 >> 32));
            Q2 q2D = this.f30623o.d();
            l0.j jVar = (q2D == null || (o0Var = q2D.f30513a) == null) ? new l0.j(0.0f, 0.0f, 0.0f, 0.0f) : o0Var.c(iB2);
            float fA2 = kotlin.ranges.s.a((float) Math.floor(dVar2.M0(C20850b2.f30651a)), 1.0f);
            float f13 = fA2 / 2;
            float fA3 = kotlin.ranges.s.a(kotlin.ranges.s.c(jVar.f413390a + f13, Float.intBitsToFloat((int) (dVar2.i() >> 32)) - f13), f13);
            float fFloor = ((int) fA2) % 2 == 1 ? ((float) Math.floor(fA3)) + 0.5f : (float) Math.rint(fA3);
            g.a aVar2 = l0.g.f413384b;
            androidx.compose.ui.graphics.drawscope.g.z1(dVar2, this.f30624p, (Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(jVar.f413391b) & 4294967295L), (Float.floatToRawIntBits(jVar.f413393d) & 4294967295L) | (Float.floatToRawIntBits(fFloor) << 32), fA2, f12, 432);
        }
        return kotlin.G0.f406611a;
    }
}
