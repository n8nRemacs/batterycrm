package com.avito.android.profile.user_profile.cards.profile_job_menu;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ProfileJobMenuItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/profile_job_menu/i;", "Lcom/avito/android/profile/user_profile/cards/profile_job_menu/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f225218b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC15503a, G0> lVar) {
        this.f225218b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        CardItem.ProfileJobMenuCardItem profileJobMenuCardItem = (CardItem.ProfileJobMenuCardItem) aVar;
        List<ProfileJobMenuItem.Tile> list = profileJobMenuCardItem.f224482h;
        ProfileJobMenuItem.Tile tile = (ProfileJobMenuItem.Tile) C42745f0.G(list);
        ProfileJobMenuItem.Tile tile2 = (ProfileJobMenuItem.Tile) C42745f0.S(list);
        kVar.H30(profileJobMenuCardItem.f224478d, new d(this, profileJobMenuCardItem));
        kVar.ku(profileJobMenuCardItem.f224479e, new e(this, profileJobMenuCardItem));
        kVar.F4(profileJobMenuCardItem.f224480f);
        kVar.ro(tile, new f(tile, this));
        kVar.J40(tile2, new g(tile2, this));
        ProfileJobMenuItem.Tile tile3 = profileJobMenuCardItem.f224483i;
        kVar.iF(tile3, new h(tile3, this));
    }
}
