package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class pf3 extends mid implements View.OnTouchListener {
    public static final OvershootInterpolator G0 = new OvershootInterpolator();
    public final mf3 E0;
    public final GestureDetector F0;

    public pf3(FrameLayout frameLayout, mf3 mf3Var, nf3 nf3Var) {
        super(frameLayout);
        this.E0 = mf3Var;
        frameLayout.setOnTouchListener(this);
        this.F0 = new GestureDetector(frameLayout.getContext(), new of3(nf3Var, 0, mf3Var));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.F0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        OvershootInterpolator overshootInterpolator = G0;
        View view2 = this.a;
        if (action == 0 || motionEvent.getActionMasked() == 5) {
            view2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(125L).setInterpolator(overshootInterpolator);
            return true;
        }
        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getActionMasked() != 6) {
            return true;
        }
        view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L).setInterpolator(overshootInterpolator);
        return true;
    }
}
