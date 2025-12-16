package com.avito.android.advert_collection_list;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCollectionListResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/j;", "Lcom/avito/android/advert_collection_list/i;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f82167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f82168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f82169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f82170d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f82171e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f82172f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f82173g;

    @Inject
    public j(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f82167a = resources;
        resources.getString(R.string.share);
        this.f82168b = resources.getString(R.string.delete);
        this.f82169c = resources.getString(R.string.successful_delete_collection);
        this.f82170d = resources.getString(R.string.advert_collection_list_publish);
        this.f82171e = resources.getString(R.string.advert_collection_list_unpublish);
        this.f82172f = resources.getString(R.string.advert_collection_list_edit);
        this.f82173g = resources.getString(R.string.advert_collection_list_share_link);
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF82168b() {
        return this.f82168b;
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF82171e() {
        return this.f82171e;
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF82169c() {
        return this.f82169c;
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF82170d() {
        return this.f82170d;
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF82172f() {
        return this.f82172f;
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    public final String f(int i12) {
        return this.f82167a.getQuantityString(R.plurals.advert_size, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.advert_collection_list.i
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF82173g() {
        return this.f82173g;
    }
}
