package com.avito.android.search.filter.adapter.switcher;

import Y61.k;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.common.SwitcherItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/switcher/f;", "Lcom/avito/android/search/filter/adapter/switcher/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<com.avito.android.search.filter.converter.common.b> f262611b;

    @Inject
    public f(@k InterfaceC34581l interfaceC34581l) {
        this.f262611b = interfaceC34581l.getF263707a();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SwitcherItem switcherItem = (SwitcherItem) aVar;
        hVar.setTitle(switcherItem.f262935c);
        hVar.setChecked(switcherItem.f262936d);
        hVar.fx(new e(switcherItem, this));
    }
}
