package com.avito.android.search_suggest;

import Op0.C14723a;
import Pp0.InterfaceC14824b;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.search_suggest.SearchSuggestFragment;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchSuggestView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/s;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f264365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C14723a f264366b;

    public s(v vVar, C14723a c14723a) {
        this.f264365a = vVar;
        this.f264366b = c14723a;
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
        if (hVar instanceof com.avito.android.search.b) {
            List<SuggestAction> actions = ((com.avito.android.search.b) hVar).f261730b.getActions();
            v vVar = this.f264365a;
            if (actions != null) {
                ((SearchSuggestFragment.c) vVar.f264372d).invoke(new InterfaceC14824b.C0869b(actions, this.f264366b));
            }
            vVar.f264378j.j();
        }
    }
}
