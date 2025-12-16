package com.avito.android.travel_guest_profile.navigation;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import navigation.TravelGuestProfileLink;
import sv.C48421d;

/* compiled from: TravelGuestProfileLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f302207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TravelGuestProfileLink f302208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, TravelGuestProfileLink travelGuestProfileLink) {
        super(0);
        this.f302207l = eVar;
        this.f302208m = travelGuestProfileLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f302207l;
        TravelGuestProfileLink travelGuestProfileLink = this.f302208m;
        eVar.f302210g.J(eVar.f302209f.a(travelGuestProfileLink.f415185b, travelGuestProfileLink.f415186c, travelGuestProfileLink.f415187d), C48421d.a(eVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
