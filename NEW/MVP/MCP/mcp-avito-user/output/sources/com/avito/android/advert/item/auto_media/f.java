package com.avito.android.advert.item.auto_media;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.auto_media.ab.ItemJournalAbTestGroup;
import com.avito.android.util.C35976x4;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutoMediaPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_media/f;", "LTV0/d;", "Lcom/avito/android/advert/item/auto_media/n;", "Lcom/avito/android/advert/item/auto_media/AdvertDetailsAutoMediaItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements TV0.d<n, AdvertDetailsAutoMediaItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f72922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.g<ItemJournalAbTestGroup> f72923c;

    @Inject
    public f(@Y61.k j jVar, @Y61.k u3.g<ItemJournalAbTestGroup> gVar) {
        this.f72922b = jVar;
        this.f72923c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        AdvertDetailsAutoMediaItem advertDetailsAutoMediaItem = (AdvertDetailsAutoMediaItem) aVar;
        this.f72923c.b();
        nVar.b(advertDetailsAutoMediaItem.f72907d);
        j jVar = this.f72922b;
        jVar.getClass();
        RecyclerView recyclerViewUJ = nVar.getF72936c();
        com.avito.konveyor.adapter.j jVar2 = jVar.f72928b;
        recyclerViewUJ.setAdapter(jVar2);
        C35976x4.a(nVar.getF72936c());
        nVar.getF72936c().l(new com.avito.android.ui.h(0, 0, 0, y6.b(12), 6, null), -1);
        jVar.f72927a.c(new UV0.c(advertDetailsAutoMediaItem.f72908e));
        jVar2.notifyDataSetChanged();
        SV.b bVar = new SV.b(0, null, 3, 0 == true ? 1 : 0);
        SV.b bVar2 = jVar.f72929c;
        if (bVar2 != null) {
            bVar2.b(null);
        }
        bVar.b(nVar.getF72936c());
        jVar.f72929c = bVar;
    }
}
