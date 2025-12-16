package com.avito.android.profile.user_profile.cards.wallet.finance_split_bonuses;

import N90.e;
import Ua0.InterfaceC15503a;
import android.content.Context;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoFinanceSplitBonusesCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f225735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.AvitoFinanceSplitBonusesCardItem f225736m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, CardItem.AvitoFinanceSplitBonusesCardItem avitoFinanceSplitBonusesCardItem) {
        super(0);
        this.f225735l = iVar;
        this.f225736m = avitoFinanceSplitBonusesCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f225735l;
        iVar.f225737b.invoke(new InterfaceC15503a.h(this.f225736m.f224345h));
        String str = iVar.f225739d.f11258a;
        e.a aVar = new e.a(2, 2);
        Context context = iVar.f225741f;
        iVar.f225738c.c(new N90.e(str, "take loan", aVar, y6.e(C35835l0.i(context).heightPixels), y6.e(C35835l0.i(context).widthPixels)));
        return G0.f406611a;
    }
}
