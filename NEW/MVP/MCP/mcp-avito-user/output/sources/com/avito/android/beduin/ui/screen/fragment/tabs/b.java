package com.avito.android.beduin.ui.screen.fragment.tabs;

import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TabsScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104333m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104332l = tabsScreenFragment;
        this.f104333m = tabsScreenModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104332l;
        com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e eVar = (com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e) tabsScreenFragment.f104320M0.getValue(tabsScreenFragment.x5(), TabsScreenFragment.f104307O0[5]);
        TabsScreenModel tabsScreenModel = this.f104333m;
        if (eVar != null) {
            List<TabsScreenModel.b> listI = tabsScreenModel.i();
            ArrayList arrayList = new ArrayList(C42745f0.q(listI, 10));
            for (TabsScreenModel.b bVar : listI) {
                arrayList.add(new e.b(bVar.getId(), bVar.getTitle(), bVar.getCounter(), bVar.g()));
            }
            eVar.b(arrayList);
        }
        a aVar2 = (a) tabsScreenFragment.f104318K0.getValue();
        List<TabsScreenModel.b> listI2 = tabsScreenModel.i();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listI2, 10));
        Iterator<T> it = listI2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TabsScreenModel.b) it.next()).getContent());
        }
        aVar2.f104330m = arrayList2;
        aVar2.notifyDataSetChanged();
        return G0.f406611a;
    }
}
