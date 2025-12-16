package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class j4h implements DisplayManager.DisplayListener, i4h {
    public final /* synthetic */ int a = 1;
    public final DisplayManager b;
    public Object c;

    public j4h(m4h m4hVar, DisplayManager displayManager) {
        this.c = m4hVar;
        this.b = displayManager;
    }

    private final void b(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    @Override // defpackage.i4h
    public void a(ehg ehgVar) {
        this.c = ehgVar;
        Handler handlerL = xxg.l(null);
        DisplayManager displayManager = this.b;
        displayManager.registerDisplayListener(this, handlerL);
        ehgVar.f(displayManager.getDisplay(0));
    }

    @Override // defpackage.i4h
    public void c() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    m4h.a((m4h) this.c, this.b.getDisplay(0));
                    break;
                }
                break;
            default:
                ehg ehgVar = (ehg) this.c;
                if (ehgVar != null && i == 0) {
                    ehgVar.f(this.b.getDisplay(0));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    public j4h(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
