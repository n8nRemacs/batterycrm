package com.avito.android.profile.user_profile.cards.adverts;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertsCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f224772l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.AdvertsCardItem f224773m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, CardItem.AdvertsCardItem advertsCardItem) {
        super(0);
        this.f224772l = eVar;
        this.f224773m = advertsCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f224772l.f224774b.invoke(new InterfaceC15503a.k(this.f224773m));
        return G0.f406611a;
    }
}
