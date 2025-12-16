package com.avito.android.search.filter.adapter.bottom_sheet_group;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupOnboardingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/bottom_sheet_group/m;", "Lcom/avito/android/search/filter/adapter/bottom_sheet_group/l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f262030a;

    @Inject
    public m(@Y61.k AK0.l lVar) {
        this.f262030a = lVar;
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.l
    public final void a(@Y61.k String str) {
        this.f262030a.putBoolean(str, false);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.l
    public final boolean b(@Y61.k String str, boolean z12) {
        if (z12) {
            return this.f262030a.getBoolean(str, true);
        }
        return false;
    }
}
