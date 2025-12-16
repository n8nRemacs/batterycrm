package androidx.compose.material;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E6 f32527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f32530o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f32531p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f32532q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(E6 e62, androidx.compose.ui.v vVar, Y41.p pVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f32527l = e62;
        this.f32528m = vVar;
        this.f32529n = pVar;
        this.f32530o = c22096n;
        this.f32531p = c22096n2;
        this.f32532q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        E6 e62;
        androidx.compose.ui.v vVar;
        Y41.p pVar;
        int i13;
        boolean z12;
        num.intValue();
        int iA2 = C22066f2.a(this.f32532q | 1);
        E6 e63 = this.f32527l;
        e63.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-1884451315);
        int i14 = iA2 & 6;
        androidx.compose.ui.v vVar2 = this.f32528m;
        if (i14 == 0) {
            i12 = (bE2.B(vVar2) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i15 = iA2 & 48;
        Y41.p pVar2 = this.f32529n;
        if (i15 == 0) {
            i12 |= bE2.u(pVar2) ? 32 : 16;
        }
        int i16 = iA2 & 384;
        C22096n c22096n = this.f32530o;
        if (i16 == 0) {
            i12 |= bE2.u(c22096n) ? 256 : 128;
        }
        int i17 = iA2 & 3072;
        C22096n c22096n2 = this.f32531p;
        if (i17 == 0) {
            i12 |= bE2.u(c22096n2) ? 2048 : 1024;
        }
        if ((iA2 & 24576) == 0) {
            i12 |= bE2.B(e63) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bE2.p(i12 & 1, (i12 & 9363) != 9362)) {
            androidx.compose.ui.v vVarH = C20588k2.h(pVar2 == null ? E6.f32579a : E6.f32580b, 0.0f, 2, vVar2);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i18 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarH);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar3 = InterfaceC22413h.a.f40796g;
            androidx.compose.runtime.R3.b(pVar3, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar4 = InterfaceC22413h.a.f40795f;
            androidx.compose.runtime.R3.b(pVar4, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar5);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar6 = InterfaceC22413h.a.f40793d;
            androidx.compose.runtime.R3.b(pVar6, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            if (pVar2 != null) {
                bE2.C(-1966455448);
                androidx.compose.ui.v vVarC2 = c20576h2.c(androidx.compose.ui.v.f42878y1, InterfaceC22215f.a.f39086l);
                float f12 = E6.f32582d;
                float f13 = f12 + E6.f32581c;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                vVar = vVar2;
                i13 = iA2;
                androidx.compose.ui.v vVarV = C20588k2.v(f13, 0.0f, 2, vVarC2);
                float f14 = E6.f32583e;
                androidx.compose.ui.v vVarM = androidx.compose.foundation.layout.R1.m(vVarV, f12, f14, 0.0f, f14, 4);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39079e, false);
                int i19 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S2 = bE2.S();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarM);
                bE2.A();
                e62 = e63;
                if (bE2.f37887P) {
                    bE2.b(aVar);
                } else {
                    bE2.d();
                }
                androidx.compose.runtime.R3.b(pVar3, bE2, interfaceC22365i0D);
                androidx.compose.runtime.R3.b(pVar4, bE2, o1S2);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i19))) {
                    AK.c.y(i19, bE2, i19, pVar5);
                }
                androidx.compose.runtime.R3.b(pVar6, bE2, vVarC3);
                C20644z c20644z = C20644z.f28804a;
                pVar2.invoke(bE2, Integer.valueOf((i12 >> 3) & 14));
                bE2.X(true);
                bE2.X(false);
            } else {
                e62 = e63;
                vVar = vVar2;
                i13 = iA2;
                bE2.C(-1965948040);
                bE2.X(false);
            }
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = c20576h2.a(aVar3, 1.0f, true);
            i.b bVar = InterfaceC22215f.a.f39086l;
            androidx.compose.ui.v vVarM2 = androidx.compose.foundation.layout.R1.m(c20576h2.c(vVarA, bVar), E6.f32584f, 0.0f, E6.f32585g, 0.0f, 10);
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(InterfaceC22215f.a.f39079e, false);
            int i22 = bE2.f37888Q;
            pVar = pVar2;
            androidx.compose.runtime.O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarM2);
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(pVar3, bE2, interfaceC22365i0D2);
            androidx.compose.runtime.R3.b(pVar4, bE2, o1S3);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar5);
            }
            androidx.compose.runtime.R3.b(pVar6, bE2, vVarC4);
            C20644z c20644z2 = C20644z.f28804a;
            androidx.compose.foundation.H.v((i12 >> 6) & 14, c22096n, bE2, true);
            if (c22096n2 != null) {
                bE2.C(-1965606420);
                androidx.compose.ui.v vVarM3 = androidx.compose.foundation.layout.R1.m(c20576h2.c(aVar3, bVar), 0.0f, 0.0f, E6.f32586h, 0.0f, 11);
                InterfaceC22365i0 interfaceC22365i0D3 = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i23 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S4 = bE2.S();
                androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(bE2, vVarM3);
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar);
                } else {
                    bE2.d();
                }
                androidx.compose.runtime.R3.b(pVar3, bE2, interfaceC22365i0D3);
                androidx.compose.runtime.R3.b(pVar4, bE2, o1S4);
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i23))) {
                    AK.c.y(i23, bE2, i23, pVar5);
                }
                androidx.compose.runtime.R3.b(pVar6, bE2, vVarC5);
                int i24 = (i12 >> 9) & 14;
                z12 = true;
                androidx.compose.foundation.H.w(i24, c22096n2, bE2, true, false);
            } else {
                z12 = true;
                bE2.C(-1965410376);
                bE2.X(false);
            }
            bE2.X(z12);
        } else {
            e62 = e63;
            vVar = vVar2;
            pVar = pVar2;
            i13 = iA2;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new D6(e62, vVar, pVar, c22096n, c22096n2, i13);
        }
        return kotlin.G0.f406611a;
    }
}
