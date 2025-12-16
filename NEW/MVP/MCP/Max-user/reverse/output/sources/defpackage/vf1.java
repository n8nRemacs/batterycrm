package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;
import java.io.IOException;

/* loaded from: classes.dex */
public final class vf1 extends wgh {
    public final ViewPager2 a;
    public final ViewStub b;
    public final j41 c;
    public final dg1 d;
    public final k e;
    public final ln1 f;
    public boolean g = true;
    public int h;
    public boolean i;

    public vf1(ViewPager2 viewPager2, ViewStub viewStub, j41 j41Var, dg1 dg1Var, k kVar, ln1 ln1Var) {
        this.a = viewPager2;
        this.b = viewStub;
        this.c = j41Var;
        this.d = dg1Var;
        this.e = kVar;
        this.f = ln1Var;
    }

    @Override // defpackage.wgh
    public final void a(int i) {
        this.g = i == 0;
    }

    @Override // defpackage.wgh
    public final void b(int i, float f, int i2) {
        if (f == 0.0f) {
            this.h = i;
        }
        int iJ = this.d.j() - 1;
        int i3 = this.h;
        ViewStub viewStub = this.b;
        j41 j41Var = this.c;
        if (iJ != i3) {
            if (dqi.q(viewStub)) {
                j41Var.setVisibility(8);
            }
            this.i = false;
            return;
        }
        if (!dqi.q(viewStub)) {
            dqi.p(viewStub, j41Var, null);
        }
        boolean z = this.h > i;
        float f2 = z ? 1.0f - f : f;
        double d = f2;
        if (0.1d > d || d > 0.6d) {
            if (0.6d <= d && d <= 0.99d && !this.i) {
                this.i = true;
                int i4 = Build.VERSION.SDK_INT;
                ViewPager2 viewPager2 = this.a;
                if (i4 >= 30) {
                    uog.i(viewPager2, p07.GESTURE_START);
                }
                int i5 = this.h;
                viewPager2.e(z ? i5 - 1 : i5 + 1, true);
            } else if (dqi.q(viewStub)) {
                j41Var.setVisibility(8);
            }
        } else if (j41Var.getVisibility() != 0) {
            hqi.g(this.c, true, 0L, null, 6);
        }
        j41Var.setTranslationY((((Number) this.f.invoke()).floatValue() - i2) + (vw4.d().getDisplayMetrics().density * (-50.0f)));
        float f3 = ((j41Var.s0 - r1) * f2) + j41Var.c;
        float f4 = ((j41Var.d - r2) * f2) + j41Var.a;
        float f5 = ((j41Var.o - r3) * f2) + j41Var.b;
        k41 k41Var = j41Var.u0;
        int iD = kti.d(f3);
        k41Var.setPadding(iD, iD, iD, iD);
        ViewGroup.LayoutParams layoutParams = k41Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = kti.d(f4);
        layoutParams.height = kti.d(f5);
        k41Var.setLayoutParams(layoutParams);
        float f6 = f2 * 3.0f;
        j41Var.t0.setAlpha(f6 <= 1.0f ? f6 : 1.0f);
    }

    @Override // defpackage.wgh
    public final void c(int i) throws IOException {
        cg1 cg1Var;
        vfh vfhVar;
        ViewPager2 viewPager2 = this.a;
        boolean z = viewPager2.E0;
        wqi.c("CallModeScrollTag", "viewpager position changed position=" + i + " isUserInputEnabled=" + z, new Object[0]);
        if (z && (cg1Var = (cg1) this.d.G(i)) != null && (vfhVar = cg1Var.a) != vfh.b) {
            this.e.invoke(vfhVar);
        }
        viewPager2.setUserInputEnabled(true);
    }
}
