package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import one.me.devmenu.DevMenuScreen;

/* loaded from: classes2.dex */
public final class cv4 extends wgh {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;

    public cv4(vgh vghVar) {
        this.b = vghVar;
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    @Override // defpackage.wgh
    public void a(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.wgh
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 1:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b;
                if (((xgh) this.c) == null) {
                    return;
                }
                float f2 = -f;
                for (int i3 = 0; i3 < linearLayoutManager.x(); i3++) {
                    View viewW = linearLayoutManager.w(i3);
                    if (viewW == null) {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(wy1.g("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.x(), " while transforming pages"));
                    }
                    float fN = (a.N(viewW) - i) + f2;
                    i00 i00Var = (i00) ((xgh) this.c);
                    ViewPager2 viewPager2 = (ViewPager2) i00Var.b;
                    c14 c14Var = ((li0) i00Var.c).F0;
                    boolean z = c14Var.j() > 1;
                    int iD = kti.d(20 * vw4.d().getDisplayMetrics().density);
                    int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                    int i4 = iD + iD2;
                    float f3 = fN * (-i4);
                    if (viewPager2.getOrientation() == 0) {
                        ViewGroup.LayoutParams layoutParams = viewW.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (viewW instanceof x3b) {
                            marginLayoutParams.setMarginStart(0);
                            marginLayoutParams.setMarginEnd(0);
                        } else if (!z) {
                            marginLayoutParams.setMarginStart(iD2);
                            marginLayoutParams.setMarginEnd(iD2);
                        } else if (viewPager2.getCurrentItem() == 0) {
                            marginLayoutParams.setMarginStart(iD2);
                            marginLayoutParams.setMarginEnd(i4);
                        } else if (viewPager2.getCurrentItem() == c14Var.j() - 1) {
                            marginLayoutParams.setMarginStart(i4);
                            marginLayoutParams.setMarginEnd(iD2);
                        }
                        viewW.setLayoutParams(marginLayoutParams);
                        if (!z) {
                            f3 = 0.0f;
                        } else if (m8j.d(viewPager2)) {
                            f3 = -f3;
                        }
                        viewW.setTranslationX(f3);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.wgh
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                viewPager2.post(new l30(viewPager2, i, (DevMenuScreen) this.c));
                break;
        }
    }

    public cv4(ViewPager2 viewPager2, DevMenuScreen devMenuScreen) {
        this.b = viewPager2;
        this.c = devMenuScreen;
    }
}
