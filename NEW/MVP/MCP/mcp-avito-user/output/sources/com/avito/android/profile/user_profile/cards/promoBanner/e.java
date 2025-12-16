package com.avito.android.profile.user_profile.cards.promoBanner;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.ParametrizedEvent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/promoBanner/e;", "Lcom/avito/android/profile/user_profile/cards/promoBanner/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225248b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225249c;

    @Inject
    public e(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f225248b = interfaceC28373a;
        this.f225249c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.PromoBanner promoBanner = (CardItem.PromoBanner) aVar;
        gVar.N4(promoBanner.f224493d, promoBanner.f224494e);
        gVar.v(promoBanner.f224495f);
        gVar.G0(promoBanner.f224496g);
        gVar.c(new d(promoBanner, this));
        ParametrizedEvent parametrizedEvent = promoBanner.f224498i;
        if (parametrizedEvent != null) {
            this.f225248b.c(a0.a(parametrizedEvent));
        }
    }
}
