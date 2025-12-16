package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22438u;
import kotlin.Metadata;
import l0.g;

/* compiled from: AndroidOverscroll.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/j1;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20533j1 extends AbstractC22425n implements InterfaceC22438u {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20525h f28179r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final T0 f28180s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f28181t;

    public C20533j1(@Y61.k androidx.compose.ui.input.pointer.g0 g0Var, @Y61.k C20525h c20525h, @Y61.k T0 t02, @Y61.k androidx.compose.foundation.layout.T1 t12) {
        this.f28179r = c20525h;
        this.f28180s = t02;
        this.f28181t = t12;
        k2(g0Var);
    }

    public static boolean n2(float f12, long j12, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f12);
        canvas.translate(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        boolean zN2;
        androidx.compose.ui.node.P p13;
        androidx.compose.ui.graphics.drawscope.a aVar;
        androidx.compose.ui.graphics.drawscope.a aVar2 = p12.f40671b;
        long jI2 = aVar2.i();
        C20525h c20525h = this.f28179r;
        c20525h.h(jI2);
        if (l0.n.f(aVar2.i())) {
            p12.y1();
            return;
        }
        p12.y1();
        ((C22082i3) c20525h.f28109d).getF42167b();
        androidx.compose.ui.graphics.M mA2 = aVar2.f39478c.a();
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) mA2).f39351a;
        T0 t02 = this.f28180s;
        boolean zF2 = T0.f(t02.f26861f);
        androidx.compose.foundation.layout.T1 t12 = this.f28181t;
        if (zF2) {
            EdgeEffect edgeEffectC = t02.c();
            float f12 = -Float.intBitsToFloat((int) (aVar2.i() & 4294967295L));
            g.a aVar3 = l0.g.f413384b;
            zN2 = n2(270.0f, (Float.floatToRawIntBits(p12.M0(t12.c(p12.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32), edgeEffectC, canvas2);
        } else {
            zN2 = false;
        }
        if (T0.f(t02.f26859d)) {
            EdgeEffect edgeEffectE = t02.e();
            float fM02 = p12.M0(t12.getF28512b());
            long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM02) & 4294967295L;
            g.a aVar4 = l0.g.f413384b;
            zN2 = n2(0.0f, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), edgeEffectE, canvas2) || zN2;
        }
        if (T0.f(t02.f26862g)) {
            EdgeEffect edgeEffectD = t02.d();
            p13 = p12;
            float fM03 = p13.M0(t12.a(p12.getLayoutDirection())) + (-kotlin.math.b.b(Float.intBitsToFloat((int) (aVar2.i() >> 32))));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            int iFloatToRawIntBits = Float.floatToRawIntBits(fM03);
            aVar = aVar2;
            long j12 = (iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits3 << 32);
            g.a aVar5 = l0.g.f413384b;
            zN2 = n2(90.0f, j12, edgeEffectD, canvas2) || zN2;
        } else {
            p13 = p12;
            aVar = aVar2;
        }
        if (T0.f(t02.f26860e)) {
            EdgeEffect edgeEffectB = t02.b();
            float fM04 = p13.M0(t12.getF28514d());
            long jFloatToRawIntBits4 = (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (aVar.i() >> 32))) << 32) | (Float.floatToRawIntBits((-Float.intBitsToFloat((int) (aVar.i() & 4294967295L))) + fM04) & 4294967295L);
            g.a aVar6 = l0.g.f413384b;
            zN2 = n2(180.0f, jFloatToRawIntBits4, edgeEffectB, canvas2) || zN2;
        }
        if (zN2) {
            c20525h.c();
        }
    }
}
