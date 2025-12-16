package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.R3;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class E0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f30215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f30216o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30217p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30218q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30219r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f30220s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f30221t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(C21011f1 c21011f1, C20985q1 c20985q1, boolean z12, boolean z13, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12, androidx.compose.ui.unit.d dVar, int i12) {
        super(2);
        this.f30213l = c21011f1;
        this.f30214m = c20985q1;
        this.f30215n = z12;
        this.f30216o = z13;
        this.f30217p = lVar;
        this.f30218q = w12;
        this.f30219r = l12;
        this.f30220s = dVar;
        this.f30221t = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C20985q1 c20985q1 = this.f30214m;
            D0 d02 = new D0(c20985q1, this.f30217p, this.f30218q, this.f30219r, this.f30220s, this.f30221t);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, d02);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            a13.z();
            HandleState handleStateA = c20985q1.a();
            HandleState handleState = HandleState.f30333b;
            boolean z12 = this.f30215n;
            boolean z13 = handleStateA != handleState && c20985q1.c() != null && c20985q1.c().m() && z12;
            C21011f1 c21011f1 = this.f30213l;
            V0.d(c21011f1, z13, a13, 0);
            if (c20985q1.a() == HandleState.f30335d && !this.f30216o && z12) {
                a13.C(-7167858);
                V0.c(c21011f1, a13, 0);
                a13.h();
            } else {
                a13.C(-7090978);
                a13.h();
            }
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
