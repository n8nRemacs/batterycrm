package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class vrc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrScannerWidget b;

    public /* synthetic */ vrc(QrScannerWidget qrScannerWidget, int i) {
        this.a = i;
        this.b = qrScannerWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        QrScannerWidget qrScannerWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = QrScannerWidget.E0;
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = qrScannerWidget.y0().animate().setStartDelay(200L).alpha(1.0f).setInterpolator((PathInterpolator) qrScannerWidget.D0.getValue()).setDuration(670L).withStartAction(new vrc(qrScannerWidget, i2)).withEndAction(new vrc(qrScannerWidget, 2));
                qrScannerWidget.B0 = viewPropertyAnimatorWithEndAction;
                if (viewPropertyAnimatorWithEndAction != null) {
                    viewPropertyAnimatorWithEndAction.start();
                    break;
                }
                break;
            case 1:
                yy7[] yy7VarArr2 = QrScannerWidget.E0;
                hrc hrcVarY0 = qrScannerWidget.y0();
                ValueAnimator valueAnimator = hrcVarY0.c;
                if (!valueAnimator.isRunning()) {
                    valueAnimator.start();
                }
                hrcVarY0.a.setColor(hrcVarY0.x0);
                hrcVarY0.y0 = false;
                hrcVarY0.o = null;
                hrcVarY0.invalidate();
                break;
            default:
                qrScannerWidget.C0 = true;
                break;
        }
    }
}
