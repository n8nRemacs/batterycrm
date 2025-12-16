package com.avito.android.advert_collection;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCollectionResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/m;", "Lcom/avito/android/advert_collection/l;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f81539a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f81540b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f81541c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f81542d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f81543e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f81544f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f81545g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f81546h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f81547i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f81548j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f81549k;

    @Inject
    public m(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f81539a = resources.getString(R.string.empty_collection);
        this.f81540b = resources.getString(R.string.try_later);
        resources.getString(R.string.successful_link_copy);
        this.f81541c = resources.getString(R.string.link_copy_error);
        this.f81542d = resources.getString(R.string.collection_load_error);
        this.f81543e = resources.getString(R.string.location_not_found_error);
        this.f81544f = resources.getString(R.string.delete);
        this.f81545g = resources.getString(R.string.successful_delete_collection);
        this.f81546h = resources.getString(R.string.collection_delete_error);
        this.f81547i = resources.getString(R.string.collection_edit);
        this.f81548j = resources.getString(R.string.collection_publish);
        this.f81549k = resources.getString(R.string.collection_unpublish);
        resources.getString(R.string.collection_publish_info);
        resources.getString(R.string.advert_collection_share_link);
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF81544f() {
        return this.f81544f;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF81549k() {
        return this.f81549k;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF81545g() {
        return this.f81545g;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF81548j() {
        return this.f81548j;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF81547i() {
        return this.f81547i;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF81543e() {
        return this.f81543e;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF81542d() {
        return this.f81542d;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getF81539a() {
        return this.f81539a;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getF81540b() {
        return this.f81540b;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getF81546h() {
        return this.f81546h;
    }

    @Override // com.avito.android.advert_collection.l
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final String getF81541c() {
        return this.f81541c;
    }
}
