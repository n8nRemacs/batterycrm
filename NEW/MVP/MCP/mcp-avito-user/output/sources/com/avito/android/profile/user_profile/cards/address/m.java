package com.avito.android.profile.user_profile.cards.address;

import Ua0.InterfaceC15503a;
import com.avito.android.analytics.event.C28415g;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmptyAddressCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f224742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.EmptyAddressCardItem f224743m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CardItem.EmptyAddressCardItem emptyAddressCardItem, o oVar) {
        super(0);
        this.f224742l = oVar;
        this.f224743m = emptyAddressCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CardItem.EmptyAddressCardItem emptyAddressCardItem = this.f224743m;
        String str = emptyAddressCardItem.f224393d;
        o oVar = this.f224742l;
        oVar.getClass();
        oVar.f224746b.c(new C28415g(str));
        if (emptyAddressCardItem.f224399j != null) {
            oVar.f224747c.invoke(new InterfaceC15503a.k(emptyAddressCardItem));
        }
        return G0.f406611a;
    }
}
