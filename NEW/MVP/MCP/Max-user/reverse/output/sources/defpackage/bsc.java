package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final class bsc extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ QrScannerWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc(Continuation continuation, View view, QrScannerWidget qrScannerWidget) {
        super(2, continuation);
        this.X = view;
        this.Y = qrScannerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bsc bscVar = (bsc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bscVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bsc bscVar = new bsc(continuation, this.X, this.Y);
        bscVar.o = obj;
        return bscVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        lrc lrcVar = (lrc) this.o;
        if (fni.a(lrcVar, irc.a)) {
            uog.i(this.X, q07.REJECT);
            ccb ccbVar = new ccb(this.Y);
            ccbVar.e(new qcb(ivd.i1));
            ccbVar.g(new n5g(o9b.d));
            ccbVar.a(new n5g(o9b.c));
            ccbVar.i();
        } else if (!fni.a(lrcVar, jrc.a)) {
            if (!(lrcVar instanceof krc)) {
                throw new NoWhenBranchMatchedException();
            }
            QrScannerWidget qrScannerWidget = this.Y;
            ((TextView) qrScannerWidget.v0.D(qrScannerWidget, QrScannerWidget.E0[5])).setVisibility(8);
            krc krcVar = (krc) lrcVar;
            yqc yqcVar = (yqc) ue3.I(krcVar.a);
            if (yqcVar != null) {
                QrScannerWidget qrScannerWidget2 = this.Y;
                boolean z = krcVar.b;
                RectF rectF = qrScannerWidget2.x0;
                if (z) {
                    qrScannerWidget2.C0(yqcVar.a);
                } else {
                    rectF.set(yqcVar.b);
                    qrScannerWidget2.y0().setOnQrAnimationCompleteListener(new l3b(qrScannerWidget2, 15, yqcVar));
                    hrc hrcVarY0 = qrScannerWidget2.y0();
                    if (hrcVarY0.y0) {
                        hrcVarY0.d.set(rectF);
                        hrcVarY0.invalidate();
                    } else {
                        hrcVarY0.c.cancel();
                        hrcVarY0.o = rectF;
                        ValueAnimator valueAnimator = hrcVarY0.u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(hrcVarY0.x0), Integer.valueOf(hrcVarY0.w0));
                        valueAnimatorOfObject.setDuration(200L);
                        valueAnimatorOfObject.addUpdateListener(new grc(hrcVarY0, 1));
                        valueAnimatorOfObject.start();
                        hrcVarY0.u0 = valueAnimatorOfObject;
                        hrcVarY0.t0.set((hrcVarY0.getWidth() - hrcVarY0.b) / 2.0f, (hrcVarY0.getHeight() - hrcVarY0.b) / 2.0f, (hrcVarY0.getWidth() + hrcVarY0.b) / 2.0f, (hrcVarY0.getHeight() + hrcVarY0.b) / 2.0f);
                        ValueAnimator valueAnimator2 = hrcVarY0.v0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new sg(hrcVarY0, 6, rectF));
                        valueAnimatorOfFloat.addListener(new qe(8, hrcVarY0));
                        valueAnimatorOfFloat.start();
                        hrcVarY0.v0 = valueAnimatorOfFloat;
                        hrcVarY0.y0 = true;
                    }
                }
            }
        }
        String name = QrScannerWidget.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "SCAN_RESULT = " + lrcVar, null);
            }
        }
        return qqg.a;
    }
}
