package com.avito.android.profile.user_profile.cards.promotions;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromotionsCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.PromotionsCardItem f225265l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f225266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f225267n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardItem.PromotionsCardItem promotionsCardItem, String str, e eVar) {
        super(0);
        this.f225265l = promotionsCardItem;
        this.f225266m = str;
        this.f225267n = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CardItem.PromotionsCardItem promotionsCardItem = this.f225265l;
        String str = promotionsCardItem.f224512d;
        e eVar = this.f225267n;
        if (str != null && this.f225266m != null) {
            eVar.f225269c.b(str);
        }
        eVar.f225270d.b();
        eVar.f225268b.invoke(new InterfaceC15503a.k(promotionsCardItem));
        return G0.f406611a;
    }
}
