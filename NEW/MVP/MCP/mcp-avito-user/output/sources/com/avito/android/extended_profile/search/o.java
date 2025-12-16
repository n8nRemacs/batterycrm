package com.avito.android.extended_profile.search;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSearchResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/search/o;", "Lcom/avito/android/extended_profile/search/n;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f150527a;

    @Inject
    public o(@Y61.k Resources resources) {
        this.f150527a = resources;
    }

    @Override // com.avito.android.extended_profile.search.n
    @Y61.k
    public final String a(int i12) {
        return this.f150527a.getQuantityString(R.plurals.profile_adverts_closed, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.extended_profile.search.n
    @Y61.k
    public final String b(int i12) {
        return this.f150527a.getQuantityString(R.plurals.profile_adverts_items, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.extended_profile.search.n
    @Y61.k
    public final String c(int i12) {
        return this.f150527a.getQuantityString(R.plurals.profile_adverts_active, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.extended_profile.search.n
    @Y61.k
    public final String d() {
        return this.f150527a.getString(R.string.extended_profile_search_error_item_text);
    }
}
