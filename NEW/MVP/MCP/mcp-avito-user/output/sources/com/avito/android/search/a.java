package com.avito.android.search;

import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: BannerSearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/a;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f261728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BannerSuggestItem f261729c;

    public a(@Y61.k String str, @Y61.k BannerSuggestItem bannerSuggestItem) {
        this.f261728b = str;
        this.f261729c = bannerSuggestItem;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248389b() {
        return this.f261728b;
    }
}
