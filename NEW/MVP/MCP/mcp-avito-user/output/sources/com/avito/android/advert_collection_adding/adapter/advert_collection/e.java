package com.avito.android.advert_collection_adding.adapter.advert_collection;

import Y61.k;
import com.avito.android.advert_collection_adding.adapter.advert_collection.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdvertCollectionPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/e;", "Lcom/avito/android/advert_collection_adding/adapter/advert_collection/c;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f81765b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f81766c;

    @Inject
    public e() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f81765b = e2VarB;
        this.f81766c = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertCollectionItem advertCollectionItem = (AdvertCollectionItem) aVar;
        gVar.setTitle(advertCollectionItem.f81753c);
        gVar.yb(advertCollectionItem.f81755e);
        gVar.x(com.avito.android.image_loader.b.b(advertCollectionItem.f81756f));
        gVar.L0(new d(this, advertCollectionItem));
    }

    @Override // com.avito.android.advert_collection_adding.adapter.advert_collection.c
    @k
    public final InterfaceC43160i<c.a> g() {
        return this.f81766c;
    }
}
