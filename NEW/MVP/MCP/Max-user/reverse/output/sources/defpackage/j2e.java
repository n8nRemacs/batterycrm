package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public interface j2e {
    static View p(ViewGroup viewGroup, String str, WindowInsets windowInsets, int i) {
        int i2;
        int i3;
        View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        int[] iArr = i2e.$EnumSwitchMapping$1;
        int i4 = iArr[az1.v(i)];
        if (i4 == 1) {
            i2 = windowInsets.getInsets(WindowInsets.Type.statusBars()).top;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        }
        int i5 = iArr[az1.v(i)];
        if (i5 == 1) {
            i3 = 48;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 80;
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, i2, i3));
        view.setTag(str);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        return view;
    }

    default Integer N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        a93.s0.x(getContext()).k().b();
        return 0;
    }

    default void c(Window window) {
        Integer num;
        if ((getA() == 3 || getA() == 1) && Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        Integer numN = N();
        if (Build.VERSION.SDK_INT >= 29) {
            num = null;
        } else {
            a93.s0.x(getContext()).k().b();
            num = 0;
        }
        s(window, num, numN, true);
    }

    Context getContext();

    default void l(Window window) {
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(true);
        }
        v1a v1aVar = a93.s0;
        v1aVar.x(getContext()).k().b();
        v1aVar.x(getContext()).k().b();
        s(window, 0, 0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default void s(Window window, final Integer num, final Integer num2, boolean z) {
        h4i h4iVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            final ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(num, viewGroup, num2, this) { // from class: h2e
                public final /* synthetic */ Integer a;
                public final /* synthetic */ ViewGroup b;
                public final /* synthetic */ Integer c;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Integer num3 = this.a;
                    ViewGroup viewGroup2 = this.b;
                    if (num3 != null) {
                        j2e.p(viewGroup2, "statusBarOverlay", windowInsets, 1).setBackgroundColor(num3.intValue());
                    } else {
                        View viewFindViewWithTag = viewGroup2.findViewWithTag("statusBarOverlay");
                        if (viewFindViewWithTag != null) {
                            viewGroup2.removeView(viewFindViewWithTag);
                        }
                    }
                    Integer num4 = this.c;
                    if (num4 != null) {
                        j2e.p(viewGroup2, "navBarOverlay", windowInsets, 2).setBackgroundColor(num4.intValue());
                        return windowInsets;
                    }
                    View viewFindViewWithTag2 = viewGroup2.findViewWithTag("navBarOverlay");
                    if (viewFindViewWithTag2 != null) {
                        viewGroup2.removeView(viewFindViewWithTag2);
                    }
                    return windowInsets;
                }
            });
        } else {
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        View decorView = window.getDecorView();
        vgd vgdVar = new vgd(decorView);
        if (Build.VERSION.SDK_INT >= 30) {
            i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
            i4iVar.c = window;
            h4iVar = i4iVar;
        } else {
            h4iVar = new h4i(window, vgdVar);
        }
        boolean z2 = a93.s0.y(decorView).h() == kf3.a && !z;
        int iV = az1.v(getA());
        if (iV == 0) {
            h4iVar.m(z2);
            h4iVar.l(z2);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(z2);
                return;
            }
            return;
        }
        if (iV == 1) {
            h4iVar.m(z2);
        } else {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h4iVar.l(z2);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(z2);
            }
        }
    }

    /* renamed from: v */
    default int getA() {
        return 1;
    }
}
