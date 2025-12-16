package com.avito.android.saved_searches.presentation.items.chips;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import kotlin.Metadata;

/* compiled from: SavedSearchChipsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/k;", "Lcom/avito/android/saved_searches/presentation/items/chips/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f258477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f258478c;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f258477b = aVar;
        this.f258478c = (Chips) view.findViewById(R.id.chips);
    }

    @Override // com.avito.android.saved_searches.presentation.items.chips.j
    public final void Bw(@Y61.k c cVar) {
        String str = cVar.f258459a;
        Chips chips = this.f258478c;
        chips.setTitle(str);
        chips.setSelectStrategy(cVar.f258460b);
        chips.setChipsSelectedListener(cVar.f258464f);
        chips.setData(cVar.f258461c);
        chips.setHint(this.f258477b.c(chips.getContext(), cVar.f258463e));
        chips.setError(cVar.f258466h);
        chips.j();
        chips.r(cVar.f258462d);
        chips.setKeepSelected(cVar.f258465g);
    }
}
