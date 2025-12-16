package defpackage;

import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final class yrc extends dtf implements sm6 {
    public final /* synthetic */ QrScannerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrc(Continuation continuation, QrScannerWidget qrScannerWidget) {
        super(2, continuation);
        this.X = qrScannerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yrc yrcVar = (yrc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yrcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yrc yrcVar = new yrc(continuation, this.X);
        yrcVar.o = obj;
        return yrcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        z8c z8cVar = (z8c) this.o;
        int i = z8cVar == null ? -1 : xrc.$EnumSwitchMapping$0[z8cVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            QrScannerWidget qrScannerWidget = this.X;
            ViewPropertyAnimator viewPropertyAnimatorWithStartAction = ((FrameLayout) qrScannerWidget.w0.D(qrScannerWidget, QrScannerWidget.E0[6])).animate().alpha(0.0f).setDuration(800L).setInterpolator((PathInterpolator) qrScannerWidget.D0.getValue()).withStartAction(new vrc(qrScannerWidget, 0));
            qrScannerWidget.A0 = viewPropertyAnimatorWithStartAction;
            if (viewPropertyAnimatorWithStartAction != null) {
                viewPropertyAnimatorWithStartAction.start();
            }
        }
        return qqg.a;
    }
}
