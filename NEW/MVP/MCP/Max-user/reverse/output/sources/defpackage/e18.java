package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public final class e18 extends PopupWindow {
    public static final /* synthetic */ int e = 0;
    public final i44 a;
    public final boolean b;
    public boolean c;
    public final float d;

    static {
        vid.a.getClass();
    }

    public e18(Context context, int i) throws Resources.NotFoundException {
        super(new i44(context), i, -2);
        i44 i44Var = (i44) getContentView();
        this.a = i44Var;
        this.b = true;
        this.c = true;
        this.d = 0.5f;
        setOnDismissListener(new j44());
        setFocusable(true);
        setElevation(vw4.d().getDisplayMetrics().density * 8.0f);
        q1g customTheme = i44Var.getCustomTheme();
        if (customTheme == null) {
            View contentView = getContentView();
            if (contentView.isInEditMode()) {
                customTheme = bq4.e0;
            } else {
                Context context2 = contentView.getContext();
                bwf bwfVar = q1g.a0;
                customTheme = nca.d(context2);
            }
        }
        Integer numValueOf = Integer.valueOf(customTheme.m);
        float dimension = getContentView().getContext().getResources().getDimension(xvc.bottom_sheet_corner_radius);
        setBackgroundDrawable(uga.f(numValueOf, null, null, new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}));
    }

    public final void a() {
        if (this.c) {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = this.d;
            e6j.b(getContentView().getContext()).updateViewLayout(rootView, layoutParams);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        a();
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        a();
    }
}
