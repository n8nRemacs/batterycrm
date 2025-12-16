package com.avito.android.favorite_sellers.adapter.advert_list;

import Y61.k;
import Y61.l;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.util.Kundle;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/e;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/d;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Kundle f155541b;

    @Inject
    public e(@com.avito.android.favorite_sellers.adapter.advert_list.di.g @l Kundle kundle) {
        this.f155541b = kundle == null ? new Kundle() : kundle;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        g gVar = (g) eVar;
        AdvertListItem advertListItem = (AdvertListItem) aVar;
        List<PersistableSerpItem> list = advertListItem.f155495d;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PersistableSerpItem persistableSerpItem = (PersistableSerpItem) next;
            if ((persistableSerpItem instanceof AdvertItem) && ((AdvertItem) persistableSerpItem).f268374D == SerpViewType.f268584d) {
                break;
            }
        }
        if (next != null) {
            gVar.U9();
        } else {
            gVar.Wd();
        }
        UV0.c cVar = new UV0.c(list);
        gVar.zc().c(cVar);
        gVar.V5().c(cVar);
        gVar.V5().s4(gVar);
        gVar.O9().c(cVar);
        gVar.O9().d(gVar);
        gVar.e8();
        gVar.s(String.valueOf(advertListItem.getF138406b().hashCode()));
        gVar.Gd(advertListItem.f155496e || !advertListItem.f155497f);
        Integer numB = this.f155541b.b(String.valueOf(advertListItem.getF138406b().hashCode()));
        if (numB != null) {
            gVar.W0(numB.intValue());
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.d
    public final void Q0(int i12, @k String str) {
        this.f155541b.i(Integer.valueOf(i12), str);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.d
    @k
    /* renamed from: d0, reason: from getter */
    public final Kundle getF155541b() {
        return this.f155541b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void r0(com.avito.konveyor.adapter.b bVar, int i12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void t0(com.avito.konveyor.adapter.b bVar, int i12) {
    }
}
