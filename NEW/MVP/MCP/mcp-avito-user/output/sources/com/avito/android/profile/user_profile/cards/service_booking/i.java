package com.avito.android.profile.user_profile.cards.service_booking;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f225410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.ServiceBookingCardItem f225411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, CardItem.ServiceBookingCardItem serviceBookingCardItem) {
        super(0);
        this.f225410l = kVar;
        this.f225411m = serviceBookingCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f225410l.f225481b.invoke(new InterfaceC15503a.j(this.f225411m.f224564h.getDeepLink()));
        return G0.f406611a;
    }
}
