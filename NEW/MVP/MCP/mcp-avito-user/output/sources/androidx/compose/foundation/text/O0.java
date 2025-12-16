package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class O0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.A, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f30497m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.F2 f30498n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30499o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30500p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30501q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C20985q1 c20985q1, boolean z12, androidx.compose.ui.platform.F2 f22, C21011f1 c21011f1, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12) {
        super(1);
        this.f30496l = c20985q1;
        this.f30497m = z12;
        this.f30498n = f22;
        this.f30499o = c21011f1;
        this.f30500p = w12;
        this.f30501q = l12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.layout.A a12) {
        androidx.compose.ui.text.input.i0 i0Var;
        androidx.compose.ui.layout.A a13;
        androidx.compose.ui.layout.A a14 = a12;
        C20985q1 c20985q1 = this.f30496l;
        c20985q1.f31785h = a14;
        Q2 q2D = c20985q1.d();
        if (q2D != null) {
            q2D.f30514b = a14;
        }
        if (this.f30497m) {
            HandleState handleStateA = c20985q1.a();
            HandleState handleState = HandleState.f30334c;
            C21011f1 c21011f1 = this.f30499o;
            InterfaceC22204y1 interfaceC22204y1 = c20985q1.f31792o;
            androidx.compose.ui.text.input.W w12 = this.f30500p;
            if (handleStateA == handleState) {
                if (((Boolean) ((C22082i3) c20985q1.f31789l).getF42167b()).booleanValue() && this.f30498n.a()) {
                    c21011f1.t();
                } else {
                    c21011f1.n();
                }
                ((C22082i3) c20985q1.f31790m).setValue(Boolean.valueOf(androidx.compose.foundation.text.selection.o1.b(c21011f1, true)));
                ((C22082i3) c20985q1.f31791n).setValue(Boolean.valueOf(androidx.compose.foundation.text.selection.o1.b(c21011f1, false)));
                ((C22082i3) interfaceC22204y1).setValue(Boolean.valueOf(androidx.compose.ui.text.v0.d(w12.f42384b)));
            } else if (c20985q1.a() == HandleState.f30335d) {
                ((C22082i3) interfaceC22204y1).setValue(Boolean.valueOf(androidx.compose.foundation.text.selection.o1.b(c21011f1, true)));
            }
            V0.f(c20985q1, w12, this.f30501q);
            Q2 q2D2 = c20985q1.d();
            if (q2D2 != null && (i0Var = c20985q1.f31782e) != null && c20985q1.b()) {
                C20862e2.f30700a.getClass();
                androidx.compose.ui.layout.A a15 = q2D2.f30514b;
                if (a15 != null && a15.m() && (a13 = q2D2.f30515c) != null) {
                    C20858d2 c20858d2 = new C20858d2(a15);
                    l0.j jVarC = androidx.compose.foundation.text.selection.M0.c(a15);
                    l0.j jVarP = a15.P(a13, false);
                    if (kotlin.jvm.internal.L.f(i0Var.f42445a.f42389b.get(), i0Var)) {
                        i0Var.f42446b.g(this.f30500p, this.f30501q, q2D2.f30513a, c20858d2, jVarC, jVarP);
                    }
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
