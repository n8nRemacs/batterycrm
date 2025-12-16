package com.avito.android.trx_promo_impl;

import Y41.p;
import ZF0.a;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ZF0.a, G0> f304198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Y41.l<? super ZF0.a, G0> lVar) {
        super(2);
        this.f304198l = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Object serializable;
        Bundle bundle2 = bundle;
        if (bundle2.containsKey("trx_promo_selected_date")) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle2.getSerializable("trx_promo_selected_date", LocalDate.class);
            } else {
                Object serializable2 = bundle2.getSerializable("trx_promo_selected_date");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate == null) {
                b.f303905a.getClass();
                localDate = b.f303906b;
            }
            ((TrxPromoFragment.h) this.f304198l).invoke(new a.d(localDate));
        }
        return G0.f406611a;
    }
}
