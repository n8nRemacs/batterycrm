package com.avito.android.search.filter.adapter.local_priority;

import Y61.k;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocalPriorityItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/local_priority/f;", "Lcom/avito/android/search/filter/adapter/local_priority/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<ParameterElement.v> f262489b;

    @Inject
    public f(@k InterfaceC34581l interfaceC34581l) {
        this.f262489b = interfaceC34581l.getF263716j();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        hVar.setTitle(vVar.f262840c);
        hVar.on(new e(vVar, this), vVar);
    }
}
