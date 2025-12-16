package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class ny6 {
    public final ViewPager2 a;
    public final ry6 b;
    public boolean c;
    public phd d;
    public my6 e;
    public kd5 f;

    public ny6(ViewPager2 viewPager2, ry6 ry6Var) {
        this.a = viewPager2;
        this.b = ry6Var;
    }

    public final void a() {
        phd phdVar = this.d;
        if (phdVar == null) {
            return;
        }
        try {
            int iJ = phdVar.j();
            this.b.b(iJ, iJ == 0 ? 0 : Math.min(this.a.getCurrentItem(), iJ - 1));
        } catch (IllegalArgumentException e) {
            wqi.p(ny6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
        }
    }
}
