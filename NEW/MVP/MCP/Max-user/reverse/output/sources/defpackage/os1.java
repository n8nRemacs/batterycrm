package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class os1 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ os1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                jtd.B((jtd) obj, i2);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                if (!(th instanceof CancellationException)) {
                    wqi.e(bj7.D0, "prefetch " + i2 + " fetchVirtualAlbums() completed by error", th);
                    break;
                }
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                if (!(th2 instanceof CancellationException)) {
                    wqi.e(bj7.D0, "prefetch " + i2 + " fetchRealAlbums() completed by error", th2);
                    break;
                }
                break;
            case 3:
                lm7 lm7Var = (lm7) obj;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new p5f(lm7Var, 0));
                valueAnimatorOfFloat.addListener(new ug(lm7Var, i2, 4));
                valueAnimatorOfFloat.start();
                break;
            default:
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) obj;
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 != 0 ? kti.d(12 * vw4.d().getDisplayMetrics().density) : 0, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                break;
        }
        return qqgVar;
    }

    public /* synthetic */ os1(v5f v5fVar, int i) {
        this.a = 3;
        this.b = i;
    }
}
