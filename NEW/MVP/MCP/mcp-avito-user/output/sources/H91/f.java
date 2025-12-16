package H91;

import Ba1.B;
import Y41.p;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.R;

/* loaded from: classes9.dex */
public abstract class f {
    public static final void a(Fragment fragment, p pVar) {
        Window window = fragment.requireActivity().getWindow();
        View decorView = window.getDecorView();
        C22823h0.K(decorView, new B(decorView, pVar));
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    public static final boolean b(Fragment fragment) {
        ActivityC22955m activityC22955mRequireActivity = fragment.requireActivity();
        TypedValue typedValue = new TypedValue();
        activityC22955mRequireActivity.getTheme().resolveAttribute(R.attr.sdkBioThemeVariant, typedValue, true);
        return typedValue.data == 1;
    }
}
