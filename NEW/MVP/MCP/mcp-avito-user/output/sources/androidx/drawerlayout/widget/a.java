package androidx.drawerlayout.widget;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z12 = false;
        boolean z13 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f46003l = windowInsets;
        drawerLayout.f46004m = z13;
        if (!z13 && drawerLayout.getBackground() == null) {
            z12 = true;
        }
        drawerLayout.setWillNotDraw(z12);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
