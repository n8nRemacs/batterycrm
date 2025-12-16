package QJ0;

import Y61.k;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.BasicIndicatorsTabFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.ExpensesTabFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.ConstructorTabFragment;
import kotlin.Metadata;

/* compiled from: ExtendedUserStatsPageAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQJ0/a;", "Landroidx/fragment/app/F;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends F {
    @Override // androidx.viewpager.widget.a
    public final int c() {
        return 3;
    }

    @Override // androidx.fragment.app.F
    @k
    public final Fragment o(int i12) {
        if (i12 == 0) {
            BasicIndicatorsTabFragment.f317341v0.getClass();
            return new BasicIndicatorsTabFragment();
        }
        if (i12 == 1) {
            ConstructorTabFragment.f317866y0.getClass();
            return new ConstructorTabFragment();
        }
        if (i12 != 2) {
            BasicIndicatorsTabFragment.f317341v0.getClass();
            return new BasicIndicatorsTabFragment();
        }
        ExpensesTabFragment.f317520y0.getClass();
        return new ExpensesTabFragment();
    }
}
