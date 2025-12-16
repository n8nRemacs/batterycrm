package com.avito.android.search.filter.adapter.switcher;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SwitcherItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/switcher/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/switcher/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f262613c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f262614b;

    public i(@k View view) {
        super(view);
        this.f262614b = (ListItemSwitcher) view;
    }

    @Override // com.avito.android.search.filter.adapter.switcher.h
    public final void fx(@k l<? super Boolean, G0> lVar) {
        ListItemSwitcher listItemSwitcher = this.f262614b;
        listItemSwitcher.i();
        listItemSwitcher.e(new com.avito.android.blueprint.switcher.h(4, lVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f262614b.i();
    }

    @Override // com.avito.android.search.filter.adapter.switcher.h
    public final void setChecked(boolean z12) {
        this.f262614b.setChecked(z12);
    }

    @Override // com.avito.android.search.filter.adapter.switcher.h
    public final void setTitle(@k String str) {
        this.f262614b.setTitle(str);
    }
}
