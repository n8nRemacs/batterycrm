package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class sgh extends rhd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sgh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rhd
    public final void a() {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                viewPager2.o = true;
                viewPager2.y0.l = true;
                break;
            default:
                ((zva) this.b).n();
                break;
        }
    }

    @Override // defpackage.rhd
    public final void b(int i, int i2) {
        a();
    }

    @Override // defpackage.rhd
    public final void c(int i, int i2, Object obj) {
        a();
    }

    @Override // defpackage.rhd
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.rhd
    public final void e(int i, int i2) {
        a();
    }

    @Override // defpackage.rhd
    public final void f(int i, int i2) {
        a();
    }
}
