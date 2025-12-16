package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class tgh extends wgh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ tgh(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.wgh
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.h();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wgh
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = this.b;
                if (viewPager2.d != i) {
                    viewPager2.d = i;
                    viewPager2.G0.n();
                    break;
                }
                break;
            default:
                ViewPager2 viewPager22 = this.b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.w0.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
