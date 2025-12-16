package com.avito.android.blueprints.radio_card.radio_card_group;

import Y41.p;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioCardsGroupView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/radio_card/radio_card_group/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/radio_card/radio_card_group/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f106548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f106549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f106550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public p<? super JO.m, ? super Boolean, G0> f106551e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f106552f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f106553g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f106554h;

    public m(@Y61.k View view) throws BlueprintCollisionException {
        super(view);
        this.f106548b = (ComponentContainer) view.findViewById(R.id.container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_radio_cards_group);
        this.f106549c = recyclerView;
        com.avito.android.blueprints.radio_card.item.a aVar = new com.avito.android.blueprints.radio_card.item.a(new com.avito.android.blueprints.radio_card.item.f(new j(2, this, m.class, "onItemSelected", "onItemSelected(Lcom/avito/android/items/SelectableItem;Z)V", 0), new k(this), new l(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f106550d = hVar;
        this.f106554h = new ArrayList();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void G() {
        Iterator it = this.f106554h.iterator();
        while (it.hasNext()) {
            ((JO.m) it.next()).f8971l = false;
        }
        RecyclerView.Adapter adapter = this.f106549c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void G5() {
        Iterator it = this.f106554h.iterator();
        while (it.hasNext()) {
            ((JO.m) it.next()).f8971l = true;
        }
        RecyclerView.Adapter adapter = this.f106549c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void H3(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f106552f = lVar;
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void V9(int i12, @Y61.k List list) {
        ArrayList arrayList = this.f106554h;
        arrayList.clear();
        arrayList.addAll(list);
        if (i12 >= 0 && i12 < arrayList.size()) {
            ((JO.m) arrayList.get(i12)).f8964e = true;
        }
        this.f106550d.f338510e = new UV0.c(arrayList);
        RecyclerView.Adapter adapter = this.f106549c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void bc(@Y61.k p<? super JO.m, ? super Boolean, G0> pVar) {
        this.f106551e = pVar;
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void setTitle(@Y61.k String str) {
        this.f106548b.setTitle(str);
    }

    @Override // com.avito.android.blueprints.radio_card.radio_card_group.i
    public final void xD(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f106553g = lVar;
    }
}
