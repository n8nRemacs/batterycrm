package androidx.compose.material;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AlertDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21227k extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f33724m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33725n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21227k(float f12, float f13, C22096n c22096n, int i12) {
        super(2);
        this.f33723l = f12;
        this.f33724m = f13;
        this.f33725n = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(439);
        C22096n c22096n = this.f33725n;
        androidx.compose.ui.v vVar = C21279o.f33847a;
        androidx.compose.runtime.B bE2 = a12.E(73434452);
        boolean zP2 = bE2.p(iA2 & 1, (iA2 & 147) != 146);
        float f12 = this.f33724m;
        float f13 = this.f33723l;
        if (zP2) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new C21214j(f13, f12);
                bE2.H(objT);
            }
            InterfaceC22365i0 interfaceC22365i0 = (InterfaceC22365i0) objT;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            int i12 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i12))) {
                AK.c.y(i12, bE2, i12, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.H.v(6, c22096n, bE2, true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21227k(f13, f12, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
