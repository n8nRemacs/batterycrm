package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import oz.InterfaceC44959a;

/* compiled from: EntryPointToAccountOwnerPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/m;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44959a f309924b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309925c;

    @Inject
    public m(@Y61.k InterfaceC44959a interfaceC44959a) {
        this.f309924b = interfaceC44959a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        EntryPointToAccountOwnerItem entryPointToAccountOwnerItem = (EntryPointToAccountOwnerItem) aVar;
        gVar.n1(entryPointToAccountOwnerItem.f309895f);
        gVar.sP(entryPointToAccountOwnerItem.f309896g, new j(this, entryPointToAccountOwnerItem));
        gVar.setTitle(entryPointToAccountOwnerItem.f309894e);
        gVar.dj(entryPointToAccountOwnerItem.f309897h, new k(this), new l(this));
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i
    public final void Y3(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309925c = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.realty.entry_point_client_room.i
    public final void e() {
        this.f309925c = null;
    }
}
