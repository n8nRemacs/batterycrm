package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public final class p6h implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6h b;

    public /* synthetic */ p6h(v6h v6hVar, int i) {
        this.a = i;
        this.b = v6hVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        v6h v6hVar = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ViewParent parent = v6hVar.getParent();
                uh9 uh9Var = parent instanceof uh9 ? (uh9) parent : null;
                if (uh9Var != null) {
                    boolean zJ = v6h.j(v6hVar);
                    int maxAvailableWidth$message_list_release = uh9Var.getMaxAvailableWidth$message_list_release();
                    if (!zJ || j9j.d(v6hVar)) {
                        maxAvailableWidth$message_list_release = kti.d(228 * vw4.d().getDisplayMetrics().density);
                    }
                    if (maxAvailableWidth$message_list_release != v6hVar.L0) {
                        if (zJ && !j9j.d(v6hVar)) {
                            v6hVar.o.c(false);
                        }
                        int i10 = v6hVar.L0;
                        ValueAnimator valueAnimator = v6hVar.K0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, maxAvailableWidth$message_list_release);
                        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                        valueAnimatorOfInt.addUpdateListener(new wk0(8, v6hVar));
                        valueAnimatorOfInt.setDuration(250L);
                        valueAnimatorOfInt.addListener(new q6h(0));
                        valueAnimatorOfInt.start();
                        v6hVar.K0 = valueAnimatorOfInt;
                        break;
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                yy7[] yy7VarArr = v6h.M0;
                v6hVar.t();
                break;
        }
    }
}
