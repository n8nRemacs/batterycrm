package com.avito.android.search;

import com.avito.android.remote.model.search.suggest.TitleSuggestItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: TitleSearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/r;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f263836b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TitleSuggestItem f263837c;

    public r(@Y61.k String str, @Y61.k TitleSuggestItem titleSuggestItem) {
        this.f263836b = str;
        this.f263837c = titleSuggestItem;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF181568b() {
        return this.f263836b;
    }
}
