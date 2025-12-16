package com.avito.android.profile.user_profile.cards.wallet.finance_simple;

import N90.e;
import Ua0.InterfaceC15503a;
import android.content.Context;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoFinanceSimpleCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f225711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.AvitoFinanceSimpleCardItem f225712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, CardItem.AvitoFinanceSimpleCardItem avitoFinanceSimpleCardItem) {
        super(0);
        this.f225711l = gVar;
        this.f225712m = avitoFinanceSimpleCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f225711l;
        gVar.f225713b.invoke(new InterfaceC15503a.h(this.f225712m.f224335f));
        String str = gVar.f225715d.f11258a;
        e.a aVar = new e.a(1, 1);
        Context context = gVar.f225717f;
        gVar.f225714c.c(new N90.e(str, PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_WALLET, aVar, y6.e(C35835l0.i(context).heightPixels), y6.e(C35835l0.i(context).widthPixels)));
        return G0.f406611a;
    }
}
