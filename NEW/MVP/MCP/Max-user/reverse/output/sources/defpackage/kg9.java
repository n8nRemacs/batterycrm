package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class kg9 extends ca8 implements yf9 {
    public static final Method N0;
    public t9f M0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                N0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.yf9
    public final void d(vf9 vf9Var, MenuItem menuItem) {
        t9f t9fVar = this.M0;
        if (t9fVar != null) {
            t9fVar.d(vf9Var, menuItem);
        }
    }

    @Override // defpackage.yf9
    public final void k(vf9 vf9Var, zf9 zf9Var) {
        t9f t9fVar = this.M0;
        if (t9fVar != null) {
            t9fVar.k(vf9Var, zf9Var);
        }
    }

    @Override // defpackage.ca8
    public final q55 q(Context context, boolean z) {
        jg9 jg9Var = new jg9(context, z);
        jg9Var.setHoverListener(this);
        return jg9Var;
    }
}
