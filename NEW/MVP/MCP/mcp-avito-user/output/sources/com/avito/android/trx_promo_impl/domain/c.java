package com.avito.android.trx_promo_impl.domain;

import Y61.k;
import com.avito.android.trx_promo_impl.di.f;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoGetScreenDataUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/domain/c;", "Lcom/avito/android/trx_promo_impl/domain/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304168b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.trx_promo_impl.data.a f304169c;

    @Inject
    public c(@f @k String str, @k com.avito.android.trx_promo_impl.data.a aVar) {
        this.f304168b = str;
        this.f304169c = aVar;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends TrxPromoInternalAction> invoke() {
        return C43175k.G(new b(this, null));
    }
}
