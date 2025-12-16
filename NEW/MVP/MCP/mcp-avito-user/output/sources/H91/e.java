package H91;

import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public abstract class e {
    public static final void a(Fragment fragment, boolean z12) {
        Window window = fragment.requireActivity().getWindow();
        if (Build.VERSION.SDK_INT < 30) {
            window.getDecorView().setSystemUiVisibility(z12 ? window.getDecorView().getSystemUiVisibility() | 8208 : window.getDecorView().getSystemUiVisibility() & (-8209));
            return;
        }
        int i12 = z12 ? 8 : 0;
        int i13 = z12 ? 16 : 0;
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.setSystemBarsAppearance(i13, 16);
        }
        WindowInsetsController insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(i12, 8);
        }
    }
}
