package com.avito.android.profile.user_profile.cards.autosubscribtion;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/autosubscribtion/e;", "Lcom/avito/android/profile/user_profile/cards/autosubscribtion/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224787b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224787b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CardItem.AutoSubscribeItem autoSubscribeItem = (CardItem.AutoSubscribeItem) aVar;
        d dVar = new d(this, autoSubscribeItem);
        ((g) eVar).wJ(autoSubscribeItem.f224318d, autoSubscribeItem.f224319e, autoSubscribeItem.f224320f, dVar);
    }
}
