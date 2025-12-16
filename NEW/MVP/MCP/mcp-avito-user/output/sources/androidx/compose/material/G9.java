package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class G9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32686l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f32687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f32688n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f32689o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C20805p0 f32690p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f32691q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32692r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f32693s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f32694t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f32695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G9(float f12, float f13, long j12, Y41.a aVar, C20805p0 c20805p0, androidx.compose.foundation.interaction.m mVar, C22096n c22096n, androidx.compose.ui.v vVar, androidx.compose.ui.graphics.h1 h1Var, boolean z12) {
        super(2);
        this.f32686l = vVar;
        this.f32687m = h1Var;
        this.f32688n = j12;
        this.f32689o = f12;
        this.f32690p = c20805p0;
        this.f32691q = f13;
        this.f32692r = mVar;
        this.f32693s = z12;
        this.f32694t = aVar;
        this.f32695u = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.runtime.J3 j32 = C21142d5.f33523a;
            androidx.compose.ui.v vVarB = C21086w0.b(M9.c(this.f32686l.d0(MinimumInteractiveModifier.f32952b), this.f32687m, M9.d(this.f32688n, (InterfaceC21128c4) a13.o(C21141d4.f33519a), this.f32689o, a13), this.f32690p, this.f32691q), this.f32692r, B7.a(0.0f, 7, 0L, false), this.f32693s, null, this.f32694t, 24);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, true);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            this.f32695u.invoke(a13, 0);
            a13.z();
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
