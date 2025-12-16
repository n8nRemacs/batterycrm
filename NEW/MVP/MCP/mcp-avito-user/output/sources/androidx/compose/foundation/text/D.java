package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.o;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: BasicTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.input.o f30187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.input.internal.p1 f30188m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f30189n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f30190o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f30191p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f30192q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.input.internal.t1 f30193r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f30194s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.k1 f30195t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f30196u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f30197v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.d2 f30198w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Orientation f30199x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f30200y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C20981p1 f30201z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(androidx.compose.foundation.text.input.o oVar, androidx.compose.foundation.text.input.internal.p1 p1Var, androidx.compose.ui.text.x0 x0Var, boolean z12, boolean z13, boolean z14, androidx.compose.foundation.text.input.internal.t1 t1Var, TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.k1 k1Var, boolean z15, boolean z16, androidx.compose.foundation.d2 d2Var, Orientation orientation, boolean z17, C20981p1 c20981p1) {
        super(2);
        this.f30187l = oVar;
        this.f30188m = p1Var;
        this.f30189n = x0Var;
        this.f30190o = z12;
        this.f30191p = z13;
        this.f30192q = z14;
        this.f30193r = t1Var;
        this.f30194s = textFieldSelectionState;
        this.f30195t = k1Var;
        this.f30196u = z15;
        this.f30197v = z16;
        this.f30198w = d2Var;
        this.f30199x = orientation;
        this.f30200y = z17;
        this.f30201z = c20981p1;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.foundation.text.input.o oVar = this.f30187l;
            if (oVar instanceof o.b) {
                o.b bVar = (o.b) oVar;
                i13 = bVar.f31515a;
                i12 = bVar.f31516b;
            } else {
                i12 = 1;
                i13 = 1;
            }
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.foundation.text.input.internal.p1 p1Var = this.f30188m;
            androidx.compose.ui.v vVarH = C20588k2.h(((androidx.compose.ui.unit.h) ((C22082i3) p1Var.f31205f).getF42167b()).f42852b, 0.0f, 2, aVar);
            Y41.l<C22547y1, kotlin.G0> lVar = C22535v1.f41625a;
            androidx.compose.ui.text.x0 x0Var = this.f30189n;
            androidx.compose.ui.v vVarB = androidx.compose.ui.draw.k.b(androidx.compose.ui.n.a(androidx.compose.ui.n.a(vVarH, lVar, new C20845a1(i13, i12, x0Var)), lVar, new N2(x0Var)));
            boolean z12 = this.f30191p;
            boolean z13 = this.f30190o;
            boolean z14 = z13 && z12;
            boolean z15 = this.f30197v;
            boolean z16 = this.f30196u;
            androidx.compose.ui.v vVarD0 = vVarB.d0(new TextFieldCoreModifier(z14, this.f30192q, this.f30188m, this.f30193r, this.f30194s, this.f30195t, z16 && !z15, this.f30198w, this.f30199x));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, true);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD0);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20632w.a(androidx.compose.foundation.relocation.e.b(aVar, p1Var.f31206g).d0(new TextFieldTextLayoutModifier(p1Var, this.f30193r, this.f30189n, this.f30200y, this.f30201z)), a13, 0);
            if (z16 && z13 && z12) {
                this.f30194s.getClass();
                throw null;
            }
            a13.C(-1319893344);
            a13.h();
            a13.z();
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
