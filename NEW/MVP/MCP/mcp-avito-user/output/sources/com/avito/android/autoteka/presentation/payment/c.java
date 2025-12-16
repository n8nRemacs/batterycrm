package com.avito.android.autoteka.presentation.payment;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.lib.design.tooltip.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPaymentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentActivity f97409l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f97410m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AutotekaPaymentActivity autotekaPaymentActivity, k kVar) {
        super(1);
        this.f97409l = autotekaPaymentActivity;
        this.f97410m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        AutotekaPaymentActivity autotekaPaymentActivity = this.f97409l;
        oVar2.b(autotekaPaymentActivity.getString(R.string.discount_below_error));
        oVar2.d(autotekaPaymentActivity.getString(R.string.autoteka_cancel_promo_code_button));
        k kVar = this.f97410m;
        oVar2.c(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(12, autotekaPaymentActivity, kVar));
        oVar2.e(new com.avito.android.advert.item.safedeal.trust_factors.k(kVar, 4));
        oVar2.f(true);
        kVar.d(new com.avito.android.advert.item.safedeal.trust_factors.k(kVar, 5));
        return G0.f406611a;
    }
}
