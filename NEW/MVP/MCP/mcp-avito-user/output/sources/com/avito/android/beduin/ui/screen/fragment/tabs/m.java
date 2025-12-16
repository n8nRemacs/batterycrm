package com.avito.android.beduin.ui.screen.fragment.tabs;

import android.content.Context;
import android.widget.FrameLayout;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wi.C49625a;
import wi.C49626b;
import wi.C49628d;

/* compiled from: TabsScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104348l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104348l = tabsScreenFragment;
        this.f104349m = tabsScreenModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e bVar;
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104348l;
        tabsScreenFragment.x5().removeAllViews();
        FrameLayout frameLayoutX5 = tabsScreenFragment.x5();
        kotlin.reflect.n<Object>[] nVarArr = TabsScreenFragment.f104307O0;
        kotlin.reflect.n<Object> nVar = nVarArr[5];
        TabsScreenFragment.e eVar = tabsScreenFragment.f104320M0;
        eVar.setValue(frameLayoutX5, nVar, null);
        TabsScreenModel tabsScreenModel = this.f104349m;
        boolean zH2 = tabsScreenModel.h();
        tabsScreenFragment.x5().setVisibility(zH2 ? 0 : 8);
        if (zH2) {
            Context contextRequireContext = tabsScreenFragment.requireContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            TabsScreenModel.d tabsSettings = tabsScreenModel.getTabsSettings();
            if (tabsSettings instanceof C49625a) {
                bVar = new com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.a(contextRequireContext, layoutParams, (C49625a) tabsSettings);
            } else if (tabsSettings instanceof C49628d) {
                bVar = new com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.d(contextRequireContext, layoutParams, (C49628d) tabsSettings);
            } else {
                if (!(tabsSettings instanceof C49626b)) {
                    throw new IllegalStateException(("Unknown tabsSetting " + tabsSettings).toString());
                }
                bVar = new com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.b(contextRequireContext, layoutParams, (C49626b) tabsSettings);
            }
            bVar.a(new l(1, tabsScreenFragment.q5(), s.class, "onManualSelectTab", "onManualSelectTab(Ljava/lang/String;)V", 0));
            tabsScreenFragment.x5().addView(bVar.getView());
            eVar.setValue(tabsScreenFragment.x5(), nVarArr[5], bVar);
        }
        return G0.f406611a;
    }
}
