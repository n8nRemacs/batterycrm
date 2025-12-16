package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class gg9 {
    public final Context a;
    public final vf9 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public lg9 h;
    public eg9 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final fg9 k = new fg9(0, this);

    public gg9(Context context, vf9 vf9Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = vf9Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final eg9 a() {
        eg9 aafVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(hwc.abc_cascading_menus_min_smallest_width)) {
                aafVar = new z52(context, this.e, this.d, this.c);
            } else {
                aafVar = new aaf(this.a, this.b, this.e, this.d, this.c);
            }
            aafVar.l(this.b);
            aafVar.r(this.k);
            aafVar.n(this.e);
            aafVar.e(this.h);
            aafVar.o(this.g);
            aafVar.p(this.f);
            this.i = aafVar;
        }
        return this.i;
    }

    public final boolean b() {
        eg9 eg9Var = this.i;
        return eg9Var != null && eg9Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        eg9 eg9VarA = a();
        eg9VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            eg9VarA.q(i);
            eg9VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            eg9VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        eg9VarA.g();
    }
}
