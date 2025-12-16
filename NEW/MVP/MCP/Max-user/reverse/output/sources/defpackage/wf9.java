package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class wf9 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, lg9 {
    public qnf a;
    public vc b;
    public w98 c;

    @Override // defpackage.lg9
    public final void f(vf9 vf9Var, boolean z) {
        vc vcVar;
        if ((z || vf9Var == this.a) && (vcVar = this.b) != null) {
            vcVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qnf qnfVar = this.a;
        w98 w98Var = this.c;
        if (w98Var.Y == null) {
            w98Var.Y = new v98(w98Var);
        }
        qnfVar.q(w98Var.Y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.f(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        qnf qnfVar = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                qnfVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return qnfVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.lg9
    public final boolean x(vf9 vf9Var) {
        return false;
    }
}
