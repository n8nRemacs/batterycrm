package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/g2;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class g2 extends AbstractC22425n implements InterfaceC22438u {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20525h f27159r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final T0 f27160s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public RenderNode f27161t;

    public g2(@Y61.k androidx.compose.ui.input.pointer.g0 g0Var, @Y61.k C20525h c20525h, @Y61.k T0 t02) {
        this.f27159r = c20525h;
        this.f27160s = t02;
        k2(g0Var);
    }

    public static boolean n2(float f12, EdgeEffect edgeEffect, Canvas canvas) {
        if (f12 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f12);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode o2() {
        RenderNode renderNode = this.f27161t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeE = androidx.appcompat.widget.G0.e();
        this.f27161t = renderNodeE;
        return renderNodeE;
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        boolean zN2;
        float f12;
        androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
        long jI2 = aVar.i();
        C20525h c20525h = this.f27159r;
        c20525h.h(jI2);
        androidx.compose.ui.graphics.M mA2 = aVar.f39478c.a();
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) mA2).f39351a;
        ((C22082i3) c20525h.f28109d).getF42167b();
        if (l0.n.f(aVar.i())) {
            p12.y1();
            return;
        }
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        T0 t02 = this.f27160s;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = t02.f26859d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = t02.f26860e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = t02.f26861f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = t02.f26862g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = t02.f26863h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = t02.f26864i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = t02.f26865j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = t02.f26866k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            p12.y1();
            return;
        }
        float fM02 = p12.M0(K0.f26750a);
        boolean z12 = T0.f(t02.f26859d) || T0.g(t02.f26863h) || T0.f(t02.f26860e) || T0.g(t02.f26864i);
        boolean z13 = T0.f(t02.f26861f) || T0.g(t02.f26865j) || T0.f(t02.f26862g) || T0.g(t02.f26866k);
        if (z12 && z13) {
            o2().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z12) {
            o2().setPosition(0, 0, (kotlin.math.b.b(fM02) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z13) {
                p12.y1();
                return;
            }
            o2().setPosition(0, 0, canvas2.getWidth(), (kotlin.math.b.b(fM02) * 2) + canvas2.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = o2().beginRecording();
        if (T0.g(t02.f26865j)) {
            EdgeEffect edgeEffectA = t02.f26865j;
            if (edgeEffectA == null) {
                edgeEffectA = t02.a(Orientation.f27426c);
                t02.f26865j = edgeEffectA;
            }
            n2(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (T0.f(t02.f26861f)) {
            EdgeEffect edgeEffectC = t02.c();
            zN2 = n2(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (T0.g(t02.f26861f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c20525h.b() & 4294967295L));
                R0 r02 = R0.f26833a;
                EdgeEffect edgeEffectA2 = t02.f26865j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = t02.a(Orientation.f27426c);
                    t02.f26865j = edgeEffectA2;
                }
                r02.getClass();
                R0.d(edgeEffectA2, R0.b(edgeEffectC), 1 - fIntBitsToFloat);
            }
        } else {
            zN2 = false;
        }
        if (T0.g(t02.f26863h)) {
            EdgeEffect edgeEffectA3 = t02.f26863h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = t02.a(Orientation.f27425b);
                t02.f26863h = edgeEffectA3;
            }
            n2(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (T0.f(t02.f26859d)) {
            EdgeEffect edgeEffectE = t02.e();
            zN2 = n2(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zN2;
            if (T0.g(t02.f26859d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c20525h.b() >> 32));
                R0 r03 = R0.f26833a;
                EdgeEffect edgeEffectA4 = t02.f26863h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = t02.a(Orientation.f27425b);
                    t02.f26863h = edgeEffectA4;
                }
                r03.getClass();
                R0.d(edgeEffectA4, R0.b(edgeEffectE), fIntBitsToFloat2);
            }
        }
        if (T0.g(t02.f26866k)) {
            EdgeEffect edgeEffectA5 = t02.f26866k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = t02.a(Orientation.f27426c);
                t02.f26866k = edgeEffectA5;
            }
            n2(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (T0.f(t02.f26862g)) {
            EdgeEffect edgeEffectD = t02.d();
            zN2 = n2(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zN2;
            if (T0.g(t02.f26862g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c20525h.b() & 4294967295L));
                R0 r04 = R0.f26833a;
                EdgeEffect edgeEffectA6 = t02.f26866k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = t02.a(Orientation.f27426c);
                    t02.f26866k = edgeEffectA6;
                }
                r04.getClass();
                R0.d(edgeEffectA6, R0.b(edgeEffectD), fIntBitsToFloat3);
            }
        }
        if (T0.g(t02.f26864i)) {
            EdgeEffect edgeEffectA7 = t02.f26864i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = t02.a(Orientation.f27425b);
                t02.f26864i = edgeEffectA7;
            }
            f12 = 0.0f;
            n2(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f12 = 0.0f;
        }
        if (T0.f(t02.f26860e)) {
            EdgeEffect edgeEffectB = t02.b();
            boolean z14 = n2(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zN2;
            if (T0.g(t02.f26860e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c20525h.b() >> 32));
                R0 r05 = R0.f26833a;
                EdgeEffect edgeEffectA8 = t02.f26864i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = t02.a(Orientation.f27425b);
                    t02.f26864i = edgeEffectA8;
                }
                r05.getClass();
                R0.d(edgeEffectA8, R0.b(edgeEffectB), 1 - fIntBitsToFloat4);
            }
            zN2 = z14;
        }
        if (zN2) {
            c20525h.c();
        }
        float f13 = z13 ? f12 : fM02;
        if (z12) {
            fM02 = f12;
        }
        LayoutDirection layoutDirection = p12.getLayoutDirection();
        C22245c c22245cA = C22247d.a(recordingCanvasBeginRecording);
        long jI3 = aVar.i();
        androidx.compose.ui.unit.d dVarB = aVar.f39478c.b();
        LayoutDirection layoutDirectionD = aVar.f39478c.d();
        androidx.compose.ui.graphics.M mA3 = aVar.f39478c.a();
        long jE2 = aVar.f39478c.e();
        a.b bVar = aVar.f39478c;
        C22267c c22267c = bVar.f39486b;
        bVar.g(p12);
        bVar.i(layoutDirection);
        bVar.f(c22245cA);
        bVar.j(jI3);
        bVar.f39486b = null;
        c22245cA.k();
        try {
            aVar.f39478c.f39485a.f(f13, fM02);
            try {
                p12.y1();
                float f14 = -f13;
                float f15 = -fM02;
                aVar.f39478c.f39485a.f(f14, f15);
                c22245cA.i();
                a.b bVar2 = aVar.f39478c;
                bVar2.g(dVarB);
                bVar2.i(layoutDirectionD);
                bVar2.f(mA3);
                bVar2.j(jE2);
                bVar2.f39486b = c22267c;
                o2().endRecording();
                int iSave = canvas2.save();
                canvas2.translate(f14, f15);
                canvas2.drawRenderNode(o2());
                canvas2.restoreToCount(iSave);
            } catch (Throwable th2) {
                aVar.f39478c.f39485a.f(-f13, -fM02);
                throw th2;
            }
        } catch (Throwable th3) {
            c22245cA.i();
            a.b bVar3 = aVar.f39478c;
            bVar3.g(dVarB);
            bVar3.i(layoutDirectionD);
            bVar3.f(mA3);
            bVar3.j(jE2);
            bVar3.f39486b = c22267c;
            throw th3;
        }
    }
}
