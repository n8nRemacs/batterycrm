package com.avito.android.trx_promo_impl.status_screen.domain;

import Y61.k;
import com.avito.android.trx_promo_impl.di.f;
import com.avito.android.trx_promo_impl.status_screen.mvi.entity.TrxPromoStatusInternalAction;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoStatusUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/domain/c;", "Lcom/avito/android/trx_promo_impl/status_screen/domain/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304437b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrxPromoStatus f304438c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TF0.a f304439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f304440e;

    @Inject
    public c(@f @k String str, @k TrxPromoStatus trxPromoStatus, @k TF0.a aVar, @k R0 r02) {
        this.f304437b = str;
        this.f304438c = trxPromoStatus;
        this.f304439d = aVar;
        this.f304440e = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends TrxPromoStatusInternalAction> invoke() {
        return C43175k.I(this.f304440e.a(), C43175k.G(new b(this, null)));
    }
}
