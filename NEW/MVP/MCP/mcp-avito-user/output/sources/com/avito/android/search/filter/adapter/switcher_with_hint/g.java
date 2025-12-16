package com.avito.android.search.filter.adapter.switcher_with_hint;

import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SwitcherWithHintItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/switcher_with_hint/g;", "Lcom/avito/android/search/filter/adapter/switcher_with_hint/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f262624b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<SwitcherWithHintItem> f262625c;

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262624b = aVar;
        this.f262625c = interfaceC34581l.getF263704D();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SwitcherWithHintItem switcherWithHintItem = (SwitcherWithHintItem) aVar;
        ((i) eVar).yW(switcherWithHintItem, new e(switcherWithHintItem, this), new f(this));
    }
}
