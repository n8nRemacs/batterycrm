package com.avito.android.search_suggest;

import Pp0.InterfaceC14824b;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.search_suggest.SearchSuggestFragment;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchSuggestView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/t;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f264367a;

    public t(v vVar) {
        this.f264367a = vVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        c(hVar);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        c(hVar);
    }

    public final void c(com.avito.android.lib.design.chips.h hVar) {
        if (hVar instanceof com.avito.android.search.e) {
            List<SuggestAction> actions = ((com.avito.android.search.e) hVar).f261733b.getActions();
            v vVar = this.f264367a;
            if (actions != null) {
                ((SearchSuggestFragment.c) vVar.f264372d).invoke(new InterfaceC14824b.C0869b(actions, Op0.c.f12562b));
            }
            vVar.f264379k.j();
        }
    }
}
