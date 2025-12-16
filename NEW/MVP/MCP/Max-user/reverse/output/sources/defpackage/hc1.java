package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class hc1 extends FrameLayout implements jn1 {
    public final /* synthetic */ CallIndicatorWidget a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc1(CallIndicatorWidget callIndicatorWidget, Context context) {
        super(context);
        this.a = callIndicatorWidget;
        setId(j0b.S);
        setBackground(new ColorDrawable(0));
        yy7[] yy7VarArr = CallIndicatorWidget.Y;
        sn0 sn0Var = callIndicatorWidget.o;
        yy7 yy7Var = CallIndicatorWidget.Y[1];
        addView((View) sn0Var.getValue());
        addView(CallIndicatorWidget.y0(callIndicatorWidget));
    }

    @Override // defpackage.jn1
    public final void a(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.z0(callIndicatorWidget, true);
        float f = 100;
        if (CallIndicatorWidget.y0(callIndicatorWidget).getHeight() != kti.d(vw4.d().getDisplayMetrics().density * f)) {
            zb1 zb1VarY0 = CallIndicatorWidget.y0(callIndicatorWidget);
            ViewGroup.LayoutParams layoutParams = zb1VarY0.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = kti.d(f * vw4.d().getDisplayMetrics().density);
            zb1VarY0.setLayoutParams(marginLayoutParams);
        }
        CallIndicatorWidget.y0(callIndicatorWidget).a(true);
    }

    @Override // defpackage.jn1
    public final void c(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.z0(callIndicatorWidget, true);
        CallIndicatorWidget.y0(callIndicatorWidget).c(z);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // defpackage.jn1
    public final void g(o98 o98Var, final boolean z, long j) {
        final CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.y0(callIndicatorWidget).g(o98Var, z, j);
        float f = 100;
        int iQ = u45.q(f, vw4.d().getDisplayMetrics().density, ((r1e) ((mc1) ((lc1) callIndicatorWidget.b.getValue())).c.getValue()).a);
        int iD = z ? iQ : kti.d(vw4.d().getDisplayMetrics().density * f);
        if (z) {
            iQ = kti.d(f * vw4.d().getDisplayMetrics().density);
        }
        zb1 zb1VarY0 = CallIndicatorWidget.y0(callIndicatorWidget);
        lg lgVar = new lg("height", iD);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, iD, iQ);
        objectAnimatorOfInt.setDuration(j);
        objectAnimatorOfInt.addUpdateListener(new tg(zb1VarY0, lgVar, 0));
        o98Var.add(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, new lg("backgroundChange", 0), 0);
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gc1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CallIndicatorWidget.z0(callIndicatorWidget, z);
            }
        });
        o98Var.add(objectAnimatorOfInt2);
    }
}
