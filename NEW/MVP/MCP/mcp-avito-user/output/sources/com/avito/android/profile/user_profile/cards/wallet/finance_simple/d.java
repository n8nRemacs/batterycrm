package com.avito.android.profile.user_profile.cards.wallet.finance_simple;

import N90.i;
import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoFinanceSimpleCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f225707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.AvitoFinanceSimpleCardItem f225708m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, CardItem.AvitoFinanceSimpleCardItem avitoFinanceSimpleCardItem) {
        super(0);
        this.f225707l = gVar;
        this.f225708m = avitoFinanceSimpleCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f225707l;
        gVar.f225713b.invoke(new InterfaceC15503a.h(this.f225708m.f224336g));
        gVar.f225714c.c(new i(gVar.f225715d.f11258a));
        return G0.f406611a;
    }
}
