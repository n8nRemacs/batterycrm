package com.avito.android.list.toggle;

import Y61.k;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import com.avito.android.search.l;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SuggestToggleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/toggle/d;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f181662b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ToggleSuggestItem f181663c;

    public d(@k String str, @k ToggleSuggestItem toggleSuggestItem) {
        this.f181662b = str;
        this.f181663c = toggleSuggestItem;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF182069b() {
        return this.f181662b;
    }
}
