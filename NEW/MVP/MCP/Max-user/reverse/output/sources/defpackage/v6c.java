package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public final class v6c implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;
    public final /* synthetic */ boolean d;

    public v6c(View view, float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = view;
        this.d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Insets insets;
        view.removeOnLayoutChangeListener(this);
        int iD = kti.d(this.a);
        int iD2 = kti.d(this.b);
        View view2 = this.c;
        View rootView = view2.getRootView();
        Rect rect = w6c.a;
        rootView.getWindowVisibleDisplayFrame(rect);
        if (Build.VERSION.SDK_INT >= 30) {
            int i9 = rect.bottom;
            WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
            rect.bottom = i9 - ((rootWindowInsets == null || (insets = rootWindowInsets.getInsets(8)) == null) ? 0 : insets.bottom);
        }
        float f = 8;
        int iQ = u45.q(f, vw4.d().getDisplayMetrics().density, rect.bottom - iD2);
        int iQ2 = u45.q(f, vw4.d().getDisplayMetrics().density, rect.top + iD2);
        int measuredHeight = view2.getMeasuredHeight();
        boolean z = this.d;
        if (iQ > measuredHeight) {
            iD2 = u45.c(f, vw4.d().getDisplayMetrics().density, iD2) + (z ? 12 : 0);
        } else if (iQ2 > measuredHeight) {
            iD2 = u45.q(f, vw4.d().getDisplayMetrics().density, iD2 - measuredHeight) - (z ? 12 : 0);
        }
        int measuredWidth = view2.getMeasuredWidth();
        if (iD + measuredWidth >= rootView.getWidth()) {
            iD = ((rootView.getWidth() - measuredWidth) - 8) - (z ? 12 : 0);
        } else if (iD <= 0) {
            iD = z ? 12 : 0;
        }
        view2.setX(iD);
        view2.setY(iD2);
    }
}
