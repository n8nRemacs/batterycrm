package androidx.compose.material3;

import androidx.compose.foundation.C20805p0;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: Surface.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ug extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35563l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f35564m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f35565n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f35566o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C20805p0 f35567p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35568q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f35569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f35570s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f35571t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f35572u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ug(float f12, float f13, long j12, Y41.a aVar, C20805p0 c20805p0, androidx.compose.foundation.interaction.m mVar, C22096n c22096n, androidx.compose.ui.v vVar, androidx.compose.ui.graphics.h1 h1Var, boolean z12) {
        super(2);
        this.f35563l = vVar;
        this.f35564m = h1Var;
        this.f35565n = j12;
        this.f35566o = f12;
        this.f35567p = c20805p0;
        this.f35568q = mVar;
        this.f35569r = z12;
        this.f35570s = aVar;
        this.f35571t = f13;
        this.f35572u = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.runtime.J3 j32 = G8.f34785a;
            androidx.compose.ui.v vVarB = C21086w0.b(Qg.d(this.f35563l.d0(MinimumInteractiveModifier.f35155b), this.f35564m, Qg.e(this.f35565n, this.f35566o, a13), this.f35567p, ((androidx.compose.ui.unit.d) a13.o(androidx.compose.ui.platform.Q0.f41199h)).M0(this.f35571t)), this.f35568q, androidx.compose.material.ripple.w.a(false, 0.0f, 0L, a13, 0, 7), this.f35569r, null, this.f35570s, 24);
            a13.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, true, a13, 48);
            a13.I(-1323940314);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarB);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar);
            } else {
                a13.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.foundation.H.x(0, c22096nC, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            this.f35572u.invoke(a13, 0);
            a13.O();
            a13.z();
            a13.O();
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
