package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class ac4 implements gyf {
    public final /* synthetic */ int a;
    public final ViewPager2 b;

    public /* synthetic */ ac4(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.fyf
    public final void a(iyf iyfVar) {
        int[] iArrB;
        int i;
        switch (this.a) {
            case 0:
                int i2 = iyfVar.a;
                ViewPager2 viewPager2 = this.b;
                int currentItem = viewPager2.getCurrentItem() - i2;
                if (Math.abs(currentItem) > 1) {
                    int iAbs = (Math.abs(currentItem) - 1) * Integer.signum(currentItem) * viewPager2.getWidth();
                    fq5 fq5Var = viewPager2.A0;
                    h3e h3eVar = fq5Var.b;
                    if (h3eVar.f != 1) {
                        fq5Var.g = 0;
                        fq5Var.f = 0;
                        fq5Var.h = SystemClock.uptimeMillis();
                        VelocityTracker velocityTracker = fq5Var.d;
                        if (velocityTracker == null) {
                            fq5Var.d = VelocityTracker.obtain();
                            fq5Var.e = ViewConfiguration.get(fq5Var.a.getContext()).getScaledMaximumFlingVelocity();
                        } else {
                            velocityTracker.clear();
                        }
                        h3eVar.e = 4;
                        h3eVar.f(true);
                        if (h3eVar.f != 0) {
                            fq5Var.c.E0();
                        }
                        long j = fq5Var.h;
                        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                        fq5Var.d.addMovement(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    float f = iAbs;
                    fq5 fq5Var2 = viewPager2.A0;
                    if (fq5Var2.b.m) {
                        float f2 = fq5Var2.f - f;
                        fq5Var2.f = f2;
                        int iRound = Math.round(f2 - fq5Var2.g);
                        fq5Var2.g += iRound;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        boolean z = fq5Var2.a.getOrientation() == 0;
                        int i3 = z ? iRound : 0;
                        if (z) {
                            iRound = 0;
                        }
                        float f3 = z ? fq5Var2.f : 0.0f;
                        float f4 = z ? 0.0f : fq5Var2.f;
                        fq5Var2.c.scrollBy(i3, iRound);
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(fq5Var2.h, jUptimeMillis, 2, f3, f4, 0);
                        fq5Var2.d.addMovement(motionEventObtain2);
                        motionEventObtain2.recycle();
                    }
                    fq5 fq5Var3 = viewPager2.A0;
                    h3e h3eVar2 = fq5Var3.b;
                    boolean z2 = h3eVar2.m;
                    if (z2) {
                        if (h3eVar2.f != 1 || z2) {
                            h3eVar2.m = false;
                            h3eVar2.g();
                            g3e g3eVar = h3eVar2.g;
                            if (g3eVar.c == 0) {
                                int i4 = g3eVar.b;
                                if (i4 != h3eVar2.h) {
                                    h3eVar2.c(i4);
                                }
                                h3eVar2.d(0);
                                h3eVar2.e();
                            } else {
                                h3eVar2.d(2);
                            }
                        }
                        VelocityTracker velocityTracker2 = fq5Var3.d;
                        velocityTracker2.computeCurrentVelocity(1000, fq5Var3.e);
                        if (!fq5Var3.c.O((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                            ViewPager2 viewPager22 = fq5Var3.a;
                            View viewG = viewPager22.x0.g(viewPager22.t0);
                            if (viewG != null && ((i = (iArrB = viewPager22.x0.b(viewPager22.t0, viewG))[0]) != 0 || iArrB[1] != 0)) {
                                viewPager22.w0.A0(i, iArrB[1], false);
                            }
                        }
                    }
                }
                viewPager2.e(i2, true);
                break;
            default:
                this.b.e(iyfVar.a, true);
                break;
        }
    }
}
