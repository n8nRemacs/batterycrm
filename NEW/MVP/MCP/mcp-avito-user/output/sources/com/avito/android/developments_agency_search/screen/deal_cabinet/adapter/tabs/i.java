package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.lib.design.tab_group.e;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TabsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TabGroup f136895b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f136896c;

    /* compiled from: TabsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/i$a", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tab_group.layout.b {
        public a() {
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@l d.c cVar) {
            if (cVar != null) {
                int i12 = cVar.f180792b;
                Y41.l<? super Integer, G0> lVar = i.this.f136896c;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i12));
                }
            }
        }
    }

    public i(@k View view) {
        super(view);
        TabGroup tabGroup = (TabGroup) view.findViewById(R.id.tabs);
        this.f136895b = tabGroup;
        tabGroup.d(new a());
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.h
    public final void KZ() throws Resources.NotFoundException {
        e.a aVar = com.avito.android.lib.design.tab_group.e.f180739j;
        TabGroup tabGroup = this.f136895b;
        Context context = tabGroup.getContext();
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Re23_TabGroup_Xxl, d.n.f178932L0);
        try {
            com.avito.android.lib.design.tab_group.e eVarA = e.a.a(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            tabGroup.setStyle(eVarA);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.h
    public final void N1(@k Y41.l<? super Integer, G0> lVar) {
        this.f136896c = lVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.h
    public final void P0(int i12, @k List list) {
        TabGroup tabGroup = this.f136895b;
        tabGroup.l();
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.a aVar = (com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.a) it.next();
            PrintableText printableText = aVar.f136884a.f136883b;
            Integer num = aVar.f136885b;
            arrayList.add(new com.avito.android.lib.design.tab_group.b(printableText, num != null ? new b.a.c(num.intValue(), null, null, 6, null) : null, false, 4, null));
        }
        com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList, Integer.valueOf(i12));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f136896c = null;
    }
}
