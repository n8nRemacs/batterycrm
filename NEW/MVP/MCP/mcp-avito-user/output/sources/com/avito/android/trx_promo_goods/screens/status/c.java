package com.avito.android.trx_promo_goods.screens.status;

import Y41.l;
import android.os.Bundle;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoGoodsStatusFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f303771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f303772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TrxPromoGoodsStatus f303773n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z12, TrxPromoGoodsStatus trxPromoGoodsStatus) {
        super(1);
        this.f303771l = str;
        this.f303772m = z12;
        this.f303773n = trxPromoGoodsStatus;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("trx_promo_goods_key_context", this.f303771l);
        bundle2.putBoolean("trx_promo_goods_key_closable", this.f303772m);
        bundle2.putParcelable("trx_promo_goods_key_status", this.f303773n);
        return G0.f406611a;
    }
}
