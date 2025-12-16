package com.avito.android.beduin.common.component.inline_filter;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.inline_filter.item.m;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import lj.d;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinInlineFilterComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/inline_filter/BeduinInlineFilterModel;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinInlineFilterModel, RecyclerView> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final C3041a f101486k = new C3041a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f101487l = BeduinInlineFilterModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinInlineFilterModel f101488e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101489f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f101490g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f101491h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f101492i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public RecyclerView f101493j;

    /* compiled from: BeduinInlineFilterComponent.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.inline_filter.a$a, reason: collision with other inner class name */
    public static final class C3041a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3041a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return a.f101487l;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("inlineFilters");
        }

        public C3041a() {
        }
    }

    public a(@k BeduinInlineFilterModel beduinInlineFilterModel, @k InterfaceC15523b interfaceC15523b, @k lj.e eVar) throws BlueprintCollisionException {
        this.f101488e = beduinInlineFilterModel;
        this.f101489f = interfaceC15523b;
        this.f101490g = eVar;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.beduin.common.component.inline_filter.item.h(new m(new b(2, this, a.class, "onFilterClick", "onFilterClick(Landroid/view/View;Lcom/avito/android/remote/model/search/Filter;)V", 0)), beduinInlineFilterModel.getTheme()));
        c10493a.b(new com.avito.android.beduin.common.component.inline_filter.item.c(new com.avito.android.beduin.common.component.inline_filter.item.f(new c(2, this, a.class, "onChipFilterClick", "onChipFilterClick(Lcom/avito/android/lib/design/button/Button;Lcom/avito/android/remote/model/search/Filter;)V", 0)), beduinInlineFilterModel.getTheme(), beduinInlineFilterModel.getItemsSpacing()));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f101491h = hVar;
        this.f101492i = new com.avito.konveyor.adapter.j(hVar, aVarA);
        List<Filter> filters = beduinInlineFilterModel.getFilters();
        ArrayList arrayList = new ArrayList(C42745f0.q(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.beduin.common.component.inline_filter.item.a((Filter) it.next()));
        }
        this.f101491h.f338510e = new UV0.c(arrayList);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101488e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setClipChildren(false);
        Integer itemsSpacing = this.f101488e.getItemsSpacing();
        recyclerView.l(new com.avito.android.ui.h(0, 0, 0, y6.b(itemsSpacing != null ? itemsSpacing.intValue() : 10), 6, null), -1);
        return recyclerView;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.K0(this.f101492i, false);
        BeduinContainerIndent padding = this.f101488e.getPadding();
        if (padding != null) {
            J.b(recyclerView, padding);
        }
        this.f101493j = recyclerView;
    }

    public final void u(Filter filter, InlineFilterValue inlineFilterValue) {
        BeduinInlineFilterModel beduinInlineFilterModel = this.f101488e;
        ArrayList arrayList = new ArrayList(beduinInlineFilterModel.getFilters());
        int iIndexOf = arrayList.indexOf(filter);
        if (iIndexOf < 0) {
            V2.f318762a.j("BeduinInlineFilters", "Cannot find " + filter + " in " + beduinInlineFilterModel, null);
            return;
        }
        arrayList.set(iIndexOf, filter.copy((65279 & 1) != 0 ? filter.attrId : null, (65279 & 2) != 0 ? filter.id : null, (65279 & 4) != 0 ? filter.widget : null, (65279 & 8) != 0 ? filter.payload : null, (65279 & 16) != 0 ? filter.title : null, (65279 & 32) != 0 ? filter.searchHint : null, (65279 & 64) != 0 ? filter.displayTitle : null, (65279 & 128) != 0 ? filter.isHighlighted : null, (65279 & 256) != 0 ? filter.value : inlineFilterValue, (65279 & 512) != 0 ? filter.options : null, (65279 & 1024) != 0 ? filter.selectedOptions : null, (65279 & 2048) != 0 ? filter.filters : null, (65279 & 4096) != 0 ? filter.changedParamType : null, (65279 & 8192) != 0 ? filter.hasSuggest : null, (65279 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? filter.richTitle : null, (65279 & 32768) != 0 ? filter.resetAreaOnChange : false));
        BeduinInlineFilterModel beduinInlineFilterModel2 = this.f101488e;
        this.f101490g.h(new d.h(beduinInlineFilterModel2, BeduinInlineFilterModel.copy$default(beduinInlineFilterModel2, null, null, null, arrayList, null, null, null, 119, null)));
        List<BeduinAction> actions = beduinInlineFilterModel.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            this.f101489f.o((BeduinAction) it.next());
        }
    }
}
