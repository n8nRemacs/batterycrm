package com.avito.android.search.filter.adapter.guests_select;

import Y61.k;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.select.l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: GuestsSelectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/guests_select/d;", "LTV0/d;", "Lcom/avito/android/search/filter/adapter/select/l;", "Lcom/avito/android/search/filter/converter/ParameterElement$n;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<l, ParameterElement.n> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g<ParameterElement> f262342b;

    @Inject
    public d(@k InterfaceC34581l interfaceC34581l) {
        this.f262342b = interfaceC34581l.getF263722p();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ParameterElement.n nVar = (ParameterElement.n) aVar;
        lVar.setTitle(nVar.f262772d);
        String str = nVar.f262775g;
        if (str != null) {
            lVar.o(str);
        }
        lVar.Kz(nVar.f262773e);
        lVar.a(new c(this, nVar));
    }
}
