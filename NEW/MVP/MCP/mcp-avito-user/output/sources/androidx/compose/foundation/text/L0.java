package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.C22273n;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30474l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30475m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30476n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C20985q1 c20985q1, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12) {
        super(1);
        this.f30474l = c20985q1;
        this.f30475m = w12;
        this.f30476n = l12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        long j12;
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        C20985q1 c20985q1 = this.f30474l;
        Q2 q2D = c20985q1.d();
        if (q2D != null) {
            androidx.compose.ui.graphics.M mA2 = gVar2.getF39478c().a();
            C20862e2.a aVar = C20862e2.f30700a;
            long j13 = ((androidx.compose.ui.text.v0) ((C22082i3) c20985q1.f31803z).getF42167b()).f42736a;
            long j14 = ((androidx.compose.ui.text.v0) ((C22082i3) c20985q1.f31777A).getF42167b()).f42736a;
            long j15 = c20985q1.f31802y;
            aVar.getClass();
            boolean zD2 = androidx.compose.ui.text.v0.d(j13);
            C22273n c22273n = c20985q1.f31801x;
            androidx.compose.ui.text.input.L l12 = this.f30476n;
            androidx.compose.ui.text.o0 o0Var = q2D.f30513a;
            if (!zD2) {
                c22273n.b(j15);
                C20862e2.a.a(mA2, j13, l12, o0Var, c22273n);
            } else if (androidx.compose.ui.text.v0.d(j14)) {
                androidx.compose.ui.text.input.W w12 = this.f30475m;
                if (!androidx.compose.ui.text.v0.d(w12.f42384b)) {
                    c22273n.b(j15);
                    C20862e2.a.a(mA2, w12.f42384b, l12, o0Var, c22273n);
                }
            } else {
                androidx.compose.ui.graphics.T tA2 = androidx.compose.ui.graphics.T.a(o0Var.f42526a.f42507b.d());
                if (tA2.f39331a == 16) {
                    tA2 = null;
                }
                if (tA2 != null) {
                    j12 = tA2.f39331a;
                } else {
                    androidx.compose.ui.graphics.T.f39320b.getClass();
                    j12 = androidx.compose.ui.graphics.T.f39321c;
                }
                c22273n.b(androidx.compose.ui.graphics.T.c(j12, androidx.compose.ui.graphics.T.e(j12) * 0.2f));
                C20862e2.a.a(mA2, j14, l12, o0Var, c22273n);
            }
            androidx.compose.ui.text.t0.f42728a.getClass();
            androidx.compose.ui.text.t0.a(mA2, o0Var);
        }
        return kotlin.G0.f406611a;
    }
}
