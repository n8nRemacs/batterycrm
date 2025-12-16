package com.avito.android.profile.user_profile.cards.item_with_button;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WithButtonCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f225007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.WithButtonCardItem f225008m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, CardItem.WithButtonCardItem withButtonCardItem) {
        super(0);
        this.f225007l = eVar;
        this.f225008m = withButtonCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f225007l.f225009b.invoke(new InterfaceC15503a.k(this.f225008m));
        return G0.f406611a;
    }
}
