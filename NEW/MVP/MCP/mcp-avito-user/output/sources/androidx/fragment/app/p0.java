package androidx.fragment.app;

import android.view.View;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {
    @Y61.k
    public static final <F extends Fragment> F a(@Y61.k View view) {
        F f12 = (F) FragmentManager.I(view);
        if (f12 != null) {
            return f12;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }
}
