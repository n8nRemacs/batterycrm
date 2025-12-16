package com.avito.android.advert_collection_list.adapter.advert_collection;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdvertCollectionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_list/adapter/advert_collection/g;", "Lcom/avito/android/advert_collection_list/adapter/advert_collection/d;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_collection_list.i f82056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f82057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f82058d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f82059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f82060f;

    @Inject
    public g(@k com.avito.android.advert_collection_list.i iVar) {
        this.f82056b = iVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f82057c = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, null, 5);
        this.f82058d = e2VarB2;
        this.f82059e = e2VarB;
        this.f82060f = e2VarB2;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (AdvertCollectionItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        AdvertCollectionItem advertCollectionItem = (AdvertCollectionItem) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof c : true) {
                obj = next;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(iVar, advertCollectionItem);
        } else {
            iVar.v6(this.f82056b.f(cVar.f82050a));
            iVar.x(com.avito.android.image_loader.b.b(cVar.f82051b));
        }
    }

    public final void k(@k i iVar, @k AdvertCollectionItem advertCollectionItem) {
        iVar.setTitle(advertCollectionItem.f82029c);
        iVar.v6(this.f82056b.f(advertCollectionItem.f82031e));
        iVar.x(com.avito.android.image_loader.b.b(advertCollectionItem.f82032f));
        iVar.L0(new e(this, advertCollectionItem));
        iVar.ea(new f(this, advertCollectionItem));
        String str = advertCollectionItem.f82033g;
        if (str == null) {
            str = "";
        }
        iVar.h(str);
        iVar.aX(advertCollectionItem.f82034h);
        iVar.TM(advertCollectionItem.f82035i);
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.d
    @k
    /* renamed from: k2, reason: from getter */
    public final e2 getF82060f() {
        return this.f82060f;
    }

    @Override // com.avito.android.advert_collection_list.adapter.advert_collection.d
    @k
    /* renamed from: v5, reason: from getter */
    public final e2 getF82059e() {
        return this.f82059e;
    }
}
