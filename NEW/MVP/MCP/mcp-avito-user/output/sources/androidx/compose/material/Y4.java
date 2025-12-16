package androidx.compose.material;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: IconButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33371l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f33373n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f33374o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f33375p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(Y41.a aVar, androidx.compose.ui.v vVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f33371l = aVar;
        this.f33372m = vVar;
        this.f33373n = z12;
        this.f33374o = c22096n;
        this.f33375p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        boolean z12;
        num.intValue();
        int iA2 = C22066f2.a(this.f33375p | 1);
        C22096n c22096n = this.f33374o;
        float f12 = C21103a5.f33405a;
        androidx.compose.runtime.B bE2 = a12.E(-111063634);
        int i13 = iA2 & 6;
        Y41.a<kotlin.G0> aVar = this.f33371l;
        if (i13 == 0) {
            i12 = (bE2.u(aVar) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i14 = iA2 & 48;
        androidx.compose.ui.v vVar = this.f33372m;
        if (i14 == 0) {
            i12 |= bE2.B(vVar) ? 32 : 16;
        }
        int i15 = i12 | 3456;
        if ((iA2 & 24576) == 0) {
            i15 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bE2.p(i15 & 1, (i15 & 9363) != 9362)) {
            androidx.compose.runtime.J3 j32 = C21142d5.f33523a;
            androidx.compose.ui.v vVarD0 = vVar.d0(MinimumInteractiveModifier.f32952b);
            androidx.compose.ui.semantics.i.f41744b.getClass();
            androidx.compose.ui.v vVarB = C21086w0.b(vVarD0, null, B7.a(C21103a5.f33405a, 4, 0L, false), true, androidx.compose.ui.semantics.i.a(0), aVar, 8);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i16 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(1885393015);
            C22143q0 c22143q0 = C21427z2.f34423a;
            float fFloatValue = ((Number) bE2.o(c22143q0)).floatValue();
            bE2.X(false);
            androidx.compose.runtime.S.a(c22143q0.b(Float.valueOf(fFloatValue)), c22096n, bE2, ((i15 >> 9) & 112) | 8);
            bE2.X(true);
            z12 = true;
        } else {
            bE2.f();
            z12 = this.f33373n;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Y4(aVar, vVar, z12, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
