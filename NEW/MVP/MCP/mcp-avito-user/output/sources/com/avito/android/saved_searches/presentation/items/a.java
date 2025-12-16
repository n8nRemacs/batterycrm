package com.avito.android.saved_searches.presentation.items;

import Y61.l;
import com.avito.android.saved_searches.presentation.items.banner.SavedSearchBannerItem;
import com.avito.android.saved_searches.presentation.items.header.SavedSearchHeaderItem;
import com.avito.android.saved_searches.presentation.items.name.SavedSearchNameItem;
import com.avito.android.saved_searches.presentation.items.switcher.SavedSearchSwitcherItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainContentsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof SavedSearchBannerItem) && (aVar2 instanceof SavedSearchBannerItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof SavedSearchHeaderItem) && (aVar2 instanceof SavedSearchHeaderItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof SavedSearchNameItem) && (aVar2 instanceof SavedSearchNameItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof SavedSearchSwitcherItem) && (aVar2 instanceof SavedSearchSwitcherItem)) {
            return L.f(aVar, aVar2);
        }
        return false;
    }
}
