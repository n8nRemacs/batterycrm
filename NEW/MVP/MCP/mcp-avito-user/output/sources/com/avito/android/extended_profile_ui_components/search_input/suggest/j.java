package com.avito.android.extended_profile_ui_components.search_input.suggest;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/j;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/h;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f153453b;

    @Inject
    public j(@Y61.k e eVar) {
        this.f153453b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SuggestItem suggestItem = (SuggestItem) aVar;
        ((l) eVar).S60(suggestItem.f153424c, new i(this, suggestItem));
    }
}
