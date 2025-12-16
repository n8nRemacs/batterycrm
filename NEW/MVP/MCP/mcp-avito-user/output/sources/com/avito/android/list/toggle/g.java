package com.avito.android.list.toggle;

import Y61.k;
import com.avito.android.C31100l2;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestTogglePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/toggle/g;", "Lcom/avito/android/list/toggle/e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31100l2 f181666b;

    @Inject
    public g(@k C31100l2 c31100l2) {
        this.f181666b = c31100l2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ToggleSuggestItem toggleSuggestItem = ((d) aVar).f181663c;
        hVar.u3(toggleSuggestItem.getLines());
        hVar.e(toggleSuggestItem.getTitle());
        hVar.en(toggleSuggestItem.getIsChecked());
        hVar.l0(new f(toggleSuggestItem, this));
    }
}
