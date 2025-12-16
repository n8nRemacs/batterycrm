package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class ph6 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public nh6 X;
    public boolean Y;
    public int Z;
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public nh6 o;
    public final int[] s0 = new int[2];

    public ph6(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        nh6 nh6Var = this.X;
        View view = this.d;
        if (nh6Var != null) {
            view.removeCallbacks(nh6Var);
        }
        nh6 nh6Var2 = this.o;
        if (nh6Var2 != null) {
            view.removeCallbacks(nh6Var2);
        }
    }

    public abstract yye b();

    public abstract boolean c();

    public boolean d() {
        yye yyeVarB = b();
        if (yyeVarB == null || !yyeVarB.a()) {
            return true;
        }
        yyeVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Y = false;
        this.Z = -1;
        nh6 nh6Var = this.o;
        if (nh6Var != null) {
            this.d.removeCallbacks(nh6Var);
        }
    }
}
