package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class o1e extends View {
    public w12 a;
    public Window b;
    public n1e c;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        gri.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b == null) {
            gri.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            gri.b("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = f;
        this.b.setAttributes(attributes);
        gri.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(de7 de7Var) {
        w12 w12Var = this.a;
        if (w12Var == null) {
            gri.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        l1e l1eVar = l1e.b;
        m1e m1eVar = new m1e(l1eVar, de7Var);
        m1e m1eVarG = w12Var.g();
        w12Var.F.put(l1eVar, m1eVar);
        m1e m1eVarG2 = w12Var.g();
        if (m1eVarG2 == null || m1eVarG2.equals(m1eVarG)) {
            return;
        }
        w12Var.v();
    }

    public de7 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(w12 w12Var) {
        jei.b();
        w12 w12Var2 = this.a;
        if (w12Var2 != null && w12Var2 != w12Var) {
            setScreenFlashUiInfo(null);
        }
        this.a = w12Var;
        if (w12Var == null) {
            return;
        }
        jei.b();
        if (w12Var.e.H() == 3 && this.b == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        jei.b();
        if (this.b != window) {
            this.c = window == null ? null : new n1e(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
