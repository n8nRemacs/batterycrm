package com.avito.android.beduin.ui.screen.fragment.tabs;

import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104336m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104335l = tabsScreenFragment;
        this.f104336m = tabsScreenModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104335l;
        com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e eVar = (com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e) tabsScreenFragment.f104320M0.getValue(tabsScreenFragment.x5(), TabsScreenFragment.f104307O0[5]);
        TabsScreenModel tabsScreenModel = this.f104336m;
        if (eVar != null) {
            eVar.c(tabsScreenModel.g());
        }
        tabsScreenFragment.w5().g(tabsScreenModel.i().indexOf(tabsScreenModel.f()), false);
        return G0.f406611a;
    }
}
