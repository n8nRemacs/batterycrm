package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import d0.C39460i;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21763o4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36937m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36938n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f36939o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y3 f36940p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f36941q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f36942r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f36943s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f36944t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21763o4(androidx.compose.ui.v vVar, Y41.p pVar, Y41.p pVar2, C22096n c22096n, Y3 y32, androidx.compose.ui.text.x0 x0Var, float f12, C22096n c22096n2, int i12) {
        super(2);
        this.f36936l = vVar;
        this.f36937m = pVar;
        this.f36938n = pVar2;
        this.f36939o = c22096n;
        this.f36940p = y32;
        this.f36941q = x0Var;
        this.f36942r = f12;
        this.f36943s = c22096n2;
        this.f36944t = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        float f12;
        androidx.compose.ui.text.x0 x0Var;
        Y3 y32;
        C22096n c22096n;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar;
        num.intValue();
        int iA2 = C22066f2.a(this.f36944t | 1);
        C22096n c22096n2 = this.f36943s;
        float f13 = V4.f35601a;
        androidx.compose.runtime.B bE2 = a12.E(1507356255);
        int i13 = iA2 & 6;
        androidx.compose.ui.v vVar = this.f36936l;
        if (i13 == 0) {
            i12 = (bE2.B(vVar) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i14 = iA2 & 48;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f36937m;
        if (i14 == 0) {
            i12 |= bE2.u(pVar2) ? 32 : 16;
        }
        int i15 = iA2 & 384;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f36938n;
        if (i15 == 0) {
            i12 |= bE2.u(pVar3) ? 256 : 128;
        }
        int i16 = iA2 & 3072;
        C22096n c22096n3 = this.f36939o;
        if (i16 == 0) {
            i12 |= bE2.u(c22096n3) ? 2048 : 1024;
        }
        int i17 = iA2 & 24576;
        Y3 y33 = this.f36940p;
        if (i17 == 0) {
            i12 |= bE2.B(y33) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i18 = 196608 & iA2;
        androidx.compose.ui.text.x0 x0Var2 = this.f36941q;
        if (i18 == 0) {
            i12 |= bE2.B(x0Var2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i19 = 1572864 & iA2;
        float f14 = this.f36942r;
        if (i19 == 0) {
            i12 |= bE2.k(f14) ? 1048576 : 524288;
        }
        if ((12582912 & iA2) == 0) {
            i12 |= bE2.u(c22096n2) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && bE2.c()) {
            bE2.f();
            f12 = f14;
            x0Var = x0Var2;
            y32 = y33;
            c22096n = c22096n3;
            pVar = pVar3;
        } else {
            C39460i.f393425a.getClass();
            f12 = f14;
            x0Var = x0Var2;
            y32 = y33;
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(C20588k2.s(vVar, C39460i.f393427c, 0.0f, 0.0f, 0.0f, 14), false, C21694l4.f36791l);
            bE2.I(-483455358);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            bE2.I(-1323940314);
            int i22 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarB);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, iA3);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar4 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar4);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            c22096n = c22096n3;
            pVar = pVar3;
            V4.a(androidx.compose.ui.v.f42878y1, pVar2, y32.f35862b, y32.f35863c, f12, androidx.compose.runtime.internal.r.b(bE2, -229007058, new C21740n4(pVar3, c22096n, pVar2, y32, x0Var)), bE2, (i12 & 112) | 196614 | (57344 & (i12 >> 6)));
            androidx.compose.foundation.H.w((i12 >> 21) & 14, c22096n2, bE2, false, true);
            bE2.X(false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21763o4(vVar, pVar2, pVar, c22096n, y32, x0Var, f12, c22096n2, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
