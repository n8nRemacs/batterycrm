package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.drawscope.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l0.g;
import l0.n;

/* compiled from: Outline.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 {
    public static void a(androidx.compose.ui.graphics.drawscope.d dVar, D0 d02, J j12, float f12) {
        C22277p c22277p;
        androidx.compose.ui.graphics.drawscope.n nVar = androidx.compose.ui.graphics.drawscope.n.f39497a;
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        int i12 = g.a.f39492b;
        if (d02 instanceof D0.b) {
            l0.j jVar = ((D0.b) d02).f39222a;
            g.a aVar = l0.g.f413384b;
            dVar.o1(j12, (Float.floatToRawIntBits(jVar.f413390a) << 32) | (Float.floatToRawIntBits(jVar.f413391b) & 4294967295L), c(jVar), f12, nVar, null, i12);
            return;
        }
        if (d02 instanceof D0.c) {
            D0.c cVar = (D0.c) d02;
            c22277p = cVar.f39224b;
            if (c22277p == null) {
                l0.l lVar = cVar.f39223a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lVar.f413401h >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(lVar.f413394a) << 32) | (Float.floatToRawIntBits(lVar.f413395b) & 4294967295L);
                g.a aVar2 = l0.g.f413384b;
                float fC2 = lVar.c();
                float fB2 = lVar.b();
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fC2) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L);
                n.a aVar3 = l0.n.f413402b;
                dVar.Y(j12, jFloatToRawIntBits, jFloatToRawIntBits2, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), f12, nVar, i12);
                return;
            }
        } else {
            if (!(d02 instanceof D0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c22277p = ((D0.a) d02).f39221a;
        }
        dVar.x0(c22277p, j12, f12, nVar, i12);
    }

    public static void b(androidx.compose.ui.graphics.drawscope.d dVar, D0 d02, long j12, androidx.compose.ui.graphics.drawscope.o oVar, int i12) {
        C22277p c22277p;
        androidx.compose.ui.graphics.drawscope.d dVar2;
        androidx.compose.ui.graphics.drawscope.j jVar = (i12 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.n.f39497a : oVar;
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        int i13 = g.a.f39492b;
        if (d02 instanceof D0.b) {
            l0.j jVar2 = ((D0.b) d02).f39222a;
            g.a aVar = l0.g.f413384b;
            dVar.P1(j12, (Float.floatToRawIntBits(jVar2.f413390a) << 32) | (Float.floatToRawIntBits(jVar2.f413391b) & 4294967295L), c(jVar2), 1.0f, jVar, null, i13);
            return;
        }
        if (d02 instanceof D0.c) {
            D0.c cVar = (D0.c) d02;
            C22277p c22277p2 = cVar.f39224b;
            if (c22277p2 == null) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f39223a.f413401h >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(r0.f413394a) << 32) | (Float.floatToRawIntBits(r0.f413395b) & 4294967295L);
                g.a aVar2 = l0.g.f413384b;
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(r0.c()) << 32) | (Float.floatToRawIntBits(r0.b()) & 4294967295L);
                n.a aVar3 = l0.n.f413402b;
                dVar.s0(j12, jFloatToRawIntBits, jFloatToRawIntBits2, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), jVar, 1.0f, i13);
                return;
            }
            dVar2 = dVar;
            c22277p = c22277p2;
        } else {
            if (!(d02 instanceof D0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c22277p = ((D0.a) d02).f39221a;
            dVar2 = dVar;
        }
        dVar2.I0(c22277p, j12, 1.0f, jVar, i13);
    }

    public static final long c(l0.j jVar) {
        float f12 = jVar.f413392c - jVar.f413390a;
        float f13 = jVar.f413393d - jVar.f413391b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }
}
