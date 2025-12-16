package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class tg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lg c;

    public /* synthetic */ tg(View view, lg lgVar, int i) {
        this.a = i;
        this.b = view;
        this.c = lgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        lg lgVar = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.height = lgVar.a;
                view.setLayoutParams(marginLayoutParams);
                break;
            default:
                int i2 = jq1.w0;
                mfh.b(view, new Rect(0, -((int) (vw4.d().getDisplayMetrics().density * 16.0f)), view.getWidth(), lgVar.a), vw4.d().getDisplayMetrics().density * 16.0f);
                break;
        }
    }
}
