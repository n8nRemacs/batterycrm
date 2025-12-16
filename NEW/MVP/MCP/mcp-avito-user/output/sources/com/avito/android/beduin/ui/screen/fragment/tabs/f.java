package com.avito.android.beduin.ui.screen.fragment.tabs;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import sK0.C48063a;

/* compiled from: TabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104339m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104338l = tabsScreenFragment;
        this.f104339m = tabsScreenModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        Q q12;
        UniversalColor titleColor;
        UniversalColor tintColor;
        UniversalColor barTintColor;
        TabsScreenModel tabsScreenModel = this.f104339m;
        TabsScreenModel.NavigationBarSettings navigationBarSettings = tabsScreenModel.getNavigationBarSettings();
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104338l;
        Context contextRequireContext = tabsScreenFragment.requireContext();
        tabsScreenFragment.y5().setBackgroundColor((navigationBarSettings == null || (barTintColor = navigationBarSettings.getBarTintColor()) == null) ? C35835l0.d(R.attr.white, contextRequireContext) : C48063a.f437606a.a(contextRequireContext, barTintColor));
        tabsScreenFragment.y5().setNavigationIconTint((navigationBarSettings == null || (tintColor = navigationBarSettings.getTintColor()) == null) ? C35835l0.d(R.attr.black, contextRequireContext) : C48063a.f437606a.a(contextRequireContext, tintColor));
        tabsScreenFragment.y5().setTitleTextColor((navigationBarSettings == null || (titleColor = navigationBarSettings.getTitleColor()) == null) ? C35835l0.d(R.attr.black, contextRequireContext) : C48063a.f437606a.a(contextRequireContext, titleColor));
        q qVar = tabsScreenFragment.f104316I0;
        com.avito.android.ui.status_bar.d dVar = null;
        if (qVar == null) {
            qVar = null;
        }
        TabsScreenModel.NavigationBarSettings navigationBarSettings2 = tabsScreenModel.getNavigationBarSettings();
        Z1<com.avito.android.ui.status_bar.d> z12 = qVar.f104362b;
        if (navigationBarSettings2 != null) {
            int iOrdinal = navigationBarSettings2.b().ordinal();
            if (iOrdinal == 0) {
                q12 = new Q(Integer.valueOf(R.attr.white), ThemeAppearance.f181334b);
            } else if (iOrdinal == 1) {
                q12 = new Q(Integer.valueOf(R.attr.black), ThemeAppearance.f181335c);
            } else if (iOrdinal == 2) {
                q12 = new Q(Integer.valueOf(R.attr.constantWhite), ThemeAppearance.f181336d);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                q12 = new Q(Integer.valueOf(R.attr.constantBlack), ThemeAppearance.f181337e);
            }
            dVar = new com.avito.android.ui.status_bar.d((ThemeAppearance) q12.f406620c, new d.a.C9356a(((Number) q12.f406619b).intValue()));
        }
        z12.setValue(dVar);
        return G0.f406611a;
    }
}
