package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.style.h;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Vj extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35700l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f35701m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vj(androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f35700l = vVar;
        this.f35701m = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(this.f35701m | 1);
        float f12 = Ok.f35270a;
        androidx.compose.runtime.B bE2 = a12.E(2100674302);
        int i13 = iA2 & 6;
        androidx.compose.ui.v vVar2 = this.f35700l;
        if (i13 == 0) {
            i12 = (bE2.B(vVar2) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        if ((i12 & 3) == 2 && bE2.c()) {
            bE2.f();
            vVar = vVar2;
        } else {
            androidx.compose.ui.text.x0 x0Var = (androidx.compose.ui.text.x0) bE2.o(C21914uj.f37441a);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i14 = androidx.compose.ui.text.style.i.f42678e;
            h.a.f42662b.getClass();
            float f13 = h.a.f42663c;
            h.d.f42670b.getClass();
            androidx.compose.ui.text.x0 x0VarB = androidx.compose.ui.text.x0.b(x0Var, 0L, 0L, null, null, 0L, i14, 0L, null, new androidx.compose.ui.text.style.h(f13, h.d.f42673e, null), 15695871);
            androidx.compose.ui.v vVarA = androidx.compose.ui.semantics.r.a(vVar2, Uj.f35577l);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            bE2.I(733328855);
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(iVar, false, bE2, 6);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarA);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            d0.i0.f393440a.getClass();
            vVar = vVar2;
            C21914uj.b(":", null, C21964x3.d(d0.i0.f393442c, bE2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, x0VarB, bE2, 6, 0, 65530);
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Vj(vVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
