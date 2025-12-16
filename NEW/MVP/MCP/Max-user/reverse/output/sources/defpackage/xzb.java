package defpackage;

import android.os.Handler;
import android.view.View;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class xzb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public xzb(n8b n8bVar, zk7 zk7Var, PinBarsWidget pinBarsWidget, n8b n8bVar2) {
        this.b = n8bVar;
        this.d = zk7Var;
        this.o = pinBarsWidget;
        this.c = n8bVar2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((n8b) this.b).removeOnAttachStateChangeListener(this);
                xk7 xk7Var = (xk7) ((zk7) this.d);
                if (xk7Var.e) {
                    svi.e(tfh.b(view), null, null, new wzb((n8b) this.c, null), 3);
                }
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.o;
                int i = PinBarsWidget.u0;
                qzb qzbVarY0 = pinBarsWidget.y0();
                String str = xk7Var.a;
                qk7 qk7Var = qzbVarY0.B0;
                if (qk7Var != null) {
                    svi.e(qk7Var.a, null, null, new ok7(qk7Var, str, null), 3);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                ((Handler) this.c).removeCallbacksAndMessages(null);
                ((View) this.d).removeOnLayoutChangeListener((nu8) this.o);
                break;
        }
    }

    public xzb(View view, Handler handler, View view2, nu8 nu8Var) {
        this.b = view;
        this.c = handler;
        this.d = view2;
        this.o = nu8Var;
    }
}
