package com.avito.android.profile.user_profile.cards.profile_settings;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileManagementPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/profile_settings/g;", "Lcom/avito/android/profile/user_profile/cards/profile_settings/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225240b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225240b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        CardItem.ProfileManagementCardItem profileManagementCardItem = (CardItem.ProfileManagementCardItem) aVar;
        cVar.setTitle(profileManagementCardItem.f224485d);
        cVar.f(profileManagementCardItem.f224486e);
        cVar.P(profileManagementCardItem.f224487f.getTitle(), new f(profileManagementCardItem, this));
    }
}
