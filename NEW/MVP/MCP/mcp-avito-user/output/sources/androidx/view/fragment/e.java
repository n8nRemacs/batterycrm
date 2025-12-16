package androidx.view.fragment;

import Y61.k;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.C23299L0;
import androidx.view.C23397v;
import androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment;
import kotlin.Metadata;

/* compiled from: Fragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    @k
    public static final C23397v a(@k AbstractProgressFragment abstractProgressFragment) {
        NavHostFragment.f53118j0.getClass();
        for (Fragment parentFragment = abstractProgressFragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).b5();
            }
            Fragment fragment = parentFragment.getParentFragmentManager().f46387y;
            if (fragment instanceof NavHostFragment) {
                return ((NavHostFragment) fragment).b5();
            }
        }
        View view = abstractProgressFragment.getView();
        if (view != null) {
            return C23299L0.a(view);
        }
        throw new IllegalStateException("Fragment " + abstractProgressFragment + " does not have a NavController set");
    }
}
