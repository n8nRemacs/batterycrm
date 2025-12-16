package com.avito.android.tariff_cpt.info.ui.items.filters_tabs;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoFiltersTabsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/filters_tabs/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/filters_tabs/i;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final TabGroup f298339b;

    /* compiled from: CptInfoFiltersTabsItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_cpt/info/ui/items/filters_tabs/j$a", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tab_group.layout.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f298340a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Integer, G0> lVar) {
            this.f298340a = lVar;
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@Y61.l d.c cVar) {
            if (cVar != null) {
                this.f298340a.invoke(Integer.valueOf(cVar.f180792b));
            }
        }
    }

    public j(@k View view) {
        super(view);
        this.f298339b = (TabGroup) view.findViewById(R.id.cpt_info_filters_tabs_item);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.filters_tabs.i
    public final void P0(int i12, @k List list) {
        TabGroup tabGroup = this.f298339b;
        tabGroup.l();
        com.avito.android.lib.design.tab_group.c.a(tabGroup, list, Integer.valueOf(i12));
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.filters_tabs.i
    public final void X1(@k l<? super Integer, G0> lVar) {
        a aVar = new a(lVar);
        TabGroup tabGroup = this.f298339b;
        tabGroup.m(aVar);
        tabGroup.d(aVar);
    }
}
