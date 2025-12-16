package Fc1;

import android.view.Window;
import androidx.view.C23489g;
import com.avito.android.R;

/* loaded from: classes9.dex */
public final class I0 {
    public static final void a(@Y61.k androidx.appcompat.app.A a12) {
        Window window = a12.getWindow();
        if (window != null) {
            androidx.view.V0.b(window.getDecorView(), a12);
            window.getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, a12);
            C23489g.b(window.getDecorView(), a12);
        }
    }
}
