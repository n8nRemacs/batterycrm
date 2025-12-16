package com.avito.android.profile.user_profile.cards.promotions;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vm.InterfaceC49346a;
import vm.InterfaceC49348c;

/* compiled from: PromotionsCardPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/promotions/e;", "Lcom/avito/android/profile/user_profile/cards/promotions/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225268b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC49348c f225269c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC49346a f225270d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC49348c interfaceC49348c, @k InterfaceC49346a interfaceC49346a) {
        this.f225268b = lVar;
        this.f225269c = interfaceC49348c;
        this.f225270d = interfaceC49346a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.PromotionsCardItem promotionsCardItem = (CardItem.PromotionsCardItem) aVar;
        gVar.setTitle(promotionsCardItem.f224513e);
        gVar.h(promotionsCardItem.f224514f);
        String str = promotionsCardItem.f224512d;
        String str2 = str != null ? this.f225269c.g(str) : true ? promotionsCardItem.f224515g : null;
        gVar.I1(str2);
        gVar.qF(promotionsCardItem.f224516h);
        gVar.P(promotionsCardItem.f224517i.getTitle(), new d(promotionsCardItem, str2, this));
    }
}
