package com.avito.android.short_term_rent.promo_codes.mvi.domain;

import Y61.k;
import com.avito.android.remote.d1;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lw0.InterfaceC43841a;

/* compiled from: StrSoftBookingPromoCodesApplyUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/domain/d;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/domain/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d1 f282454b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43841a f282455c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f282456d;

    @Inject
    public d(@k d1 d1Var, @k InterfaceC43841a interfaceC43841a, @k R0 r02) {
        this.f282454b = d1Var;
        this.f282455c = interfaceC43841a;
        this.f282456d = r02;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends StrSoftBookingPromoCodesInternalAction> invoke(String str) {
        return C43175k.I(this.f282456d.a(), new C43137a0(new c(2, null), C43175k.G(new b(this, str, null))));
    }
}
