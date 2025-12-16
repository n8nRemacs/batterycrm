package com.avito.android.search_suggest.adapter.toggle;

import Pp0.InterfaceC14824b;
import Y41.l;
import Y61.k;
import com.avito.android.list.toggle.d;
import com.avito.android.list.toggle.e;
import com.avito.android.list.toggle.h;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestTogglePresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/toggle/b;", "Lcom/avito/android/list/toggle/e;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264177b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar) {
        this.f264177b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        d dVar = (d) aVar;
        ToggleSuggestItem toggleSuggestItem = dVar.f181663c;
        hVar.u3(toggleSuggestItem.getLines());
        hVar.e(toggleSuggestItem.getTitle());
        hVar.en(toggleSuggestItem.getIsChecked());
        hVar.l0(new a(toggleSuggestItem, this, dVar));
    }
}
