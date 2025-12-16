package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.saved_searches.analytics.SavedSearchEntryPointType;
import com.avito.android.saved_searches.analytics.SavedSearchFromPageType;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/d0;", "Lcom/avito/android/saved_searches/analytics/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.d0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C28970d0 implements com.avito.android.saved_searches.analytics.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109664a;

    public C28970d0(BxContentFragment bxContentFragment) {
        this.f109664a = bxContentFragment;
    }

    @Override // com.avito.android.saved_searches.analytics.c
    public final void a(@Y61.k SavedSearchEntryPointType savedSearchEntryPointType, boolean z12) {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentFragment bxContentFragment = this.f109664a;
        String categoryId = bxContentFragment.Z5().f112645M.a().f112345l.getCategoryId();
        SavedSearchFromPageType savedSearchFromPageType = bxContentFragment.Z5().f112645M.a().f112306I.isMap() ? SavedSearchFromPageType.f258250d : SavedSearchFromPageType.f258249c;
        com.avito.android.saved_searches.analytics.d dVar = bxContentFragment.f108895C3;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(categoryId, savedSearchFromPageType, savedSearchEntryPointType, z12);
    }
}
