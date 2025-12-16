package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CrossfadePainter.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/n;", "Landroidx/compose/ui/graphics/painter/e;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends androidx.compose.ui.graphics.painter.e {

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.painter.e f58250g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.graphics.painter.e f58251h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22374n f58252i;

    /* renamed from: j, reason: collision with root package name */
    public final int f58253j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f58254k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f58255l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f58258o;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f58256m = U2.a(0);

    /* renamed from: n, reason: collision with root package name */
    public long f58257n = -1;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f58259p = Q1.a(1.0f);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f58260q = C22126m3.g(null);

    public n(@Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar2, @Y61.k InterfaceC22374n interfaceC22374n, int i12, boolean z12, boolean z13) {
        this.f58250g = eVar;
        this.f58251h = eVar2;
        this.f58252i = interfaceC22374n;
        this.f58253j = i12;
        this.f58254k = z12;
        this.f58255l = z13;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        ((C22040c3) this.f58259p).S6(f12);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@Y61.l U u12) {
        ((C22082i3) this.f58260q).setValue(u12);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: h */
    public final long getF39738j() {
        long f39738j;
        androidx.compose.ui.graphics.painter.e eVar = this.f58250g;
        long f39738j2 = 0;
        if (eVar != null) {
            f39738j = eVar.getF39738j();
        } else {
            l0.n.f413402b.getClass();
            f39738j = 0;
        }
        androidx.compose.ui.graphics.painter.e eVar2 = this.f58251h;
        if (eVar2 != null) {
            f39738j2 = eVar2.getF39738j();
        } else {
            l0.n.f413402b.getClass();
        }
        l0.n.f413402b.getClass();
        long j12 = l0.n.f413403c;
        boolean z12 = f39738j != j12;
        boolean z13 = f39738j2 != j12;
        if (z12 && z13) {
            return l0.o.a(Math.max(l0.n.e(f39738j), l0.n.e(f39738j2)), Math.max(l0.n.c(f39738j), l0.n.c(f39738j2)));
        }
        if (this.f58255l) {
            if (z12) {
                return f39738j;
            }
            if (z13) {
                return f39738j2;
            }
        }
        return j12;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@Y61.k androidx.compose.ui.graphics.drawscope.g gVar) {
        boolean z12 = this.f58258o;
        androidx.compose.ui.graphics.painter.e eVar = this.f58251h;
        InterfaceC22192v1 interfaceC22192v1 = this.f58259p;
        if (z12) {
            j(gVar, eVar, ((C22040c3) interfaceC22192v1).f());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f58257n == -1) {
            this.f58257n = jUptimeMillis;
        }
        float f12 = (jUptimeMillis - this.f58257n) / this.f58253j;
        float f13 = ((C22040c3) interfaceC22192v1).f() * kotlin.ranges.s.f(f12, 0.0f, 1.0f);
        float f14 = this.f58254k ? ((C22040c3) interfaceC22192v1).f() - f13 : ((C22040c3) interfaceC22192v1).f();
        this.f58258o = f12 >= 1.0f;
        j(gVar, this.f58250g, f14);
        j(gVar, eVar, f13);
        if (this.f58258o) {
            this.f58250g = null;
        } else {
            InterfaceC22196w1 interfaceC22196w1 = this.f58256m;
            ((C22061e3) interfaceC22196w1).L3(((C22061e3) interfaceC22196w1).e() + 1);
        }
    }

    public final void j(androidx.compose.ui.graphics.drawscope.g gVar, androidx.compose.ui.graphics.painter.e eVar, float f12) {
        if (eVar == null || f12 <= 0.0f) {
            return;
        }
        long jI2 = gVar.i();
        long f39738j = eVar.getF39738j();
        l0.n.f413402b.getClass();
        long j12 = l0.n.f413403c;
        long jA2 = (f39738j == j12 || l0.n.f(f39738j) || jI2 == j12 || l0.n.f(jI2)) ? jI2 : T0.a(f39738j, this.f58252i.a(f39738j, jI2));
        InterfaceC22204y1 interfaceC22204y1 = this.f58260q;
        if (jI2 == j12 || l0.n.f(jI2)) {
            eVar.g(gVar, jA2, f12, (U) ((C22082i3) interfaceC22204y1).getF42167b());
            return;
        }
        float f13 = 2;
        float fE2 = (l0.n.e(jI2) - l0.n.e(jA2)) / f13;
        float fC2 = (l0.n.c(jI2) - l0.n.c(jA2)) / f13;
        gVar.getF39478c().f39485a.c(fE2, fC2, fE2, fC2);
        eVar.g(gVar, jA2, f12, (U) ((C22082i3) interfaceC22204y1).getF42167b());
        float f14 = -fE2;
        float f15 = -fC2;
        gVar.getF39478c().f39485a.c(f14, f15, f14, f15);
    }
}
