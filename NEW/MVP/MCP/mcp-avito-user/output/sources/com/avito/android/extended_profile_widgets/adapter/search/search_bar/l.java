package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import android.view.View;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileSearchInputView f154760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f154761c;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_search_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView");
        }
        this.f154760b = (ProfileSearchInputView) viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    public final void Am() {
        this.f154760b.b();
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    @Y61.k
    public final com.jakewharton.rxrelay3.c PC() {
        return this.f154760b.f153403u;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f154761c = aVar;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    @Y61.k
    public final z<String> dc() {
        return this.f154760b.h();
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    @Y61.k
    public final z<Integer> e5() {
        return this.f154760b.f153400r;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f154761c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    @Y61.k
    public final z<String> o6() {
        return this.f154760b.g();
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_bar.k
    public final void w80(@Y61.k SearchBarItem searchBarItem) {
        ProfileSearchInputView profileSearchInputView = this.f154760b;
        profileSearchInputView.f153405w = null;
        D6.w(profileSearchInputView.f153397o);
        profileSearchInputView.setHint(searchBarItem.f154740h);
        profileSearchInputView.setQuery(searchBarItem.f154739g);
        View view = profileSearchInputView.f153392j;
        if (view != null) {
            D6.G(view, searchBarItem.f154736d > 0);
        }
        profileSearchInputView.setFilterEnabled(searchBarItem.f154737e);
        profileSearchInputView.setInputEnabled(!searchBarItem.f154738f);
    }
}
