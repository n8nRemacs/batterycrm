package com.avito.android.search.filter.adapter.inline_select;

import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InlineSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/inline_select/g;", "Lcom/avito/android/search/filter/adapter/inline_select/e;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.v> f262402b;

    @Inject
    public g(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262402b = interfaceC34581l.getF263716j();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        ParameterElement.v.b bVar = (ParameterElement.v.b) aVar;
        iVar.setTitle(bVar.f262840c);
        iVar.i00(bVar.f262862t, bVar.f262844g, new f(bVar, this));
        iVar.RZ();
    }
}
