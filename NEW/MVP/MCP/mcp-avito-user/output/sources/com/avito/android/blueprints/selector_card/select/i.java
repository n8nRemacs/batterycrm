package com.avito.android.blueprints.selector_card.select;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGroupView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/selector_card/select/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/selector_card/select/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f106670b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106671c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ComponentContainer f106672d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f106673e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f106674f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public N f106675g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f106676h;

    /* compiled from: SelectorCardGroupView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJO/m;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(LJO/m;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<m, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f106677l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(m mVar, Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    public i(@k View view, @k com.avito.android.util.text.a aVar) throws BlueprintCollisionException {
        super(view);
        this.f106670b = view;
        this.f106671c = aVar;
        this.f106672d = (ComponentContainer) view.findViewById(R.id.container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_selector_card_group);
        this.f106673e = recyclerView;
        com.avito.android.blueprints.selector_card.item.a aVar2 = new com.avito.android.blueprints.selector_card.item.a(new com.avito.android.blueprints.selector_card.item.c(new h(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f106674f = hVar;
        this.f106675g = a.f106677l;
        this.f106676h = new ArrayList();
        j jVar = new j(hVar, aVarA);
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext().getResources().getInteger(R.integer.publish_selector_card_group_column_number)));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.l(new com.avito.android.ui.b(view.getContext().getResources().getInteger(R.integer.publish_selector_card_group_column_number), com.avito.android.actions_sheet.a.d(view, R.dimen.publish_selector_card_items_padding)), -1);
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void G() {
        Iterator it = this.f106676h.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f8971l = false;
        }
        RecyclerView.Adapter adapter = this.f106673e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void G5() {
        Iterator it = this.f106676h.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f8971l = true;
        }
        RecyclerView.Adapter adapter = this.f106673e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void S4(int i12) {
        ((m) this.f106676h.get(i12)).f8964e = true;
        RecyclerView.Adapter adapter = this.f106673e.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i12);
        }
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void V9(int i12, @k List list) {
        ArrayList arrayList = this.f106676h;
        arrayList.clear();
        arrayList.addAll(list);
        if (i12 >= 0 && i12 < arrayList.size()) {
            ((m) arrayList.get(i12)).f8964e = true;
        }
        this.f106674f.f338510e = new UV0.c(arrayList);
        RecyclerView.Adapter adapter = this.f106673e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void bc(@k p<? super m, ? super Boolean, G0> pVar) {
        this.f106675g = (N) pVar;
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void k(@l AttributedText attributedText) {
        G0 g02;
        ComponentContainer componentContainer = this.f106672d;
        if (attributedText != null) {
            componentContainer.setSubtitle(this.f106671c.c(componentContainer.getContext(), attributedText));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            componentContainer.setSubtitle((CharSequence) null);
        }
    }

    @Override // com.avito.android.blueprints.selector_card.select.g
    public final void setTitle(@k CharSequence charSequence) {
        this.f106672d.setTitle(charSequence);
    }
}
