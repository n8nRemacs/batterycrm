package com.avito.android.inline_filters.dialog.group.item.multiselect;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.inline_filters.dialog.select.adapter.j;
import com.avito.android.inline_filters.dialog.select.adapter.u;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/multiselect/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/group/item/multiselect/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f171613b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f171614c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f171615d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public N f171616e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public N f171617f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Object f171618g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Filter f171619h;

    /* compiled from: MultiselectView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Filter, List<? extends String>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f171620l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(Filter filter, List<? extends String> list) {
            return G0.f406611a;
        }
    }

    /* compiled from: MultiselectView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f171621l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    public f(@k View view) throws BlueprintCollisionException {
        super(view);
        View viewFindViewById = view.findViewById(R.id.inline_filter_multiselect_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f171613b = recyclerView;
        this.f171616e = a.f171620l;
        this.f171617f = b.f171621l;
        this.f171618g = C42784z0.f406748b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(true);
        j jVar = new j(new d(this), new e(this));
        com.avito.android.inline_filters.dialog.select.adapter.d dVar = new com.avito.android.inline_filters.dialog.select.adapter.d(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.p pVar = new com.avito.android.inline_filters.dialog.select.adapter.p(jVar);
        u uVar = new u(jVar);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        c10493a.b(pVar);
        c10493a.b(uVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f171614c = aVarA;
        this.f171615d = new h(aVarA, aVarA, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.dialog.group.item.multiselect.c
    public final void dY(@k Y41.l<? super DeepLink, G0> lVar) {
        this.f171617f = (N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.dialog.group.item.multiselect.c
    public final void f70(@k p<? super Filter, ? super List<String>, G0> pVar) {
        this.f171616e = (N) pVar;
    }

    @Override // com.avito.android.inline_filters.dialog.group.item.multiselect.c
    public final void yz(@k MultiselectItem multiselectItem, @k List<i> list) {
        List<String> selectedOptions;
        this.f171619h = multiselectItem.f171603c;
        List<i> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (i iVar : list2) {
            InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = multiselectItem.f171604d;
            iVar.f172094e = (inlineFilterMultiSelectValue == null || (selectedOptions = inlineFilterMultiSelectValue.getSelectedOptions()) == null) ? false : selectedOptions.contains(iVar.f172092c);
            arrayList.add(iVar);
        }
        this.f171618g = arrayList;
        UV0.c cVar = new UV0.c(list);
        h hVar = this.f171615d;
        hVar.f338510e = cVar;
        RecyclerView recyclerView = this.f171613b;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, this.f171614c));
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
