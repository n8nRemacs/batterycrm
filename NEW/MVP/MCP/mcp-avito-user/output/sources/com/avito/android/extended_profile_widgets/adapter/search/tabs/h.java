package com.avito.android.extended_profile_widgets.adapter.search.tabs;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.lib.design.tab_group.layout.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SearchTabsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/tabs/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/tabs/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TabGroup f154861c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f154862d;

    /* compiled from: SearchTabsItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/search/tabs/h$a", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tab_group.layout.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f154863a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, G0> lVar) {
            this.f154863a = lVar;
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@l d.c cVar) {
            if (cVar != null) {
                this.f154863a.invoke(Integer.valueOf(cVar.f180792b));
            }
        }
    }

    public h(@k View view) {
        super(view);
        this.f154860b = view;
        this.f154861c = (TabGroup) view;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.tabs.g
    public final void N1(@k Y41.l<? super Integer, G0> lVar) {
        a aVar = new a(lVar);
        this.f154862d = aVar;
        this.f154861c.d(aVar);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.tabs.g
    public final void d8(int i12) {
        d.c cVarJ = this.f154861c.j(i12);
        if (cVarJ != null) {
            cVarJ.b();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        a aVar = this.f154862d;
        if (aVar != null) {
            this.f154861c.m(aVar);
        }
        this.f154862d = null;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.tabs.g
    public final void u4(@k List<ExtendedProfileSearchTab> list) {
        TabGroup tabGroup = this.f154861c;
        tabGroup.l();
        List<ExtendedProfileSearchTab> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (ExtendedProfileSearchTab extendedProfileSearchTab : list2) {
            arrayList.add(new com.avito.android.lib.design.tab_group.b(extendedProfileSearchTab.f154616b, new b.a.c(extendedProfileSearchTab.f154617c, null, null, 6, null), extendedProfileSearchTab.f154619e));
        }
        com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList, 0);
    }
}
