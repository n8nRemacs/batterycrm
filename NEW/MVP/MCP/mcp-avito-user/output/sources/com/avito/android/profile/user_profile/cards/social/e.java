package com.avito.android.profile.user_profile.cards.social;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.social.SocialNetwork;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SocialCardItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/social/e;", "Lcom/avito/android/profile/user_profile/cards/social/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225562b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225562b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.SocialCardItem socialCardItem = (CardItem.SocialCardItem) aVar;
        gVar.UA();
        for (SocialNetwork socialNetwork : socialCardItem.f224599d) {
            String title = socialNetwork.getTitle();
            if (socialNetwork instanceof SocialNetwork.Vkontakte) {
                gVar.IR(title);
            } else if (socialNetwork instanceof SocialNetwork.Odnoklassniki) {
                gVar.OY(title);
            } else if (socialNetwork instanceof SocialNetwork.Google) {
                gVar.Wg(title);
            } else if (socialNetwork instanceof SocialNetwork.Apple) {
                gVar.cn(title);
            } else if (socialNetwork instanceof SocialNetwork.Esia) {
                gVar.Mh(title);
            } else if (socialNetwork instanceof SocialNetwork.AvitoFake) {
                gVar.CD(title);
            } else if (socialNetwork instanceof SocialNetwork.VkId) {
                gVar.IR(title);
            }
        }
        gVar.Q(new d(this, socialCardItem));
    }
}
