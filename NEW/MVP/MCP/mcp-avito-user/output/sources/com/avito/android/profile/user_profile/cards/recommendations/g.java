package com.avito.android.profile.user_profile.cards.recommendations;

import Ua0.InterfaceC15503a;
import Y41.l;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.recommendations.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RecommendationsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/recommendations/g;", "Lcom/avito/android/profile/user_profile/cards/recommendations/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC15503a, G0> f225289b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k l<? super InterfaceC15503a, G0> lVar) {
        this.f225289b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        CardItem.RecommendationsItem recommendationsItem = (CardItem.RecommendationsItem) aVar;
        iVar.U(new e(recommendationsItem, this));
        iVar.Og(new f(this));
        iVar.setTitle(recommendationsItem.f224519d);
        iVar.B(recommendationsItem.f224521f);
        this.f225289b.invoke(new InterfaceC15503a.s(a.C6833a.f225280a));
    }
}
